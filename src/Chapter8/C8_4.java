package Chapter8;

public class C8_4 {

    public static void main(String[] args) {
        int counter = 0;
        int[][] a = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        System.out.println("                Su      M       T       W       Th      F       S       Total");
        for (int r = 0; r < a.length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < a[r].length; c++) {
                System.out.print("\t" + a[r][c]);
            }
            System.out.println("       " + (a[counter][0] + a[counter][1] + a[counter][2] + a[counter][3] + a[counter][4] + a[counter][5] + a[counter][6]));
            counter++;
        }
    }
}
