import java.util.Formatter;

class Conversor{

	public static void binConverter( byte val ){
		int byteBinVal 	= 127;
		System.out.println("Valor del byte: \n");
		for( int i = 0; i < 8; i++ ){
			if( i%8==0 ){
				System.out.print( " | " );
			}
			if( (val&byteBinVal)!=0 ){
				System.out.print( "1" );
			} else{
				System.out.print( "0" );
			}
			byteBinVal = ( byteBinVal >>> 1 );
		}
		System.out.print( " |\n" );
	}
	
	public static void binConverter( short val ){
		int byteBinVal 	= 32768;
		System.out.println("Valor del short: \n");
		for( int i = 0; i < 16; i++ ){
			if( i%8==0 ){
				System.out.print( " | " );
			}
			if( (val&byteBinVal)!=0 ){
				System.out.print( "1" );
			} else{
				System.out.print( "0" );
			}
			byteBinVal = ( byteBinVal >>> 1 );
		}
		System.out.print( " |\n" );
	}
	
	public static void binConverter( int val ){
		int byteBinVal 	= 32768;
		System.out.println("Valor del int: \n");
		for( int i = 0; i < 32; i++ ){
			if( i%8==0 ){
				System.out.print( " | " );
			}
			if( (val&byteBinVal)!=0 ){
				System.out.print( "1" );
			} else{
				System.out.print( "0" );
			}
			byteBinVal = ( byteBinVal >>> 1 );
		}
		System.out.print( " |\n" );
	}
	
	public static void binConverter( long val ){
		int byteBinVal 	= 32768;
		System.out.println("Valor del long: \n");
		for( int i = 0; i < 64; i++ ){
			if( i%8==0 ){
				System.out.print( " | " );
			}
			if( (val&byteBinVal)!=0 ){
				System.out.print( "1" );
			} else{
				System.out.print( "0" );
			}
			byteBinVal = ( byteBinVal >>> 1 );
		}
		System.out.print( " |\n" );
	}
	
	public static void main( String ... args ){
		
		byte 	byteValue 	= -128;
		short 	shortValue 	= -32768;
		int 		intValue		= Integer.MIN_VALUE;
		long 	longValue	= Long.MIN_VALUE;
		
		
		
		
		binConverter(byteValue); 		
 		binConverter(shortValue);
 		binConverter(intValue);
 		binConverter(longValue);
	}
	
}

