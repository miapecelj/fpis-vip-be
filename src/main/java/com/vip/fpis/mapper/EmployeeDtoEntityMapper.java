package com.vip.fpis.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.vip.fpis.dto.EmployeeDto;
import com.vip.fpis.entity.EmployeeEntity;

@Mapper(componentModel = "spring", uses = {
		PositionEntityDtoMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmployeeDtoEntityMapper {
	EmployeeDto toDto(EmployeeEntity eployee);

	EmployeeEntity toEntity(EmployeeDto employee);

}
