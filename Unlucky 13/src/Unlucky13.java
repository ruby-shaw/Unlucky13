

public class Unlucky13
	{

		public static void main(String[] args)
			{
				
				 int counter = 0;
				for (int i = 0; i < Numbers.numbers.length; i++) 
				{
					if (Numbers.numbers[i] == 13)
						{
							counter++;
							Numbers.numbers[i] = 7; 
						}
				}
				System.out.println("There are " + counter + " thirteens in the array.");
				for (int p = 0; p < Numbers.numbers.length; p++)
					{
						System.out.println(Numbers.numbers[p]);
					}
			}

	}
