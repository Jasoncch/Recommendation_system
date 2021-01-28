package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.ItemSubset;
import entity.Record;
import relationModel.ItemsetGenerator;

public class ItemsetGeneratorTest {

	@BeforeEach
	public void setUp() throws Exception {}
	
	@Test
	public void test_ItemsetGenerator_01() {
		
		Record R = new Record("src/DataSet.csv");
		
		ItemsetGenerator IG = new ItemsetGenerator(R);

		List <ItemSubset> result = null;
		
		List <ItemSubset> expected = null;
		
		assertEquals(expected,result);
	}
}
