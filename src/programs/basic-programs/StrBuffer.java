package programs;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when we write the String value then 
		//StringBuffer growing formula is
		//new capacity=(s.length()+16)
		StringBuffer sb= new StringBuffer("ashutosh");
		System.out.println(sb.charAt(4));
		//System.out.println(sb.charAt(21));
		System.out.println(sb.capacity());

	}

}
