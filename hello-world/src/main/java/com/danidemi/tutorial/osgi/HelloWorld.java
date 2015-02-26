package com.danidemi.tutorial.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Just a simple example that shows how to react to a start() and stop() received from the framework,
 * implementing {@link BundleActivator}.
 * Please, pay attentio to the fact that in the MANIEST.MF, this class should be declared: 
 * {@code Bundle-Activator: com.danidemi.tutorial.osgi.HelloWorld}
 */
public class HelloWorld implements BundleActivator {

	private String message;
	
	public HelloWorld() {
		this.message = "Hello World";
	}
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println(message);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye");
	}
	
}
