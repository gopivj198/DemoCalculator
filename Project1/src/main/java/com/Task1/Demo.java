package com.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Calculation
{
	public double Add( List<Double> data);
	public double Sub(List<Double> data);
	public double Mul(List<Double> data);
	public double Div(List<Double> data);
}
class Calculator implements Calculation
{
	public double Add(List<Double> data)
	{
		double result=0.0;
			result=data.get(0)+data.get(1);				
		return result;
	}
	public double Sub(List<Double> data)
	{
		double result=0.0;
		result=data.get(0)-data.get(1);
		return result;
	}
	public double Mul(List<Double> data)
	{
		double result=0.0;
		result=data.get(0)*data.get(1); 
		return result;
	}
	public double Div(List<Double> data)
	{
		double result=0.0;
		result=data.get(0)/data.get(1);		
		return result;
	}
}
public class Demo
{
	public static void main(String as[])
	{
		Calculator c=new Calculator();
		System.out.println("Enter two numbers ");
		Double a,b,res=0.0;
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		List<Double> l=new ArrayList<Double>();
		l.add(a);
		l.add(b);
		System.out.println("choose operation\n1.Add\n2.Sub\n3.Mul\n4.Div\n");
		int n;
		n=s.nextInt();
		switch(n){
		case 1:res=c.Add(l);
			break;
		case 2:res=c.Sub(l);
			break;
		case 3:res=c.Mul(l);
			break;
		case 4:res=c.Div(l);
			break;
		default:System.out.println("failed");
		}
		System.out.println("Ans : "+res);
	}	
}

