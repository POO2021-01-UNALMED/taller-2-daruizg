package test;

public class Motor {
	
	// ATRIBUTOS
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	// MÉTODOS
	// cambiarRegistro
	public void cambiarRegistro(int nuevoR) { // nuevoR = Nuevo registro
		registro = nuevoR;
	}
	
	// asignarTipo
	public void asignarTipo(String tipoM) { // tipoM = Tipo de motor
		
		if (tipoM == "electrico" || tipoM == "gasolina") {
			tipo = tipoM;
		}
	}
}
