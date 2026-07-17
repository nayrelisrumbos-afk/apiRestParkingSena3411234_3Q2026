package com.sena.parqueadero.dto;


import com.sena.parqueadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class VehiculoDTO {
	private long idVehiculo;
	@NotBlank(message = "la placa es obligatoria")
	@Pattern(regexp = "^[A-Za-z0-9 -]{3,10}$", message = "formato de placa invalido")
	private String placa;
	@NotNull(message = "El tipo de vehículo es obligatorio")
	private TipoVehiculo tipo;
	private String marca;
	private String modelo;
}
