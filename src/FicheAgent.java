import java.io.*;
import java.util.Scanner;
import java.io.*;

// Création des fiches agents

public class FicheAgent {

    public void FicheAgent(String chemin) throws IOException {


        String line = "";
        String ligne1 = "";
        String ligne2 = "";
        String ligne3 = "";
        String ligne4 = "";
        String ligne5 = "";
        String ligne6 = "";
        String ligne7 = "";

        // Le fichier d'entrée
        File file = new File(chemin);
        // Créer l'objet File Reader
        FileReader fr = new FileReader(file);
        // Créer l'objet BufferedReader
        BufferedReader br = new BufferedReader(fr);

        int i = 0;
        // Boucle de lecture ligne par ligne du fichier
        while((line = br.readLine()) != null)
        {
            switch(i) {

                case 0:
                    ligne1 = line;

                case 1:
                    ligne2 = line;

                case 2:
                    ligne3 = line;

                case 3:
                    ligne4 = line;

                case 4:
                    ligne5 = line;

                case 5:
                    ligne6 = line;

                case 6:
                    ligne7 = line;
            }
            i++;
        }
        
        // Utilisation de la classe PrintStream afin d'écrire du contenu HTML dans des fichiers

        PrintStream fileOut = new PrintStream(ligne2 + ligne1 + ".html");
        System.setOut(fileOut);
        
        // Contenu HTML des fiches agents

        System.out.println("<!DOCTYPE html><html><head><meta charset=\"utf-8\">" +
                "<link rel=\"stylesheet\" href=\"style.css\"/><title>Fiche - " + ligne1 + ligne2 + "</title></head>" +
                "<header><h1><a href=\"homepage.html\">MSPR JAVA</a></h1>" +
                "<div class=\"logo\"><a href=\"homepage.html\"><img src=\"logo.jpg\"></a></div></header>" +
                "<body><h1>" + ligne2 + " " + ligne1 + "</h1><br>" +
                "<p>" +
                "<div class=\"photo\"><img src=\"cberthier.jpg\"></div><br><br>" +
                "<div class=\"checked\"><input type=\"checkbox\"  checked>" + ligne5 +
                "<br><input type=\"checkbox\" checked>" + ligne6 +
                "<br><input type=\"checkbox\" checked>" + ligne7 +
                "</div></p><footer><p class=\"copyright\">Copyright Go Securi - Tous droits réservés<br></p></footer></body>" +
                "</html>");






    }
}
