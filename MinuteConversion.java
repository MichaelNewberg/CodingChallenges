// Write a function that takes an integer minutes and converts it to seconds.
// Examples
// convert(5) ➞ 300
// convert(3) ➞ 180
// convert(2) ➞ 120
// Notes
// Don't forget to return the result.
import java.util.Scanner;
class MinuteConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of time (minutes) as a whole number.");
        int minute = sc.nextInt();
        int seconds = minute * 60;
        System.out.println("Your time of " + minute + " minutes is equivalent to " + seconds + " seconds.");
        sc.close();
    }
}
