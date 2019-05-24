package com.dtospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtospringboot.model.SubClassification;
import com.dtospringboot.repository.SubClassificationRepository;

@Service
public class SubclassificationServiceImp  implements SubClassificationservice{

	
	@Autowired
	private SubClassificationRepository subclassificationRepositoty;
	
	@Override
	public SubClassification save(SubClassification subClassification) {
		return subclassificationRepositoty.save(subClassification);
	}

	@Override
	public List<SubClassification> getAllsubclassification() {
		// TODO Auto-generated method stub
		return null;
	}

}