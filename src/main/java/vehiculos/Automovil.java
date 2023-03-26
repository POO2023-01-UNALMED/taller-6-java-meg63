package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante f,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",f);
		this.puestos=puestos;
		super.a++;
		
		
	}
	

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

}
