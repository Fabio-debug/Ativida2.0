/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");

	    cachorro Cachorro = new cachorro();
	    cavalo Cavalo = new cavalo();
	    preguica Pregui = new preguica();
	    Random random = new Random();
            
             int animal = random.nextInt(3);
                
              switch (animal){
                  
                  case 1:
                      System.out.println(Cavalo.emitirSom());
                    break;  
                  case 2:
                      System.out.println(Cachorro.emitirSom());
                    break;  
                  case 3:
                      System.out.println(Pregui.emitirSom());
                  break;  
    
        }
	}
    
    
}
