package com.vip.fpis.mapper;

import org.mapstruct.Mapper;

import com.vip.fpis.dto.ManufacturerDto;
import com.vip.fpis.entity.ManufacturerEntity;

@Mapper(componentModel = "spring")
public interface ManufacturerDtoEntityMapper {
	ManufacturerDto toDto(ManufacturerEntity manufacturer);

	ManufacturerEntity toEntity(ManufacturerDto manufacturer);
}
