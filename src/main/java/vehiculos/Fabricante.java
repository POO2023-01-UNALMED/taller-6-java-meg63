package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static ArrayList<Fabricante> fabricantes=Vehiculo.fabricantes;
	public Fabricante(String nombre,Pais pais){
		this.setNombre(nombre);
		this.setPais(pais);
	}
	 public static Fabricante fabricaMayorVentas() {
			
			Fabricante f = null;
			int c = 0;
			for(int i=0;i<fabricantes.size();i++) {
				Fabricante fabricante=fabricantes.get(i);
				int ca=0;
				for(int x=0;x<fabricantes.size();x++) {
					if (fabricantes.get(x)==fabricante) {
						ca++;
						
					}
				if(ca>c) {
					f=fabricante;
				}
					
				}	 
			 } return f;
			
		}

	
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais2) {
		this.pais = pais2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
