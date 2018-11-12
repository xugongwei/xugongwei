package cn.ibona.proxy.itest.service.impl;

import cn.ibona.proxy.itest.entity.ProductTpExtend;
import cn.ibona.proxy.itest.mapper.ProductTpExtendMapper;
import cn.ibona.proxy.itest.service.ProductTpExtendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTpExtendServiceImpl implements ProductTpExtendService {

    private final ProductTpExtendMapper productTpExtendMapper;

    @Autowired
    public ProductTpExtendServiceImpl(ProductTpExtendMapper productTpExtendMapper) {
        this.productTpExtendMapper = productTpExtendMapper;
    }

    /**
     * 根据商品id获取指定商品规格扩展列表
     *
     * @param productId 商品id
     * @return 商品规格扩展列表
     */
    @Override
    public List<ProductTpExtend> listProductTpExtend(Long productId) {
        return productTpExtendMapper.listProductTpExtend(productId);
    }
}
