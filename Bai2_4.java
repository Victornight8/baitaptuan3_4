import java.util.Scanner;

public class Bai2_4 {

    static void IN () {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <=10; j++) {
                System.out.println( i + "x"+ j+"="+i*j);
            }
            System.out.println();
        }
    }

    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        IN();
    }
}