package streamStrumienZadanie8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//  Utwórz nieposortowaną kolekcję z 10 dowolnymi i unikatowymi imionami.
// Korzystającze strumieni posortuj kolekcję i wyświetl ją
public class Main {
    public static void main(String[] args) {
        List<String> unikatelistnames = Arrays.asList("Anna","Michal","Jan","Kuba","Filip","Mateusz","Rafal","Marta","Kasia","Jacek");

        List<String> result2 = unikatelistnames.stream().sorted().collect(Collectors.toList());
        System.out.println(result2);
    }
}
// compare to - do sortowania, lambda, innych wartosci