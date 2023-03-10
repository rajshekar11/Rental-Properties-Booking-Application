package com.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rental.entities.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {

}
