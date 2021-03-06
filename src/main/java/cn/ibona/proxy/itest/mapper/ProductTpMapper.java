package cn.ibona.proxy.itest.mapper;

import cn.ibona.proxy.itest.entity.ProductTp;

import java.util.List;

public interface ProductTpMapper {

    /**
     * 根据商品id获取指定商品的规格
     *
     * @param productId 商品id
     * @return 指定商品的规格列表
     */
    List<ProductTp> listProductTp(Long productId);


}
