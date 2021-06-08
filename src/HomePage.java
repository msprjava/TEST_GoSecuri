import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Création de la classe HomePage

public class HomePage {

    public void accueil() {
        
        // Contenu HTML du fichier homepage.html

        String homePage = "<!DOCTYPE html><html><head><meta charset=\"utf-8\">" +
                "<link rel=\"stylesheet\" href=\"style.css\"/>" +
                "<title>Go Securi</title></head>" +
                "<body><header><h1><a href=\"homepage.html\">Go Securi - Accueil</a></h1><span class=\"logo\"><a href=\"homepage.html\">" +
                "<img src=\"logo.jpg\"></a></span></header></body>" +
                "<br><br>" +
                "<br><br><h2> Fiches agents</h2><br>" +

                "<div><ul><li><a href=\"CorinneBerthier.html\">Corinne Berthier</a></li><br>" +
                "<li><a href=\"SamConnor.html\">Sam Connor</a></li><br>" +
                "<li><a href=\"AnthonyFoley.html\">Anthony Foley</a></li><br>" +
                "<li><a href=\"SherlockHolmes.html\">Sherlock Holmes</a></li><br>" +
                "<li><a href=\"JaneMacClane.html\">Jane MacClane</a></li><br>" +
                "<li><a href=\"MaryRiggs.html\">Mary Riggs</a></li><br>" +
                "<li><a href=\"JeanRouletabille.html\">Jean Rouletabille</a></li><br>" +
                "<li><a href=\"JohnWest.html\">John West</a></li></ul></div><br><br><br><br><br><br>" +
                "</p><footer><p>Copyright Go Securi - Tous droits réservés<br></p></footer>" +
                "</body></html>";
        
        // Création du fichier homepage.html

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
