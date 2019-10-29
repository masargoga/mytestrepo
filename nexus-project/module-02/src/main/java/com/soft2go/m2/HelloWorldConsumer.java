package com.soft2go.m2;

import com.soft2go.m1.HelloWorldProducer;

public class HelloWorldConsumer {

	public static void main(String[] args) {
		System.out.println(new HelloWorldProducer().produceHelloWorld());
	}
}
