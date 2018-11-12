package cn.ibona.proxy.itest.mapper;

import cn.ibona.proxy.itest.entity.ProductTpExtend;

import java.util.List;

public interface ProductTpExtendMapper {
    /**
     * 根据商品id获取指定商品规格扩展列表
     *
     * @param productId 商品id
     * @return 商品规格扩展列表
     */
    List<ProductTpExtend> listProductTpExtend(Long productId);
}
