package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.ManufacturerEntity;

@RepositoryRestResource(collectionResourceRel = "manufacturer", path = "manufacturer")
public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity, Long> {

}
