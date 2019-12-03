package dad.javafx.geofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.connection.ConnectionController;
import dad.javafx.geofx.location.LocationController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class BorderGeoController  implements Initializable  {
	
	private ConnectionController connectionControl; 
	private LocationController locationControl = new LocationController();
	
	private String ip;
	  	@FXML
	    private BorderPane root = new BorderPane();
	  	
		@FXML
	    private TextField ipText = new TextField();

	    @FXML
	    private Button checkButton = new Button();

	    @FXML
	    private Tab locationTab = new Tab();

	    @FXML
	    private Tab conectionTab= new Tab();

	 
	   public BorderGeoController() throws IOException {
		   
		   FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/BorderGeoView.fxml"));
		   loader.setController(this);
		   loader.load();
	}


	public void initialize(URL location, ResourceBundle resources) {
		ip = "check";
		
		ipText.setText(ip);
		
		try {
			connectionControl= new ConnectionController(ip);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		locationTab.setContent(locationControl.getView());
		
		conectionTab.setContent(connectionControl.getView());
		
		checkButton.setOnAction(e->setCheckButtonAction(e));
		
	}
	
	
	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	private void setCheckButtonAction(ActionEvent e) {
		ip=ipText.getText();
	}


	public BorderPane getRoot() {
		return root;
	}
	    
	    
}
