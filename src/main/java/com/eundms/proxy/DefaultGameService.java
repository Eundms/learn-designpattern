package com.eundms.proxy;

public class GameServiceProxy extends GameService {
	@Override
	public void startGame() {
		long before = System.currentTimeMillis();
		super.startGame();
		Thread.sleep(1000L);
		System.out.println(System.currentTimeMillis() - before);
	}
}
