/*
 *	  This is simple Java program.
 *	  Call this file "ConsoleArgs.java"
 *	  Version 25.11.2019
 *	  Author Berestovoy Artiom
 */ 
 public class ConsoleArgs{
	 public static void main(String[] args){
		 
		 for(int i = args.length; i > 0; i--){
			 System.out.print(args[i - 1] + " ");
		 }
		 
	 }
 }