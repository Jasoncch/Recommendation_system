package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Record;
import membership.Normal;

public class NormalTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_Normal_01() {
		
		String[] user_input1={"1","Toothpaste"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);
	
		Normal normal = new Normal();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothbrush]",7.0);
		expected.put("[Shampoo]",20.0);
		expected.put("[Conditioner]",70.0);
		expected.put("[Shampoo, Toothbrush]",25.65);
		expected.put("[Conditioner, Toothbrush]",73.15);
		expected.put("[Conditioner, Shampoo]",85.5);
		
		HashMap<String, Double> result = normal.get_recommandation(record, items);
	 					
 		assertEquals(expected,result);
	}
	
	@Test
	public void test_Normal_02() {
		
		String[] user_input1={"1","Apple"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);

		
		Normal normal = new Normal();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = normal.get_recommandation(record, items);
		
		assertEquals(expected,result);
	}
}
