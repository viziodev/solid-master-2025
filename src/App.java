import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner scanner=new Scanner(System.in);
         //Creation des Dependance
         ArticleVue articleVue=new ArticleVue();
         ArticleService articleService=new ArticleService();
         int choix;
         do {
            System.out.println("1-Ajouter Article");
            System.out.println("2-Lister les  Articles");
            System.out.println("3-Quitter");
            System.out.println("Faites votre choix");
            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                    Article article=articleVue.saisie();
                    //Ajouter Article dans la liste
                    articleService.addArticle(article);
                    break;
                    case 2:
                    articleVue.affiche(articleService.findAll());
                default:
                    break;
            }
         
         } while (choix!=3);
         scanner.close();
        
    }




}
