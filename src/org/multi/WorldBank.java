package org.multi;

public class WorldBank extends RBI {
public void intrest() {
System.out.println(" intrest is 5%");
}
public static void main(String [] args) {
	WorldBank r = new WorldBank();
	r.fixed();
	r.savings();
	r.current();
	r.savings1();
    r.intrest();
    
}

}
