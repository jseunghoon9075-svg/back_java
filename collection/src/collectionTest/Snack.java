package collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Snack {
	private String flavor;
	private int calory;
	
	public Snack() {;}
	
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calory, flavor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return calory == other.calory && Objects.equals(flavor, other.flavor);
	}
	
	public static void main(String[] args) {
		HashMap<String, Object> ad = new HashMap<>();
//		HashMap는 키는 중복x value는 중복o
		ad.put("치킨", new Snack("양념", 17000));
		ad.put("마늘치킨", new Snack("마늘", 23000));
		ad.put("간장치킨", new Snack("간장", 21000));
		ad.put("후라이드치킨", new Snack("후라이드", 17000));
		
		ArrayList<HashMap<String, Object>> arr = new ArrayList<>();
		
		arr.add(ad);
		
		System.out.println(arr);
	}
	
}
