package Outer;

public class Outer {
    static class Nested_Demo{  // inner class açtık
        public void my_method(){  // metod açtık
            System.out.println("this is my nested class");
        }
    }
    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Nested_Demo();
        nested.my_method();
        // not inner classımızı static yaparsak main metod da ise
        // my_metod otomatik gelecekti yani Outer.Outer.Nested_Demo.my_method(); şeklinde olacktı

    }
}
