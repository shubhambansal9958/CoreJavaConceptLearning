package com.concept.learning.locking;

public class StatementGenerator implements Runnable {

	Printer resource;
	String statement;
	
	
	public StatementGenerator(Printer resource, String statement) {
		this.resource = resource;
		this.statement = statement;
	}


	@Override
	public void run() {
		resource.printStatement(statement);
	}

}
