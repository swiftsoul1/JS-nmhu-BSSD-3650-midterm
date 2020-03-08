package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene start, details;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent start = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
        window.setTitle("Character Sheet 5E");
        window.setScene(new Scene(start, 1050, 765));
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
