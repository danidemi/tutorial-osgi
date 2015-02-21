package com.danidemi.tutorial.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorld implements BundleActivator {

	private String message;
	
	public HelloWorld() {
		// message is initialized here just to prove constructor is invoked
		this.message = "Hello World";
	}
	
	public void start(BundleContext context) throws Exception {
		System.out.println(message);
	}

	public void stop(BundleContext context) throws Exception {
		throw new RuntimeException("WTF");
		//System.out.println("Goodbye");
	}

}
