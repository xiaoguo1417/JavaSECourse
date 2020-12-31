import java.util.Scanner;

public class Main {
    public static void main(String[] ares){
        //double[] a = {1, 2, 3, 4, 5, 6};
        int[] a = new int[6];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = scan.nextInt();
        }

        ArithmeticAverage arithmeticAverage = new ArithmeticAverage();
        double average1 = arithmeticAverage.compute(a);
        System.out.println(average1);

        Median median = new Median();
        double average2 = median.compute(a);
        System.out.println(average2);
    }
}
