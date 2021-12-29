package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		 char key=0;
		 String line="testsample";
	        Map<Character,Integer> map = new TreeMap<>();
	        for(int i=0;i<line.length();i++)
	            {
	                if(!map.containsKey(line.charAt(0)))
	                    map.put(line.charAt(0),1);
	                else
	                    {
	                        int count=map.get(line.charAt(0));
	                        map.put(line.charAt(0),++count);
	                        
	                        
	                  }
	                    
	            }
	        System.out.println(map);
	            int curr=-1;
	            
	          for( Map.Entry<Character,Integer> map2:map.entrySet())
	          {
	              if(map2.getValue()>curr)
	              {
	                    curr=map2.getValue();
	                    key=map2.getKey();
	              }
	              
	              
	              
	          }
	          System.out.println(key);
		/*
		 * Map<Integer,Integer> map=new HashMap<>(); map.put(10,11); map.put(11, 12);
		 * map.put(12, 13); Set<Integer> set=map.keySet(); for(int i:set) {
		 * System.out.println(map.get(i)); System.out.println(i==10); if(i==10) {
		 * map.put(12,30); } } System.out.println(map);
		 */
		

	}

}
