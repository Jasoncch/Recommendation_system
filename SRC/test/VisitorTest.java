package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Record;
import membership.Visitor;

public class VisitorTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_Visitor_01() {
		
		String[] user_input1={"0","Coke"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);

		
		Visitor visitor = new Visitor();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Chips]",15.0);

		
		HashMap<String, Double> result = visitor.get_recommandation(record, items);
						
		assertEquals(expected,result);
	}
	
	@Test
	public void test_Visitor_02() {
		
		String[] user_input1={"0","Ice"};
		
		Record record  = new Record("src/DataSet.csv");
		
		List<String> items = new ArrayList<>();
		items.add(user_input1[1]);

		
		Visitor visitor = new Visitor();
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = visitor.get_recommandation(record, items);
						
		assertEquals(expected,result);
	}
}
