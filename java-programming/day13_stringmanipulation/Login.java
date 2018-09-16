package day13_stringmanipulation;

public class Login {
	public static void main(String[] args) {
		String secretUserName = "admin";
		String secretPassword = "abc123";
		
		//2 variables, userName, password.
		//make sure they match wiht secret ones. and alloow login successfully
		//Whenever login is not successful, let program tell exact reason 
		//why it is not valid:
			//username is not valid
			//password is not valid
			//both username and password are invalid
		String userName = "admin2";
		String password = "abc123";
					//dont worry about case
		if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword) ) {
			System.out.println("Login Successful. Welcome back!");
		}else {
			//System.out.println("ERROR: Invalid Username or Password");
			if( !userName.equalsIgnoreCase(secretUserName) && !password.equals(secretPassword) ) {
				System.out.println("ERROR: Both Username and password are invalid");
			}else if(!userName.equalsIgnoreCase(secretUserName)) {
				System.out.println("ERROR: Username is not valid");
			}else {
				System.out.println("ERROR: Password is not valid");
			}
			
		}
		
		//boolean b = password.equals(secretPassword);
		
		
	}
}
