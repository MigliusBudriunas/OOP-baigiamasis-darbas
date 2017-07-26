/**
 * Projektas: "VVT keleivių skaičiuoklė"
 */
package galutinisprojektas;

/**
 * Demonstruojamos technologijos: 
 * Nr.17: Klasė, objekto sukūrimas 
 * Nr.18: Duomuo
 * Nr.19: Konstruktorius 
 * Nr.20: Konstruktorius this su ir be argumentų 
 * Nr.21: Technologija toString
 *
 * @author Miglius
 * year 2017
 */
/**
 * Nr.17: Klasė, objekto sukūrimas, klasės dalis
 */
public class Skaicius {

    /**
     * Nr.18: Duomuo
     */
    public Integer Skaicius;

    /**
     * Nr.19: Konstruktorius Nr.20: Konstruktorius this be argumentų
     */
    public Skaicius() {
        this(0);
    }

    /**
     * Nr.20: Konstruktorius this su argumentu
     *
     * @param x - vertė, kuri perduodama
     */
    public Skaicius(Integer x) {
        this.Skaicius = x;
    }

    /**
     * Nr.21: Technologija toString
     *
     * @return grąžina saugomą Skaicius vertę string formatu
     */
    @Override
    public String toString() {
        return Skaicius.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
