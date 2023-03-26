package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	Camion(String placa,String nombre,int precio,int peso,Fabricante f,int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",f);
		this.ejes=ejes;
		super.cm++;
	}
	//puertas 2
	//velocidadMaxima 80
	//traccion "4X2"

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
