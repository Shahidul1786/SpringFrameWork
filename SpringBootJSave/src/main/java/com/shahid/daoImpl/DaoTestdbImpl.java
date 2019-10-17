package com.shahid.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahid.dao.DaoTestdb;
import com.shahid.model.ModelTestdb;
import com.shahid.repository.TestdbRepository;

@Service
public class DaoTestdbImpl implements DaoTestdb {
	
	@Autowired
	private TestdbRepository testdbRepository;

	@Override
	public int save(ModelTestdb modelTestdb) {
		
		try {
			
			testdbRepository.save(modelTestdb);
			
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

}
