package membership;
import java.util.*;

import entity.Record;

public interface Membership {
	
	public HashMap<String, Double> get_recommandation(Record R,List<String> items);

}
