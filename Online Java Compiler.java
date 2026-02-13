// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
int adj_matrix[][]={{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
    int sc=0;
    for(int i=0;i<adj_matrix.length;i++)
    {int count=0;
        for(int j=0;j<adj_matrix.length;j++)
        {  
            if(adj_matrix[i][j]==0)
            {
                
                count++;
            }
        }
        if(count==5)
        {
              sc++;
        }
    }
    System.out.print("Sink nodes "+sc);
    }
}