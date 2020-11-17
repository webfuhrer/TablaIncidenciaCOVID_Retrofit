package paquetecovid;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Data {

private List<Incidencia> data;

public List<Incidencia> getData() {
	return data;
}

public void setData(List<Incidencia> data) {
	this.data = data;
}

@Override
public String toString() {
	return "Data [data=" + data + "]";
}

}
