//Anonymous Classes - declare and instantiate at the same time

public class HelloWorldAnonymousClasses{

	interface HelloWorld{
		public void greet();
		public void greetSomeone(String someone);
	}

	public void sayHello(){

		class EnglishGreeting implements HelloWorld{
			String name = "World";
			public void greet(){
				greetSomeone("world");
			}
			public void greetSomeone(String someone){
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting(); //object/instance

		// Syntax of Anonymous Class - instantiation of the frenchGreeting object
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tour le monde";
			public void greet(){
				greetSomeone("tour le monde");
			}
			public void greetSomeone(String someone){
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		HelloWorld spanishGreeting = new HelloWorld(){
			String name = "mundo";
			public void greet(){
				greetSomeone("mundo");
			}
			public void greetSomeone(String someone){
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();

	//close sayHello method
	}

	public static void main(String... args){
		HelloWorldAnonymousClasses myApp = 
			new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}

//close HelloWorldAnonymousClasses class
} 