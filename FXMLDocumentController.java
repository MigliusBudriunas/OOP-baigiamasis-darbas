/**
 * Projektas: "VVT keleivių skaičiuoklė"
 */
package galutinisprojektas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * Demonstruojamos technologijos: 
 * Nr.1: Klasė, objekto sukūrimas
 * Nr.2: Teisės ir jų panaudojimas: private, default, protected ir public
 * Nr.3: Grafinis elementas mygtukas. Mygtuko paspaudimas
 * Nr.4: Blokai try, catch, finally
 * Nr.5: I/O nuskaitymas iš internetinės nuorodos
 * Nr.6: Išimtinė situacija
 * Nr.7: Metodo iškvietimas
 *
 * @author Miglius
 * year 2017
 */
public class FXMLDocumentController implements Initializable {

    
    /**
     * Nr.1: Klasė, objekto sukūrimas, objekto sukūrimo dalis
     */
    Skaicius Ilipo = new Skaicius(0);
    Skaicius Islipo = new Skaicius(0);
    Isplestas rezultatas = new Isplestas(0);

    @FXML
    /**
     *Nr.2: Teisės ir jų panaudojimas: protected ir public dalys
     */
    public TextArea textarea;
    public Label label1, label2, label3, label4;
    public TextField ilipe, islipe, stotele, dinge;
    protected String labas = "labas";
    String GitHubVilnius = "https://raw.githubusercontent.com/vilnius/"
            + "keleiviu-srautai/master/data/2016-12-01_2017-01-01.csv";
    BufferedReader buff = null;
    String eilute = "";
    String skirtukas = ";";

    /**
     *Nr.3: Grafinis elementas mygtukas. Mygtuko paspaudimas
     * @param event - mygtuko paspaudimas
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {

        /**
         * Nr.4: Blokas try
         */
        try {
            /**
             *Nr.5: I/O nuskaitymas iš internetinės nuorodos
             */
            URL Vilnius = new URL(GitHubVilnius);
            URLConnection rysys = Vilnius.openConnection();
            InputStreamReader inStream = new InputStreamReader(rysys.getInputStream());
            buff = new BufferedReader(inStream);
            while ((eilute = buff.readLine()) != null) {

                String[] keliaiviai = eilute.split(skirtukas);

                /**
                 *Nr.6: Išimtinė situacija
                 */
                try {
                    Ilipo.Skaicius = Ilipo.Skaicius + Integer.valueOf(keliaiviai[7]);
                    Islipo.Skaicius = Islipo.Skaicius + Integer.valueOf(keliaiviai[8]);
                    /**
                     *Nr.7: Metodo iškvietimas
                     */
                    rezultatas.Palygink(Integer.valueOf(keliaiviai[7]), Integer.valueOf(keliaiviai[8]), keliaiviai[5]);                   

                } catch (NumberFormatException e) {
                    System.out.println("Tai nebuvo sveikas skaičius");
                }

            }

            /**
             *Nr.4: Blokas catch
             */
        } catch (MalformedURLException ex) {
            System.out.println("Nepavyko susijungti");
        } catch (IOException e) {
            System.out.println("Nepavyko I/O operacija");
        } /**
         *Nr.4: Blokas finally
         */
        finally {
            System.out.println("Is viso ilipo: " + Ilipo.Skaicius + " Is viso islipo: " + Islipo.Skaicius);

            if (buff != null) {
                try {
                    buff.close();
                } catch (IOException e) {
                    System.out.println("Nepavyko IO operacija");
                }
            }
        }
        rezultatas.Skaicius = Islipo.Skaicius - Ilipo.Skaicius;
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        islipe.setText(Islipo.toString());
        ilipe.setText(Ilipo.toString());
        stotele.setText(rezultatas.toString()+" " +rezultatas.maksimalus.toString());
        dinge.setText(rezultatas.Skaicius.toString());
        ilipe.setVisible(true);
        islipe.setVisible(true);
        stotele.setVisible(true);
        dinge.setVisible(true);
        textarea.clear();
        textarea.setText("Duomenys paimti iš: " + GitHubVilnius);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
