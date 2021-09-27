package com.company.interviewques;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
	Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1=scan.next();
        System.out.println("Enter the string2:");
        String str2=scan.next();
        String res="";
        for(int i=str1.length()-1;i>=0;i++)
        {
            res += str1.charAt(i);
        }
        if(res.equals(str2))
        {
                    System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}