package views;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Article;
import utils.Validator;

public class ArticleVue {
   //Dependance 
     private Validator validator;
     private Scanner scanner=new Scanner(System.in);
     private CategorieVue categorieVue;
    public ArticleVue(){
      this.validator = new Validator();
      this.categorieVue = new CategorieVue();
    }

    public  Article saisie() {
        
          //1-Saisir l'article
          Article article=new Article();
           do {
              System.out.println("Entrer l'id");
              article.setId(scanner.nextInt());
           } while (!validator.isPositif(article.getId()));
          
           scanner.nextLine();
           do {
              System.out.println("Entrer le Libelle");
              article.setLibelle(scanner.nextLine());
            } while ( article.getLibelle().equals(""));
            do {
            System.out.println("Entrer le prix ");
           article.setPrix(scanner.nextDouble());
           } while (!validator.isPositif(article.getPrix()));
            do {
             System.out.println("Entrer la qte Stock");
              article.setQteStock(scanner.nextInt());
            }while (!validator.isPositif(article.getQteStock()));
            //Saisie Categorie
             System.out.println("Choisir une Categorie");
            article.setCategorie(categorieVue.saisie());
            return article;
    } 

  
    public void affiche(ArrayList<Article> articles){
        for (Article art1 : articles) {
            System.out.println(art1.toString());
       }
    }

  
}
