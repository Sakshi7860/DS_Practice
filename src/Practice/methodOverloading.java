package Practice;

class Demo_1 { 
    public void show(int x) 
    { 
        System.out.println("In int" + x); 
    } 
    public void show(String s) 
    { 
        System.out.println("In String" + s); 
    }
    public void show(short c) 
    { 
        System.out.println("In short" + c); 
    } 
    public void show(byte b) 
    { 
        System.out.println("In byte" + b); 
    } 
} 

public class methodOverloading {

	public static void main(String[] args) {
		byte a = 25; 
        Demo_1 obj = new Demo_1(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
        //obj.show(7.5);

	}

}
