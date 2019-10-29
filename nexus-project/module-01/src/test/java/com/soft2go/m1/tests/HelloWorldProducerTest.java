package com.soft2go.m1.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.soft2go.m1.HelloWorldProducer;

public class HelloWorldProducerTest {

	@Test
	public void testProduceHelloWorld() {
		String text = new HelloWorldProducer().produceHelloWorld();
		assertNotNull(text);
	}

}
