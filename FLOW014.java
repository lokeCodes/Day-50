// https://www.codechef.com/problems/FLOW014
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
		    int x = s.nextInt();
		    float y = s.nextFloat();
		    int z = s.nextInt();
		    if(x>50 && y<0.7 && z>5600){
		        System.out.println(10);
		    }else if(x>50 && y<0.7){
		        System.out.println(9);
		    }else if(y<0.7 && z>5600){
		        System.out.println(8);
		    }else if(x>50 && z>5600){
		        System.out.println(7);
		    }else if(x>50 || y<0.7 || z>5600){
		        System.out.println(6);
		    }else{
		        System.out.println(5);
		    }
		    
		}
	}
}
