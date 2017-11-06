package jconf;

class Test extends Thread {

    static String sName = "good";

    public static void _main(String... args) throws InterruptedException {
        Test t = new Test();
        t.nameTest(sName);
        sleep(3000);
        System.out.println(sName);
    }

    public void nameTest(String sName) {
        sName = sName + "idea";
        start();
    }

    public void run() {
        for (int i = 0; i < 4; i ++) {
            sName = sName + " " + i;
        }

    }


}


class A {
    String message = "Hello from A";

    // Instance initialization block:
    // Runs each time you instantiate an object
    // before constructor
    {
        writeTheMessage();
    }

    protected A(String message) {
        this.message = message;
    }

    protected String getMessage() {
        return message;
    }

    public void writeTheMessage() {
        System.out.println(getMessage());
    }
}

class B extends A {
    public static void _main(String[] args) {
        A a = new B("Hello world");
        a.writeTheMessage();
    }

    public B(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage() + "  + B";
    }
}