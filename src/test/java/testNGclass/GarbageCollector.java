package testNGclass;

public class GarbageCollector {

	        // Java program to demonstrate requesting 
	        // JVM to run Garbage Collector
            public static void main(String[] args) throws InterruptedException {
	    	GarbageCollector t1 = new GarbageCollector();
	    	GarbageCollector t2 = new GarbageCollector();
	        // Nullifying the reference variable
	        t1 = null;
	        // requesting JVM for running Garbage Collector
	        System.gc();
	        // Nullifying the reference variable
	        t2 = null;
	        // requesting JVM for running Garbage Collector
	        Runtime.getRuntime().gc();}
	        @Override
	        // finalize method is called on object once 
	        // before garbage collecting it
	        protected void finalize() throws Throwable {
	        System.out.println("Garbage collector called");
	        System.out.println("Object garbage collected : " + this); }}

