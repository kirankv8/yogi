package com.ty;

public class Adding {
	
	BobbleSort bobbleSort;

public static void add(int a,int b)
{
	int res=a+b;
	System.out.println(res);
}

public static boolean anagram(String s1,String s2)
{
	char[]a=s1.toCharArray();
	char[]b=s2.toCharArray();
	if(a.length !=b.length)
	{
		return false;
	}
	int k[]=new int[26];
	for(int i=0;i<a.length;i++)
	{
		k[a[i]-'a']++;
		k[b[i]-'a']--;
	}

for(int j:k)
{
	if(j!=0)
	{
		return false;
	}
}
  return true;
}
public static void main(String[] args) {
	 System.out.println(anagram("kira","rain"));
	 Adding.add(292,120);
	 b
}
}
