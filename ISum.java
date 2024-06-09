//PSEUDO-CODE
/*
    start
    input 
    sum = 0;
    while input = integer
        n = input
        sum = sum + n;
        input n++;
    print sum
    end
 */
//CODE
import java.util.Scanner;
public class ISum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1;
        System.out.println("Enter any character to quit or enter number " + i );
        int isum = 0 ;
        while(input.hasNextInt()){
            int num = input.nextInt();
            isum += num;
            i++;
            System.out.println("Enter number " + i );
        }
        System.out.println("The sum of the inputs = "+isum);

    }
}
