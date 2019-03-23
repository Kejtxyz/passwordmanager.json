package Lambdastream1.Filter.Filer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,110,200,1,4,5);
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i< numbers.size(); i++){
            if(numbers.get(i) > 100 ){
                result.add(numbers.get(i));


            }
            numbers.stream().filter(element -> element > 100 ).collect(Collectors.toCollection());
            System.out.println("Result : " + Array.toString(result.toArray()));

            // mozna na tym wykonywac jakies operacje, np, dodawanie,


        }
    }
}
