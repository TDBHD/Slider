import java.util.Random;

public class Slider {
    int sliderArray[][] =
            {{0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}};
    int sliderArrayRichtig[][] = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
    int zeilen = 4;
    int spalten = 4;
    int a;

    public void mischen(int[][] a) {
        /*Fisher–Yates Algorithmus*/
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = a[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                int temp = a[i][j];
                a[i][j] = a[m][n];
                a[m][n] = temp;
            }
        }
    }

    public void Spielfeld() {
        System.out.println("+--+--+--+--+--+--+");
        System.out.println("| " + sliderArray[0][0] + " | " + sliderArray[0][1] + " | " + sliderArray[0][2] + " | " + sliderArray[0][3] + " | ");
        System.out.println("+--+--+--+--+--+--+");
        System.out.println("| " + sliderArray[1][0] + " | " + sliderArray[1][1] + " | " + sliderArray[1][2] + " | " + sliderArray[1][3] + " | ");
        System.out.println("+--+--+--+--+--+--+");
        System.out.println("| " + sliderArray[2][0] + " | " + sliderArray[2][1] + " | " + sliderArray[2][2] + " | " + sliderArray[2][3] + " | ");
        System.out.println("+--+--+--+--+--+--+");
        System.out.println("| " + sliderArray[3][0] + " | " + sliderArray[3][1] + " | " + sliderArray[3][2] + " | " + sliderArray[3][3] + " | ");
        System.out.println("+--+--+--+--+--+--+");
    }

    public void spielen() {
/* swap
    int speicher = sliderArray[0][0];
    sliderArray[0][0] = sliderArray [0][1];
    sliderArray[0][1] = speicher;
*/
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (sliderArray[y][x] == 0) {
                    System.out.println(sliderArray[x][y]);
                    System.out.println("x: "+x);
                    System.out.println("y: "+y);
                }
            }
        }


    }

    public void gameOver() {
        if (sliderArray == sliderArrayRichtig) {
            System.out.println("Gewonnen!");
        }
    }
}

