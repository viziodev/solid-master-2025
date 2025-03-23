public enum CategorieEnum {
    Electronic(1.2), //1.2
    ElectroMenager(1.8); //1.8
     private double taxe;
     CategorieEnum(double taxe) {
        this.taxe = taxe;
     }
     public double getTaxe() {
        return this.taxe;
     }
}
