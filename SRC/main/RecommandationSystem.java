package main;
import java.util.*;
import entity.*;
import membership.*;

public class RecommandationSystem {
	private Record R;
	private Membership MS;
	private static RecommandationSystem instance = null; 
	public static RecommandationSystem getInstance(String filename) {
		if(instance == null)
			instance = new RecommandationSystem(filename);
		return instance;
	}
	
	public RecommandationSystem(String[][] input){
		this.R=new Record(input);
	}
	
	public RecommandationSystem(String filename){
		this.R=new Record(filename);
	}
	
	public HashMap<String, Double>  recommand(String[] input) {
		int member=Integer.parseInt(input[0]);
		List<String> items=new ArrayList<>();
		HashMap<String, Double> result=new HashMap<String, Double> ();
		for(int i =1;i<input.length;i++) {
			items.add(input[i]);
		}
		if(member==0) {
			MS= new Visitor();
			result=MS.get_recommandation(R, items);
		}else
		if(member==1) {
			MS= new Normal();
			result = MS.get_recommandation(R, items);
		}else
		if(member==2) {
			MS= new VIP();
			result=MS.get_recommandation(R, items);
		}
		R.add(items);
		return result;
	}
	public boolean check(String[] input){
		int member;

		try {
		member=Integer.parseInt(input[0]);
		}
		catch(NumberFormatException e) {
			System.out.print("Membership index must be integer \n");
			return false;
		}
		if(input.length<2) {
			System.out.print("Invalid Arguements \n");
			return false;
		}
		else if(!R.contain(input)) {
				System.out.print("Invalid item input \n");
				return false;
		}
		else if(member<0||member>2){
				System.out.print("Invalid membership index \n");
				return false;
		}
		else if(!is_unique(input)){
				System.out.print("Repeated items \n");
				return false;
		}else
		{
				return true;
		}
	}
	private boolean is_unique(String[] input)
	{
		Set<String> unique_items= new HashSet<>();
		for(int i=1;i<input.length;i++) {
			unique_items.add(input[i]);;
		}
		if(unique_items.size()==input.length-1) {
			return true;
		}
		else
			return false;
	
	}
}

