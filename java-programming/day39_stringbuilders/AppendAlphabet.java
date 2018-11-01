package day39_stringbuilders;

public class AppendAlphabet {
	public static void main(String[] args) {
		char ch = 'A';
		ch++;
		System.out.println(ch);
		StringBuilder alphabet = new StringBuilder();
		String str = "";
		for(char chars='A'; chars <= 'Z'; chars++) {
			alphabet.append(chars);
			str = str + chars;
			System.out.println(alphabet);
		}
		
		System.out.println(alphabet);
		
	}
}
