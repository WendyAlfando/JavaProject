package main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import jfxtras.labs.scene.control.window.Window;

public class manageProduct {
	TableView<Product> tableProduct;
	BorderPane bPane;
	Window window;
	GridPane gPane;
	FlowPane bottomPane,row1,row2;
	Label nameLbl,priceLbl,stockLbl,brandLbl;
	TextField nameTF,priceTF;
	Spinner<Integer>stockSpinner;
	ComboBox<String>brandCMB;
	Button insertBtn,updateBtn,deleteBtn;
	public Window manageProduct() {
		bPane = new BorderPane();
		window = new Window();
		gPane = new GridPane();
		
		
		
		
		
		
		tableProduct = new TableView<Product>();
		tableProduct.setMinWidth(700);
		TableColumn<Product, String> col1 = new TableColumn<Product, String>("Watch ID");
		TableColumn<Product, String> col2 = new TableColumn<Product, String>("Watch Name");
		TableColumn<Product, String> col3 = new TableColumn<Product, String>("Watch Brand");
		TableColumn<Product, Integer> col4 = new TableColumn<Product, Integer>("Watch Price");
		TableColumn<Product, Integer> col5 = new TableColumn<Product, Integer>("Watch Stock");

		col1.setCellValueFactory(new PropertyValueFactory<Product, String>("WatchID"));
		col2.setCellValueFactory(new PropertyValueFactory<Product, String>("WatchName"));
		col3.setCellValueFactory(new PropertyValueFactory<Product, String>("WatchBrand"));
		col4.setCellValueFactory(new PropertyValueFactory<Product, Integer>("WatchPrice"));
		col5.setCellValueFactory(new PropertyValueFactory<Product, Integer>("WatchStock"));

		tableProduct.getColumns().addAll(col1, col2, col3, col4, col5);
		tableProduct.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		
		nameLbl = new Label("Watch Name: ");
		nameTF = new TextField();
		priceTF = new TextField();
		priceLbl = new Label("Watch Price:");
		stockLbl = new Label("Watch Price: ");
		stockSpinner = new Spinner<Integer>();
		brandLbl = new Label("Watch Brand: ");
		brandCMB = new ComboBox<String>();
		insertBtn = new Button("Insert Watch");
		updateBtn = new Button("Update Watch");
		deleteBtn = new Button("Delete Watch");
		
		
		
		
		bottomPane = new FlowPane();
		gPane.add(nameLbl, 0, 0);
		gPane.add(nameTF, 1, 0);
		gPane.add(stockLbl, 0, 1);
		gPane.add(stockSpinner, 1, 1);
		gPane.add(priceLbl, 2, 0);
		gPane.add(priceTF, 3, 0);
		gPane.add(brandLbl, 2, 1);
		gPane.add(brandCMB, 3,1);
		gPane.setHgap(20);
		gPane.setVgap(20);
		bottomPane.getChildren().add(insertBtn);
		bottomPane.getChildren().add(updateBtn);
		bottomPane.getChildren().add(deleteBtn);
		bottomPane.setHgap(20);
		
		
		bottomPane.setAlignment(Pos.CENTER);
		gPane.setAlignment(Pos.CENTER);
		
		bPane.setTop(tableProduct);
		bPane.setCenter(gPane);
		bPane.setBottom(bottomPane);
		bPane.setPadding(new Insets(10, 10, 10, 10));;
		window.getContentPane().getChildren().add(bPane);
		window.setResizableWindow(false);
		
		return window;
	}

}
