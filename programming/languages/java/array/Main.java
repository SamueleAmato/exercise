public class Main {
  public static void main(String[] args) {
    int[] k = {1, 2, 3, 4};

    int[] t = new int[20]; // Declaration of an array of int long 20 int 

    // NOTE: to return an array without declaring it: return new int[] {1, 2, 3};
   
    // Regged array
    
    // Int is a bydimansional array, the first dimension is long 5 and the second one 10;
    int[][] ragged_x = new int[2][];
    ragged_x[0] = new int[5];
    ragged_x[1] = new int[10];

    for (int[]x : ragged_x) {
      for (int y : x) {
        System.out.printf("%d ", y);
      }
      System.out.printf("\n");
    }
  }
}

