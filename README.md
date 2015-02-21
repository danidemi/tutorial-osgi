# tutorial-osgi
Examples on OSGI

## Set Up

Set up Git, Ant and Maven

Checkout the examples.

	$ git clone https://github.com/danidemi/tutorial-osgi.git
	$ cd tutorial-osgi

Just run `ant` in the project folder, this will instruct Ant to download some additional libraries.

	$ ant

Then, you can run whatever example you want. Run `ant -p` to discover the available examples.

	$ ant -p
	Buildfile: tutorial-osgi/build.xml
    	Launching various OSGI examples.
    
	Main targets:

	 example-felix-standard-bundles  Run bare Felix with Gogo console.
	 setup                           Set up the environment. You need to run this before any other example.
	Default target: setup

For instance, to run the `example-felix-standard-bundles` example, just run the following command.

	$ ant example-felix-standard-bundles

## Do you need more examples ?

Would you like me to include more examples ? Please, feel free to open an issue.
