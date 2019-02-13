package com.dummy.test;

public class ComparsionFloat {
  private static void sfComp()
  {
	  double f = 0.1;
	  for (int i=0;i<=11;i++){
		  f = f+ 0.1;
	  }
	  double d = .1*11;
	  System.out.println("F V ="+ f);
	  System.out.println("F V2 ="+ d);
	  
	  if(f == d)
	  {
		  System.out.println("eql");
	  }else 
	  {
		  System.out.println("Not equal");
	  }
  }
  public static void main(String []args)
  {
	  sfComp();
  }
}
