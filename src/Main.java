import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws IOException {

        HomePage homePageGoSecuri = new HomePage();
        homePageGoSecuri.accueil();

        String chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/cberthier.txt";


        FicheAgent ficheAgent = new FicheAgent();
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/jmacclane.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/afoley.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/jrouletabille.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/jwest.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/mriggs.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/sconnor.txt";
        ficheAgent.FicheAgent(chemin);

        chemin = "/var/lib/jenkins/workspace/GoSecuri/TEST_GoSecuri/Fiches/sholmes.txt";
        ficheAgent.FicheAgent(chemin);


    }
}

