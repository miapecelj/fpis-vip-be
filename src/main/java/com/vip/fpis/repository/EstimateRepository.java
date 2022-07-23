package com.vip.fpis.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vip.fpis.entity.EstimateEntity;

public interface EstimateRepository extends JpaRepository<EstimateEntity, Long> {
	List<EstimateEntity> findByDate(Date date);

}
