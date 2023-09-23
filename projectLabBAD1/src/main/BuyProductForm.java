package main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import jfxtras.labs.scene.control.window.Window;

public class BuyProductForm {
	TableView<Product> tableProduct;
	TableView<Cart> CartTable;
	BorderPane bPane;
	Label selWatchLbl, quantityLbl;
	Spinner<Integer> qtySpinner;
	Button addWatchBtn, clearBtn, checkoutBtn;
	FlowPane fBottomPane, fCenterPane;
	GridPane gCenterPane;
	Window window;
	public Window BuyProductFormWindow() {
		bPane = new BorderPane();
		window = new Window();
		fBottomPane = new FlowPane();
		gCenterPane = new GridPane();
		fCenterPane = new FlowPane();
		selWatchLbl = new Label("Selected Watch : ");
		quantityLbl = new Label("Quantity: ");
		qtySpinner = new Spinner<>(0, 100, 0, 1);
		addWatchBtn = new Button("Add Watch to Cart");
		clearBtn = new Button("Clear Cart");
		checkoutBtn = new Button("Checkout");

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

		CartTable = new TableView<Cart>();
		TableColumn<Cart, String> col6 = new TableColumn<Cart, String>("User ID");
		TableColumn<Cart, String> col7 = new TableColumn<Cart, String>("Watch ID");
		TableColumn<Cart, Integer> col8 = new TableColumn<Cart, Integer>("Quantity");

		col6.setCellValueFactory(new PropertyValueFactory<Cart, String>("UserID"));
		col7.setCellValueFactory(new PropertyValueFactory<Cart, String>("WatchID"));
		col8.setCellValueFactory(new PropertyValueFactory<Cart, Integer>("Quantity"));

		CartTable.getColumns().addAll(col6, col7, col8);
		CartTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

		fBottomPane.getChildren().add(clearBtn);
		fBottomPane.getChildren().add(checkoutBtn);
		fBottomPane.setAlignment(Pos.BOTTOM_CENTER);
		fBottomPane.setPadding(new Insets(10));
		fBottomPane.setHgap(20);
		fBottomPane.setVgap(20);

		fCenterPane.getChildren().add(quantityLbl);
		fCenterPane.getChildren().add(qtySpinner);
		fCenterPane.getChildren().add(addWatchBtn);
		fCenterPane.setHgap(10);
		fCenterPane.setVgap(10);

		gCenterPane.add(tableProduct, 2, 0);
		gCenterPane.add(selWatchLbl, 2, 1);
		gCenterPane.add(fCenterPane, 2, 2);
		gCenterPane.add(CartTable, 2, 3);
		gCenterPane.setHgap(15);
		gCenterPane.setVgap(15);

		bPane.setCenter(gCenterPane);
		gCenterPane.setAlignment(Pos.CENTER);
		bPane.setBottom(fBottomPane);
		window.getContentPane().getChildren().add(bPane);
		window.setResizableWindow(false);
		
		return window;
	}

}
