package com.mpokketapp.calculator;

public class Calculator {
	double emi,interestAmount,newPrincipleFormula;
	
	private void calEmiHome(double principalAmount, int tenure) {
		
		interestAmount=(principalAmount/8);
		emi=(principalAmount+interestAmount)/tenure;
		
	}
private void calEmiPersonal(double principalAmount, int tenure) {
		
		interestAmount=(principalAmount/12.5);
		emi=(principalAmount+interestAmount)/tenure;
		
	}
private double calEmiBorrow(double principalAmount, int tenure) {
	
	interestAmount=(principalAmount/10);
	emi=(principalAmount+interestAmount)/tenure;
	 return emi;
}

public double calEmiEducation(double principalAmount, int tenure) {
	
	interestAmount=(principalAmount/10);
	emi=(principalAmount+interestAmount)/tenure;
	
    double newPrincipleAmount= principalAmount+(emi+tenure);

	double newInterstAmount=(newPrincipleAmount/10);
	double newEmi =(newPrincipleAmount+interestAmount)/2;
	
	return  newEmi;
	
	
}

public double calEmiEntrepreneur(double principalAmount, int tenure) {
	
	interestAmount=(principalAmount/15);
	emi=(principalAmount+interestAmount)/tenure;
	return emi;
}




}
