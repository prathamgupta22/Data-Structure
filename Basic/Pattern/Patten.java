public class Patten {
  public static void main(String[] args) {
    q8(5);
  }

  public static void q1(int n) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void q3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void q4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void q5(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q6(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void q7(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q8(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void q9(int n) {

  }

  public static void q10(int n) {

  }

  public static void q11(int n) {

  }

  public static void q12(int n) {

  }

  public static void q13(int n) {

  }

  public static void q14(int n) {

  }

  public static void q15(int n) {

  }
}