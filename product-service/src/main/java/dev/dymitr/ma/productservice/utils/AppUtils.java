package dev.dymitr.ma.productservice.utils;

import dev.dymitr.ma.productservice.dto.ProductDto;
import dev.dymitr.ma.productservice.entity.Product;
import org.springframework.beans.BeanUtils;

public class AppUtils {
    public static ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
