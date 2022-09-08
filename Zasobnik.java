package lekcia15.uloha15_3_5_zasobnik;

import java.util.LinkedList;

/**
 * trieda Zasobnik zodpoveda za vlozenie noveho prvku do zasobnika, odstranenie prvku zo zasobnika, zistenia pozicie prveho prvku, t.j. prvku na vrchole zasobnika,
 * zistenia celkovej velkosti zasobnika a zistenia, ci je zasobnik
 */
public class Zasobnik {

    private LinkedList<Integer> data = new LinkedList<Integer>();

    /**
     * vlozi novy prvok do zasobnika
     *
     * @param prvok prvok, ktory bude vlozeny na vrchol zasobnika
     */
    public void vloz(int prvok) {
        int novyPrvok = 0;
        data.add(novyPrvok);

    }

    /**
     * odstrani posledny vlozeny prvok, t.j. prvok na vrchole zasobnika
     *
     * @return vrati prvky zo zasobnika bez odstraneneho prvku
     */
    public int odstran() {
        return data.removeFirst();

    }

    /**
     * zisti a vrati poziciu prvku na vrchole zasobnika
     *
     * @return pozicia prvku na vrchole zasobnika
     */
    public int prvokNaVrchole() {
        return data.size();

    }

    /**
     * zisti a vrati velkost zasobnika
     *
     * @return velkost zasobnika
     */
    public int getVelkost() {
        return data.size();

    }

    /**
     * overi a vrati informaciu, ci zasobnik obsahuje nejkae prvke alebo nie
     *
     * @return true = obsahuje prvky, false = neobsahuje ziadne prvky, t.j. zasobnik je prazdny
     */
    public boolean jePrazdny() {
        if (data.isEmpty()) {
            return true;
        } else
            return false;

    }


}
