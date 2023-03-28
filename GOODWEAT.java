// https://www.codechef.com/problems/GOODWEAT
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int arr[] = new int[7];
		    int rainy = 0;
		    int sunny = 0;
		    for(int i=0;i<7;i++){
		        arr[i]=s.nextInt();
		        if(arr[i]==0){
		            rainy++;
		        }else{
		            sunny++;
		        }
		    }
		    
		    String res = (sunny>rainy) ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
