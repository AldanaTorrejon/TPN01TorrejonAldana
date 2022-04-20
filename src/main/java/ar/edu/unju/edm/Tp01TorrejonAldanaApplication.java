package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Principal;
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
@SpringBootApplication
public class Tp01TorrejonAldanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01TorrejonAldanaApplication.class, args);
		//punto1
		Principal factorPrincipal = new Principal();
		factorPrincipal.setNum(4);
		System.out.println("El factorial es " + factorPrincipal.main());
		//punto2
		punto2 Bisiesto = new punto2();
		Bisiesto.setAño(2020);
		System.out.println("El año es " + Bisiesto.Bi());
		//punto3
		punto3 Par=new punto3();
		int aux=3;
		for(int i=0;i<5;i++){
			Par.setNum(aux);
			System.out.println("El numero es "+ Par.par());
			aux=aux+3;
		}
		//punto4
		punto4 mes = new punto4();
		mes.setNum(11);
		System.out.println(mes.Mes());
		//punto5
		punto5 mess = new punto5();
		mess.setNum(13);
		System.out.println(mess.Mes());
		//punto6
		punto6 Nota = new punto6();
		aux=7;
		while(aux>0){
			Nota.setNum(aux);
			System.out.println(Nota.nota());
			aux--;
		}
		//punto7
		punto7 Secuencia = new punto7();
		Secuencia.setNum(117);
		System.out.println(Secuencia.secuencia());
		//punto8
		punto8 Secuencia2 = new punto8();
		Secuencia2.setNum(4);
		System.out.println(Secuencia2.secuencia());
		//punto9
		punto9 Secuencia3 = new punto9();
		Secuencia3.setNum(320);
		System.out.println(Secuencia3.secuencia());
		//punto10
		punto10 Secuencia4 = new punto10();
		Secuencia4.setNum(320);
		System.out.println(Secuencia4.secuencia());
		//punto11
		punto11 Secuencia5 = new punto11();
		Secuencia5.setNum(320);
		System.out.println(Secuencia5.secuencia());

	}
}
