package Person;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {  // main de nesneler oluşturabilmek için consranctor oluşturduk
        this.name = name;
        this.age = age;
    }
    // p1.compareAge(p2);  // p1 in ismine this.name ile yaşına ise this.age ile ulaşıyoruz
    // p2 nin ismine person.getNmae() ile  yaşına ise person.getAge(); ulasıyoruz
    public void compareAge(Person person) {  // metod açtık
        int birinci_yas = this.age;
        int ikinci_yas = person.getAge(); // 2. person metodun içinde olduğundan get edebilmek için getter ve setter açtık
        if (birinci_yas > ikinci_yas) {
            System.out.println("I am older than" + person.getName());
        } else if (birinci_yas == ikinci_yas) {
            System.out.println(this.name + " and " + person.getName() + " are in the same age");

        } else {
            System.out.println(person.getName() + " is older than me");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
