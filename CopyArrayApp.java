import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    ArrayList<Integer> myVals = new ArrayList<>(0);
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      if (myVals.contains(item)) {
        continue;
      }
      else {
        myVals.add(item);
      }
    }
    System.out.println("original values: " + Arrays.toString(args));
    System.out.println("unique values: " + myVals);
  }
}