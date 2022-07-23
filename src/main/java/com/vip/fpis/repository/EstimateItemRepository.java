package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.EstimateItemEntity;

@RepositoryRestResource(collectionResourceRel = "estimate-item", path = "estimate-item")
public interface EstimateItemRepository extends JpaRepository<EstimateItemEntity, Long> {

}
