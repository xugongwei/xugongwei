package cn.ibona.proxy.itest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Product implements Serializable {
    private Long productId;

    private Long productCategoryId;

    private Long productBrandId;

    private String productThumbnail;

    private String productTitle;

    private String productDesc;

    private String productName;

    private String productImg;

    private String productSpu;

    private BigDecimal productPrice;

    private BigDecimal productCrossLinePrice;

    private Short postage;

    private Integer inventoryNum;

    private Integer lockingNum;

    private Integer salesVolume;

    private Integer buyingNum;

    private Integer lookNum;

    private String productTags;

    private Integer sorting;

    private Boolean isPutOn;

    private String source;

    private Boolean isDeleted;

    private Boolean isRecommend;

    private Date createAt;

    private Date updateAt;

    private BigDecimal productCost;

    private Long companyId;

    private Long projectId;
}