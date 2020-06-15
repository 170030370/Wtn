package com.wipro.arrays;

public class ExA14 {
public static void main(String[] args) {
	int a=args.length;
	int i;
    int arr[][] = new int[3][3];
    if(a<9)
    {
    System.out.println("enter 9 values");
    }
    if(a==9)
    {
        int k=0;
        for(i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
            
        		arr[i][j]=Integer.parseInt(args[k]);
        		k++;
        	}
        }
        System.out.println("The given array is:");
        for(i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        int max=arr[0][0];
        for(i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		if(arr[i][j]>max)
        		{
        			max=arr[i][j];
        		}
        	}
        }
    	System.out.println("Maximum is"+max);
     }
   }
}
