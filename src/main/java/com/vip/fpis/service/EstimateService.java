package com.vip.fpis.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vip.fpis.dto.EstimateDto;
import com.vip.fpis.dto.EstimateItemDto;
import com.vip.fpis.entity.EstimateEntity;
import com.vip.fpis.mapper.EstimateDtoEntityMapper;
import com.vip.fpis.mapper.EstimateItemDtoEntityMapper;
import com.vip.fpis.repository.EstimateRepository;

@Service
@Transactional
public class EstimateService {
	@Autowired
	private EstimateRepository estimateRepository;
	@Autowired
	private EstimateDtoEntityMapper estimateMapper;
	@Autowired
	private EstimateItemDtoEntityMapper estimateItemMapper;

	public EstimateDto getById(Long id) throws Exception {
		Optional<EstimateEntity> entity = estimateRepository.findById(id);
		if (entity.isEmpty()) {
			throw new Exception("No such request");
		}
		return estimateMapper.toDto(entity.get());
	}

	public List<EstimateDto> getAll() {
		List<EstimateEntity> entities = estimateRepository.findAll();
		List<EstimateDto> dtos = new ArrayList<>();
		for (EstimateEntity entity : entities) {
			dtos.add(estimateMapper.toDto(entity));
		}
		return dtos;
	}

	public List<EstimateDto> findByDate(Date date) {
		List<EstimateDto> estimates = estimateRepository.findByDate(date).stream()
				.map(request -> estimateMapper.toDto(request)).collect(Collectors.toList());
		return estimates;
	}

	public void update(EstimateDto estimate, Long id) {
		EstimateEntity entity = estimateRepository.getById(id);
		entity.getEstimateItems().clear();
		for (EstimateItemDto item : estimate.getEstimateItems()) {
			entity.addEstimateItem(estimateItemMapper.toEntity(item));

		}
		estimateRepository.save(entity);
	}

	public void save(EstimateDto estimate) {
		estimateRepository.save(estimateMapper.toEntity(estimate));

	}

}
