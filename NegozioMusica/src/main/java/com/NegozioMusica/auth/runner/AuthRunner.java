package com.NegozioMusica.auth.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.NegozioMusica.auth.entity.ERole;
import com.NegozioMusica.auth.entity.Role;
import com.NegozioMusica.auth.entity.User;
import com.NegozioMusica.auth.payload.RegisterDto;
import com.NegozioMusica.auth.repository.RoleRepository;
import com.NegozioMusica.auth.repository.UserRepository;
import com.NegozioMusica.auth.service.AuthService;
import com.NegozioMusica.main.entities.Articolo;
import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.repositories.ArticoloRepository;
import com.NegozioMusica.main.repositories.ChitarraElettricaRepository;


@Component
public class AuthRunner implements ApplicationRunner {
	
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired AuthService authService;
	@Autowired ArticoloRepository articoloRepository;
	@Autowired ChitarraElettricaRepository chitarraRepository;
	
	private Set<Role> adminRole;
	private Set<Role> moderatorRole;
	private Set<Role> userRole;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...");
		//setRoleDefault();
		//setUserDefault();
		
		//User mom=userRepository.findByEmail("domenico.frau@gmail.com");
	       // System.out.println(mom);
		//ChitarraElettrica mom=chitarraRepository.findById(1L).get();
		//System.out.println(mom);
		//System.out.println(articoloRepository.getById(1L));
		
		
	}
	
	private void setRoleDefault() {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
		roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
		roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
		roleRepository.save(moderator);
		
		adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		userRole = new HashSet<Role>();
		userRole.add(user);
	}
	
	private void setUserDefault() {
		

		Set<String> roleAdmin = new HashSet<>(
				adminRole.stream()
						.map(r -> r.getRoleName().toString())
						.collect(Collectors.toList())
				);
		Set<String> roleModerator = new HashSet<>(
				moderatorRole.stream()
						.map(r -> r.getRoleName().toString())
						.collect(Collectors.toList())
				);
		Set<String> roleUser = new HashSet<>(
				userRole.stream()
						.map(r -> r.getRoleName().toString())
						.collect(Collectors.toList())
				);
		
		
		RegisterDto userAdmin = new RegisterDto();
		userAdmin.setName("Admino Stretor");
		userAdmin.setSurname("admin");
		userAdmin.setEmail("admin@example.com");
		userAdmin.setPassword(passwordEncoder.encode("admin"));
		userAdmin.setRoles(roleAdmin);
		System.out.println(authService.register(userAdmin));
		
		RegisterDto simpleUser = new RegisterDto();
		simpleUser.setName("Mario Rossi");
		simpleUser.setSurname("mariorossi");
		simpleUser.setEmail("m.rossi@example.com");
		simpleUser.setPassword(passwordEncoder.encode("12345"));
		simpleUser.setRoles(roleUser);
		System.out.println(authService.register(simpleUser));
		
		RegisterDto userModerator = new RegisterDto();
		userModerator.setName("Giuseppe Verdi");
		userModerator.setSurname("giuver");
		userModerator.setEmail("g.verdi@example.com");
		userModerator.setPassword(passwordEncoder.encode("qwerty"));
		userModerator.setRoles(roleModerator);
		System.out.println(authService.register(userModerator));
	}

}
