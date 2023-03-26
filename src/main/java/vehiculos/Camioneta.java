package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante f,boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",f);
		this.volco=volco;
		super.ct++;
	}
	

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
