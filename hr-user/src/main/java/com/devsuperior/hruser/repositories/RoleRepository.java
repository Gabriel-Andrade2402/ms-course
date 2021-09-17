package com.devsuperior.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.hruser.entities.Role;
import com.devsuperior.hruser.entities.User;

public interface RoleRepository extends JpaRepository<Role, Long>{

}

