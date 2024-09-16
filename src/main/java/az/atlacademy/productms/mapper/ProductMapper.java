package az.atlacademy.productms.mapper;

import az.atlacademy.productms.dao.entity.ProductEntity;
import az.atlacademy.productms.model.request.SaveProductDto;
import az.atlacademy.productms.model.response.ProductResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductEntity buildProductEntity(SaveProductDto dto);

    ProductResponseDto buildProductResponseDto(ProductEntity entity);
}
