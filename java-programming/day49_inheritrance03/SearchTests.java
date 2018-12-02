package day49_inheritrance03;

public class SearchTests {
	public static void main(String[] args) {
		
		SearchEngine srch = new SearchEngine();
		srch.search("iphone charger");
		
		Google gooogle = new Google();
		gooogle.search("Java overriding rules");
		
		Etsy etsy = new Etsy();
		etsy.search("Wooden Spoon!");
	}
}
