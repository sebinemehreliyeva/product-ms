package az.atlacademy.productms.service.impl;

import az.atlacademy.productms.dao.entity.ProductEntity;
import az.atlacademy.productms.dao.entity.repository.ProductRepository;
import az.atlacademy.productms.exception.ProductNotFoundException;
import az.atlacademy.productms.mapper.ProductMapper;
import az.atlacademy.productms.model.request.SaveProductDto;
import az.atlacademy.productms.model.response.ProductResponseDto;
import az.atlacademy.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.atlacademy.productms.model.ErrorMessage.PRODUCT_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void saveProduct(SaveProductDto dto) {
        var entity = ProductMapper.PRODUCT_MAPPER.buildProductEntity(dto);
        productRepository.save(entity);
    }

    @Override
    public ProductResponseDto getResponseById(Long id) {
        var entity = fetchProductIfExist(id);
        return ProductMapper.PRODUCT_MAPPER.buildProductResponseDto(entity);
    }

    @Override
    public void reduceProductCount(Long id, Integer count) {
        var entity = fetchProductIfExist(id);
        var updatedCount = entity.getCount() - count;
        entity.setCount(updatedCount);
        productRepository.save(entity);
    }

    private ProductEntity fetchProductIfExist(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException(PRODUCT_NOT_FOUND.format(id))
        );
    }
}