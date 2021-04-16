// package basic_algorithm;
public class Practice1 {
  public static int max4(int a, int b, int c, int d){
    int max = a;
    if(b > max){ max = b; }
    if(c > max){ max = c; }
    if(d > max){ max = d; }
    return max;
  }
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 9;
    int d = 4;
    System.out.println(max4(a, b, c ,d));
  }
}