package cn.ibona.proxy.itest.service.impl;

import cn.ibona.proxy.itest.entity.Product;
import cn.ibona.proxy.itest.mapper.ProductMapper;
import cn.ibona.proxy.itest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    /**
     * 根据商品id获取指定商品
     *
     * @param id 商品id
     * @return 指定商品
     */
    @Override
    public Product getProductById(Long id) {
        return productMapper.getProductById(id);
    }
}
