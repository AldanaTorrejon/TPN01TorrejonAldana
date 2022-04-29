package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto5;

@Controller
public class punto5Controller {
	@Autowired
	punto5 mes2;
	  @GetMapping("/mes2")
	  public String getMes2Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto5 mes2 = new punto5();
	    mes2.setNum(num);
			aux = mes2.Mes();
	    model.addAttribute("meS2", aux);
	    return "puntoCinco";
	  }
}
