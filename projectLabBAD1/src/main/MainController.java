package main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainController extends Application {
	public Stage mainStage = new Stage();
	
	
	LoginMenu loginPage = new LoginMenu();
	RegisterMenu registerPage = new RegisterMenu();
	CustomerMainForm custMenu = new CustomerMainForm();
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		LoginMenu();	
	}
	
	public void LoginMenu() {
		mainStage.setHeight(500);
		mainStage.setWidth(500);
		mainStage.setTitle("Login");
		mainStage.setScene(scene(loginPage.loginPage()));
		mainStage.show();
		loginPage.loginBtn.setOnAction((event) -> {
			boolean isValid;
			isValid = loginPage.LoginButtonAction();
			if(isValid == true) {
				customerMenu();
			}
		});
		loginPage.registerInsteadBtn.setOnAction((event) ->{
			registerMenu();
		});
		
//		loginPage.loginBtn.setOnAction((event) -> {
//			
//			loginButtonAction();
//		});
	}
	
	public void registerMenu() {
		mainStage.setScene(scene(registerPage.registerPage()));
		mainStage.setTitle("Register");
		mainStage.setHeight(700);
		mainStage.setWidth(600);
		
		registerPage.backToLoginBTN.setOnAction((event1) -> {
			LoginMenu();
		});
		
		registerPage.regBtn.setOnAction((event) -> {
			registerPage.registerButtonAction();			
		});
	}
		
	public void customerMenu() {
		mainStage.setHeight(800);
		mainStage.setWidth(1500);
		mainStage.setTitle("Main Page");
		mainStage.setScene(scene(custMenu.CustomerMainForm()));	
		custMenu.buyWatchMI.setOnAction((event) ->{
			BuyProductForm buyProductMenu = new BuyProductForm();
			custMenu.bp.setCenter(buyProductMenu.BuyProductFormWindow());
		});
		custMenu.myTransHistoryMI.setOnAction((event) ->{
			CustomerTransactionHistory cusTransHist = new CustomerTransactionHistory();
			custMenu.bp.setCenter(cusTransHist.historyPage());
//			manageProduct mp = new manageProduct();
//			custMenu.bp.setCenter(mp.manageProduct());
		});
		custMenu.logoutMI.setOnAction((event) -> {
			mainStage.close();
			LoginMenu();
		});
	}
	
	public void loginButtonAction() {
			// validate if email is empty or not
			if (loginPage.emailTF.getText().equals("")) {
				Alert warningEmail = new Alert(AlertType.ERROR);
				warningEmail.setHeaderText("Error");
				warningEmail.setContentText("Email must be filled!");
				warningEmail.show();
				// validate if password is empty or not
			}
			else if (loginPage.passwordPF.getText().equals("")) {
				Alert warningPassword = new Alert(AlertType.ERROR);
				warningPassword.setHeaderText("Error");
				warningPassword.setContentText("Password must be filled!");
				warningPassword.show();
				// VALIDATE Credentials with database(WIP)
			}else {
				customerMenu();	
		}			
		}
	
		
	public Scene scene(Parent x) {
		Scene sc = new Scene(x);
		return sc;
	}
	


}
