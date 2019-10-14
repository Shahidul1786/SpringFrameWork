package com.shahid.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahid.model.ModelTestdb;
import com.shahid.repository.TestdbRepository;

@Service
public class DaoTestdbImp implements DaoTestdb {

	@Autowired
	private TestdbRepository testdbRepository;
	
	@Override
	public int save(ModelTestdb modelTestdb) {
		try {
		testdbRepository.save(modelTestdb);
		return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
