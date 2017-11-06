package jconf;

class Test extends Thread {

    static String sName = "good";

    public static void main(String... args)
    {
        Test t = new Test();
        t.nameTest(sName);
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