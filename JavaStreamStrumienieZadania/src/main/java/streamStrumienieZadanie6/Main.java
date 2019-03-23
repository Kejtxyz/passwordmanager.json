package streamStrumienieZadanie6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Dla danej listyList<Integer> numbers = Arrays.​asList​
// (​new ​Integer[]{​1​, ​4​, ​2​,33​, ​1254​, ​1​, ​6​, ​55​, ​22​, ​121​, ​8​});
// Sprawdź czy żaden z elementów nie ma wartości 122
public class Main {
    public static void main(String[] args) {
        List<Integer> listaListnumbers = Arrays.asList(1,4,2,33,1254,1,6,55,22,121,8);


        boolean result2 = !listaListnumbers.stream().anyMatch(number -> number.equals(122));
        System.out.println("Zadna liczba nie ma wartosci 122 " + (result2));



    }
}
