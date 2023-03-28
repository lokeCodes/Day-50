// https://www.codechef.com/problems/OPMIN
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
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    int min =Integer.MAX_VALUE;
		    int count=0;
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		        if(arr[i]<min){
		            min=arr[i];
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(arr[i]>min){
		            count++;
		        }
		    }
		    
		     System.out.println(count);
		    
		  //  for(int i=0;i<=max;i++){
		  //      if(min==max){
		  //          System.out.println(i);
		  //          break;
		  //      }else{
		  //          min++;
		  //      }
		  //  }
		}
	}
}
