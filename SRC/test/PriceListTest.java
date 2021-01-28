package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import entity.PriceList;

public class PriceListTest {

	@BeforeEach
	public void setUp() throws Exception {}

	@Test
	public void test_PriceList_01() {
		
		PriceList priceList = new PriceList();
		
		priceList.init("src/PriceList.csv");
		
        Set<String> item = new HashSet<String>(); 

        item.add("Coke"); 
		
		int result = priceList.get_price(item);

		int expected = 7;
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_PriceList_02() {
		
		PriceList priceList = new PriceList();
		
		priceList.init("src/PriceList.csv");
		
        Set<String> item = new HashSet<String>(); 

        item.add("Jam"); 
		
		int result = priceList.get_price(item);

		int expected = 20;
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_PriceList_04() {
		
		PriceList priceList = new PriceList();
		
        Set<String> item = new HashSet<String>(); 

        item.add("Bread"); 
		
		int result = priceList.get_price(item);

		int expected = 20;
		
		assertEquals(expected,result);
	}
	
	@Test
	public void test_PriceList_05() {
		
		PriceList priceList = new PriceList();
		
		priceList.init("src/text.csv");
		
        Set<String> item = new HashSet<String>(); 

        item.add("Bread"); 
		
		int result = priceList.get_price(item);

		int expected = -1;
		
		assertEquals(expected,result);
	}
}
