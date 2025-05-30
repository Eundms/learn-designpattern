package com.eundms.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class App {
	public static void main(String[] args) throws Exception {
		Settings settings = Settings.getInstance();
		try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			output.writeObject(settings);
		}
		Settings settings1 = null;
		try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settings1 = (Settings) input.readObject();
		}
		System.out.println(settings1 == settings);
		// int threadCount = 100;
		// CountDownLatch latch = new CountDownLatch(threadCount);
		// Settings[] instances = new Settings[threadCount];
		//
		// for (int i = 0; i < threadCount; i++) {
		// 	final int index = i;
		// 	new Thread(() -> {
		// 		instances[index] = Settings.getInstance();
		// 		latch.countDown();
		// 	}).start();
		// }
		//
		// latch.await();
		//
		// // 모든 인스턴스가 같은지 확인
		// boolean allSame = true;
		// for (int i = 1; i < threadCount; i++) {
		// 	if (instances[i] != instances[0]) {
		// 		allSame = false;
		// 		break;
		// 	}
		// }
		//
		// if (allSame) {
		// 	System.out.println("✅ Singleton 유지됨 (모든 인스턴스가 동일)");
		// } else {
		// 	System.out.println("❌ Singleton 깨짐 (여러 인스턴스가 생성됨)");
		// }
	}

}
