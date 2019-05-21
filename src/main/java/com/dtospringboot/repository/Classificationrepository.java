package com.dtospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtospringboot.model.Classification;

public interface Classificationrepository extends JpaRepository<Classification, Long>  {

}
