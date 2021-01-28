package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.RecommandationSystem;
 
public class RecommendationTest {

	@BeforeEach
	public void setUp() throws Exception {}

	//public void tearDown() {}
	 
	@Test
	public void test_RS_01() {
		
		String[] user_input1={"0","Coke"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Chips]",15.0);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_01a() {
		
		String[] user_input1={"0","Butter"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Bread]",20.0);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_01b() {
		
		String[] user_input1={"0","Shampoo"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothpaste]",15.0);
		expected.put("[Toothbrush]",7.0);
		expected.put("[Conditioner]",70.0);
		expected.put("[Toothpaste, Toothbrush]",21.56);
		expected.put("[Toothpaste, Conditioner]",83.3);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_01c() {
		
		String[] user_input1={"0","Coffee"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>(); 
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_02() {
		
		String[] user_input1={"1","Toothpaste"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothbrush]",7.0);
		expected.put("[Shampoo]",20.0);
		expected.put("[Conditioner]",70.0);
		expected.put("[Shampoo, Toothbrush]",25.65);
		expected.put("[Conditioner, Toothbrush]",73.15);
		expected.put("[Conditioner, Shampoo]",85.5);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_02a() {
		
		String[] user_input1={"1","Sugar"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_02b() {
		
		String[] user_input1={"1","Conditioner"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothpaste]",15.0);
		expected.put("[Toothbrush]",7.0);
		expected.put("[Shampoo]",20.0);
		expected.put("[Towel]",20.0);
		expected.put("[Toothpaste, Toothbrush]",20.9);
		expected.put("[Toothpaste, Shampoo]",33.25);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_02c() {
		
		String[] user_input1={"1","Coke"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Chips]",15.0);

		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	 
	@Test
	public void test_RS_03() {
		
		String[] user_input1={"2","Coke"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Chips]",15.0);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_03a() {
		
		String[] user_input1={"2","Conditioner"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothpaste]",15.0);
		expected.put("[Toothbrush]",7.0);
		expected.put("[Shampoo]",20.0);
		expected.put("[Towel]",20.0);
		expected.put("[Toothpaste, Toothbrush]",19.8);
		expected.put("[Toothpaste, Shampoo]",31.5);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_03b() {
		
		String[] user_input1={"2","Shampoo"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Toothpaste]",15.0);
		expected.put("[Toothbrush]",7.0);
		expected.put("[Conditioner]",70.0);
		expected.put("[Toothpaste, Toothbrush]",19.8);
		expected.put("[Toothpaste, Conditioner]",76.5);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_03c() {
		
		String[] user_input1={"2","Sugar"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_04() {
		
		String[] user_input1={"3","Coke"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_04a() {
		
		String[] user_input1={"3","Lemon"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_04b() {
		
		String[] user_input1={"4","Lemon"};
		
		RecommandationSystem RS = new RecommandationSystem("src/DataSet.csv");
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RS_05() { 
		
		String[] user_input1={"0","Soup"};
		
		String[][] input = {
				{"Coke" ,"Chips" ,"Soup"},
				{"Coke" ,"Chips" ,"Toothpaste" ,"Toothbrush" ,"Cup"},
				{"Bread", "Butter", "Jam"},
				{"Pen" ,"Tape" ,"Eraser"},
				{"Shampoo" ,"Conditioner" ,"Towel"}
			   };
		
		RecommandationSystem RS = new RecommandationSystem(input);
		
		HashMap<String, Double> expected = new HashMap<String, Double>();
		expected.put("[Coke]",7.0);
		expected.put("[Chips]",15.0);
		expected.put("[Coke, Chips]",21.56);
		
		HashMap<String, Double> result = RS.recommand(user_input1);		
		
		assertEquals(expected,result);
	}
}


