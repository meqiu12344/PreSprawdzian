import napoje.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        ArrayList<Napoje> napojes = new ArrayList<>();


        // DODANIE NAPOI DO LISTY
        napojes.add(new woda("cisowianka", true));
        napojes.add(new sok("lipton", "brzoskiniowy"));
        napojes.add(new nektar("hortex", "brzoskiniowa"));


        // SORTOWANIE PO NAZWIE

        napojes.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return o1.getNazwa().compareTo(o2.getNazwa());
            }
        });


        // PROGRAMOWANIE

        KochajacyProgramowac programowac = new KochajacyProgramowac() {
            @Override
            public String programuje() {
                return "Programuje";
            }
        };

        // LAMBDA

        Function<String, Integer> len = (String tekst) -> tekst.length();
        System.out.println("Długość twojego stringa wynosi: " + len.apply("test"));

        Consumer<Integer> ocena = (Integer oce) -> System.out.println("Twoja ocena to: " + oce);
        ocena.accept(6);

        BiFunction<Integer, Integer, Integer> mno = (Integer a, Integer b) -> a*b;
        System.out.println(mno.apply(1,2));
    }
}