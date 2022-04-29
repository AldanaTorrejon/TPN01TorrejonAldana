package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto8;

@Controller
public class punto8Controller {
	@Autowired
	punto8 secuencia2;
	  @GetMapping("/secuencia2")
	  public String getSecuencia2Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto8 secuencia2 = new punto8();
	    secuencia2.setNum(num);
	    aux = secuencia2.secuencia();
	    model.addAttribute("secue2", aux);
	    return "puntoOcho";
	  }
}
