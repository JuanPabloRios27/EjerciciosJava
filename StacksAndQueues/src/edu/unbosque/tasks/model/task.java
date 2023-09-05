package edu.unbosque.tasks.model;

import java.io.Serializable;

public class task implements Comparable<task>{
	public int id;
	public String Descripcion;
	public priority PR;
	private priority priority;
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
	
	@Override
	public int compareTo(task o) {
		// TODO Auto-generated method stub
		return PR.compareTo(o.PR);
	}
	
	
	
}
