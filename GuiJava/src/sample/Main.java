package sample;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.opencv.core.Core;

import java.io.File;

public class Main extends Application {

    static {

        try{
            File file = new File(Core.NATIVE_LIBRARY_NAME);
            System.load(file.getAbsolutePath()+".dll");
        }catch (Exception ex){}
    }

    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws Exception{
        primaryStage = stage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("mainPage2.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Exam Grading Program");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
