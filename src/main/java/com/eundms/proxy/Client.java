package com.eundms.proxy;

public class Client {
	public static void main(String[] args) {
		// defaultGameservice를 proxy를 거쳐서 사용
		GameService gameService = new GameServiceProxy(new DefaultGameService());
		gameService.startGame();
	}
}
