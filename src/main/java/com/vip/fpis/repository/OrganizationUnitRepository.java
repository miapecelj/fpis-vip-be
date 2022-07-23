package com.vip.fpis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vip.fpis.entity.OrganizationUnitEntity;

@RepositoryRestResource(collectionResourceRel = "organization-unit", path = "organization-unit")
public interface OrganizationUnitRepository extends JpaRepository<OrganizationUnitEntity, Long> {

}
