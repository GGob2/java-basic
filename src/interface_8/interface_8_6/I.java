package interface_8.interface_8_6;

public interface I {
    private static String speak() {
        return "Hello!";
    }

    private static void run() {
        System.out.println("Run!!!!");
    }

    public static void speakMyName(String name){
        System.out.println(speak() + " My name is "+ name + "!");
    }
}
