package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ar.edu.unju.edm.model.punto1;
import ar.edu.unju.edm.model.punto2;
import ar.edu.unju.edm.model.punto3;
import ar.edu.unju.edm.model.punto4;
import ar.edu.unju.edm.model.punto5;
import ar.edu.unju.edm.model.punto6;
import ar.edu.unju.edm.model.punto7;
import ar.edu.unju.edm.model.punto8;
import ar.edu.unju.edm.model.punto9;
import ar.edu.unju.edm.model.punto10;
import ar.edu.unju.edm.model.punto11;
@Controller
public class MenuController {
	@Autowired
	punto1 nuevoFactorial;
	punto2 añoBisiesto;
	@GetMapping({"/menu","/index","/principal","/"})
	public String mostrarMenu() {
	return "index";
	}
	//punto1
		@GetMapping("/calculoFactorial")//METODOS dentro del controler atraves de un get mapping, muchos metodos
		public String getFactorialPage (@RequestParam (name = "num1")int num1, Model model){
		   int resultadoF = 0;
		   nuevoFactorial.setNum1(num1);
		   resultadoF = nuevoFactorial.resolverFactorial();
		   model.addAttribute("resultadoF", resultadoF);
		   model.addAttribute("numero", num1);
		   return "resultadoFactorial";
	}

	 //punto3
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
	 //punto4
	  @GetMapping("/mes")
	  public String getMesPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto4 mes = new punto4();
	    mes.setNum(num);
			aux = mes.Mes();
	    model.addAttribute("meS", aux);
	    return "puntoCuatro";
	  }

	  //punto5
	  @GetMapping("/mes2")
	  public String getMes2Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto5 mes2 = new punto5();
	    mes2.setNum(num);
			aux = mes2.Mes();
	    model.addAttribute("meS2", aux);
	    return "puntoCinco";
	  }
	  //punto6
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
	  //punto7
	  @GetMapping("/secuencia1")
	  public String getSecuencia1Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto7 secuencia1 = new punto7();
	    secuencia1.setNum(num);
	    aux = secuencia1.secuencia();
	    model.addAttribute("secue", aux);
	    return "puntoSiete";
	  }
	  //punto8
	  @GetMapping("/secuencia2")
	  public String getSecuencia2Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto8 secuencia2 = new punto8();
	    secuencia2.setNum(num);
	    aux = secuencia2.secuencia();
	    model.addAttribute("secue2", aux);
	    return "puntoOcho";
	  }
	  //punto9
	  @GetMapping("/secuencia3")
	  public String getSecuencia3Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto9 secuencia3 = new punto9();
	    secuencia3.setNum(num);
	    aux = secuencia3.secuencia();
	    model.addAttribute("secue3", aux);
	    return "puntoNueve";
	  }
	  //punto10
	  @GetMapping("/secuencia4")
	  public String getSecuencia4Page(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    punto10 secuencia4 = new punto10();
	    secuencia4.setNum(num);
	    aux = secuencia4.secuencia();
	    model.addAttribute("secue4", aux);
	    return "puntoDiez";
	  }
	  //punto11
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
