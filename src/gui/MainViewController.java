package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerActicon() {
		System.out.println("Vendedor");
	}
	@FXML
	public void onMenuItemDepartmentActicon() {
		System.out.println("Departamento");
	}
	
	@FXML
	public void onMenuItemAboutActicon() {
		System.out.println("Sobre");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	
}
