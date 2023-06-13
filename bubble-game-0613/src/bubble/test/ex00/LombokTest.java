package bubble.test.ex00;

import lombok.Data;

@Data
class Dog {
	private String name;
}

public class LombokTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("이제되네");
		System.out.println(d.getName());
	}
}
