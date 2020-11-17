package paquetecovid;
//PLAIN OLD JAVA OBJECT
public class Incidencia {
private String municipio_distrito, fecha_informe;
private int casos_confirmados_ultimos_14dias;






public String getMunicipio_distrito() {
	return municipio_distrito;
}






public String getFecha_informe() {
	return fecha_informe;
}






public int getCasos_confirmados_ultimos_14dias() {
	return casos_confirmados_ultimos_14dias;
}






@Override
public String toString() {
	return "Incidencia [municipio_distrito=" + municipio_distrito + ", fecha_informe=" + fecha_informe
			+ ", casos_confirmados_ultimos_14dias=" + casos_confirmados_ultimos_14dias + "]";
}


}
