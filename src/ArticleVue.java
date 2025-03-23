import java.util.ArrayList;
import java.util.Scanner;

public class ArticleVue {
    public  Article saisie() {
          Scanner scanner=new Scanner(System.in);
          //1-Saisir l'article
          Article article=new Article();
           do {
              System.out.println("Entrer l'id");
              article.setId(scanner.nextInt());
           } while (article.getId()<=0);
          
           scanner.nextLine();
           do {
              System.out.println("Entrer le Libelle");
              article.setLibelle(scanner.nextLine());
           } while ( article.getLibelle().equals(""));
           do {
           System.out.println("Entrer le prix ");
           article.setPrix(scanner.nextDouble());
          } while (article.getPrix()<=0);
          do {
             System.out.println("Entrer la qte Stock");
              article.setQteStock(scanner.nextInt());
            }while (article.getQteStock()<=0);
            return article;
    } 

  
    public void affiche(ArrayList<Article> articles){
        for (Article art1 : articles) {
            System.out.println(art1.toString());
       }
    }

  
}
