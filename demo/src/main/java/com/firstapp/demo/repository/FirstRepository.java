package com.firstapp.demo.repository;

import com.firstapp.demo.entity.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FirstRepository extends JpaRepository<FirstEntity,Long> {

}
