
import java.util.Scanner;

public class wordle
{

	static String palabra_oculta;
	static String palabra_dada;

	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		Scanner sc;
		
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Escribe la palabra que desea que se averigue");
		palabra_oculta = sc.nextLine();
		
		MostrarInicio();
		System.out.println();
		System.out.println("Escribe palabras de " + palabra_oculta.length() + " letras");
		
		int indice = 0;
		for(indice = 0 ; indice < 6; indice ++)
		{	
		Buscaletra();	
		}
		
		
		
	
		
		

	}

	public static void MostrarInicio() 
	{
		int i_lineas;
		for(i_lineas = 0; i_lineas<6; i_lineas++)
		{
			int i;
			for(i = 0; i < palabra_oculta.length(); i++)
			{
				System.out.print(" _ ");
			}
			System.out.println();
		}
	}
	

	@SuppressWarnings("resource")
	public static void Buscaletra()
	{
		Scanner sc;
		
		
		sc = new Scanner(System.in);
		
				do 
				{
					palabra_dada = sc.nextLine();
	
					if(palabra_dada.length() != palabra_oculta.length())
					{
						System.out.println("No contiene " +palabra_oculta.length()+ " letras");
					}
					else
					{
						int i;
						for(i = 0 ; i < palabra_oculta.length(); i++)
						{
							if(palabra_oculta.charAt(i) == palabra_dada.charAt(i) || palabra_oculta.contains(palabra_dada.charAt(i) + ""))
									{
										if(palabra_oculta.charAt(i) == palabra_dada.charAt(i))
										{
											System.out.print(palabra_dada.charAt(i) + "  ");
										}
										else
										{
											System.out.print(palabra_dada.charAt(i) + "*  ");
										}
									}
							else
							{
								System.out.print(" _ ");
							}
						}
						
					}
				}
				while(palabra_dada.length() != palabra_oculta.length());	
			
		
	}
	
	
		
}


