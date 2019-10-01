package Array;

public class Count {
	public static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n != 0) { 
            count += n & 1; 
            System.out.println(count);
            n >>= 1; 
            System.out.println("Number is "+n);
        } 
        return count; 
    } 
  
    // Function that return count of 
    // flipped number 
    public static int FlippedCount(int a, int b) 
    { 
        // Return count of set bits in 
        // a XOR b 
        return countSetBits(a ^ b); 
    } 
      
	public static void main(String[] args) {
		int a = 10; 
        int b = 13; 
        System.out.print(FlippedCount(a, b)); 

	}

}
