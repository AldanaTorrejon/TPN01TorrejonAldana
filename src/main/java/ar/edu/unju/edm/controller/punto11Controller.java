package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.punto11;

@Controller
public class punto11Controller {
	@Autowired
	punto11 secuencia5;
	  @GetMapping("/secuencia5")
	  public String getSecuencia5Page(@RequestParam (name = "num") int num, Model model){
	    String aux;
	    punto11 secuencia5 = new punto11();
	    secuencia5.setNum(num);
	    aux = secuencia5.secuencia();
	    model.addAttribute("secue5", aux);
	    return "puntoOnce";
	  }
}
