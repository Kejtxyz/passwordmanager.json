package pl.sda.exampletests.test1przyklad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



//Fizz Buzz
//Zwróć „fizz”, „buzz” lub „fizzbuzz”.
//
//Dla danej liczby naturalnej większej niż zero powrotu:
//
//"fizz" if the number is dividable by 3
//"buzz" if the number is dividable by 5
//"fizzbuzz" if the number is dividable by 15
//the same number if no other requirement is fulfilled

import static org.assertj.core.api.Java6Assertions.assertThat;

public class test2 {
    // @formatter:off

    @DisplayName("given an empty string,+" +
            " then 0 is returned")
    @ParameterizedTest(name = "string numbers : {0}, expectec {1}")
    @CsvSource()
    @Test
    void test(String stringNumbers) throws Exception{
        //when
        int sum = StringCalculator.add(stringNumbers);

        //then
        assertThat(sum).isEqualTo(expectedSum);
    }
}
