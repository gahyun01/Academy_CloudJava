package Inheritance;

public class Price {
  public static void main(String[] args) {
    System.out.printf("%d %d\n", 30, 20);
    System.out.printf("%d %d\n", 20, 30);

    System.out.printf("가격 : %d원\n", 25320000);
    System.out.printf("%5.3f\n", 35.33333);
    System.out.println();

    System.out.printf("%d년 %d월 %d일\n", 2009, 5, 3);
    System.out.printf("%2$d년 %3$d월 %1$d일\n", 1, 2005, 3);
    System.out.println();

    System.out.printf("%3d %10s %-8s %-5d\n", 1, "hong", "홍길동", 20);
    System.out.printf("%3d %10s %-8s %-5d\n", 22, "kim", "김아무개", 03);
    System.out.printf("%3d %10s %-8s %-5d\n", 3, "kyu", "규짱", 20);
    System.out.printf("%3d %10s %-8s %-5d\n", 4, "park", "박군", 20);
  }
}
