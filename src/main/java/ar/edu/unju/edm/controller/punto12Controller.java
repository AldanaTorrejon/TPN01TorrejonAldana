package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.punto11;
import ar.edu.unju.edm.model.punto12;

@Controller
public class punto12Controller {
	@Autowired
	punto11 formula;
	  @GetMapping("/punto12")
	  public String gettiempoPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto12 tiempo = new punto12();
	    tiempo.setNum(num);
	    aux = tiempo.formula();
	    model.addAttribute("time", aux);
	    return "puntoDoce";
	  }
}
