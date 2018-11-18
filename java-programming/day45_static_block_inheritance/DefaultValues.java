package day45_static_block_inheritance;

public class DefaultValues {

	int intValue;
	byte byteValue;
	public double doubleValue;
	public boolean booleanValue;
	public char charValue;
	public String stringValue;//null
	public Integer integerObject;//null
	
	public static void main(String[] args) {
		//System.out.println(integerObject);
		DefaultValues d = new DefaultValues();
		System.out.println(d.intValue);
		System.out.println(d.byteValue);
		System.out.println(d.doubleValue);
		System.out.println(d.booleanValue);
		System.out.println(d.charValue);
		System.out.println(d.stringValue);
		System.out.println(d.integerObject);
		
		System.out.println(d.intValue + 101);
		
		//System.out.println(d.stringValue.toUpperCase());//java.lang.NullPointerException
		d.stringValue = "Hello World!";
		System.out.println(d.stringValue.toUpperCase());

	}
	
}










