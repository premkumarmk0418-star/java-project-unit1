package JavaArrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 25;
        numbers[0][1] = 10;
        numbers[0][2] = 25;

        numbers[1][0] = 10;
        numbers[1][1] = 28;
        numbers[1][2] = 26;

        numbers[2][0] = 17;
        numbers[2][1] = 15;
        numbers[2][2] = 16;


        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

