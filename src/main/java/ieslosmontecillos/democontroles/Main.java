package ieslosmontecillos.democontroles;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        StackPane root = new StackPane();
        VBox vb = new VBox();
        Label lb = new Label("Probando...");
        MiControl micontrol = new MiControl();

        micontrol.setOnAction(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Se ha hecho click en la región");
                lb.setText("Cambio provocado por el evento");
            }
        });
        vb.getChildren().addAll(lb, micontrol);
        root.getChildren().add(vb);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}