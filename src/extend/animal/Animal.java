package extend.animal;

public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	public abstract void cry();
	
}
