package com.devsuperior.hrworker.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long>{

}
