package edu.co.unbosque.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductosBean {
	private String categoria;
	private int cantidad;
	private long precio;
	private String nombre;
	private String apellido;
	private String tarjeta;
	private long numero;
	
	public ProductosBean() {
		super();
	}

	public ProductosBean(String categoria, int cantidad, long precio, String nombre, String apellido, String tarjeta,
			long numero) {
		super();
		this.categoria = categoria;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	

	
	
}
