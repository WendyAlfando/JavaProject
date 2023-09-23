package main;

import java.sql.Date;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import jfxtras.labs.scene.control.window.Window;


public class CustomerTransactionHistory {
BorderPane bPane;
TableView<TransactionHeader>transHeaderTable;
TableView<TransactionDetail>transDetailTable;
Label selectedTransaction;
Label currentSelection;
FlowPane selections,topPane,bottomPane;
Window window;
VBox vbox;
GridPane gPane;


	public Window historyPage() {
		bPane = new BorderPane();
		window = new Window();
		gPane = new GridPane();
		transHeaderTable = new TableView<TransactionHeader>();
		transHeaderTable.setMinWidth(1450);
		TableColumn<TransactionHeader, Integer> head1 = new TableColumn<TransactionHeader, Integer>("TransactionID");
		TableColumn<TransactionHeader, Integer> head2 = new TableColumn<TransactionHeader, Integer>("User ID");
		TableColumn<TransactionHeader, Date> head3 = new TableColumn<TransactionHeader, Date>("Transaction Date");
		
		
		transHeaderTable.getColumns().addAll(head1,head2,head3);
		transHeaderTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		selectedTransaction = new Label("Selected Transaction: ");
		currentSelection = new Label("None");
		selections = new FlowPane();
		selections.getChildren().add(selectedTransaction);
		selections.getChildren().add(currentSelection);
		
		transDetailTable = new TableView<TransactionDetail>();
		transDetailTable.setMinWidth(1450);
		TableColumn<TransactionDetail, Integer> detail1 = new TableColumn<TransactionDetail, Integer>("TransactionID");
		TableColumn<TransactionDetail, Integer> detail2 = new TableColumn<TransactionDetail, Integer>("Watch Id");
		TableColumn<TransactionDetail, String> detail3 = new TableColumn<TransactionDetail, String>("Watch Name");
		TableColumn<TransactionDetail, String> detail4 = new TableColumn<TransactionDetail, String>("Watch Brand");
		TableColumn<TransactionDetail, String> detail5 = new TableColumn<TransactionDetail, String>("Watch Price");
		TableColumn<TransactionDetail, Integer> detail6 = new TableColumn<TransactionDetail, Integer>("Quantity");
		TableColumn<TransactionDetail, String> detail7 = new TableColumn<TransactionDetail, String>("Sub Total");
		
		transDetailTable.getColumns().addAll(detail1,detail2,detail3,detail4,detail5,detail6,detail7);
		transDetailTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		
		topPane = new FlowPane();
		bottomPane = new FlowPane();
		vbox = new VBox(10);
		
//		topPane.getChildren().add(transHeaderTable);
//		bottomPane.getChildren().add(transDetailTable);
		
		gPane.add(transHeaderTable, 1, 0);
		gPane.add(selections, 1, 1);
		gPane.add(transDetailTable, 1, 3);
		
		gPane.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(gPane, Pos.CENTER);
		
		bPane.setCenter(gPane);
		bPane.setPadding(new Insets(10, 10, 10, 10));;
		
		window.getContentPane().getChildren().add(bPane);
		window.setResizableWindow(false);
		
		
		
		return window;
	}

}
