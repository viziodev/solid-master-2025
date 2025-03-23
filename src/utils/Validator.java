package utils;
public class Validator {
   public boolean isPositif(int nbre){
      return nbre>0;
   }
   public boolean isPositif(double nbre){
    return nbre>0;
  }
  public boolean isEmpty(String value){
    return value.equals("");
   }
}
