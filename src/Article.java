//Description de Donnees ==>Diagramme Classe
public class Article {
    
    //Attributs ou des caracteristiques
     private int id; //id>0  //4octes
     private String libelle; //Libelle est obligatoire //25*2 =50
     private double prix;  //8octets
     private int qteStock; //4octes

     private CategorieEnum categorie;
     
    public CategorieEnum getCategorie() {
        return categorie;
    }
    public void setCategorie(CategorieEnum categorie) {
        this.categorie = categorie;
    }
    //Methodes
      //1-Constructeur
       //Instanciation d'un objet
       //Initialisation des Attributs d'un objet lors de la creation
      public Article(){

     }  
      //2-Getters and Setters
       public int getId() {
        return id;
       }
       public void setId(int id) {
        this.id = id;
      }
      public String getLibelle() {
        return libelle;
      }
      public void setLibelle(String libelle) {
        this.libelle = libelle;
      }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQteStock() {
        return qteStock;
    }
    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

     //Methodes metiers  ==> Une methode qui est ni un constructeur, ni un getter ni setter 
      //Comparaison de Valeur
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Article other = (Article) obj;
        if (id != other.id)
            return false;
        return true;
    }

   public void copie(Article article){
      this.id = article.getId();
      this.libelle = article.getLibelle();
      this.prix = article.getPrix();
      this.qteStock = article.getQteStock();
   }
   //Serialisation  convertion   Object ==> Chaine
   //Deserialisation  convertion  Chaine ==>  Object
@Override
public String toString() {
    return "Article [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", qteStock=" + qteStock + ", categorie="
            + categorie + "(" +categorie.getTaxe() +")]";
}
       //equals ==> Perment de comaprer deux objets(les valeurs) de la classe




      
     
}
