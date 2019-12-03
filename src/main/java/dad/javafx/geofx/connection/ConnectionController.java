package dad.javafx.geofx.connection;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.BorderGeoController;
import dad.javafx.geofx.ConnectionGeoFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {
	
	//private BorderGeoController controllerGeo= new BorderGeoController();
	
	private String ip;
	private ConnectionGeoFX con = new ConnectionGeoFX();
	
	@FXML
	private GridPane view= new GridPane();
	
	@FXML
	private Label ipAddressLabel = new Label();
	
	@FXML
	private Label registeredISPLabel = new Label();
	
	@FXML
	private Label typeLabel = new Label();
	
	@FXML
	private Label ansLabel = new Label();
	
	@FXML
	private Label hostNameLabel = new Label();
	

	
	public ConnectionController(String ip) throws IOException {
		this.ip=ip;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		
		//String ip= controllerGeo.getIp();
		
		//acceder al connectionGeo y y los bindeos
		
		ipAddressLabel.setText(con.cargarDato(ip, "ip"));
		registeredISPLabel.setText(con.cargarDato(ip, ""));
		typeLabel.setText(con.cargarDato(ip, "type"));
		ansLabel.setText(con.cargarDato(ip, ""));
		hostNameLabel.setText(con.cargarDato(ip, ""));
		
		
	}
	
	public GridPane getView() {
		return view;
	}
}
