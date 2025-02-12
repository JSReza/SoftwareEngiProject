
public interface StoreDecimalInterface {
	String toString();// converts input to string to be checked if it can be converted
	boolean readInt(String s);//checks to make sure its an integer that can be converted to hex
	int getValue(String s);//if value can be converted, re-translates it into an int value
	void store(int i);//store on HashSet
	
	
}
