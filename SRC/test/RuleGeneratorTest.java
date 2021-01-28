package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entity.AssociationRule;
import entity.ItemSubset;
import entity.Record;
import relationModel.ItemsetGenerator;
import relationModel.RuleGenerator;

public class RuleGeneratorTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_RuleGenerator_01() {
		
		double support = 0.2;
		double confidence = 0.4;	
		
		Record R = new Record("src/DataSet.csv");

		RuleGenerator process = new RuleGenerator(R,support,confidence);
		List<AssociationRule> result = process.run();
		
		Set<String> sample_set_L = new HashSet<String>();		
		sample_set_L.addAll(Arrays.asList(new String[] {"Coke"}));
		Set<String> sample_set_R = new HashSet<String>();  
		sample_set_R.addAll(Arrays.asList(new String[] {"Chips"}));
		
		AssociationRule expected = new AssociationRule(sample_set_L,sample_set_R,0);
		expected.set_interest(0.0);
		
		Boolean expected_rule_is_contained = false;
		
		for(AssociationRule result_rule : result)
		{
			if (result_rule.is_equal(expected))
				expected_rule_is_contained = true;
		}
		
		assertEquals(true,expected_rule_is_contained);
	}
	 
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
