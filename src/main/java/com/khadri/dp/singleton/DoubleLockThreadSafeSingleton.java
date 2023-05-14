package com.khadri.dp.singleton;

public class DoubleLockThreadSafeSingleton {
	private static DoubleLockThreadSafeSingleton SINGLETON = null;

	private DoubleLockThreadSafeSingleton() {

	}

	public static DoubleLockThreadSafeSingleton getInstance() {

		if (SINGLETON == null) {
			synchronized (DoubleLockThreadSafeSingleton.class) {
				if(SINGLETON == null)
					SINGLETON = new DoubleLockThreadSafeSingleton();
			}
		}

		return SINGLETON;
	}

}
