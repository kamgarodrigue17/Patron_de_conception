public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // somme
        int som = Arithmetique.getInstance().somme(2, 5);
        System.out.printf("la somme est %d",som);
        // moyenne
        float moy = Arithmetique.getInstance().moyenne(2,5);
        System.out.printf("\nla moyenne est %f",moy);
        // soustraction
        int minus = Arithmetique.getInstance().soustraction(2,5);
        System.out.printf("\nla difference  est de %d",minus);
        //multiplication
        int mult = Arithmetique.getInstance().multiplication(2,5);
        System.out.printf("\nle produit est  est %d",mult);
        // division
        float div = Arithmetique.getInstance().division(2,5);
        System.out.printf("\nle rapport  est %f",div);
        
        Arithmetique s3 = Arithmetique.getInstance(5, 9,"Arithmetique");
        s3.afficheAll();
    }
}
