import java.util.Formatter;

class Conversor{

 	public static String binaryString( String val ){
		String curVal = "";
		String out = "";
		for(int i = 0; i < val.length(); i++ ){
			curVal = ""+val.charAt(i);
			if(i%2 == 0){
				out += " | ";
			}
			if( curVal.matches( "^[a-fA-F]" ) ){
				switch(curVal.toLowerCase()){
					case "a":
						out += "1010";
					break;
					case "b":
						out += "1011";
					break;
					case "c":
						out += "1100";
					break;
					case "d":
						out += "1101";
					break;
					case "e":
						out += "1110";
					break;
					case "f":
						out += "1111";
					break;
				}
			} else{
				switch( curVal ){
					case "0":
						out += "0000";
					break;
					case "1":
						out += "0001";
					break;
					case "2":
						out += "0010";
					break;
					case "3":
						out += "0011";
					break;
					case "4":
						out += "0100";
					break;
					case "5":
						out += "0101";
					break;
					case "6":
						out += "0110";
					break;
					case "7":
						out += "0111";
					break;
					case "8":
						out += "1000";
					break;
					case "9":
						out += "1001";
					break;
				}
			}
		}
		return out+" |\n";
	}
	
	public static void shortConverter( String val ){
		String shortBinVal = "0x8000";
		shortBinVal = shortBinVal.substring(2, shortBinVal.length());
		val = val.substring(2,val.length());
		char car = val.toCharArray();
		int result = 0;
		for(int i =0; i < car.length(); i++){
			result = shortBinVal&car[i];
			System.out.println(result);
		}
		
		System.out.println(result);
	}
	
	public static void byteConverter( String val ){
		String byteBinVal = "0x80";
		val = val.substring(2,val.length());
		
		
		System.out.println(binaryString(val));
	}
	
	public static void intConverter( String val ){
		String intBinVal = "0x80000000";
		val = val.substring(2,val.length());
		int acumulator = 0;
		System.out.println(binaryString(val));
	}
	
	public static void longConverter( String val ){
		String longBinVal = "0x8000000000000000L";
		val = val.substring(2,val.length());
		int acumulator = 0;
		
		System.out.println(binaryString(val));
	}
	
	public static void main( String ... args ){
		
		String byteValue 	= "0x1a";
		String shortValue 	= "0x8014";
		String intValue		= "0xE1463d5f";
		String longValue		= "0x75a46133dd1aae40";
		
		System.out.println("Valor del byte: \n");
		byteConverter(byteValue);
		System.out.println("Valor del short: \n");
		shortConverter(shortValue);
		System.out.println("Valor del int: \n");
		intConverter(intValue);
		System.out.println("Valor del long: \n");
		longConverter(longValue);
	}
	
}

