import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomePage {

    public void accueil() {

        String homePage = "<!DOCTYPE html><html><head><meta charset=\"utf-8\">" +
                "<link rel=\"stylesheet\" href=\"/var/lib/jenkins/workspace/TEST1/TEST_GoSecuri/style.css\"/>" +
                "<header><h1>GoSecuri</h1></header>" +
                "<title>Home page - GoSecuri</title></head>" +
                "<body><h1>Accueil</h1></body><br><br><br>" +
                "<h2>Liste des agents</h2><br><br>" +

                "<ul><li><a href=\"corinneberthier.html\">Corinne Berthier</a></li>" +
                "<li><a href=\"samconnor.html\">Sam Connor</a></li>" +
                "<li><a href=\"janemacclane.html\">Jane MacClane</a></li>" +
                "<li><a href=\"anthonyfoley.html\">Anthony Foley</a></li>" +
                "<li><a href=\"maryriggs.html\">Mary Riggs</a></li>" +
                "<li><a href=\"johnwest.html\">John West</a></li>" +
                "<li><a href=\"sherlockholmes.html\">Sherlock Holmes</a></li>" +
                "<li><a href=\"jeanrouletabille.html\">Jean Rouletabille</a></li></ul><br><br><br><br><br><br>" +
                "</p><footer><p>Copyright GoSecuri - Tous droits réservés<br></p></footer>" +
                "</body></html>";

        File accueil = new File("/var/www/html/homepage.html");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(accueil));
            bw.write(homePage);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
