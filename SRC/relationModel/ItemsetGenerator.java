package relationModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entity.ItemSubset;
import entity.Record;

public class ItemsetGenerator {
	private Record R;
	
	
	public ItemsetGenerator(Record R){
		this.R=R;
	}
	
	public void print_all(Set<String> items) {
		String[] temp = items.toArray(new String[0]);
		for(int x=0;x<temp.length;x++) {
			System.out.printf("%s ", temp[x]);								//print all string in the array
		}
	}
	
	public List <ItemSubset>  find_frequent_itemset(int bottom_line) {
		List <ItemSubset>  result = new ArrayList<>();
		//int max_size=get_max_size(raw_data);
		int max_size = R.get_max_size();
		for(int i=1;i<max_size+1;i++) {
			List<Set<String>> all_subset;
			boolean early_quit=true;
			//all_subset=get_all_subsets(all_items,i);									//get all subset into memory
			all_subset=R.get_all_subsets(i);
			for(int j=0;j<all_subset.size();j++) {
				int count = R.get_count(all_subset.get(j));						//find the confidence of the target
				if(count>=bottom_line) {											//check if it pass the confidence
					early_quit=false;
				
				//	System.out.printf("appears %d times \n",count);
					//System.out.print("add: "+all_subset.get(j)+" with count = "+count+" to fre_items \n");
					result.add(new ItemSubset(all_subset.get(j),count));			//add the occurrence to the array
				}
			}
			if(early_quit)
				break;
		}
		return result;
	}
}
