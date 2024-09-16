package az.atlacademy.productms.service;

import az.atlacademy.productms.model.request.SaveProductDto;
import az.atlacademy.productms.model.response.ProductResponseDto;

public interface ProductService {
    void saveProduct(SaveProductDto dto);

    ProductResponseDto getResponseById(Long id);

    void reduceProductCount(Long id, Integer count);
}

