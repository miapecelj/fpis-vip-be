package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.TariffPackageEntity;

@RepositoryRestResource(collectionResourceRel = "tariff-package", path = "tariff-package")
public interface TariffPackageRepository extends JpaRepository<TariffPackageEntity, Long> {

}
