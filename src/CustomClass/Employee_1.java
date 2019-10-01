package CustomClass;

public class Employee_1 implements Comparable<Employee_1>{
	int eno;
	String ename;
	String ecity;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
//	@Override
//	public int hashCode()
//	{
//		return eno;
//	}
//	@Override
//	public boolean equals(Object obj)
//	{
//		Employee_1 emp1=(Employee_1)obj;
//		if((this.eno==emp1.eno) && (this.ename.equals(emp1.ename) )&& (this.ecity.equals(emp1.ecity)))
//			return true;
//		else
//			return false;
//			
//		
	//}
	@Override
	public int compareTo(Employee_1 o) {
		Employee_1 emp1=(Employee_1)o;
		if(this.eno < emp1.eno)
			return -1;
		else if(this.eno > emp1.eno)
			return 1;
		else
			return 0;
		
	}
	@Override
	public String toString() {
		return "Employee_1 [eno=" + eno + ", ename=" + ename + ", ecity=" + ecity + "]";
	}
	
	
}
