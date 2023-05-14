package com.khadri.dp.singleton;


public class StaticBlockSingleton {
	private static StaticBlockSingleton SINGLETON = null;

	private StaticBlockSingleton() {
		
	}
	static {
		try {
			SINGLETON = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("Error while SINGLETON object creation");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return SINGLETON;
	}

}
