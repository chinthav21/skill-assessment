public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(getDetails("Chinthaka", 39));
    }

    public static String getDetails(String name, int age){
        return "Hello " + name + ", age " + age;
    }
}
