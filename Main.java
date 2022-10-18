public class Main {
    public static void main(String[] args) {

        int[][] matrix={{1,2,3,5},{8,3,6,7}};
        int[][] boyut=new int[4][2];
        for(int i=0;i<boyut.length;i++){
            for(int j=0;j< matrix.length;j++){
                boyut[i][j]=matrix[j][i];

            }

        }for (int row = 0; row < boyut.length; row++) {
            for (int column = 0; column < boyut[row].length; column++) {
                System.out.print(boyut[row][column] + " ");
            }
            System.out.println();
        }

    }
}