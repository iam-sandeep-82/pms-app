package com.pms.app1.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.app1.model.PatientModel;


@Repository
public interface PatientRepos extends JpaRepository<PatientModel, Integer> {
}
