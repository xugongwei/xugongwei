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
public class ProductTpExtend implements Serializable {
    private Long productTpExtendId;

    private String productTpIds;

    private BigDecimal productTpPrice;

    private Integer productTpInventory;

    private String productTpCode;

    private BigDecimal productCost;

    private Long productId;

    private String productSkuName;

    private String productSkuCode;

    private Boolean isDeleted;

    private Date createAt;

    private Date updateAt;
}