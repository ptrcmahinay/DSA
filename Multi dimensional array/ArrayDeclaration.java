
public class ArrayDeclaration {

    public static void main(String[] args) {
      // 1D array declaration
      int[] array1d = new int[2];
      int[] array2 = {1, 2, 3};

      // Two-ways of Declaration or initialization of 2D arrays
      int[][] matrix = new int[2][2];
      int[][] matrix2 = {
        {1, 2, 3},
        {4, 5, 6}
      };

      // Two-ways of Declaration or initialization of 3D arrays
      int[][][] array3 = new int[2][2][2];
      int[][][] array4 = {
        {{1, 2, 3}, {4, 5, 6}},
        {{7, 8, 9}, {10, 11, 12}}
      };

    // 4D array Declaration or initialization or N-dimension
      int[][][][] arr = new int[2][2][2][2];
    // Initialiaze the array with values
      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
          for (int k = 0; k < 2; k++) {
            for(int l = 0; l < 2; l++){
              arr[i][j][k][l] = i + j + k + l;
            }
          }
        }
      }
  }
}
  
