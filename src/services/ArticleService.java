package services;
import java.util.ArrayList;

import database.MysqlDatabase;
import entity.Article;


/*
  gescom V.1.0.0
   version majeur.fonctionel.mineur
        -mineur: Correction de bogues
        //Ajouter de la categorie
         gescom V.1.0.1
        -fonctionnel: Ajout de nouvelles fonctionnalites
          //Creer Commande ==>  gescom V.1.1.0
        -majeur : changer de technologie ou Architecture ou Ressource Materiel
               //Mis a jour: 
                   -Structure de Stockage List==>Base de donnees
                   -Approche :
                      -Modification  ==>  Stockage va se faire dans une Bd mais plus dans une List
                      -Evolution(Open/Close Principle )  ==>  Stockage List ou Dans une Bd c'est au choix 

          ==> gescom V.2.0.0
 */
public class ArticleService {
     private MysqlDatabase database;
     public ArticleService(){
      this.database = new MysqlDatabase();
     }
    public void addArticle(Article article) {
        String sql="insert into article (libelle,prix,..) values (?, ?)";
        //execution de la requete sql
        this.database.executeUpdate(sql,article.getLibelle(),article.getPrix());
    }
    public ArrayList<Article>  findAll() {
       return this.database.executeSelect("select * from article");
    }
}
