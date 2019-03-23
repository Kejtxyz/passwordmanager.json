package LambdaZadanie1;
//   Utwórz listę List<String> a następnie dodaj 5 imion do kolekcji. Korzystając z metody
//foreach listy oraz wyrażenia lambda wyświetl wszystkie imiona znajdujące się na
//liście.
//
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> listName1 = Arrays.asList("Ania", "Karol", "Lukasz", "Marcin", "Alan");

        listName1.forEach((name) -> System.out.println(name + " "));
    }
}
