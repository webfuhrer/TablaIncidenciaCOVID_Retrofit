package paquetecovid;

import java.io.FileWriter;
import java.io.IOException;

public class AccesoFichero {

	public static void grabarTabla(String html) {
		FileWriter fw;
		try {
			fw = new FileWriter("T:\\ficheros\\incidencias.html");
			fw.write(html);
			fw.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				}

}
