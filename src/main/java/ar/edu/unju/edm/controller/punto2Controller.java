package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.punto2;

@Controller

public class punto2Controller {
	@Autowired
	punto2 nuevoBisiesto ;
	@GetMapping("/anioBisiesto")//METODOS dentro del controler atraves de un get mapping, muchos metodos
	public ModelAndView getBisiestoPage (@RequestParam (name = "num1")int num1){
	   String resultadoB = "";
	   ModelAndView anioo=new ModelAndView("resultadoBisiesto") ;
	   nuevoBisiesto.setAnio(num1);
	   resultadoB = nuevoBisiesto.calcularBisiesto();
	   anioo.addObject("resultadoB", resultadoB);
	   anioo.addObject("numero", num1);
	   return anioo;
}
}
