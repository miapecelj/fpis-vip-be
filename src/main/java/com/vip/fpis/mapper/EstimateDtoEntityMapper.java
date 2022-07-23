package com.vip.fpis.mapper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vip.fpis.dto.EstimateDto;
import com.vip.fpis.dto.EstimateItemDto;
import com.vip.fpis.entity.EstimateEntity;
import com.vip.fpis.entity.EstimateItemEntity;
import com.vip.fpis.repository.EstimateItemRepository;

@Component
public class EstimateDtoEntityMapper {

	@Autowired
	private EmployeeDtoEntityMapper employeeMapper;
	@Autowired
	private EstimateItemRepository estimateItemRepository;
	@Autowired
	private DeviceDtoEntityMapper deviceMapper;
	@Autowired
	private TariffPackeetDtoEntityMapper tariffMapper;
	@Autowired
	private EstimateItemDtoEntityMapper estimateItemMapper;

	public EstimateDto toDto(EstimateEntity estimate) {
		EstimateDto estimateDto = new EstimateDto();
		estimateDto.setDate(estimate.getDate());
		estimateDto.setDiscount(estimate.getDiscount());
		estimateDto.setPriceWithDiscount(estimate.getPriceWithDiscount());
		estimateDto.setEmployeeReceive(employeeMapper.toDto(estimate.getEmployeeReceive()));
		estimateDto.setEmployeeSend(employeeMapper.toDto(estimate.getEmployeeSend()));
		estimateDto.setNote(estimate.getNote());
		estimateDto.setId(estimate.getId());
		for (EstimateItemEntity item : estimate.getEstimateItems()) {
			estimateDto.getEstimateItems().add(estimateItemMapper.toDto(item));
		}
		return estimateDto;
	}

	public EstimateEntity toEntity(EstimateDto estimate) {
		EstimateEntity estimateEntity = new EstimateEntity();
		estimateEntity.setDate(estimate.getDate());
		estimateEntity.setDiscount(estimate.getDiscount());
		estimateEntity.setNote(estimate.getNote());
		estimateEntity.setPriceWithDiscount(estimate.getPriceWithDiscount());
		estimateEntity.setId(estimate.getId());
		estimateEntity.setEmployeeReceive(employeeMapper.toEntity(estimate.getEmployeeReceive()));
		estimateEntity.setEmployeeSend(employeeMapper.toEntity(estimate.getEmployeeSend()));
		for (EstimateItemDto item : estimate.getEstimateItems()) {
			if (item.getId() != null) {
				Optional<EstimateItemEntity> existingItem = estimateItemRepository.findById(item.getId());
				if (existingItem.isPresent()) {
					estimateEntity.addEstimateItem(existingItem.get());
				}
			} else {
				EstimateItemEntity estimateItem = new EstimateItemEntity();
				estimateItem.setId(item.getId());
				estimateItem.setOrderNumber(item.getOrderNumber());
				estimateItem.setDevice(deviceMapper.toDEntity(item.getDevice()));
				estimateItem.setTariffPackage(tariffMapper.toEntity(item.getTariffPackage()));
				estimateEntity.addEstimateItem(estimateItem);
			}
		}
		return estimateEntity;
	}

}
