package extend.animal;

public class Dog extends Animal {
	
	

	public Dog(String name) {
		super(name);
	}

	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}
