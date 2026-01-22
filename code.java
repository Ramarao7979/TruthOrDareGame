import java.util.Random;
import java.util.Scanner;

public class TruthOrDareGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] truth = {
            "What is your biggest fear?",
            "Who is your crush?",
            "Have you ever lied to your best friend?",
            "What is your most embarrassing moment?",
            "What is the last thing you searched on Google?"
        };

        String[] dare = {
            "Say 'I love coding' loudly!",
            "Clap your hands 5 times",
            "Smile for 10 seconds 😄",
            "Drink a glass of water",
            "Send 😂 emoji to your friend"
        };

        System.out.println("🎉 Welcome to Truth or Dare Game 🎉");
        System.out.println("Choose an option:");
        System.out.println("1. Truth");
        System.out.println("2. Dare");

        int choice = sc.nextInt();

        if (choice == 1) {
            int t = rand.nextInt(truth.length);
            System.out.println("🟢 TRUTH:");
            System.out.println(truth[t]);
        } 
        else if (choice == 2) {
            int d = rand.nextInt(dare.length);
            System.out.println("🔴 DARE:");
            System.out.println(dare[d]);
        } 
        else {
            System.out.println("❌ Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}