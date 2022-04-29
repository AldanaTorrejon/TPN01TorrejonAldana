package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.punto9;

@Controller
public class punto9Controller {
	@Autowired
	punto9 secuencia3;
	  @GetMapping("/secuencia3")
	  public String getSecuencia3Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto9 secuencia3 = new punto9();
	    secuencia3.setNum(num);
	    aux = secuencia3.secuencia();
	    model.addAttribute("secue3", aux);
	    return "puntoNueve";
	  }
}
