package cn.ibona.proxy.itest.entity.custom;

import cn.ibona.proxy.itest.entity.Product;
import cn.ibona.proxy.itest.entity.ProductTp;
import cn.ibona.proxy.itest.entity.ProductTpExtend;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 商品视图对象
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class ProductVO implements Serializable {

    private Product product;

    private List<List<ProductTp>> productTps;

    private List<ProductTpExtend> productTpExtends;
}
