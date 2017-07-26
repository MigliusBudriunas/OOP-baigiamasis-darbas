/**
 * Projektas: "VVT keleivių skaičiuoklė"
 */
package galutinisprojektas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Demonstruojamos technologijos: 
 * Nr.8: Grafinis elementas TextArea 
 * Nr.9:Grafiniai elementai: TextField, Label 
 * Nr.10: JavaFX langas su elementais
 *
 * @author Miglius
 * year 2017
 */
public class GalutinisProjektas extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        /**
         * Nr.8: Grafinis elementas TextArea
         * Nr.9: Grafiniai elementai:TextField, Label
         */
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        /**
         * Nr.10: JavaFX langas su elementais
         */
        stage.setScene(scene);
        stage.setTitle("VVT keleivių skaičiuoklė");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
