package com.ty;

public class Dupicate {

	public static void duplicate(int a[])
	{
	for(int i=0;i<a.length;i++)
	{
		 boolean isrepeated=false;
	     for(int j=i+1;j<a.length;j++)
	     {
	    	if(a[i]==a[j])
	    	{
	    		isrepeated=true;
	    	}
	     }
	     if(!isrepeated)
	     {
	    	 System.out.println(a[i]+ " hai");
	     }
    	}
	}
	public static void main(String[] args) {
		int k[]= {1,2,3,4,4,5,1,9};
		duplicate(k);
	}
	
}
