package com.error;
class Err{
	public void alpha() {
		alpha();
	}
}
public class Error1 {

	public static void main(String[] args) {
		Err e = new Err();
		e.alpha();
	}

}
