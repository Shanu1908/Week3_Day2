package week3.day2;

public interface Software extends Hardwareresource {

	public static void main(String[]args) {
	}
	interface Hardwareresources{  
	void themouse();  
	void thekeyboard();
	void themonitor();

	public default void theplugs(){
		
		System.out.println("The mouse is used to click");}  
	
public default void thekeyboard1(){
		
		System.out.println("The keyboard is used to type");}  
	}  
	}  

