package main;

import java.io.Serializable;
import java.util.Objects;

public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
/*
 * ATRIBUTOS DE LA CLASE
 */
	private int id;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private double precio;

/*
 * CONSTRUCTOR VACIO
 */
	public Articulo() {
		super();
	}
/*
 * CONSTRUCTOR CON TODO
 */
	public Articulo(int id, String nombre, String descripcion, int cantidad, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
/*
 * GETTERS AND SETTERS
 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

/*
 * toSTRING
 */
	 
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
/*
 * hashCode AND equals
 */
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, descripcion, id, nombre, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return cantidad == other.cantidad && Objects.equals(descripcion, other.descripcion) && id == other.id
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}