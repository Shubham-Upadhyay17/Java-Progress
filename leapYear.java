// PSEUDO-CODE
/*
    start
    input = year
    if year % 4 == 0
        year = leap
    else
        year != leap
    stop
*/

//CODE

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        System.out.println("Please enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("Input is leap year");
        }else {
            System.out.println("Input is not a leap year");
        }
    }
}
