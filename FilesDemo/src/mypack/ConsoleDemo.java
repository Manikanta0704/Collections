package mypack;

import java.io.Console;

public class ConsoleDemo {
	   public static void main(String[] args)throws Exception {

	       Console console = System.console();
	       String uname = console.readLine("User Name   : ");
//	       char[] pwd = console.readPassword("Password    : ");
//	       String upwd = new String(pwd);
	       String upwd = console.readLine("Password   : ");
	       
	       if (uname.equals("durga") && upwd.equals("durga")){
	           System.out.println("Login Success");
	       }else{
	           System.out.println("Login Failure");
	       }
	   }
	}
