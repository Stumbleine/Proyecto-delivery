package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Role;
import com.example.demo.document.Usuario;
import com.example.demo.repository.Rol_Repository;
import com.example.demo.repository.Usuario_Repository;

@Service
public class Usuario_Service {
	@Autowired
	private Usuario_Repository repository;
	@Autowired
	private Rol_Repository rol_Repository;
	
	public void guardar(String nombre,String pass) {
		Usuario usuario=new Usuario( nombre, pass);
		Role role=rol_Repository.findByRol("ADMI");
		usuario.setRoles(new HashSet<>(Arrays.asList(role)));
		repository.save(usuario);
	}
	/*
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

	    Usuario user = repository.findByNombre(email);
	    if(user != null) {
	        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
	        return buildUserForAuthentication(user, authorities);
	    } else {
	        throw new UsernameNotFoundException("username not found");
	    }
	}
	private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
	    Set<GrantedAuthority> roles = new HashSet<>();
	    userRoles.forEach((role) -> {
	        roles.add(new SimpleGrantedAuthority(role.getRol()));
	    });

	    List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
	    return grantedAuthorities;
	}
	private UserDetails buildUserForAuthentication(Usuario user, List<GrantedAuthority> authorities) {
	    return new org.springframework.security.core.userdetails.User(user.getNombre(), user.getPass(), authorities);
	}
	*/
}
