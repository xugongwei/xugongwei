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
public class ProductCategory implements Serializable {
    private Long productCategoryId;

    private String productCategoryImg;

    private String productCategoryName;

    private Long productParentId;

    private Boolean isEnabled;

    private Boolean isDeleted;

    private Date createAt;

    private Date updateAt;

    private Integer sorting;
}