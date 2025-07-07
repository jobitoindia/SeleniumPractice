package Registartion;

import java.util.Collection;

public class ArrayDemo 
{
	
	public static void main(String[] args) {
		
		int arrDemo[]=new int[100];

		arrDemo[0]=101;
		arrDemo[1]=102;
		arrDemo[2]=103;
		
		int arr[]= {1,2,3,4,5};
		
		int i=15;
		Integer ii=new Integer(15);
		int multiArra[][]=new int[2][2];
		multiArra[0][0]=1000;
		multiArra[0][1]=1001;
		multiArra[1][0]=1003;
		multiArra[1][1]=1004;
				
		int mArray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int mA[][]= {{1,2,3,4,5,6},{4,5,6,77,88,99}};
		
		for(int[] ijk:mArray) {
			System.out.println(ijk);
		}
		
		for(int i1=0;i1<3;i1++)   // row
		{
			for(int j=0;j<3;j++) {  //column
				
				System.out.println(mArray[i1][j]);
			}
		}
		
		

		
		
		
		
		
	}

}
