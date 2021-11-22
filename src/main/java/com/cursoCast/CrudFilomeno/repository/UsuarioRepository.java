package com.cursoCast.CrudFilomeno.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cursoCast.CrudFilomeno.Application;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
public class UsuarioRepository {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
        System.out.println("Fala GafanhOto");
       
    }
}
