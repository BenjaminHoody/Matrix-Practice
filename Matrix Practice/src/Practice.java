
public class Practice
	{

		public static void main(String[] args)
			{
				
				int [] [] matrix = new int[6][6];
				
				for(int i=0; i < matrix.length; i++)
					{
						for(int j=0; j < matrix[0].length; j++)
							{
								matrix[i][j] = (int)(Math.random()*90)+10;
							}
					}
				
				
				for(int i=0; i < matrix.length; i++)
					{
						for(int j=0; j < matrix[0].length; j++)
							{
								System.out.print(matrix[i][j] + "  ");
							}
						System.out.println(" ");
					}
				
				int biggest = matrix[0][0];
				
				
				for(int i=0; i < matrix.length; i++)
					{
						for(int j=0; j < matrix[0].length; j++)
							{
								if(matrix[i][j] > biggest)
									{
										biggest = matrix[i][j];
									}
							}
					}
				
				System.out.println("\n \nThe biggest number in the matrix is " + biggest);
				
				
				

			}

	}
