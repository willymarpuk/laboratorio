package com.fiuni.sd.domain.sexo;

import com.fiuni.sd.domain.base.BaseDomain;

public class SexoDomain extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		this._descripcion = descripcion;
	}

	private String _descripcion;

}