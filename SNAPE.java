// https://www.codechef.com/problems/SNAPE
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
		    double b = s.nextInt();
		    double ls = s.nextInt();
		    
		    double minrs = Math.sqrt(ls*ls-b*b);
		    double maxrs = Math.sqrt(ls*ls+b*b);
		    System.out.println(minrs+" "+maxrs);
		}
	}
}
