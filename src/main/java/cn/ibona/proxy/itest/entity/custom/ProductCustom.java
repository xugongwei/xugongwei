package cn.ibona.proxy.itest.entity.custom;

import cn.ibona.proxy.itest.entity.Product;
import cn.ibona.proxy.itest.entity.ProductTp;
import cn.ibona.proxy.itest.entity.ProductTpExtend;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ProductCustom extends Product implements Serializable {

    private List<List<ProductTp>> productTpLists;

    private List<ProductTpExtend> productTpExtends;
}
