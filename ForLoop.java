public class ForLoop {
    public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			System.out.println("Hi"+i);
		}
		
		
		for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
		
		
		int i=1;
		for(;i<=5;)
		{
			System.out.println("DAY"+i);
			i++;
		}
	}
}


/**
 For loop:-
If you know how many iterations you want to go for loop
(intiliazing vaue, condition, increment or decrement)

While loop:-
When you need to read the file go for while loop, if the number of iterations is not known.

- For loop can also be used as a while.
 
Do While Loop:-
If you condition get false but you want to exceute the code at least once.
 */