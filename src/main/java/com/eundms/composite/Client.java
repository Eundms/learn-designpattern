package com.eundms.composite;

public class Client {
	public static void main(String[] args) {
		Item doranBlade = new Item("도란검", 450);
		Item healPotion = new Item("체력 물약", 40);

		Bag bag = new Bag();
		bag.add(doranBlade);
		bag.add(healPotion);

		Client client = new Client();
		client.printPrice(doranBlade);
		client.printPrice(bag);
	}

	private void printPrice(Component item) { // 클라이언트는 Bag이던, Item이던 상관 없이 Component 인터페이스만 보면 된다
		System.out.println(item.getPrice());
	}
}
