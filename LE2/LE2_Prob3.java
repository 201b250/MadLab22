public class Main
{
	public static void main (String[] args) {
	    Application.main();
	}
}

class Mother {
    public static void show () {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    public static void show () {
        System.out.println("Hello JUET");
    }
}

class Application {
    public static void main () {
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
        Mother m1 = new Child();
        m1.show();
    }
}