package com.dtospringboot.mapper;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtospringboot.dto.SubclassificationDTO;
import com.dtospringboot.model.SubClassification;
import com.dtospringboot.service.SubClassificationservice;

@Service
public class SubclassificationDTOMapper {
	@Autowired
	private SubClassificationservice subclassificationservice;
	
	ModelMapper modelMapper = new ModelMapper();

	PropertyMap<SubclassificationDTO, SubClassification> subclassificationMap = new PropertyMap<SubclassificationDTO, SubClassification>() {
		protected void configure() {
			map().setSubclassificationName(source.getSubclassificationName());
			map().getClassification().setClassId(source.getMainclassId());
			
		}
	};
	
	@SuppressWarnings("unused")
	private SubclassificationDTO EntityToDTO(SubClassification subClassification) {
		SubclassificationDTO subclassDTO = modelMapper.map(subClassification, SubclassificationDTO.class);
		return subclassDTO ;
	}

	public SubClassification savesubclassification(SubclassificationDTO subClassificationDTO) {
		TypeMap<SubclassificationDTO, SubClassification> typeMap = modelMapper.getTypeMap(SubclassificationDTO.class,
				SubClassification.class);
		if (typeMap == null) {
			modelMapper.addMappings(subclassificationMap);
		}
		SubClassification subclassification = modelMapper.map(subClassificationDTO, SubClassification.class);
		return subclassificationservice.save(subclassification);
	}
	
	public List<SubclassificationDTO> getAllMainClass(){
		List<SubClassification> mainClass = subclassificationservice.getAllsubclassification();
		Type listType = new TypeToken<List<SubclassificationDTO>>() {}.getType();
		List<SubclassificationDTO> returnValue = new ModelMapper().map(mainClass, listType);
		return returnValue;
	}
		
}
