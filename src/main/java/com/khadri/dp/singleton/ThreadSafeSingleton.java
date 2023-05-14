package com.khadri.dp.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton SINGLETON = null;

	private ThreadSafeSingleton() {

	}

	public static synchronized ThreadSafeSingleton getInstance() {

		if (SINGLETON == null)
			SINGLETON = new ThreadSafeSingleton();

		return SINGLETON;
	}

}
