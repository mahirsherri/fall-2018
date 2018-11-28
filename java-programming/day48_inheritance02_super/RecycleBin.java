package day48_inheritance02_super;

public class RecycleBin extends Bin {
//	public RecyleBin() {
//	  setType("recycle bin");
//	}
	
	public RecycleBin() {
		super("recycle bin");
	}
	
	public RecycleBin(String typeOfRecycleBin) {
		super(typeOfRecycleBin);
	}
	
}
