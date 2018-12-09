package day50_final_super_abstraction;

public class FInalMethods {
	
	public final void makeAPhoneCall( String phoneNumber ) {
		System.out.println("Dial number:" + phoneNumber 
							+"\n Press On Call");		
	}
	
	public static final void readSMSMessage(String sender) {
		System.out.println("Open messages and read for " + sender);		
	}
	
}

class Sub extends FInalMethods{
	/**
	 * Cannot override inherited final method
	 */
//	public  void makeAPhoneCall(String phoneNumber) {
//		
//	}'
	
//	public static final void readSMSMessage(String sender) {
//		System.out.println("Open messages and read for " + sender);
//	}
//	
	/**
	 * Final methods can be overloaded.
	 * Since it is considered to be a new method
	 * @param number
	 */
	public void makeAPhoneCall(int number) {
		System.out.println("Dial number:" + number 
				+"\n Press On Call");		
	}

}
