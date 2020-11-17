package paquetecovid;

import java.util.List;

public class PintarHTML {
private static int min, max;
	public static String crearTabla(Data d) {
		List<Incidencia> lista_incidencias=d.getData();
		calcularExtremos(lista_incidencias);
		String tabla="<table><tr><th>DISTRITO</th><th>FECHA</th><th>Nº CASOS</th></tr>";
		for (Incidencia i: lista_incidencias)
		{
			tabla+="<tr><td>"+i.getMunicipio_distrito()+"</td><td>"+
						i.getFecha_informe()+"</td>"+
					"<td style="+calcularColor(i.getCasos_confirmados_ultimos_14dias())+">"+i.getCasos_confirmados_ultimos_14dias()+"</td></tr>";
		}
		tabla+="</tr>";
		return tabla;
	}
	private static String calcularColor(int x)
	{
		//H=(100/(xmin-xmax))*x-100xmax/(xmin-xmax)
		float n=((float)100/(min-max))*x-(float)(100*max/(min-max));
		String color="'background-color: hsl("+n+",  100%, 50%);'";
		return color;
	}
	private static void calcularExtremos(List<Incidencia> lista) {
		min=0;
		max=0;
		for(Incidencia i: lista)
		{
			int n=i.getCasos_confirmados_ultimos_14dias();
			if (n>max)
			{
				max=n;
			}
			if (n<min)
			{
				min=n;
			}
		}
		
	}

	

}
