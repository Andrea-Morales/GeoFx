package dad.javafx.geofx.location;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.BorderGeoController;
import dad.javafx.geofx.ConnectionGeoFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {
	
	//private BorderGeoController controllerGeo= new BorderGeoController();
	
	private ConnectionGeoFX con = new ConnectionGeoFX();
	
	
	@FXML
	private GridPane view = new GridPane();
	
	
	@FXML
	private Label latitudeLabel = new Label();
	
	@FXML
	private Label longitudeLabel= new Label();
	
	@FXML
	private Label ipLocationLabel= new Label();
	
	@FXML
	private Label cityLabel = new Label();
	
	@FXML
	private Label zipLabel = new Label();
	
	@FXML
	private Label languageLabel = new Label();
	
	@FXML
	private Label timeLabel = new Label();
	
	@FXML
	private Label callingCodeLabel = new Label();
	
	@FXML
	private Label currencyLabel = new Label();
	
	@FXML
	private ImageView flagImage = new ImageView();
	
	public LocationController()throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		// Acceder a ConnectionGeo y hacer los bindeos con ellos para ver los resultados
		//String ip= controllerGeo.getIp();
		
		
		
		
	}

	public GridPane getView() {
		return view;
	}
	
}
