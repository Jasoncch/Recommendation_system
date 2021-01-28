package membership;
import java.util.HashMap;
import java.util.List;

import entity.AssociationRule;
import entity.PriceList;
import entity.Record;
import relationModel.RuleGenerator;

public class VIP implements Membership{
	
	private static double support =0.2,confidence=0.4;	
	private List<AssociationRule> Rules;
	
	public HashMap<String, Double> get_recommandation(Record R,List<String> items) {
		
		boolean has_rule=false;
		HashMap<String, Double> recommandList = new HashMap<String, Double>();
		PriceList priceList = new PriceList();
		
		System.out.print("You are VIP \n");
		RuleGenerator process = new RuleGenerator(R,support,confidence);
		this.Rules = process.run();
		for(AssociationRule rule:Rules) {
			if(items.containsAll(rule.getLeft())) {
				has_rule=true;
				if(rule.getRight().size()==1) {
					double price = priceList.get_price(rule.getRight());
					System.out.print("You bought "+rule.getLeft()+" , you probably need "+rule.getRight() +" with $"+price+"\n");
					recommandList.put(rule.getRight().toString(), price);
				}
				else
				{
					int discount = rule.getRight().size()/2*10;
					double price = (double)priceList.get_price(rule.getRight())*(double)(100-discount)/(double)100;
					System.out.print("You bought "+rule.getLeft()+" , you can buy "+rule.getRight() +" with "+ discount+"% off only $"+price+"\n");	
					recommandList.put(rule.getRight().toString(), price);
				}
			}
		}
		
		if(!has_rule) {
			System.out.print("Thank You \n");
		}
		
		return recommandList;
	};
}

