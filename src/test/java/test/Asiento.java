package test;

public class Asiento {
	
	// ATRIBUTOS
	public String color;
	public int precio;
	public int registro;

	// MÉTODOS
	public void cambiarColor(String color) {

		switch (color) {
		case "rojo":
			this.color = color;
			break;
		case "verde":
			this.color = color;
			break;
		case "amarillo":
			this.color = color;
			break;
		case "negro":
			this.color = color;
			break;
		}
	}
}
