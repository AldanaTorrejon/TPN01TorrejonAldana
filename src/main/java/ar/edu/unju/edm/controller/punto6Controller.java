package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto6;

@Controller
public class punto6Controller {
	@Autowired
	punto6 nota;
	  @GetMapping("/nota")
	  public String getnotaPage(@RequestParam (name = "num") int num,Model model){
	    String[] aux1= new String[8];
	    punto6 nota = new punto6();
			for(int i=0;i<8;i++){
				nota.setNum(num);
				aux1[i] = nota.nota();
				  model.addAttribute("nota1", aux1[3]);
			      model.addAttribute("nota2", aux1[5]);
			      model.addAttribute("nota3", aux1[7]);
			      model.addAttribute("nota4", aux1[9]);
			      model.addAttribute("nota5", aux1[2]);
			      model.addAttribute("nota6", aux1[10]);
			      model.addAttribute("nota7", aux1[6]);
			      model.addAttribute("nota8", aux1[5]);
			      num--;
			}return "puntoSeis";
	  }
}
