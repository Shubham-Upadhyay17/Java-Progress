//PSEUDO-CODE
/*
    start
    input numbers a and b
    while x != y
        if x > y
            x=x-y;
        else
            y=y-x;
    lcm = (a*b)/x;
    print lcm,hcf(x);
    end
 */
//  CODE
import java.util.Scanner;
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int x=a;
        int y=b;
        while( x != y){
            if( x > y){
                x=x-y;
            }else{
                y=y-x;
            }
        }

        System.out.println("The Hcf of the numbers are "+ x);
        int lcm = (a*b)/x;
        System.out.println("The Lcm of the numbers are: "+ lcm);
    }
}
