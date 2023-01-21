package com.ty;

public class BobbleSort {

	public static void bobble(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,9,8,7,5,4,3};
		bobble(a);
	}
}
