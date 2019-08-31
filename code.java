import java.io.*;
class Menu
{
	public static void main(String args[])
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter number:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter choice 1:Add() 2:Sub() 3:Mult() 4:Div() .");
		int c = Integer.parseInt(br.readLine());

		/*switch(c)
		{
			case 1: Add(a,b); 
            		break; 
        		case 2: Sub(a,b); 
            		break; 
        		case 3: Mult(a,b); 
            		break; 
        		case 4: Div(a,b); 
            		break;  
        		default: System.out.println("Invalid option"); 
            		break;
		}*/
	}
}