package OuterDemo;

public class OuterDmeo {
    private int sayi = 5;

    private class InnerDemo {  // İnner class açtık yani dışarıdan ulaşılmaz
        void innerDemoMethod() {  // meto açtık
            System.out.println("sayi : " + sayi);
        }
    }

    public void OuterDmeoMethod() {  // metod açtık
        InnerDemo innerDemo = new InnerDemo();   // nesne çaıyoruz
        innerDemo.innerDemoMethod();
    }
}
