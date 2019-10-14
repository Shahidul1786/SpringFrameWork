package com.shahid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.model.ModelTestdb;

public interface TestdbRepository extends JpaRepository<ModelTestdb, Integer> {

}
