package com.vip.fpis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.vip.fpis.dto.EstimateItemDto;
import com.vip.fpis.entity.EstimateItemEntity;

@Mapper(componentModel = "spring", uses = { DeviceDtoEntityMapper.class,
		TariffPackeetDtoEntityMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EstimateItemDtoEntityMapper {
	EstimateItemDto toDto(EstimateItemEntity estimateItem);

	EstimateItemEntity toEntity(EstimateItemDto estimateItem);

}
