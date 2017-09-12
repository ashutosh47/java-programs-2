package programs;

public class StrBuffer2 {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("ashutosh");//append method follow method overloading
		                                  //like for String,int,double,boolean,char
		sb.append("the value is:");
		sb.append(true);
		//System.out.println("  :  ");
		sb.append('a');
		sb.append(3.14);
		System.out.println(sb);
		sb.insert(3,"xxx");//insert method used to insert the character into the given index. 
		System.out.println(sb);
		sb.deleteCharAt(3);//used to delete the char at the specified index
		System.out.println(sb);
		sb.delete(3,6);//sb.delete(int begin,int end); used to delete the string from one index to another index)
		System.out.println(sb);
		System.out.println(sb.reverse());//reverse is used to reverse the string !
	    sb.setLength(5);//setLength is used to set the length we want like how much character we want !
		System.out.println(sb);
		StringBuffer sb1= new StringBuffer("ashutosh chourasiya");
		sb1.setLength(4);
		System.out.println(sb1);
		sb1.ensureCapacity(1000);//how much capacity we want on demand on air we used this method ensureCapacity()
		System.out.println(sb1.capacity());
		sb1.trimToSize();//it is used to trim the  capacity size to reduce the unwanted memory allocations
		System.out.println(sb1.capacity());
		sb1.append("tosh").append("chourasiya").append("is").delete(1,10).insert(10,12);
		System.out.println(sb1);//method chaining is allowed in String,StringBuffer and StringBuilder
 	}

}
