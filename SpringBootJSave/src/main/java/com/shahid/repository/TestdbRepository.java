package com.shahid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shahid.model.ModelTestdb;

@Repository
public interface TestdbRepository extends JpaRepository<ModelTestdb, Integer> {

}
