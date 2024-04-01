package Exception;

public class Ex {
  public static void main(String[] args) {
    int i = 100;
    int[] arr = new int[3];
    System.out.println("\n");

    try {
      // arr[3] = 789;
      Integer.parseInt("java");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
