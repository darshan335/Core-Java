package com.exceptionhandling;
class Exep1{
	public void alpha() throws Exception{
		throw new Exception("Exception Occured");
	}
}
public class DuckingAnException {

	public static void main(String[] args) {
		Exep1 e = new Exep1();
		try {
			e.alpha();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
