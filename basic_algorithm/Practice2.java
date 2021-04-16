// package basic_algorithm;

public class Practice2 {
  public static int min3(int a, int b, int c){
    int min = a;
    if(min > b){ min = b; }
    if(min > c){ min = c; }
    return min;
  }
  public static void main(String[] args) {
    int a = 5;
    int b = 8;
    int c = 1;
    System.out.println(min3(a, b, c));
  }
}
