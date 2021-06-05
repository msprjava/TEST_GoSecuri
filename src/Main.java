import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws IOException {

        HomePage homePageGoSecuri = new HomePage();
        homePageGoSecuri.accueil();

        String chemin = "/var/www/html/Fiches/cberthier.txt";


        FicheAgent ficheAgent = new FicheAgent();
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/jmacclane.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/afoley.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/jrouletabille.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/jwest.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/mriggs.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/sconnor.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/www/html/Fiches/sholmes.txt";
        ficheAgent.FicheAgent(chemin);


    }
}

