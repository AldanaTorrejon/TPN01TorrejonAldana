package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto7;

@Controller
public class punto7Controller {
	@Autowired
	punto7 secuencia1;
	  @GetMapping("/secuencia1")
	  public String getSecuencia1Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto7 secuencia1 = new punto7();
	    secuencia1.setNum(num);
	    aux = secuencia1.secuencia();
	    model.addAttribute("secue", aux);
	    return "puntoSiete";
	  }
}
