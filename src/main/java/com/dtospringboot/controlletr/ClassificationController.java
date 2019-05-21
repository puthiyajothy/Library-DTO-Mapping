package com.dtospringboot.controlletr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtospringboot.dto.ClassificationDTO;
import com.dtospringboot.mapper.ClassificationDTOMapper;


@RestController
public class ClassificationController {
	
	@Autowired
	private ClassificationDTOMapper classificationDTOMapper;
	
	
	@PostMapping("/save")
public HttpStatus saveclassification(@Valid @RequestBody ClassificationDTO classificationDTO) {
		classificationDTOMapper.saveclassification(classificationDTO);
		return HttpStatus.CREATED;
	
	}

}
