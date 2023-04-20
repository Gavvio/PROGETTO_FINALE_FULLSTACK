package com.NegozioMusica.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.auth.entity.ERole;
import com.NegozioMusica.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
