package cn.ibona.proxy.itest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class ProductTp implements Serializable {
    private Long productTpId;

    private Long productId;

    private Long tpCategoryId;

    private String productTpValue;

    private String productTpImg;

    private Short productTpLevel;

    private Boolean isDeleted;

    private Date createAt;

    private Date updateAt;
}