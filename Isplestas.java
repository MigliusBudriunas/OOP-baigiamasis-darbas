/**
 * Projektas: "VVT keleivių skaičiuoklė"
 */
package galutinisprojektas;

/**
 * Demonstruojamos technologijos: 
 * Nr.11: Poklasė
 * Nr.2: Teisės ir jų panaudojimas: private, default, protected ir public
 * Nr.12: Duomenų paslėpimas. Enkapsuliacija
 * Nr.13: Konstruktorius super su ir be argumentų
 * Nr.14: SetGet technologija
 * Nr.15: Metodas klasėje
 * Nr.16: Daugiareikšmingumas(overloading)
 *
 * @author Miglius
 * year 2017

 * Nr.11: Poklasė
 */
public class Isplestas extends Skaicius {

    /**
     * Nr.2: Teisės ir jų panaudojimas: private dalis
     */
    private String Stotele;

    /**
     * Nr.12: Duomenų paslėpimas. Enkapsuliacija Integer Skaicius
     */
    Integer Skaicius;

    /**
     * Nr.2: Teisės ir jų panaudojimas: default dalis
     */
    Integer maksimalus = 0;

    /**
     * Nr.13: Konstruktorius super be argumentų
     */
    public Isplestas() {
        super();
        this.Skaicius = 0;
    }

    /**
     * Nr.13: Konstruktorius super su argumentu
     *
     * @param x - vertė, kuri perduodama
     */
    public Isplestas(Integer x) {
        super(x);
        this.Skaicius = 0;
    }

    /**
     * Nr.14: GetSet technologija Get dalis
     *
     * @return grąžina saugomą Stotele vertę
     */
    public String getStotele() {
        return Stotele;
    }

    /**
     * Nr.14: GetSet technologijaSet dalis
     *
     * @param Stotele - vertė, kurią reiks saugoti
     */
    public void setStotele(String Stotele) {
        this.Stotele = Stotele;
    }

    @Override
    public String toString() {
        return Stotele;
    }

    /**
     * Nr.15: Metodas klasėje Nr.16: Daugiareikšmingumas (overloading)
     *
     * @param verte1 - primasis lyginamas skaičius
     * @param verte2 - antrasis lyginamas skaičius
     */
    void Palygink(Integer verte1, Integer verte2) {
    }

    /**
     * Nr.16: Daugiareikšmingumas (overloading)
     *
     * @param verte1 - primasis lyginamas skaičius
     * @param verte2 - antrasis lyginamas skaičius
     * @param stotis - stotelės pavadinimas
     */
    void Palygink(Integer verte1, Integer verte2, String stotis) {
        if (this.maksimalus < verte1 + verte2) {
            this.maksimalus = verte1 + verte2;
            this.Stotele = stotis;
        }
    }
}
