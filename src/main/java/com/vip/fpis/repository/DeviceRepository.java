package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.DeviceEntity;

@RepositoryRestResource(collectionResourceRel = "device", path = "device")
public interface DeviceRepository extends JpaRepository<DeviceEntity, Long> {

}
