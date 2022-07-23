package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.TariffPackageTypeEntity;

@RepositoryRestResource(collectionResourceRel = "tariff-package-type", path = "tariff-package-type")
public interface TariffPackageTypeRepository extends JpaRepository<TariffPackageTypeEntity, Long> {

}
