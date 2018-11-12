package cn.ibona.proxy.itest.controller;

import cn.ibona.proxy.itest.entity.Product;
import cn.ibona.proxy.itest.entity.ProductTp;
import cn.ibona.proxy.itest.entity.ProductTpExtend;
import cn.ibona.proxy.itest.entity.custom.ProductVO;
import cn.ibona.proxy.itest.service.ProductService;
import cn.ibona.proxy.itest.service.ProductTpExtendService;
import cn.ibona.proxy.itest.service.ProductTpService;
import cn.ibona.proxy.itest.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/itest")
public class ProductController {
    private final ProductService productService;
    private final ProductTpService productTpService;
    private final ProductTpExtendService productTpExtendService;

    @Autowired
    public ProductController(ProductService productService, ProductTpService productTpService, ProductTpExtendService productTpExtendService) {
        this.productService = productService;
        this.productTpService = productTpService;
        this.productTpExtendService = productTpExtendService;
    }

    /**
     * 商品详情
     * @param productId 商品id
     * @return 统一格式返回
     */
    @GetMapping("/productDetails/{productId}")
    public Result getProductDetails(@PathVariable("productId") Long productId) {
        // 获取商品详情VO对象
        ProductVO productVO = new ProductVO();
        // 根据id获取商品
        Product product = productService.getProductById(productId);
        // 如果对应商品不存在则返回错误信息
        if (product == null) {
            return Result.error();
        }
        // 封装商品基本信息到VO对象
        productVO.setProduct(product);

        List<List<ProductTp>> llpt = new ArrayList<>();
        // 根据商品id获取商品规格列表
        List<ProductTp> productTps = productTpService.listProductTp(product.getProductId());
        List<ProductTp> productTpList1 = new ArrayList<>();
        List<ProductTp> productTpList2 = new ArrayList<>();
        List<ProductTp> productTpList3 = new ArrayList<>();
        // 遍历规格列表 设置等级信息
        for (ProductTp productTp : productTps) {
            if (productTp.getProductTpLevel() == 1) {
                // 封装一级列表
                productTpList1.add(productTp);
            } else if (productTp.getProductTpLevel() == 2) {
                // 封装二级列表
                productTpList2.add(productTp);
            } else {
                // 封装三级列表
                productTpList3.add(productTp);
            }
        }

        llpt.add(productTpList1);
        llpt.add(productTpList2);
        llpt.add(productTpList3);
        // 封装商品规格等级信息
        productVO.setProductTps(llpt);

        List<ProductTpExtend> productTpExtends = productTpExtendService.listProductTpExtend(product.getProductId());
        // 封装商品规格扩展信息
        productVO.setProductTpExtends(productTpExtends);
        // 返回VO对象
        return Result.success("获取成功").put("productVO", productVO);
    }
}
