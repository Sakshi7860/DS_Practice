package Practice;

public class ClonePractice implements Cloneable {
	

	public ClonePractice() {
		System.out.println("Cloned");
		
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		ClonePractice cp=new ClonePractice();
		ClonePractice cp1=(ClonePractice) cp.clone();
		System.out.println(cp.hashCode());
		System.out.println(cp1.hashCode());

	}

}
