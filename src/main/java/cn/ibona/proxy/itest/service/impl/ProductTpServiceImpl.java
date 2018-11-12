package cn.ibona.proxy.itest.service.impl;

import cn.ibona.proxy.itest.entity.ProductTp;
import cn.ibona.proxy.itest.mapper.ProductTpMapper;
import cn.ibona.proxy.itest.service.ProductTpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTpServiceImpl implements ProductTpService {

    private final ProductTpMapper productTpMapper;

    @Autowired
    public ProductTpServiceImpl(ProductTpMapper productTpMapper) {
        this.productTpMapper = productTpMapper;
    }

    /**
     * 根据商品id获取指定商品的规格
     *
     * @param productId 商品id
     * @return 指定商品的规格列表
     */
    @Override
    public List<ProductTp> listProductTp(Long productId) {
        return productTpMapper.listProductTp(productId);
    }
}
