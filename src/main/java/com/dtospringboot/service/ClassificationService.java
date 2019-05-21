package com.dtospringboot.service;

import java.util.List;

import com.dtospringboot.model.Classification;

public interface ClassificationService {
	
	Classification save(Classification classification);
	List<Classification>getAllclassification();
	

	
}
