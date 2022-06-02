public class Main
{
	public static void main (String[] args) {
	    Application.main();
	}
}

class Mother {
    int x;
    public void show (int y) {
        System.out.println("Mother class");
        this.x = y;
        System.out.println(x);
    }
}

class Child extends Mother {
    public void show() {
        System.out.println("Child class");
    }
}

class Application {
    public static void main () {
        Mother m = new Mother();
        m.show(5);
        Child ch = new Child();
        ch.show();
    }
}