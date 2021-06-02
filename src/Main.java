import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws IOException {

        HomePage homePageGoSecuri = new HomePage();
        homePageGoSecuri.accueil();

        String chemin = "D:\\TEST\\Fiches\\cberthier.txt";


        FicheAgent ficheAgent = new FicheAgent();
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\jmacclane.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\afoley.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\jrouletabille.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\jwest.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\mriggs.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\sconnor.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "D:\\TEST\\Fiches\\sholmes.txt";
        ficheAgent.FicheAgent(chemin);


    }
}

