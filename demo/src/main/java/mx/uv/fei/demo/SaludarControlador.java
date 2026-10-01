package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //paradigna, consiste en hacer peticiones http, a traves de los verbos
public class SaludarControlador{

    String nombre;
    
    @GetMapping("/saludos")
	public String saludar (){
		return "Hola Mundo! " + nombre;
	}

    @GetMapping("/despedidas")
    public String despedirse(){
        return "adios mundo!";
    }

    @PostMapping("/nombramientos")
    public void nombre(){
        nombre = "Misael";
    }

    @PutMapping("/nombramientos")
    public void met1(){
        nombre = "actualizar";
    }

    @DeleteMapping("/nombramientos")
    public void met2(){
        nombre = null;
    }
}