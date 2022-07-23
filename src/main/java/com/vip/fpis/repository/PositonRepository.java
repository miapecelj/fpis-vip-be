package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.PositionEntity;

@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PositonRepository extends JpaRepository<PositionEntity, Long> {

}
