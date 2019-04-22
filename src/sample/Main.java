package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        NotePadClass npc = new NotePadClass();

    }


    public static void main(String[] a) {
        Application.launch(a);
    }
}
