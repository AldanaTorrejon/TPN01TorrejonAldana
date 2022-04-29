package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto4;

@Controller
public class punto4Controller {
	@Autowired
	punto4 Mes1;
	  @GetMapping("/mes")
	  public String getMesPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto4 mes = new punto4();
	    mes.setNum(num);
			aux = mes.Mes();
	    model.addAttribute("meS", aux);
	    return "puntoCuatro";
	  }
}
