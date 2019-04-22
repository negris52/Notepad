package sample;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;

public class NotePadClass {

    NotePadClass() {
        MenuBar menubar = new MenuBar();
        Menu file = new Menu("FILE");
        Menu edit = new Menu("EDIT");
        Menu format = new Menu("Format");
        Menu view = new Menu("View");
        Menu help = new Menu("Help");


        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save = new MenuItem("Save");
        MenuItem Close = new MenuItem("Close");

        file.getItems().addAll(New, Open, Save, Close);
        menubar.getMenus().addAll(file, edit, format, view, help);


        TextArea txtarea = new TextArea();
        txtarea.setMaxWidth(600);
        txtarea.setMaxHeight(400);

        Save.setOnAction(ActionEvent-> {
                    FileChooser fc = new FileChooser();
                    FileChooser.ExtensionFilter ext = new FileChooser.ExtensionFilter("txt files", "*.txt");
                    File savefile = fc.showSaveDialog(null);
                    try {
                        FileWriter fw = new FileWriter(savefile);
                        fw.write(txtarea.getText());
                        fw.close();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                });


        GridPane gp = new GridPane();
        gp.add(menubar, 0, 0);
        gp.add(txtarea,0,1);

        Group gr = new Group();
        gr.getChildren().add(gp);
        Scene sc = new Scene(gr);
        Stage st = new Stage();
        st.setScene(sc);
        st.setMaxWidth(600);
        st.setMaxHeight(500);
        st.show();

    }
}
