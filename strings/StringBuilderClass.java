/* January 04, 2017 :: utility
 * <<StringBuilder and StringBuffer utilities>>
 * 
 * 
 * 
 */

package practice.stringbuider;

public class StringBuilderClass {

	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		
		System.out.println(sb.capacity());
		//1-Add / append
		sb.append("hello");
		sb.append("world");
		
		System.out.println(sb);
	
		//2-Insert at a specific index
		sb.insert(5, "dear");
		System.out.println(sb);
		
		//3-Clear the stringbuffer
		sb.setLength(0);
		sb.append("newhi");
		System.out.println(sb);
		
		//4-Reverse
		sb.reverse();
		System.out.println(sb);
		
		//5-Delete from one point to other
		//sb.delete(2, 4);
		System.out.println(sb);
		
		//6-Replace from one point to other with given string
		sb.replace(2, 3, "going");
		System.out.println(sb);
		sb.append("456");
		//7-Capacity for size
		sb.append("1234567899");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//8-Set length
		sb.setLength(100);
		System.out.println(sb.capacity());
		
		//9-Index of 
		System.out.println(sb.indexOf("456"));
		
		//10-Last index of 
		System.out.println(sb.lastIndexOf("456"));
	}

}
