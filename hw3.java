import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum =0;
        if (a <= 120) {
            System.out.println( a * 2.10);
            sum =252;
        } else if ( a <= 330){
                System.out.println(sum+(a-120) * 3.02);
                sum=886;
            } else {
                if (  a <= 500) {
                    System.out.println(sum+(a-330)*4.39);
                    sum=1651;
                    if (  a <= 700) {
                        System.out.println(sum+(a-500) * 4.97);
                    } else {
                            System.out.println(200*4.97+170*4.39+110*3.02+120*2.1+(a-700)* 5.63);
                        }
                    }
                }
            }
        }

