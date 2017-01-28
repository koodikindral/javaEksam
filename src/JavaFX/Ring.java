package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ring extends Application {
  TextField x = new TextField("x");
  TextField y = new TextField("y");
  TextField r = new TextField("r");
  Button button = new Button("Joonista!");
  Circle ring = new Circle();

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello World!");


    button.setOnAction(event ->{
      ring.setCenterX(Integer.parseInt(x.getText()));
      ring.setCenterY(Integer.parseInt(y.getText()));
      ring.setRadius(Integer.parseInt(r.getText()));
    });

    GridPane pane = new GridPane();
    pane.setPadding(new Insets(5, 5, 5, 5));
    pane.setConstraints(x, 0, 1);
    pane.setConstraints(y, 0, 2);
    pane.setConstraints(r, 0, 3);
    pane.setConstraints(button, 0, 4);

    button.setOnAction(event ->{
      ring.setCenterX(Integer.parseInt(x.getText()));
      ring.setCenterY(Integer.parseInt(y.getText()));
      ring.setRadius(Integer.parseInt(r.getText()));
    });

    pane.getChildren().addAll(x, y, r, button, ring);

    primaryStage.setScene(new Scene(pane, 1000, 1000));
    primaryStage.show();
  }
}