package com.userFront.userFront.dao;

import com.userFront.userFront.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}
