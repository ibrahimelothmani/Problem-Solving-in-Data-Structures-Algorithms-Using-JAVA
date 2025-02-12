

public class Main {
    public static void main(String[] args) {
        twoDArrayExample();
    }

    public static void twoDArrayExample() {
        int[][] arr = new int[4][2];
        int count = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 2; j++)
                arr[i][j] = count++;

        print2DArray(arr, 4, 2);
    }

    public static void print2DArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                System.out.println("	" + arr[i][j]);
    }
}