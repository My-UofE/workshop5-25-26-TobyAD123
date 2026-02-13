import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int[] myVals = new int[nVals];
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      myVals[i] = item;
    }
    System.out.println(Arrays.toString(myVals));
  }
}