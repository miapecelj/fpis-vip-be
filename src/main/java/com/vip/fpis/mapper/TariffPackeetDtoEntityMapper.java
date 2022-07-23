package com.vip.fpis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.vip.fpis.dto.TariffPackageDto;
import com.vip.fpis.entity.TariffPackageEntity;

@Mapper(componentModel = "spring", uses = {
		TariffPackageTypeDtoEntityMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TariffPackeetDtoEntityMapper {
	TariffPackageDto toDto(TariffPackageEntity tp);

	TariffPackageEntity toEntity(TariffPackageDto tp);

}
