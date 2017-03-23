package com.waheedtechblog.singleton;

public class SingletonTester {

	public static void main(String[] args) {

		// checking first class
		DoubleCheckSingletonPattern singletonPattern1 = DoubleCheckSingletonPattern.getInstance();
		DoubleCheckSingletonPattern singletonPattern2 = DoubleCheckSingletonPattern.getInstance();

		if (singletonPattern1 == singletonPattern2) {
			System.out.println("Class DoubleCheckSingletonPattern is Singleton");
		} else {
			System.out.println("Class DoubleCheckSingletonPattern is not Singleton");
		}

		// checking second class
		SingletonUsingInnerStaticClass innerStaticClass1 = SingletonUsingInnerStaticClass.getInstance();
		SingletonUsingInnerStaticClass innerStaticClass2 = SingletonUsingInnerStaticClass.getInstance();

		if (innerStaticClass1 == innerStaticClass2) {
			System.out.println("Class SingletonUsingInnerStaticClass is Singleton");
		} else {
			System.out.println("Class SingletonUsingInnerStaticClass is not Singleton");
		}

	}

}
