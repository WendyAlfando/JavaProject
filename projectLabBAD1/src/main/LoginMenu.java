package main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class LoginMenu {
	Label loginTitleLBL, emailLBL, passwordLBL;
	TextField emailTF;
	PasswordField passwordPF;
	Button loginBtn, registerInsteadBtn;
	BorderPane bp, outerBP;
	GridPane gp;
	Scene scene;
	VBox loginMenuBTNs;

	public BorderPane loginPage() {
		loginTitleLBL = new Label("Watches Dealer Login");
		emailLBL = new Label("Email :");
		emailTF = new TextField();
		emailTF.setPromptText("Email Address");
		passwordLBL = new Label("Password: ");
		passwordPF = new PasswordField();
		passwordPF.setPromptText("Password");
		loginBtn = new Button("Login");
		registerInsteadBtn = new Button("Register Instead");
		emailLBL.setMinWidth(250);
		emailTF.setMinWidth(250);
		passwordLBL.setMinWidth(250);
		passwordPF.setMinWidth(250);
		loginBtn.setMinWidth(250);
		registerInsteadBtn.setMinWidth(250);
		gp = new GridPane();
		bp = new BorderPane();
		loginTitleLBL.setAlignment(Pos.CENTER);
		loginMenuBTNs = new VBox(10);
		loginMenuBTNs.getChildren().addAll(loginBtn, registerInsteadBtn);
		outerBP = new BorderPane();
		gp.setVgap(20);

		gp.add(loginTitleLBL, 1, 0);
		gp.add(emailLBL, 1, 1);
		gp.add(emailTF, 1, 2);
		gp.add(passwordLBL, 1, 3);
		gp.add(passwordPF, 1, 4);
		gp.add(loginMenuBTNs, 1, 5);
		bp.setTop(loginTitleLBL);
		bp.setCenter(gp);
		outerBP.setCenter(bp);

		BorderPane.setAlignment(bp, Pos.CENTER);
		BorderPane.setAlignment(outerBP, Pos.CENTER);
		BorderPane.setAlignment(loginTitleLBL, Pos.CENTER);
		loginTitleLBL.setMinWidth(150);
		bp.setPadding(new Insets(50, 50, 50, 50));
		outerBP.setPadding(new Insets(50, 50, 75, 75));

		return outerBP;

	}
	public boolean LoginButtonAction() {
		boolean isValid = false;
		// validate if email is empty or not
		if (emailTF.getText().equals("")) {
			Alert warningEmail = new Alert(AlertType.ERROR);
			warningEmail.setHeaderText("Error");
			warningEmail.setContentText("Email must be filled!");
			warningEmail.show();
			// validate if password is empty or not
		}
		else if (passwordPF.getText().equals("")) {
			Alert warningPassword = new Alert(AlertType.ERROR);
			warningPassword.setHeaderText("Error");
			warningPassword.setContentText("Password must be filled!");
			warningPassword.show();
			// VALIDATE Credentials with database(WIP)
		}else {
			isValid = true;
		}
		return isValid;
	}

}
