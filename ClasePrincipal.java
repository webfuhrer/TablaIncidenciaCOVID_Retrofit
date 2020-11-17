package paquetecovid;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClasePrincipal implements ClasePeticionRetrofit.Actualizacion{

	public static void main(String[] args) {
		//List datos=ClasNoseQUe.devolverDatos();
		ClasePeticionRetrofit.perdirDatos(new ClasePrincipal());
		//System.out.println("Ya tengo los datos: "+d);
	}
	
	@Override
	public void recuperardatos(Data d) {
		String html=PintarHTML.crearTabla(d);
		AccesoFichero.grabarTabla(html);
		System.out.println(d);
		
	}

}
