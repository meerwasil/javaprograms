public class multiDimensional {
        public static void main(String args[])
        {
            // declaring and initializing 2D array
            int arr[][] = { {9,7,4},{5,6,1},{7,4,2} };

            // printing 2D array
            for (int i = 0; i < 3 ; i++)
            {
                for (int j = 0; j < 3 ; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }
    }

