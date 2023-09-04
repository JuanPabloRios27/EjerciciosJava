package edu.unbosque.tasks.model;

public class task {
	public int id;
	public String Descripcion;
	public priority PR;
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public priority getPR() {
		return PR;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public void setPR(priority pR) {
		PR = pR;
	}
	@Override
	public String toString() {
		return "task [id=" + id + ", Descripcion=" + Descripcion + ", PR=" + PR + "]";
	}
	public task(int id, String descripcion, priority pR) {
		this.id = id;
		Descripcion = descripcion;
		PR = pR;
	}
	
	
}
