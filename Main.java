import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
        if (y % 400 == 0) {
            System.out.println("閏年");
        } else {
if (y%100==0){
    System.out.println("平年");
}else {
if (y%4==0){
    System.out.println("閏年");
}else {
    System.out.println("平年");
}
        }
    }
  }
}