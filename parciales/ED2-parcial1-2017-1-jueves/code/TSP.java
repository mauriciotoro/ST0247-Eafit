
Java Program to Implement Traveling Salesman Problem using Nearest neighbour Algorithm
This Java Program is to Implement Traveling Salesman Problem using Nearest neighbour Algorithm.The travelling salesman problem (TSP) or travelling salesperson problem asks the following question: Given a list of cities and the distances between each pair of cities, what is the shortest possible route that visits each city exactly once and returns to the origin city? It is an NP-hard problem in combinatorial optimization, important in operations research and theoretical computer science.

Here is the source code of the Java Program to Implement Traveling Salesman Problem using Nearest neighbour Algorithm. The Java program is successfully compiled and run on a Linux system. The program output is also shown below.

    import java.util.InputMismatchException;

    import java.util.Scanner;

    import java.util.Stack;

     

    public class TSPNearestNeighbour

    {

        private int numberOfNodes;

        private Stack<Integer> stack;

     

        public TSPNearestNeighbour()

        {

            stack = new Stack<Integer>();

        }

     

        public void tsp(int adjacencyMatrix[][])

        {

            numberOfNodes = adjacencyMatrix[1].length - 1;

            int[] visited = new int[numberOfNodes + 1];

            visited[1] = 1;

            stack.push(1);

            int element, dst = 0, i;

            int min = Integer.MAX_VALUE;

            boolean minFlag = false;

            System.out.print(1 + "\t");

     

            while (!stack.isEmpty())

            {

                element = stack.peek();

                i = 1;

                min = Integer.MAX_VALUE;

                while (i <= numberOfNodes)

                {

                    if (adjacencyMatrix[element][i] > 1 && visited[i] == 0)

                    {

                        if (min > adjacencyMatrix[element][i])

                        {

                            min = adjacencyMatrix[element][i];

                            dst = i;

                            minFlag = true;

                        }

                    }

                    i++;

                }

                if (minFlag)

                {

                    visited[dst] = 1;

                    stack.push(dst);

                    System.out.print(dst + "\t");

                    minFlag = false;

                    continue;

                }

                stack.pop();

            }

        }

     

        public static void main(String... arg)

        {

            int number_of_nodes;

            Scanner scanner = null;

            try

            {

                System.out.println("Enter the number of nodes in the graph");

                scanner = new Scanner(System.in);

                number_of_nodes = scanner.nextInt();

                int adjacency_matrix[][] = new int[number_of_nodes + 1][number_of_nodes + 1];

                System.out.println("Enter the adjacency matrix");

                for (int i = 1; i <= number_of_nodes; i++)

                {

                    for (int j = 1; j <= number_of_nodes; j++)

                    {

                        adjacency_matrix[i][j] = scanner.nextInt();

                    }

                }

                for (int i = 1; i <= number_of_nodes; i++)

                {

                    for (int j = 1; j <= number_of_nodes; j++)

                    {

                        if (adjacency_matrix[i][j] == 1 && adjacency_matrix[j][i] == 0)

                        {

                            adjacency_matrix[j][i] = 1;

                        }

                    }

                }

                System.out.println("the citys are visited as follows");

                TSPNearestNeighbour tspNearestNeighbour = new TSPNearestNeighbour();

                tspNearestNeighbour.tsp(adjacency_matrix);

            } catch (InputMismatchException inputMismatch)

             {

                 System.out.println("Wrong Input format");

             }

            scanner.close();

        }

    }


$javac  TSPNearestNeighbour.java
$java TSPNearestNeighbour
 
Enter the number of nodes in the graph
9
Enter the adjacency matrix
000 374 200 223 108 178 252 285 240 356
374 000 255 166 433 199 135 095 136 017
200 255 000 128 277 128 180 160 131 247
223 166 128 000 430 047 052 084 040 155
108 433 277 430 000 453 478 344 389 423
178 199 128 047 453 000 091 110 064 181
252 135 180 052 478 091 000 114 083 117
285 095 160 084 344 110 114 000 047 078
240 136 131 040 389 064 083 047 000 118
356 017 247 155 423 181 117 078 118 000
the citys are visited as follows
1	5	3	2	9	7	4	6	8

