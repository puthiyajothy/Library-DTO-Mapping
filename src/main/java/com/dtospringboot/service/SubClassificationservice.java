package com.dtospringboot.service;

import java.util.List;


import com.dtospringboot.model.SubClassification;

public interface SubClassificationservice{

	SubClassification save(SubClassification subClassification);
	List<SubClassification>getAllsubclassification();
}