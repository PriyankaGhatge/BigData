package collections;

import java.util.HashSet;
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Price> mydata = new HashSet<Price>();

		mydata.add(new Price("100",20));
		mydata.add(new Price("101",30));
		mydata.add(new Price("102",40));
		mydata.add(new Price("103",50));
		
		for (Price pobj:mydata){
			System.out.println(pobj);
		}
	}

	static class Price{
		private String item;
		
		private int price;
		
		public Price (String item, int price){
			this.item=item;
			this.price=price;
		}
		
		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String toString(){
			return "item:"+item+ "Price:"+price;
		}
		
	}
}
