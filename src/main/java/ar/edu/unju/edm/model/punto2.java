package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class punto2 {
	int año;
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año=año;
	}
	public String Bi(){
		String bisiesto="";
		if(((año%4==0) || (año%400==0)) && (año%100!=0)){
			bisiesto="Si es Bisiesto";
			}else{
		      bisiesto="No es bisiesto";
		      }return bisiesto;
    }
}
