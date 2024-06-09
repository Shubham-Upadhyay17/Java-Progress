//PSEUDO-CODE
/*
    start
    input n
    for i = 1; i<10; i++
        mul = n * i ;
        print mul;
    end
 */
//CODE
import java.util.Scanner;
public class mulTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("The table for the input is:");
        for (int i = 1; i < 11; i++) {
            int mul = n * i;
            System.out.println(n +" * "+ i+ "= "+ mul);
        }

    }
}
