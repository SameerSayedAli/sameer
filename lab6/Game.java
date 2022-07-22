import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int cmp_choice = rand.nextInt(3) + 1;
		int no_choices = 0;
		int t_chances = 4;
		int P_point = 0;
		int C_point = 0;

		while (no_choices <= t_chances) {
			System.out.println("Enter rock, paper, scissor as 1,2,3");
			byte user_input = sc.nextByte();

			if (user_input == cmp_choice) {
				System.out.println("Its a tie");
			} else if (user_input == 1 && cmp_choice == 2) {
				System.out.println("you lose");
				C_point = C_point + 1;
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);
				System.out.println("your score is" + " " + P_point + "Computer score is" + C_point);

			} else if (user_input == 1 && cmp_choice == 3) {
				System.out.println("you won");
				P_point = (int) P_point + 1;
				System.out.println("your score is" + " " + P_point + "Computer score is" + " " + C_point);
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);

			} else if (user_input == 2 && cmp_choice == 1) {
				System.out.println("you won");
				P_point = (int) P_point + 1;
				System.out.println("your score is" + " " + P_point + "Computer score is" + " " + C_point);
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);

			} else if (user_input == 2 && cmp_choice == 3) {
				System.out.println("you lose");
				C_point = C_point + 1;
				System.out.println("your score is" + " " + P_point + "Computer score is" + " " + C_point);
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);

			} else if (user_input == 3 && cmp_choice == 1) {
				System.out.println("you lose");
				C_point = C_point + 1;
				System.out.println("your score is" + " " + P_point + "Computer score is" + " " + C_point);
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);

			} else if (user_input == 3 && cmp_choice == 2) {
				System.out.println("you won");
				P_point = (int) P_point + 1;
				System.out.println("your score is" + " " + P_point + "Computer score is" + " " + C_point);
				System.out.println("you entered" + user_input + "computer entered" + cmp_choice);

			} else {
				System.out.println("enter correct input");
			}
			no_choices++;
			int left = t_chances - no_choices;
			System.out.println("you are left with" + left + "chances");
		}
		System.out.println("Game Over");
		System.out.println("Scoreboard");
		if (C_point > P_point) {
			System.out.println("you lose your score is" + " " + P_point + "computer score is" + " " + C_point);
		} else if (C_point < P_point) {
			System.out.println("You won, your score is" + " " + P_point + "computer score is" + " " + C_point);
		} else if (C_point == P_point) {
			System.out.println("You Tied, your score is" + " " + P_point + "computer score is" + " " + C_point);
		}
		sc.close();
	}

}
