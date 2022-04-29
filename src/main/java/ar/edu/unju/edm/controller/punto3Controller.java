package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.punto3;

@Controller
public class punto3Controller {
	@Autowired
	punto3 Imparpar;
	 @GetMapping("/parImpar")
	  public String getParImparPage(@RequestParam (name = "num") int num,Model model){
		    String[] aux1= new String[5];
		    punto3 Par = new punto3();
				for(int i=0;i<5;i++){
					Par.setNum(num);
					aux1[i] = Par.par();
					model.addAttribute("par1", aux1[0]);
				    model.addAttribute("par2", aux1[1]);
				    model.addAttribute("par3", aux1[5]);
				    model.addAttribute("par4", aux1[8]);
				    model.addAttribute("par5", aux1[4]);
					num=num+3;
				}return "puntoTres";
		  }
}
