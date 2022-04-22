package org.howard.edu.lsp.finalExam.junit;


import org.howard.edu.lsp.finalExam.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesTest {
	@Test
	@DisplayName("MapUtilities.equals key/value")
	public void testKeyValue() throws NullMapException {
		
		    //When both maps are created, some values are similar  
			HashMap<String, String> map1= new HashMap<>();
			map1.put("Alice", "Healthy");
			map1.put("Mary", "Ecstatic");
			map1.put("Bob", "Happy");
			map1.put("Chuck", "Fine");
			map1.put("Felix", "Sick");
			
			
			HashMap<String, String> map2= new HashMap<>();
			map2.put("Mary", "Ecstatic");
			map2.put("Felix", "Healthy");
			map2.put("Ricardo", "Subperb");
			map2.put("Tam", "Fine");
			map2.put("Bob", "Happy");
			
			MapUtilities hmap = new MapUtilities();
			
			assertEquals(hmap.CommonKeyValuePairs(map1, map2), 2);
			
			//When one map is empty, other is not meaning no values are similar
			HashMap<String, String> map11= new HashMap<>();
			map11.put("Alice", "Healthy");
			map11.put("Mary", "Ecstatic");
			map11.put("Bob", "Happy");
			map11.put("Chuck", "Fine");
			map11.put("Felix", "Sick");
			
			
			HashMap<String, String> map21= new HashMap<>();
			map21.put("Mary", "sad");
			map21.put("Felix", "Healthy");
			map21.put("Ricardo", "Subperb");
			map21.put("Tam", "Fine");
			map21.put("Bob", "nervous");
			
			MapUtilities hmap1 = new MapUtilities();
			
			assertEquals(hmap1.CommonKeyValuePairs(map11, map21), 0);
			
			//When both maps are made and all values are similar
			HashMap<String, String> map5= new HashMap<>();
			map5.put("Alice", "Healthy");
			map5.put("Mary", "Ecstatic");
			map5.put("Bob", "Happy");
			map5.put("Chuck", "Fine");
			map5.put("Felix", "Sick");
			
			
			HashMap<String, String> map4= new HashMap<>();
			map4.put("Alice", "Healthy");
			map4.put("Mary", "Ecstatic");
			map4.put("Bob", "Happy");
			map4.put("Chuck", "Fine");
			map4.put("Felix", "Sick");;
			
			MapUtilities hmap2 = new MapUtilities();
			
			assertEquals(hmap2.CommonKeyValuePairs(map5, map4), 5);


	}
	@Test
	@DisplayName("Hashmapzempty Junit Test")
	public void MapUtilitiesEmpty() throws NullMapException {
		
		//When one map is only empty
		HashMap<String, String> map1= new HashMap<>();
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecstatic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		
		HashMap<String, String> map2= new HashMap<>();
		MapUtilities hmap1 = new MapUtilities();
		assertEquals(0, hmap1.CommonKeyValuePairs(map1, map2));
		
		
		
		//When both map is only empty
		HashMap<String, String> map7= new HashMap<>();				
		HashMap<String, String> map8= new HashMap<>();
				
		MapUtilities hmap3 = new MapUtilities();
				
		assertEquals(0, hmap3.CommonKeyValuePairs(map7, map8));
		
}
	@Test
	@DisplayName("HashMapNullException Junit Test")
	public void MapUtilities_Throw_Exception() {
		
		HashMap<String, String> map1= new HashMap<>();				
		HashMap<String, String> map2= new HashMap<>();
		
		MapUtilities Map = new MapUtilities();
		
		Exception exception = assertThrows(NullMapException.class, () -> {
			Map.CommonKeyValuePairs(null, map2);
		});
	}
}










			
		
	


