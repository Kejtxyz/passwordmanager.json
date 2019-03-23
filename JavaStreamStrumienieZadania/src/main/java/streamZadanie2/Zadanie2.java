package streamZadanie2;
//  Wykorzystując kolekcję z poprzedniej zadania
// wyświetl 5 pierwszych słówznajdujących się w liście 3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie2 {
    public static void main(String[] args) {
        List<String> listaImion = Arrays.asList("Anna","Natan","Mikolaj","Lukas","Robo", "Asif", "Barzan");
        List<String> result = new ArrayList<>();

         result = listaImion.stream().limit(3).collect(Collectors.toList());
        System.out.println("Result" + Arrays.toString(result.toArray()));


    }
}
