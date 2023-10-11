

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ProduitFactory produitFactory = new ProduitFactory();
        Produit produit=null;
        System.out.println("Utilisation de premiere fabrique");
        produit = produitFactory.geProduit(1);
        produit.methode();
        System.out.println("Utilisation de deuxieme fabrique");
        produit = produitFactory.geProduit(2);
        produit.methode();
          

    }
}
