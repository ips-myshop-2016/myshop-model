package com.myshop.model.order;

public enum Status {

	PENDIENTE_PAGO("pendiente_pago"), RECIVIDO("recivido"), PREPARANDO(
			"preparando"), PREPARADO("preparado"), EMPAQUETANDO(
					"empaquetando"), PENDIENTE_DE_ENVIO(
							"pendiente_de_envio"), ENVIADO(
									"enviado"), INCIDENCIA("incidencia");

	private String estado;

	Status(String estado) {
		this.estado = estado;
	}

	public String toString() {
		return this.estado;
	}

}
