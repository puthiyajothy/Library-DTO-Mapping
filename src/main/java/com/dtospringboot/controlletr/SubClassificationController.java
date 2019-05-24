package com.dtospringboot.controlletr;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtospringboot.dto.SubclassificationDTO;
import com.dtospringboot.mapper.SubclassificationDTOMapper;

@RestController
public class SubClassificationController {

	@Autowired 
	private SubclassificationDTOMapper subclassificationDTOMapper;
	
	@PostMapping("/subclasssave")
	public HttpStatus savesubclassification(@Valid @RequestBody SubclassificationDTO subClassificationDTO) {
		subclassificationDTOMapper.savesubclassification(subClassificationDTO);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/GetAllSubClassification")
	public List<SubclassificationDTO> getAllSubClass() {
		return null;
//				subclassificationDTOMapper.getAllMainClass();
	}
	
}
