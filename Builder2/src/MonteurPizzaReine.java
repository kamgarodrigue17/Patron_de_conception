public class MonteurPizzaReine extends MonteurPizza {
    @Override
    public Pizza getPizza() { return pizza; }
     
    public void monterPate() { pizza.setPate("croisée"); }
    public void monterSauce() { pizza.setSauce("douce"); }
    public void monterGarniture() {
   pizza.setGarniture("jambon+champignon"); }
   @Override
    public void creerNouvellePizza() { pizza = new Pizza(); }
}
