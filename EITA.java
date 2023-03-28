// https://www.codechef.com/problems/EITA
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
		    int d = s.nextInt();
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    
		    int minw = 7*x;
		    int maxw = ( (7-d)*z ) + (d*y);
		    int res = Math.max(minw,maxw);
		    System.out.println(res);
		}
	}
}
