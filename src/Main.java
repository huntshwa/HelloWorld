import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in); //creating scanner
        String name = s.nextLine(); //assigning variable with input
        System.out.println("Hello, " + name + "!");

        File f = new File("Class.txt");
        s = new Scanner(f); //creating scanner
        String course = s.nextLine(); //adding content of txt file to variable
        System.out.println("Welcome to " + course + "!");
    }
}
