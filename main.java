import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Please type in your name");

        Scanner input = new Scanner(System.in);
        String userName= input.nextLine();
        System.out.println("Hi " + userName );

        System.out.println("Please state youre age");

        int age = input.nextInt();
        System.out.println("You are " + age + " Years old fam");

        int retirementAge = 67;
        int retiring = retirementAge - age;
        System.out.println("You can retire in " + retiring + " Years");
    }
}
