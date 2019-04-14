package pw.qnv.spendingapi.api.spending;

import java.util.Date;

import lombok.Data;

@Data
public class SpendingApiResponse {
    private int id;
    private String productName;
    private int categoryId;
    private String categoryName;
    private Date purchaceDate;

}
