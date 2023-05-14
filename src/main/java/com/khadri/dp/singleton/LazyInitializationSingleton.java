package com.khadri.dp.singleton;

public class LazyInitializationSingleton {
	private static LazyInitializationSingleton SINGLETON = null;

	private LazyInitializationSingleton() {

	}

	public static LazyInitializationSingleton getInstance() {

		if (SINGLETON == null)
			SINGLETON = new LazyInitializationSingleton();

		return SINGLETON;
	}

}
