package com.vip.fpis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.vip.fpis.dto.PositionDto;
import com.vip.fpis.entity.PositionEntity;

@Mapper(componentModel = "spring", uses = {
		OrganizationUnitDtoEntityMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PositionEntityDtoMapper {
	PositionDto toDto(PositionEntity position);

	PositionEntity toEntity(PositionDto position);

}
