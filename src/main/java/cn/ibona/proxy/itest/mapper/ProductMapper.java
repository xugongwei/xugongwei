package cn.ibona.proxy.itest.mapper;

import cn.ibona.proxy.itest.entity.Product;
import cn.ibona.proxy.itest.entity.custom.ProductCustom;

public interface ProductMapper {

    /**
     * 根据商品id获取指定商品
     *
     * @param id 商品id
     * @return 指定商品
     */
    Product getProductById(Long id);

    ProductCustom getByProductId(Long id);

}
