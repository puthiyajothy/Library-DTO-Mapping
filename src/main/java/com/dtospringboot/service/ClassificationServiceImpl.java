package com.dtospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtospringboot.model.Classification;
import com.dtospringboot.repository.Classificationrepository;

@Service
public class ClassificationServiceImpl implements ClassificationService {
	
	@Autowired
	private Classificationrepository Classificationrepository;

	@Override
	public Classification save(Classification classification) {
		return Classificationrepository.save(classification);
	}

	@Override
	public List<Classification> getAllclassification() {
		// TODO Auto-generated method stub
		return null;
	}

}
