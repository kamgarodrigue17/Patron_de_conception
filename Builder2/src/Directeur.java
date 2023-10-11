public class Directeur {
   private MonteurPizza monteurPizza ;
  public  Directeur(MonteurPizza monteurPizza){
    this.monteurPizza=monteurPizza;
    }
    
public Pizza construire(){
    monteurPizza.creerNouvellePizza();
    monteurPizza.monterSauce();
    monteurPizza.monterPate();
    monteurPizza.monterGarniture();

return monteurPizza.getPizza();
}
}
