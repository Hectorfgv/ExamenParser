package parser_persona;

import java.util.ArrayList;

public class Acciones {
	
	private String nombre;
	private String compra;
	private int cantidad;
	private double precio;
	private ArrayList<String> operacion = new ArrayList<String>();
	
	
	public Acciones(String nombre, String compra, int cantidad, double precio, ArrayList<String> operacion) {
		super();
		this.nombre = nombre;
		this.compra = compra;
		this.cantidad = cantidad;
		this.precio = precio;
		this.operacion = operacion;
	}
	public Acciones() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public ArrayList<String> getOperacion() {
		return operacion;
	}
	public void setOperacion(ArrayList<String> operacion) {
		this.operacion = operacion;
	}
	public void print () {
		System.out.println("Nombre "+nombre);
		System.out.println("Compra "+compra);
		System.out.println("Cantidad "+cantidad);
		System.out.println("Precio "+precio);
		
	
		System.out.println("\n");
	}

	
}
