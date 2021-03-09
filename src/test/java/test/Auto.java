package test;

public class Auto {
	
	// ATRIBUTOS
	public String modelo; 
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	// M�TODOS
	// cantidadAsientos
	public int cantidadAsientos() {
		
		int contadorAsientos = 0;
		
		for (Asiento asiento: asientos) {
			
			if (asiento != null) {
				contadorAsientos ++;
			}
		}
		
		return contadorAsientos;
	}
	
	// verificarIntegridad
	public String verificarIntegridad() {
		
		// Verificaci�n registro cada asiento
		boolean asientosValidos = true;
		
		for (Asiento asiento: asientos) {
			
			if (asiento != null && asiento.registro != motor.registro) {
				asientosValidos = false;
				break;
			}
		}
		
		// Verificaci�n partes del auto
		if (motor.registro == registro && asientosValidos == true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}




