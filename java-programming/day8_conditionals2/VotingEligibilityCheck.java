package day8_conditionals2;
/* 
create a variable called age of type int.
assign some number to it

check if value of age is 18 or more,
	true -> you are eligible to vote
	false -> you are not yet eligible to vote
 */
public class VotingEligibilityCheck {
	public static void main(String[] args) {
		int age = 12;
		if(age >= 18) {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("You are not yet eligible for voting");
		}
	}
}
