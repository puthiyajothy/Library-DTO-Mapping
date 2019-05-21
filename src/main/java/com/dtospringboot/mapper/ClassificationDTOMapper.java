package com.dtospringboot.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtospringboot.dto.ClassificationDTO;
import com.dtospringboot.model.Classification;
import com.dtospringboot.service.ClassificationService;

@Service
public class ClassificationDTOMapper {

	@Autowired
	private ClassificationService classificationService;
	
	
	
	ModelMapper modelMapper = new ModelMapper();
	
	
	
	PropertyMap <ClassificationDTO, Classification> classificationMap = new PropertyMap <ClassificationDTO, Classification> () {
		  protected void configure() {
			  map().setClassName(source.getMainclassName());
			  
//			  map().getSubClassification().setSubClassId(source.getSubClassId());
		  }
		};
		
	
	@SuppressWarnings("unused")
	private ClassificationDTOMapper EntityToDTO(Classification classification) {
		ClassificationDTOMapper classDTO = modelMapper.map(classification,ClassificationDTOMapper.class);
		return classDTO;
	}
	
	
	public Classification saveclassification(ClassificationDTO classificationDTO) {
	TypeMap<ClassificationDTO, Classification> typeMap = modelMapper.getTypeMap(ClassificationDTO.class, Classification.class);
		if (typeMap == null) {
			modelMapper.addMappings(classificationMap);
			
	}
	
		Classification classification = modelMapper.map(classificationDTO, Classification.class);
				return classificationService.save(classification);
	}
}
