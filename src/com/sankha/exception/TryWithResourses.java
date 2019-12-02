package com.sankha.exception;
import java.io.*; 

public class TryWithResourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";  
        BufferedReader br = null; 
          
        System.out.println("Provide the file path"); 
        br = new BufferedReader(new InputStreamReader(System.in)); 
        /* Prior to java7
        try
        { 
            String s; 
              
            // file resource 
            br = new BufferedReader(new FileReader(str));  
              
            while ((s = br.readLine()) != null)  
            { 
                //print all the lines in the text file 
                System.out.println(s);  
            } 
        }  
        catch (IOException e)  
        { 
            e.printStackTrace(); 
        } 
          
        finally
        { 
            try
            { 
                if (br != null) 
                  
                    //closing the resource in 'finally' block 
                    br.close();  
            }  
            catch (IOException ex)  
            { 
                ex.printStackTrace(); 
            } 
        } */
          
        try
        { 
            str=br.readLine(); 
        } 
        catch(IOException e) 
        { 
            e.printStackTrace();  
        }  
          
        // try with Resource 
        // note the syntax difference 
        try (BufferedReader b = new BufferedReader(new FileReader(str))) 
        { 
            String s; 
            while ((s = b.readLine()) != null)  
            { 
                System.out.println(s); 
            } 
        }  
        catch (IOException e)  
        { 
            e.printStackTrace(); 
        } 

	}

}
