package entity;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PriceList {
	
	//Coke, Chips, Soup, Tshirt, Cake, Toothpaste, Toothbrush, Cup, Bread, Butter, Jam, Pen, Tape, Eraser, Shampoo, Conditioner, Towel, Pills, Knife, Toothpick, Milk, Pencil, Oil, Salt, Sugar, Handwash, Biscuit, Bowl, Ruler, Bottle, Paper, Tissue, Glue, Fork, Spoon, Detergent, Bleach, Egg, Hangar, Bodywash
	 
	static HashMap<String,Integer> price_table = new HashMap<String,Integer>();
	static String[][] input={
								{"Coke", "7"},
								{"Chips", "15"},
								{"Soup", "20"},
								{"Tshirt", "70"},
								{"Cake", "20"},
								{"Toothpaste","15"},
								{"Toothbrush", "7"},
								{"Cup", "15"},
								{"Bread", "20"},
								{"Butter", "70"},
								{"Jam", "20"},
								{"Pen","15"},
								{"Tape", "7"},
								{"Eraser", "15"},
								{"Shampoo", "20"},
								{"Conditioner", "70"},
								{"Towel", "20"},
								{"Pills","15"},
								{"Knife", "7"},
								{"Toothpick", "15"},
								{"Milk", "20"},
								{"Oil", "70"},
								{"Salt", "20"},
								{"Sugar","15"},
								{"Handwash", "7"},
								{"Biscuit", "15"},
								{"Ruler", "20"},
								{"Bottle", "70"},
								{"Paper", "20"},
								{"Tissue","15"},
								{"Glue", "7"},
								{"Fork", "15"},
								{"Spoon", "20"},
								{"Detergent", "70"},
								{"Bleach", "20"},
								{"Egg","15"},
								{"Hangar", "7"},
								{"Bodywash", "15"},
								{"Pencil", "15"},
								{"Bowl", "15"}
							};
	
	public PriceList(){
		init("PriceList.csv");
	}
	
	public static void init(String[][] input) {
		price_table.clear();
		for(int i=0;i<input.length;i++) {
			 price_table.put(input[i][0],Integer.parseInt(input[i][1]));  
		}
	}
	
	
	public int get_price(Set<String> items) {
		int sum=0;
		if(price_table.isEmpty())
			return -1;
		for(String name:items) {
			sum += price_table.get(name);
		}
		return sum;
		
	}
	public void init(String file_name){
		price_table.clear();
		try (Scanner scanner = new Scanner(new File(file_name));) {
			 while (scanner.hasNextLine()) {
				 String[] data = scanner.nextLine().split(",");
				 price_table.put(data[0],Integer.parseInt(data[1]));  
			 }
		} catch (FileNotFoundException e) {
			System.out.print("Cannot open file with path" + file_name +"\n");
		}	
	}
	
}
