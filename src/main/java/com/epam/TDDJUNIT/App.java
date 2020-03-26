package com.epam.TDDJUNIT;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String st = sc.next();
        int count=1;
        StringBuffer sb = new StringBuffer(st);
        if(sb.charAt(0)=='A')
        {
        	sb.deleteCharAt(0);
        	if(sb.charAt(0)=='A')
            {
            	sb.deleteCharAt(0);
            }
        }
        else if(sb.charAt(1)=='A')
        {
        	sb.deleteCharAt(1);
        }
        System.out.print(sb);
    }
}
