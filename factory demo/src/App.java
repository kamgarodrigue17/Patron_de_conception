public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Utilisation de premiere fabrique");
        ProduitFactory iProduitAbstractFactory1=new Produit1Factory();

        Produit produit=null;
        produit=iProduitAbstractFactory1.getProduit();
        produit.methode();
        System.out.println("Utilisation de deuxieme fabrique");
        iProduitAbstractFactory1=new produit2Factory();
        produit =iProduitAbstractFactory1.getProduit();
                produit.methode();
     


    }
}
