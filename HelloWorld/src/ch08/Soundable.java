package ch08;

public interface Soundable {
	String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "�߿�";
	}

}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "�۸�";
	}
}
