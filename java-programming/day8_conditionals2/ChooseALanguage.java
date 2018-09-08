package day8_conditionals2;

import java.util.Scanner;
//BREAK TILL 4:18 PM EST
public class ChooseALanguage {
	public static void main(String[] args) {
		/*
		 * English -> 1
		 * Spanish -> 2
		 * Turkish -> 3
		 * Russian -> 4
		 * Uyghur -> 5
		 * Uzbek -> 6
		 * Kyrgyz -> 7
		 * Tajik -> 8
		 * Any other say -> I do not speak that language
		 */
		System.out.println("Please select: English -> 1 \n"+
							"Spanish -> 2 \n"+
							"Turkish -> 3 \n"+
							"Russian -> 4 \n"+
							"Uyghur -> 5 \n"+
							"Uzbek -> 6 \n"+
							"Kyrgyz -> 7 \n"+
							"Tajik -> 8");
		
		Scanner scan = new Scanner(System.in);
		
		int language = scan.nextInt();
		String greeting="";
		if(language == 1) {
			greeting = "Hello, How are you?";
		}else if(language == 2) {
			greeting = "Hola , Como Estas?";
		}else if(language == 3) {
			greeting = "Merhaba, Nasilsiniz?";
		}else if(language == 4) {
			greeting = "Privet, Kak dela?";
		}else if(language == 5) {
			greeting = "ياخشىمۇسىز!";
		}else if(language == 6) {
			greeting = "Salom, Qalesiz?";
		}else if(language == 7) {
			greeting = "Salam, Kandaysiz?";
		}else if(language == 8) {
			greeting = "Salom, Chihel shumo?";
		}else {
			greeting = "I do not speak that language";
		}
		
		System.out.println(greeting);
		
		
	}	
	
}
