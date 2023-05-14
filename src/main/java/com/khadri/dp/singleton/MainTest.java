package com.khadri.dp.singleton;

public class MainTest {

	public static void main(String[] args) {

		SingltonEnum singleton1 = SingltonEnum.getInstance();
		SingltonEnum singleton2 = SingltonEnum.getInstance();

		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
