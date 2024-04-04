package com.data;

import java.util.HashMap;

public class Count 
{
	
	public static void main(String[] args) 
	{
        String str = "write java program to count tha number of words in a string using hash map";

        HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
        
        String[] splitData = str.split(" ");
        
        for(String word :splitData)
        {
          Integer number=hashMap.get(word);
          if(number == null)
          {
        	  hashMap.put(word, 1);
          }
          else {
        	  hashMap.put(word, number+1);
			
		    }
        }
        
        System.out.println(hashMap);
     
	}
}
