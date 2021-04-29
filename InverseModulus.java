public class InverseModulus {
    /*
    1.	(10 points) Recall that a value a has an inverse mod n iff a is relatively prime to n.
    Compute the multiplicative inverses for the values 1 to 34 mod 35.
    I suggest writing a small program to do this.
    We have not discussed the extended Euclidean algorithm,
    which is the usual way of finding inverse, so it's fine for each a to try all possible values to find its inverse.
    Put your results in a table containing only those values that do have inverses along with the inverses.
     */
    public static void main(String[] args) {

        int[] number = new int[]
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                        26, 27, 28, 29, 30, 31, 32, 33, 34
                };

        for (int x = 0; x < 34; x++) {
            if ((inverse(number[x]) != 0)) {
                System.out.println(String.format("The number: %d \t The inverse: %d \n", x+1, inverse(number[x])));
            } else {
                System.out.println(String.format("\t %d has no inverse \n", x+1));
            }
        }

    }
        static int inverse(int digit) {
            digit = digit % 35;
            for (int x = 1; x < 35; x++) {
                if ((digit * x) % 35 == 1)
                    return x;
            }
            return  0;
        }
}
