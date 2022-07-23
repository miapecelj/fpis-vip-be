package com.vip.fpis.mapper;

import org.mapstruct.Mapper;

import com.vip.fpis.dto.OrganizationUnitDto;
import com.vip.fpis.entity.OrganizationUnitEntity;

@Mapper(componentModel = "spring")
public interface OrganizationUnitDtoEntityMapper {
	OrganizationUnitDto toDto(OrganizationUnitEntity ou);

	OrganizationUnitEntity toEntity(OrganizationUnitDto ou);

}
