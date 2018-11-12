package cn.ibona.proxy.itest.service;

import cn.ibona.proxy.itest.entity.Product;

public interface ProductService {

    /**
     * 根据商品id获取指定商品
     *
     * @param id 商品id
     * @return 指定商品
     */
    Product getProductById(Long id);
}
