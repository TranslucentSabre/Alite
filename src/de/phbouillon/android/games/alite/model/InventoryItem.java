package de.phbouillon.android.games.alite.model;

public class InventoryItem {
	private Weight weight;
	private long totalBuyPrice;
	
	public InventoryItem() {
		clear();
	}
	
	public void add(Weight w, long price) {
		totalBuyPrice += price;
		weight = weight.add(w);
	}
	
	public void set(Weight w, long price) {
		totalBuyPrice = price;
		weight = weight.set(w);
	}

	public void clear() {
		this.weight = Weight.grams(0);
		this.totalBuyPrice = 0;
	}
	
	public long getPrice() {
		return totalBuyPrice;
	}
	
	public Weight getWeight() {
		return weight;
	}
}
