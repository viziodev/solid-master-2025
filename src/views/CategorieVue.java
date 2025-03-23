package views;
import java.util.Scanner;

import entity.CategorieEnum;

public class CategorieVue {
   private Scanner scanner=new Scanner(System.in);
   public CategorieEnum saisie() {
    int categorie;
     do {
         System.out.println("1-Electronic");
         System.out.println("2-ElectroMenager");
         categorie=scanner.nextInt(); 
     } while (categorie!=1&&categorie!=2);
    return categorie==1?CategorieEnum.Electronic:CategorieEnum.ElectroMenager;
   }
}
