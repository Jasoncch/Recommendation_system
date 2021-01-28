package entity;
import java.util.Set;

public class ItemSubset {
	private Set<String> items;
	int size;
	private int occurrence;
	
	public ItemSubset(Set<String>items,int occurrence){
		this.setItems(items);
		this.size=items.size();
		this.setOccurrence(occurrence);
	}
	
	public Set<String> getItems() {
		return items;
	}
	
	public void setItems(Set<String> items) {
		this.items = items;
	}
	
	public int getOccurrence() {
		return occurrence;
	}
	
	public void setOccurrence(int occurrence) {
		this.occurrence = occurrence;
	}
}
