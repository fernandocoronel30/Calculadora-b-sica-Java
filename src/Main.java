import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }//main

    private static void printNameLength( String name )
    {
    	System.out.println("La longitud es: " + name.length());
    }//printNameLength

    private static void printNameCharacters( String name )
    {	
    	for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}//for
    	System.out.println(); 
    }//printNameCharacters


}//Main