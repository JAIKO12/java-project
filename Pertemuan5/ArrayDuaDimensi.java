package Pertemuan5;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        int[][] array2D = new int[2][3];
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;
        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("array2D[" + i + "][" + j + "] = " + array2D[i][j]);
            }
        }
    }
}
