import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {

    System.out.println("Enter numbers:");

    Scanner input = new Scanner(System.in);

    double max = Double.MAX_VALUE;
    double min = Double.MIN_VALUE;

    while(true) {

        if (!input.hasNextDouble())
         break;
         Double num = input.nextDouble();

         min = Math.min(min, num);
         max = Math.max(max, num);
    }

    System.out.println("Max is:"+ max);
    System.out.println("Min is:"+ min);
}
}