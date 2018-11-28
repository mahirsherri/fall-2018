package day48_inheritance02_super;

public class TestBin {
	public static void main(String[] args) {
		Bin yourBin = new Bin();
		System.out.println(yourBin.toString());
		
		yourBin.add("book");
		yourBin.add("notepad");
		yourBin.add("ipad");
		
		System.out.println(yourBin.toString());
		
		yourBin.remove("BOOK");
		
		System.out.println(yourBin.toString());
		
		RecycleBin rBin = new RecycleBin();
		rBin.add("Bottle");
		
		System.out.println(rBin);

	}
}
