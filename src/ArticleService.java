import java.util.ArrayList;

public class ArticleService {
    private  ArrayList<Article> articles=new ArrayList<Article>();

    public void addArticle(Article article) {
        articles.add(article);
        //requete sql
        //execution de la requete sql
    }
    public ArrayList<Article>  findAll() {
       return articles;
    }
}
