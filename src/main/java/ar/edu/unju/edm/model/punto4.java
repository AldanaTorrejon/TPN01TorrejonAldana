package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;
@Component
public class punto4 {
	int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num= num;
	}
	public String Mes() {
		String aux;
		if(num==1) {
			aux="Enero";
		}else {
			if(num==2) {
				aux="Febrero";
			}else {
				if(num==3) {
					aux="Marzo";
				}else {
					if(num==4) {
						aux="Abril";
					}else {
						if(num==5) {
							aux="Mayo";
						}else {
							if(num==6) {
								aux="Junio";
							}else {
								if(num==7) {
									aux="Julio";
								}else {
									if(num==8) {
										aux="Agosto";
									}else{
										if(num==9) {
											aux="Septiembre";
										}else {
											if(num==10) {
												aux="Octumbre";
											}else {
												if(num==11) {
													aux="Noviembre";
												}else {
													if(num==12) {
														aux="Diciembre";
													}else {
														aux="El mes no existe";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}return aux;
	}
}
