package com.vip.fpis.mapper;

import org.mapstruct.Mapper;

import com.vip.fpis.dto.TariffPackageTypeDto;
import com.vip.fpis.entity.TariffPackageEntity;
import com.vip.fpis.entity.TariffPackageTypeEntity;

@Mapper(componentModel = "spring")
public interface TariffPackageTypeDtoEntityMapper {
	TariffPackageTypeDto toDto(TariffPackageEntity tpt);

	TariffPackageTypeEntity toEntity(TariffPackageTypeDto tpt);

}
