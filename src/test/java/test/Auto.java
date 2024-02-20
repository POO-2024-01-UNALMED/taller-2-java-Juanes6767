package test;

public class Auto {
	String modelo=null;
	int precio;
	Asiento [] asientos;
	String marca= null;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int contador=0;
		for (int i=0 ;1<asientos.length;i++) {
			if(asientos[i]!=null) {
				contador++;
			}
		}
		return contador;
	}
	
	String verificarIntegridad() {
		if(this.registro==this.motor.registro){
			for(int i= 0; i < asientos.length;i++) {
				if(asientos[i]!=null) {
					if (asientos[i].registro!=registro) {
						return "Las piezas no son originales";
					}
				}
				}
					return "Auto original";
			}else {
				return "Las piezas no son originales";
		}
}
}
