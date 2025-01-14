package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        System.out.println(asterix.getGaulois());
        System.out.println(asterix.parler("Bonjour � tous"));
        Romain minus = new Romain("Minus", 6);
        System.out.println(asterix.parler(" UN GAU… UN GAUGAU… "));
    }

}
