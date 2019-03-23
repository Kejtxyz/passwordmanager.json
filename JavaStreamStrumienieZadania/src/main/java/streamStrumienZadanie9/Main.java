package streamStrumienZadanie9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//  Utwórz kolekcję z 6 liczbami.
// Korzystając z strumieni znajdź maksymalną,
// minimalnąliczbę oraz
// średnią wszystkich liczb znajdującą się w kolekcji.
public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(1,4,6,2,98,120);

        OptionalInt result2 = listNumber.stream().mapToInt(l -> l ).max(); // konwertuje na strumien,int
        OptionalInt result3 = listNumber.stream().mapToInt(l -> l).min();

        System.out.println(" Maksymalna liczba w strumieniu " + result2.getAsInt()+"\n" + result3.getAsInt());
        int sum = 0;
        for(int num : listNumber){
            sum = sum + num;
            sum = sum / listNumber.size();
        }
        System.out.println("Srednia zsumowanych liczb : " + sum);


    }
}
