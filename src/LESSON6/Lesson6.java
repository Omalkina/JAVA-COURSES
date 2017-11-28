package LESSON6;

public class Lesson6 {

    public static void main(String[] args) {
      lesson6Ex3();
    }


    static void lesson6Ex3() {
        String[][] matrixA;
        matrixA = new String[9][7];
        matrixA[0][0] ="XXX";
        matrixA[0][1] = "";
        matrixA[0][2] = "";
        matrixA[0][3] = "XXX";
        matrixA[0][4] = "";
        matrixA[0][5] = "";
        matrixA[0][6] = "XXX";
        matrixA[1][0] = "";
        matrixA[1][1] = "XXX";
        matrixA[1][2] = "";
        matrixA[1][3] = "XXX";
        matrixA[1][4] = "";
        matrixA[1][5] = "XXX";
        matrixA[1][6] = "";
        matrixA[2][0] = "";
        matrixA[2][1] = "";
        matrixA[2][2] = "XXX";
        matrixA[2][3] = "XXX";
        matrixA[2][4] = "XXX";
        matrixA[2][5] = "";
        matrixA[2][6] = "";
        matrixA[3][0] = "XXX";
        matrixA[3][1] = "XXX";
        matrixA[3][2] = "XXX";
        matrixA[3][3] = "XXX";
        matrixA[3][4] = "XXX";
        matrixA[3][5] = "XXX";
        matrixA[3][6] = "XXX";
        matrixA[4][0] = "";
        matrixA[4][1] = "";
        matrixA[4][2] = "XXX";
        matrixA[4][3] = "XXX";
        matrixA[4][4] = "XXX";
        matrixA[4][5] = "";
        matrixA[4][6] = "";
        matrixA[5][0] = "";
        matrixA[5][1] = "XXX";
        matrixA[5][2] = "";
        matrixA[5][3] = "XXX";
        matrixA[5][4] = "";
        matrixA[5][5] = "XXX";
        matrixA[5][6] = "";
        matrixA[6][0] = "XXX";
        matrixA[6][1] = "";
        matrixA[6][2] = "OO";
        matrixA[6][3] = "XXX";
        matrixA[6][4] = "OO";
        matrixA[6][5] = "";
        matrixA[6][6] = "XXX";
        matrixA[7][0] = "XXX";
        matrixA[7][1] = "";
        matrixA[7][2] = "";
        matrixA[7][3] = "";
        matrixA[7][4] = "";
        matrixA[7][5] = "";
        matrixA[7][6] = "XXX";
        matrixA[8][0] = "";
        matrixA[8][1] = "XXX";
        matrixA[8][2] = "";
        matrixA[8][3] = "";
        matrixA[8][4] = "";
        matrixA[8][5] = "XXX";
        matrixA[8][6] = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

