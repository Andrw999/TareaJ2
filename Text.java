import java.util.Formatter;

class Text{
	public static void main( String ... args ){
		String 	test 	= "0000000000000000";
		String 	m 		= "1010000011011010";
		String a1 = "111";
		int a = -128;
//  		System.out.println(Integer.toHexString(a));
//  		System.out.println(Integer.toBinaryString(a));
//  		System.out.println(Integer.toBinaryString(9>>>1));
 		System.out.println( String.format("%010d", a1));
		
  		/*char bitch[] = m.toCharArray();
  		int result = 0;
  		char muestra[] = m.toCharArray();
  		for(int i = 0; i < bitch.length; i++){
  			result >>>= 1;
  			result |= (bitch[i] == '0')?0:1;
  			
  		}
		System.out.println(result);*/
	}
}