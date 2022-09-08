package lekcia15.uloha15_3_5_zasobnik;

public class ZasobnikTester {
    public static void main(String[] args) {

        Zasobnik zasobnik = new Zasobnik();

        for (int i = 1; i <= 1000; i++) {
            zasobnik.vloz(i);
        }

        System.out.println("Aktualna velkost zasobnika po pridani prvkov: " + zasobnik.getVelkost());
        System.out.println("Ocakavana hodnota: 1000");

        for (int i = 1; i <= 300; i++) {
            zasobnik.odstran();
        }


        System.out.println("\nAktualna velkost zasobnika po odobrati prvkov: " + zasobnik.getVelkost());
        System.out.println("Ocakavana hodnota: 700");

        zasobnik.odstran();
        zasobnik.odstran();
        System.out.println("\nAktualna pozicia prvku na vrchole po odobrati dvoch prvkov: " + zasobnik.prvokNaVrchole());
        System.out.println("Ocakavana hodnota: 698");

        System.out.println("\nAktualna velkost zasobnika po odobrati dvoch prvkov: " + zasobnik.getVelkost());
        System.out.println("Ocakavana hodnota: 698");

        while (!zasobnik.jePrazdny()) {
            zasobnik.odstran();
        }

        System.out.println("\nAktualna velkost zasobnika po odobrati vsetkych prvkov: " + zasobnik.getVelkost());
        System.out.println("Ocakavana hodnota: 0");
    }
}
