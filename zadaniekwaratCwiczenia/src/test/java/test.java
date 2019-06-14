import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class test {
// test
    @Test
    @Parameters(method = "patternParameters")
    public void piwienienstworzyckwadrat(char sign, int size, String pattern) throws Exception {
        // given poczatek
                Pattern kw = new Pattern();
        // when akacja ktora chcecmy testowac
            String actual = kw.prepareSquareWihDiagonals(sign, size );
        // then sprawdzamy czy aplikacja zachowala sie zgodnie z oczekiwaniami
       Assertions.assertThat(actual).isEqualTo(pattern);
    }

        private Object patternParameters(){
            return new Object[][]{
                    {'x', 0, ""},
                    {'#', 1, "#\n"},
                    {'*', 2, "* *\n* *\n"},
                    {'@', 3, "@ @ @\n@ @ @\n@ @ @\n"},
                    {'\u00A9', 4, "\u00A9 \u00A9 \u00A9 \u00A9\n\u00A9 \u00A9 \u00A9 \u00A9\n\u00A9 \u00A9 \u00A9 \u00A9\n\u00A9 \u00A9 \u00A9 \u00A9\n"},
                    {'x', 5, "x x x x x\nx x   x x\nx   x   x\nx x   x x\nx x x x x\n"},
                    {'%', 6, "% % % % % %\n% %     % %\n%   % %   %\n%   % %   %\n% %     % %\n% % % % % %\n"},

            };
    }
}





