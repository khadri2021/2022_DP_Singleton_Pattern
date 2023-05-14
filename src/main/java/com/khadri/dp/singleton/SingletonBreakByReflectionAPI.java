package com.khadri.dp.singleton;

import java.lang.reflect.Constructor;

public class SingletonBreakByReflectionAPI {

	public static void main(String[] args) throws Exception {

		// Reflection API
		Constructor<?>[] constructors = EagerInitializeSingleton.class.getDeclaredConstructors();

		for (Constructor<?> constructor : constructors) {

			constructor.setAccessible(true);// This will be break singleton by providing public access

			EagerInitializeSingleton instance1 = (EagerInitializeSingleton) constructor.newInstance(null);
			EagerInitializeSingleton instance2 = (EagerInitializeSingleton) constructor.newInstance(null);

			System.out.println(instance1);
			System.out.println(instance2);

		}

	}
}
