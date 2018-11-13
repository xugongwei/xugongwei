package cn.ibona.proxy.itest;

import cn.ibona.proxy.itest.entity.custom.ProductCustom;
import cn.ibona.proxy.itest.mapper.ProductMapper;
import cn.ibona.proxy.itest.mapper.ProductTpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItestApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductTpMapper productTpMapper;

    @Test
    public void contextLoads() {
        ProductCustom custom = productMapper.getByProductId(170L);
        System.out.println(custom.getProductId());
        System.out.println(custom);
    }

}
