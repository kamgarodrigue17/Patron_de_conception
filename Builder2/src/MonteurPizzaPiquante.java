public class MonteurPizzaPiquante extends MonteurPizza {
    @Override
    public Pizza getPizza() { return pizza; }
     
    public void monterPate() { pizza.setPate("feuilletée"); }
 public void monterSauce() { pizza.setSauce("piquante"); }
 public void monterGarniture() { pizza.setGarniture("pepperoni+salami"); 
}
@Override
    public void creerNouvellePizza() { pizza = new Pizza(); }

}