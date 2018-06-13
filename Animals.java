public interface Animals {
    void speak();
    void eat();

   
    
  public static void main(String[] args) {
	  dog obj=new dog();
      obj.speak();
      obj.eat();
      cat obj1=new cat();
      obj1.speak();
      obj1.eat();
	}

}
 class dog implements Animals{
	public void speak() {
		
		System.out.println("Dog here");
		
	}
	public void eat() {
		
		System.out.println("Dog eats");
		
	}
 }
 class cat implements Animals{
		public void speak() {
			
			System.out.println("Cat here");
			
		}
		public void eat() {
			
			System.out.println("Cat eats");
			
		}
	 }