package com.vip.fpis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.vip.fpis.dto.DeviceDto;
import com.vip.fpis.entity.DeviceEntity;

@Mapper(componentModel = "spring", uses = {
		ManufacturerDtoEntityMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface DeviceDtoEntityMapper {
	DeviceDto toDto(DeviceEntity device);

	DeviceEntity toDEntity(DeviceDto device);

}
