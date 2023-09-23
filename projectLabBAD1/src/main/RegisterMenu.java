package main;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RegisterMenu {
	Label regTitleLBL, regNameLBL, regGenderLBL, regEmailLBL, regPasswordLBL, regConfirmPasswordLBL;
	TextField regEmailTF, regNameTF;
	RadioButton maleRB, femaleRB;
	ToggleGroup genderGroup;
	PasswordField regPasswordPF, regConfirmPasswordPF;
	Button regBtn, backToLoginBTN;
	BorderPane regbp, outerBP;
	GridPane gp;
	Scene scene;
	VBox regMenuBTNs;
	HBox genderRadioButtonBox;
	public BorderPane registerPage() {
		regTitleLBL = new Label("Register");

		regNameLBL = new Label("Name: ");
		regNameTF = new TextField();
		regNameTF.setPromptText("Name");

		regGenderLBL = new Label("Gender : ");
		maleRB = new RadioButton("Male");
		femaleRB = new RadioButton("Female");
		genderGroup = new ToggleGroup();
		maleRB.setToggleGroup(genderGroup);
		femaleRB.setToggleGroup(genderGroup);
		genderRadioButtonBox = new HBox(10);
		genderRadioButtonBox.getChildren().add(maleRB);
		genderRadioButtonBox.getChildren().add(femaleRB);

		regEmailLBL = new Label("Email :");
		regEmailTF = new TextField();
		regEmailTF.setPromptText("Email Address");

		regPasswordLBL = new Label("Password :");
		regPasswordPF = new PasswordField();
		regPasswordPF.setPromptText("Password");

		regConfirmPasswordLBL = new Label("Confirm Password :");
		regConfirmPasswordPF = new PasswordField();
		regConfirmPasswordPF.setPromptText("Confirm Password");

		regBtn = new Button("Register");
		regBtn.setMinWidth(250);
		backToLoginBTN = new Button("Back to Login");
		backToLoginBTN.setMinWidth(250);

		regMenuBTNs = new VBox(15);
		regMenuBTNs.getChildren().add(regBtn);
		regMenuBTNs.getChildren().add(backToLoginBTN);

		gp = new GridPane();
		gp.add(regTitleLBL, 0, 0);
		gp.add(regNameLBL, 0, 1);
		gp.add(regNameTF, 0, 2);
		gp.add(regGenderLBL, 0, 3);
		gp.add(genderRadioButtonBox, 0, 4);
		gp.add(regEmailLBL, 0, 5);
		gp.add(regEmailTF, 0, 6);
		gp.add(regPasswordLBL, 0, 7);
		gp.add(regPasswordPF, 0, 8);
		gp.add(regConfirmPasswordLBL, 0, 9);
		gp.add(regConfirmPasswordPF, 0, 10);
		gp.add(regMenuBTNs, 0, 11);
		gp.setVgap(20);
		regbp = new BorderPane();
		regbp.setCenter(gp);
		GridPane.setHalignment(regTitleLBL, HPos.CENTER);
		gp.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(gp, Pos.CENTER);
		regbp.setPadding(new Insets(100, 50, 100, 50));
		
		return regbp;
	}
	
	public void registerButtonAction() {
		String password = regPasswordPF.getText();
		System.out.println(password);
		String confirmPassword;
		int length = regEmailTF.getText().length();
		int emailCounter = 0;
		int dotCounter = 0;
		int index = 0;
		if (length != 0) {
			for (int i = 0; i < length; i++) {
				if (regEmailTF.getText().charAt(i) == '@') {
					index = i;
					emailCounter++;
				}
				
			}
		}
		for(int i = index; i < length; i++) {
			if(regEmailTF.getText().charAt(i) == '.') {
				dotCounter++;
			}
		}
		// Name length must be between 5 - 40 characters.
		if (regNameTF.getText().length() < 5 || regNameTF.getText().length() > 40) {
			Alert nameLength = new Alert(AlertType.ERROR);
			nameLength.setHeaderText("Name Length Error!");
			nameLength.setContentText("Your name's length must be between 5-40 Characters!");
			nameLength.show();
		}
		// Gender must be chosen, either “Male” or “Female”.
		else if (!maleRB.isSelected() && !femaleRB.isSelected()) {
			Alert genderSelection = new Alert(AlertType.ERROR);
			genderSelection.setHeaderText("Gender Error!");
			genderSelection.setContentText("You must choose a gender!");
			genderSelection.show();
		}
		// Character ‘@’ must not be next to ‘.’. udah
		else if (regEmailTF.getText().contains("@.")) {
			Alert emailNaming = new Alert(AlertType.ERROR);
			emailNaming.setHeaderText("Email Error!");
			emailNaming.setContentText("Character '@' must not be next to '.'");
			emailNaming.show();
		}
		// Must not starts and ends with ‘@’ nor ‘.’. udah
		else if (regEmailTF.getText().startsWith("@") || regEmailTF.getText().endsWith("@")) {
			Alert emailNaming = new Alert(AlertType.ERROR);
			emailNaming.setHeaderText("Email Error!");
			emailNaming.setContentText("Email must not starts and ends with '@'");
			emailNaming.show();
		} else if (regEmailTF.getText().startsWith(".") || regEmailTF.getText().endsWith(".")) {
			Alert emailNaming = new Alert(AlertType.ERROR);
			emailNaming.setHeaderText("Email Error!");
			emailNaming.setContentText("Email must not starts and ends with '.'");
			emailNaming.show();
			// Must contain exactly one ‘@’.udah
		} else if (emailCounter != 1) {
			Alert emailNaming = new Alert(AlertType.ERROR);
			emailNaming.setHeaderText("Email Error!");
			emailNaming.setContentText("Email must contain exactly 1 '@'");
			emailNaming.show();
	}else if (!regEmailTF.getText().endsWith(".com")) {
		Alert com = new Alert(AlertType.ERROR);
		com.setHeaderText("Email Error!");
		com.setContentText("EMail must end with '.com'!");
		com.show();

	} else if (regPasswordPF.getText().length() < 6 || regPasswordPF.getText().length() > 20) {
		Alert passwordLength = new Alert(AlertType.ERROR);
		passwordLength.setHeaderText("Password Length Error!");
		passwordLength.setContentText("Your password's Length must be between 6 - 20 Characters!");
		passwordLength.show();
	} else if (!regConfirmPasswordPF.getText().equals(regPasswordPF.getText())) {
		Alert passwordMisMatch = new Alert(AlertType.ERROR);
		passwordMisMatch.setHeaderText("Password Error!");
		passwordMisMatch.setContentText("Your confirmation password must be the same as your password!");
		passwordMisMatch.show();
	}else {
		
	}
	}

}
