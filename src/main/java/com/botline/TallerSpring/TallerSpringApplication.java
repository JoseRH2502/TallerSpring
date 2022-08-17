package com.botline.TallerSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.botline.TallerSpring.Entidades.Usuario;
import com.botline.TallerSpring.Respositorio.UsuarioRepositorio;

@SpringBootApplication
public class TallerSpringApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(TallerSpringApplication.class, args);


	}

	@Autowired
	private UsuarioRepositorio repositorio;
	


	public  void run(String[] args) throws Exception {
	 
		Usuario estudiante1 = new Usuario("Christian","cris20@gmail.com");
	    repositorio.save(estudiante1);
	    
	    Usuario estudiante2 = new Usuario("Andre","andrecar20@gmail.com");
	    repositorio.save(estudiante2);
	    
	}


	
	
		
	
		
	

}
