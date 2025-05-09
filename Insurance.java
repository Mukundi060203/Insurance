import java.util.Scanner;

public class Insurance {

    public static int calculatePremium(int currentYear,int birthYear){
        int age = currentYear + birthYear;
        int decade = age/10;
        int premium = (decade + 15) * 20;
        return premium;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current year: ");
        int currentYear = input.nextInt();

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();

        int premium = calculatePremium(currentYear, birthYear);
        System.out.println("premium: R"+premium);
    }
}