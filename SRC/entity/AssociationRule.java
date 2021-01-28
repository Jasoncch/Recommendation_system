package entity;
import java.util.Set;

public class AssociationRule {
	
	private double confidence,interest;
	private Set<String> left,right;
	
	public AssociationRule(Set<String> left,Set<String> right,double confidence){
		this.setLeft(left);
		this.setRight(right);
		this.setConfidence(0);
		this.setInterest(0);
	}
	
	public void set_interest(double interest){
		this.setInterest(interest);
	}	
	
	public boolean is_equal(AssociationRule B ) {
		return this.left.equals(B.left) && this.right.equals(B.right) && this.confidence==B.confidence && this.getInterest()==B.getInterest();
		
	}

	public double getConfidence() {
		return confidence;
	}

	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public Set<String> getLeft() {
		return left;
	}

	public void setLeft(Set<String> left) {
		this.left = left;
	}

	public Set<String> getRight() {
		return right;
	}

	public void setRight(Set<String> right) {
		this.right = right;
	}

	public double getInterest() {
		return interest;
	}

}
