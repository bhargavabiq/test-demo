package testcheck;

import java.io.*;
import java.net.URL; 
class ValidWebsite
{
  public static boolean isValid(String url) 
        { 
    try            // Try creating a valid URL //
             { 
         new URL(url).toURI(); 
         return true; 
        } 
          catch (Exception e)         // If there is an Exception while creating the URL object return false since it is invalid
          { 
              return false; 
          } 
      }   
  public static void main(String[] args)throws IOException
  {  
    String url="http://52.139.11.214/";     //Input String which is the website to be checked if it exists or not  
	/*
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * System.out.println("Enter the URL: "); url= br.readLine();
	 */
        if (isValid(url))  
            System.out.println("The inputted website exists"); 
        else
            System.out.println("The inputted website does not exist\nPlease try again");                    
      }  
}
