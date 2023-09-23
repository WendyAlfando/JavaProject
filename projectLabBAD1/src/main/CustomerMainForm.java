package main;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class CustomerMainForm {
	Scene scene;
	BorderPane bp;
	MenuBar menuBar;
	Menu userMenu,transMenu,managementMenu;
	MenuItem logoutMI,buyWatchMI,myTransHistoryMI;
	
	public BorderPane CustomerMainForm() {
		bp = new BorderPane();
		menuBar = new MenuBar();
		userMenu = new Menu("User");
		transMenu = new Menu("Transactions");
		managementMenu = new Menu("Management");
		
		logoutMI = new MenuItem("Log Out");
		buyWatchMI = new MenuItem("Buy Watch");
		myTransHistoryMI = new MenuItem("My Transaction History");
		
		menuBar.getMenus().add(userMenu);
		menuBar.getMenus().add(transMenu);
		
		//add userMenu's item;
		userMenu.getItems().add(logoutMI);
		// add transMenu's item;
		transMenu.getItems().add(buyWatchMI);
		transMenu.getItems().add(myTransHistoryMI);
		
		bp.setTop(menuBar);
		BuyProductForm BuyProduct = new BuyProductForm();
		BorderPane a = BuyProduct.bPane;
		
		return bp;
	}

}
