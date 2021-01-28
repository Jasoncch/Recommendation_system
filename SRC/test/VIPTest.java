package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Record;
import membership.VIP;

public class VIPTest {
	
	@BeforeEach
	public void setUp() throws Exception {}

	@Test
	public void test_VIP_01() {
		
		String[] user_input1={"2","Toothbrush"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);
		
		VIP vip = new VIP();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothpaste]",15.0);
		expected.put("[Shampoo]",20.0);
		expected.put("[Conditioner]",70.0);
		expected.put("[Toothpaste, Shampoo]",31.5);
		expected.put("[Toothpaste, Conditioner]",76.5);
		
		HashMap<String, Double> result = vip.get_recommandation(record, items);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_VIP_02() {
		
		String[] user_input1={"2","Egg"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);
		
		VIP vip = new VIP();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = vip.get_recommandation(record, items); 
		
		assertEquals(expected,result);
	}
}
