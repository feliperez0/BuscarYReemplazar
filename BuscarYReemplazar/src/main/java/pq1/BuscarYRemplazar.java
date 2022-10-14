package pq1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazar extends Application {
	
	private TextField texto1 = new TextField();
	private TextField texto2 = new TextField();
	private Label label1 = new Label("Buscar:");
	private Label label2 = new Label("Remplazar con:");
	private Button b1 = new Button("Buscar");
	private Button b2 = new Button("Remplazar");
	private Button b3 = new Button("Remplazar todo");
	private Button b4 = new Button("Cerrar");
	private Button b5 = new Button("Ayuda");
	private CheckBox check1 = new CheckBox("Mayusculas y minusculas");
	private CheckBox check2 = new CheckBox("Buscar hacia atrás");
	private CheckBox check3 = new CheckBox("Expresión regular");
	private CheckBox check4 = new CheckBox("Resaltar resultados");
	
	@Override
	public void start(Stage primaryStage) throws Exception {	
				
		GridPane checkPane = new GridPane();
		checkPane.setPadding(new Insets(5));
		checkPane.setHgap(5);
		checkPane.setVgap(5);
//		checkPane.setGridLinesVisible(true);
		checkPane.addRow(0, check1, check2);
		checkPane.addRow(1, check3, check4);
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(5));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
//		gridPane.setGridLinesVisible(true);
		gridPane.addRow(0, label1, texto1);
		gridPane.addRow(1, label2, texto2);
		gridPane.addRow(2, new Label(), checkPane);
		
		VBox botonesPane = new VBox(5);
		botonesPane.setAlignment(Pos.TOP_RIGHT);
		botonesPane.setFillWidth(false);
		botonesPane.getChildren().addAll(b1, b2, b3, b4, b5);
		b1.setPrefSize(110, 15);
		b2.setPrefSize(110, 15);
		b3.setPrefSize(110, 15);
		b4.setPrefSize(110, 15);		
		b5.setPrefSize(110, 15);
		
		HBox root = new HBox();
		root.getChildren().addAll(gridPane, botonesPane);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(new Scene(root, 500, 150));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}