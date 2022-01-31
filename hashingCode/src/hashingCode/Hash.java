package hashingCode;

public class Hash {

	public static void main(String[] args) {
		String a ="200";
		String b="200";
		
		if(a.equals(b)) {
			System.out.println("Equal variables");
			System.out.println(a.hashCode() + "\n" + b.hashCode());
		}
		
		String c ="20";
		String d="200";
		
		if(a.equals(b)) {
			System.out.println("UnEqual variables");
			System.out.println(c.hashCode() + "\n" + d.hashCode());
		}
		
	}

}
