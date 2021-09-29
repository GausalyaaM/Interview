package com.company.interviewques;
import java.util.Scanner;
public class StrRotation
{
    public static boolean checkRotation(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        if((str1+str1).indexOf(str2)!=-1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1 = scan.next();
        System.out.println("Enter the string2:");
        String str2 = scan.next();
        System.out.println(checkRotation(str1, str2));
    }}