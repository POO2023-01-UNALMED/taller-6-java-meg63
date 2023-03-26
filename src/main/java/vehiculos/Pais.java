package vehiculos;

import java.util.ArrayList;

public class Pais {
	 private String nombre;
	 ArrayList<Pais> paises=Vehiculo.paises;
	public Pais(String nombre) {
		 this.nombre=nombre;
	 }
	public static Pais paisMasVendedor() {
		
			Pais p = null;
			int c = 0;
			for(int i=0;i<paises.size();i++) {
				Pais pais=paises.get(i);
				int ca=0;
				for(int x=0;x<paises.size();x++) {
					if (paises.get(x)==pais) {
						ca++;
						
					}
				if(ca>c) {
					p=pais;
				}
					
				}	 
			 } return p;
			
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
