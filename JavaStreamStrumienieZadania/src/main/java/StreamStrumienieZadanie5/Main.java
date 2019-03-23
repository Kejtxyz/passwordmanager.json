package StreamStrumienieZadanie5;
//Dla danej listyList<Integer> numbers = Arrays.​asList​
// (​new ​Integer[]{​1​, ​4​, ​2​,33​, ​1254​, ​1​, ​6​, ​55​, ​22​, ​121​, ​8​});
// Sprawdź czy czy którykolwiek element ma wartość 6.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaListnumbers = Arrays.asList(1, 4, 2, 33, 1254, 1, 6, 55, 22, 121, 8);

        boolean result1 = listaListnumbers.stream().anyMatch(numer -> numer.equals(6));
        System.out.println(" Resultat wyswietli czy ktorys element jest 6 " + (result1));

    }
}
