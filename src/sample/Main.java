package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");

        //Group root = new TestShape().makeShape();

        //primaryStage.setScene(new Scene(root, 300, 300));

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
