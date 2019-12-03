package dad.javafx.geofx;

import com.mashape.unirest.http.Unirest;

public class ConnectionGeoFX {

	public ConnectionGeoFX() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
	}
	public String cargarDato(String ip, String value) {
		
		String resultado;
		resultado = Unirest.get("http://api.ipapi.com/"+ip+"?access_key=bd7096e6fb4fd015b1deaf7dd0a187c9&files="+value)
				.toString();
		return resultado;
		
	} 
	
}
