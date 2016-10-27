package com.myshop.model.product;

public enum Status {
	
	PENDIENTE_PAGO ("pendiente_pago"), PAGADO ("pagado"), PREPARANDO ("preparando"),
	PENDIENTE_EMPAQUETADO ("pendiente_empaquetado"), EMPAQUETANDO ("empaquetando"), FINALIZADO ("finalizado");
	
	private String estado;
	
	Status(String estado) {
		this.estado = estado;
	}
	
	public String toString() { return this.estado; }
}
