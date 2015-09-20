/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/FLAMASTE/
 */

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		in.nextLine();
		for(int i=0; i<t; i++)
		{
			String c = in.nextLine();

			char znak[] = new char[c.length()];
			for(int j=0; j<c.length(); j++)
			{
				znak[j] = c.charAt(j);
			}
			
			int sumaLiter=1;
			for(int k=0; k<c.length(); k++)
			{
				//dodawanie jedynki
				if( k < (c.length()-1) && znak[k]==znak[k+1] )
				{
					sumaLiter+=1;
				}

				//wypisywanie pojedynczych liter
				if(sumaLiter<=2)
				{
					System.out.print(znak[k]);
				}
				
				//wypisywanie liczb
				if( k < (c.length()-1) && znak[k] != znak[k+1] && sumaLiter<=2)
				{
					sumaLiter=1;
				}
				else if( k < (c.length()-1) && znak[k] != znak[k+1] && sumaLiter>2)
				{
					System.out.print(sumaLiter);
					sumaLiter=1;
				}
				else if(k == (c.length()-1) && k!=0 && znak[k] == znak[k-1] && sumaLiter>2)
				{
					System.out.print(sumaLiter);
					sumaLiter=1;
				}	
			}
			System.out.println();
		}
		in.close();
	}

}

