package database;

import java.util.ArrayList;


import entity.Article;

public class MysqlDatabase {
    public void executeUpdate(String sql,Object ...params){
     //JDBC pour l'execution des requetes
      System.out.println("Execute  "+sql);
    }

    public ArrayList<Article> executeSelect(String sql,Object ...params){
        //JDBC pour l'execution des requetes
         System.out.println("Execute  "+sql);
         //Recuperer les donnees et les stokes dans une list
         return new ArrayList<>();
       }

      
}
