package com.sandwich.admin.repository;

import com.sandwich.admin.domain.AdEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @description ad
 * @date 2021-07-01
 */
public interface AdRepository extends CrudRepository<AdEntity, Long> {

}