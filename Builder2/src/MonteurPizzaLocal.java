public class MonteurPizzaLocal  extends MonteurPizza{

    @Override
    public void monterPate() {
        pizza.setPate("feuille de macabo");
      }

    @Override
    public void monterSauce() {
    pizza.setSauce("Sauce aux 22 condiments");
      }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("escargot");
     }
    
}
