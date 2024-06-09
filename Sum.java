//PSEUDO-CODE
/*
    start
    input a,b;
    sum = a+b;
    print sum;
    end
 */
//CODE

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int sum = first + second;
        System.out.println("The sum of the input provided is: " + sum);
    }
}
