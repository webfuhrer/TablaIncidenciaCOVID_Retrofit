package paquetecovid;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClasePeticionRetrofit {
	static Data d=null;
	public static Data perdirDatos(Actualizacion a)
	{
		
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("http://datos.comunidad.madrid/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();

			InterfazCOVID service = retrofit.create(InterfazCOVID.class);
			Call<Data> llamada=service.recuperaIncidencias();
			
			llamada.enqueue(new Callback<Data>() {
				
				@Override
				public void onResponse(Call<Data> call, Response<Data> response) {
					d=response.body();
					
					List<Incidencia> incidencias=d.getData();
					a.recuperardatos(d);
					/*String datos=PintarHTML.crearTabla(d);*/
					/*AccesoFichero.grabarFichero(datos);*/
					//ClasePrincipal.actualizarLoQueSea(d);
					
				}
				
				@Override
				public void onFailure(Call<Data> call, Throwable t) {
					// TODO Auto-generated method stub
					System.out.println("Ha habido un fallo: "+t.getMessage());
				}
			});
			
			return d;
	}
	public interface Actualizacion
	{
		public void recuperardatos(Data d);
	}
}
