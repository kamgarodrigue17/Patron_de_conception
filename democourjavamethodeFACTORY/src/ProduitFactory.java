public class ProduitFactory{
    Produit produit =null;
    public static final int  type_un=1;
      public static final int  type_deux=2;
      public static final int  type_trois=3;
      public Produit geProduit(int type_produit){

        switch (type_produit) {
            case type_un:
            produit = new Produit1();
                
                break;
            case type_deux:
             produit = new Produit2();

             break;
             
        
            default:
            throw new IllegalArgumentException("type de produit  inconnu");
               
        }
        return  produit;
      }
   
}