public abstract class  ProduitFactory {
    public   Produit getProduit(){
        return  createProduit();
    }
    public  abstract Produit createProduit();
}
