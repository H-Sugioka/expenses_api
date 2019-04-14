package pw.qnv.spendingapi.api.spending;

import java.util.Date;
import java.util.Objects;

public class SpendingApiResponse {
    private int id;
    private String productName;
    private int categoryId;
    private String categoryName;
    private Date purchaceDate;

    public SpendingApiResponse() {
    }

    public SpendingApiResponse(int id, String productName, int categoryId, String categoryName, Date purchaceDate) {
        this.id = id;
        this.productName = productName;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.purchaceDate = purchaceDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getPurchaceDate() {
        return this.purchaceDate;
    }

    public void setPurchaceDate(Date purchaceDate) {
        this.purchaceDate = purchaceDate;
    }

    public SpendingApiResponse id(int id) {
        this.id = id;
        return this;
    }

    public SpendingApiResponse productName(String productName) {
        this.productName = productName;
        return this;
    }

    public SpendingApiResponse categoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public SpendingApiResponse categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public SpendingApiResponse purchaceDate(Date purchaceDate) {
        this.purchaceDate = purchaceDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SpendingApiResponse)) {
            return false;
        }
        SpendingApiResponse spendingApiResponse = (SpendingApiResponse) o;
        return id == spendingApiResponse.id && Objects.equals(productName, spendingApiResponse.productName)
                && categoryId == spendingApiResponse.categoryId
                && Objects.equals(categoryName, spendingApiResponse.categoryName)
                && Objects.equals(purchaceDate, spendingApiResponse.purchaceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, categoryId, categoryName, purchaceDate);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", productName='" + getProductName() + "'" + ", categoryId='"
                + getCategoryId() + "'" + ", categoryName='" + getCategoryName() + "'" + ", purchaceDate='"
                + getPurchaceDate() + "'" + "}";
    }

}
