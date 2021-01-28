package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.AssociationRule;
import entity.ItemSubset;
import entity.Record;
import relationModel.ItemsetGenerator;
import relationModel.RuleGenerator;

public class AssociationRuleTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_RuleGenerator_02() {
		
		double support = 0.8;
		double confidence = 0.8;	
		
		Record R = new Record("src/DataSet.csv");

		RuleGenerator process = new RuleGenerator(R,support,confidence);
		List<AssociationRule> result = process.run();
		
		List<AssociationRule> expected = new ArrayList<AssociationRule>();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RuleGenerator_03() {
		
		double support = 0.4;
		double confidence = 0.6;	
		
		String[][] input = {};
		
		Record R = new Record(input);

		RuleGenerator process = new RuleGenerator(R,support,confidence);
		List<AssociationRule> result = process.run();
		
		List<AssociationRule> expected = new ArrayList<AssociationRule>();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RuleGenerator_04() {
		
		double support = 0.4;
		double confidence = 0.6;	
		
		String[][] input = {};
		
		Record R = new Record(input);

		RuleGenerator process = new RuleGenerator(R,support,confidence);
		List<AssociationRule> result = process.run();
		
		List<AssociationRule> expected = new ArrayList<AssociationRule>();
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_RuleGenerator_05() {
		
		double support = 0.4;
		double confidence = 0.6;
		
		Record R = new Record("src/DataSet.csv");

		RuleGenerator process = new RuleGenerator(R,support,confidence);
		
		int bottom_line = (int)(support*R.get_size());
		
		ItemsetGenerator IG = new ItemsetGenerator(R);
		
		List<ItemSubset> frequent_items = IG.find_frequent_itemset(bottom_line);
		
		List<AssociationRule> result = process.find_confident_rule(frequent_items,2);

		List<AssociationRule> expected = new ArrayList<AssociationRule>();
		
		assertEquals(expected,result);
	}
}
