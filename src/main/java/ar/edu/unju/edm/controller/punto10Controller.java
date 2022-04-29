package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto10;

@Controller
public class punto10Controller {
	@Autowired
	punto10 secuencia4;
	  @GetMapping("/secuencia4")
	  public String getSecuencia4Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto10 secuencia4 = new punto10();
	    secuencia4.setNum(num);
	    aux = secuencia4.secuencia();
	    model.addAttribute("secue4", aux);
	    return "puntoDiez";
	  }
}
