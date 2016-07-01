package com.jmunoz.sql;

public class Informes {
	private String id;
	private String informe;
	private String seccion;
	private String href;
	
	public Informes() {
		super();
	}
	public Informes(String id, String informe, String seccion, String href) {
		super();
		this.id = id;
		this.informe = informe;
		this.seccion = seccion;
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInforme() {
		return informe;
	}
	public void setInforme(String informe) {
		this.informe = informe;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
	
}
