## API設計

### やりたいこと
- 支出を登録
- カテゴリごとの支出を見る(一定期間の支出データを取得して画面側でカテゴリごとに分類して表示)
    - カテゴリごとに支出を分類する部分は画面側でやる
- 残金を表示(予算 - 支出)
    - 「予算 - 支出」の計算は画面側でやる

### APIをどんなことに使うかを考える
- 支出を登録する
- 支出を取得する(期間で絞れる)

### APIのリクエスト項目/レスポンス項目を決める
- 支出を登録するAPI
    - リクエスト
        - 商品名
        - 金額
        - カテゴリID
        - 購入日付
    - レスポンス
        - 支出ID
- 支出を取得する(期間で絞れる)API
    - リクエスト
        - ユーザID
        - 検索開始日
        - 検索終了日
    - レスポンス
        - 支出ID
        - 商品名
        - カテゴリID
        - カテゴリ名
        - 購入日付
        - 登録日

### APIのエンドポイント(URL)を決める
#### HTTPの仕様
- URL
    - http://localhost:8080/product/
- HTTPメソッド
    - GET, POST, PUT, DELETE, PATCH ..API

#### REST APIとは
```
URLで、リソースを指定する。  
HTTPメソッドで、そのリソースに対する操作を指定する。
```

例1: http://localhost:8080/products/00001 GET => IDが00001のProductを取得する。  
例2: http://localhost:8080/products/00001 POST => IDが00001のProductを変更する。  
例3: http://localhost:8080/products POST => Productを新規作成する。  
例4: http://localhost:8080/products GET => 全てのProductを取得する。  
例4-2: http://localhost:8080/products?name=パソコン&purchaseDate=20180101 GET => 名前がパソコンで購入日が2018年1月1日のProductを取得する。

#### エンドポイント設計
- 支出(Spending)を登録するAPI
    - /spendings POST
- 支出を取得する(期間で絞れる)API
    - /spendings?start=20190101&end=20190201&user=KASUPA GET

## アプリケーション設計
### [具体例] 登録時の処理
- アプリケーション層(Controller)
1. SpendingRegisterRequestで受け取る。
2. SpendingRegisterRequestからSpendingクラスに移し替える。
3. SpendingServiceのregisterメソッドを呼び出す。

- ドメイン層(Service)  
1. Spendingクラスの中身が正しい値かどうかをチェックする。
2. Repositoryのsaveメソッドを呼び出す。

- インフラストラクチャ層(Repository) 
1. SpendingクラスをDBに登録する。

## Tips
### アプリケーションのレイヤーについて
- アプリケーション層・・・Controllerにあたる。APIに関する層。この層扱うデータはAPIの都合に合わせた持ち方をする。  
- ドメイン層・・・Serviceにあたる。ビジネスロジックを書く。  
- インフラストラクチャ層・・・Repository。DBアクセスに関する層。  

### メモ
JPA
Spending s = spendingRepository.get(1);

@Entity
class Spending{
    String id;
    String productName;
    Category category;
    Date recordCreateDate;
}

@Entity
class Category{
    String id;
    String categoryName;
    Date recordCreateDate;
}


消費登録API
class SpendingRegisterRequest{
    String productName;
    String price;
    String categoryId;
    Date purchaseDate;
}

消費取得API
class SpendingGetRequest{
    String productName;
    String price;
    String categoryId;
    Date purchaseDate;
}