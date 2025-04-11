package extend.animal2;

public class Dog extends Animal {
	
	private String name;
	
	public Dog(String name) {
		if ((name == "")||(name == null)) {
			this.name = "犬";
		}else {
			this.name = name;			
		}
	}
	
	public void eat() {
		System.out.println(this.name + "が食事をしました！");
	}

	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}
}
