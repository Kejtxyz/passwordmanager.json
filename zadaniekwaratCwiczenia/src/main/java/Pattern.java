public class Pattern {

    public static void main(String[] args) {

        new Pattern().prepareSquareWihDiagonals('#', 7);

    }

    public String prepareSquareWihDiagonals(char sign, int size) {
        String pattern = "";
// petla chodzaca iterujaca po wierszach
        for (int i = 0; i < size; i++) {
            // petla iterujaca po kolumnach
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    if (j != size - 1) {
                        pattern = pattern + sign + " ";
                    } else {
                        pattern = pattern + sign + "\n";
                    }
                } else if (i != 0) {
                    if (j == 0) {
                        pattern = pattern + sign + " ";
                    } else if (i == j || i == size - j - 1) {
                        pattern = pattern + sign + " ";
                    } else if (j == 0 && i == size - 1 || j == size - 1) {
                        pattern = pattern + sign + "\n";
                    } else {
                        pattern = pattern + "  ";
                    }
                }
            }
        }

        System.out.println(pattern);
        return pattern;


    }
}
