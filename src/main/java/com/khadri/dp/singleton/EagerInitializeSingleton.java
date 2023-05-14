package com.khadri.dp.singleton;

public class EagerInitializeSingleton {

	private static final EagerInitializeSingleton SINGLETON = new EagerInitializeSingleton();

	private EagerInitializeSingleton() {

	}

	public static EagerInitializeSingleton getInstance() {
		System.out.println("invoked ");
		return SINGLETON;
	}

}
