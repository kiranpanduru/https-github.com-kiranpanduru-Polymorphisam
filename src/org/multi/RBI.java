package org.multi;

public class RBI implements SBI, HDFC {

	@Override
	public void fixed() {
System.out.println(" fixed rate is 12%");		
	}

	@Override
	public void savings() {
System.out.println("savings rate is 10%");		
	}
	public void savings1() {
		System.out.println("savings rate is 12%");		
			}
	@Override
	public void current() {
System.out.println("current rate is 15% ");		
}

public static void main (String[]args) {
	RBI r = new RBI();
	r.fixed();
	r.savings();
	r.current();
	r.savings1();
	
}
}

