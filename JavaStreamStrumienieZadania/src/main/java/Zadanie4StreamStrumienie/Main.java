package Zadanie4StreamStrumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//  Utwórz kolekcję z dowolnymi słowami,
// a następnie korzystając z Stream utwórz listęzawierającą długość słów
public class Main {
    public static void main(String[] args) {
        List<String> nazwalistyzlistaimion = Arrays.asList("Natan","RObertho", "Robo", "asif", "Barzan");
        List<Integer> result = new ArrayList<>();

        result = nazwalistyzlistaimion.stream().map(imie -> imie.length()).collect(Collectors.toList());
        System.out.println("Resultat " + Arrays.toString(nazwalistyzlistaimion.toArray()));



    }
}
