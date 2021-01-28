package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.Record;

public class RecordTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_Record_01() {
		
		String[][] input = {
				{"Bread", "Milk"},
				{"Bread", "Diaper", "Beer", "Eggs"},
				{"Milk", "Diaper", "Beer", "Coke"},
				{"Bread", "Milk", "Diaper", "Beer"},
				{"Bread", "Milk", "Diaper", "Coke"}
			   };
		
		Record r = new Record(input);
		
		List<String> expected = new ArrayList<String>();
		expected.add("Bread");
		expected.add("Milk");
		expected.add("Diaper");
		expected.add("Beer");
		expected.add("Eggs");
		expected.add("Coke");
		
		List<String>  result = r.get_all_items();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_Record_02() {
		
		Record r = new Record("src/DataSet.csv");
		
		int expected = 11;
		
		int  result = r.get_max_size();
		
		assertEquals(expected,result);
	}
	 
	@Test
	public void test_Record_03() {
		
		Record r = new Record("src/DataSet.csv");
		
		int expected = 14;
		
		Set<String> target = new HashSet<String>(); 
		target.add("Bread");
		target.add("Milk");
		
		int  result = r.get_count(target);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_Record_04() {
		
		Record r = new Record("src/text.txt");
		
		List<String> expected = new ArrayList<String>();
		
		List<String>  result = r.get_all_items();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_Record_05() {
		
		Record r = new Record("src/DataSet.csv");
		
		int expected = 101;
		
		int  result = r.get_size();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_Record_06() {
		
		String[][] input = {
				{"Bread", "Milk"},
				{"Bread", "Diaper", "Beer", "Eggs"},
				{"Milk", "Diaper", "Beer", "Coke"},
				{"Bread", "Milk", "Diaper", "Beer"},
				{"Bread", "Milk", "Diaper", "Coke"}
			   };
		
		Record r = new Record(input);
		
		int expected = 3;
		
		Set<String> target = new HashSet<String>(); 
		target.add("Bread");
		target.add("Milk");
		
		int  result = r.get_count(target);
		
		assertEquals(expected,result);
	}
}
