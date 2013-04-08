package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Divide extends AbstractOperation implements BinaryOperation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "/";
	}

	@Override
	public float perform(float arg1, float arg2) {
		// TODO Auto-generated method stub
		return arg1 / arg2;
	}

	
	
}
