package passby;

class Dog{
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PassByValue {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");  // Dog *aDog = &("Max")  aDog = 42
        Dog oldDog = aDog;  //oldDog = 42

        // we pass the object to foo
        foo(aDog);  // foo(memory location 42)
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true  42.getName() = "Max"
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog == oldDog); // true  42 == 42
    }

    public static void foo(Dog d) {  // d = memory location 42
        System.out.println("In foo " + d.getName().equals("Max")); // true   42.getName = "Max"
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");  //  52 = new Dog("Fifi")  --> d = 52
        System.out.println("In foo " + d.getName().equals("Fifi")); // true   52.getName() ==> Fifi
    }

    /*public static void main(String[] args) {
        Dog aDog = new Dog("Max");  // aDog = 42
        Dog oldDog = aDog;  // oldDog = 42

        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        aDog.getName().equals("Fifi"); // true  42.getName() ==> "Fifi"
        // but it is still the same dog:
        System.out.println(aDog == oldDog); // true  42 == 42
        System.out.println("aDog.getName() = " + aDog.getName());  // 42.getName() ==> "fifi"
        System.out.println("oldDog.getName() = " + oldDog.getName()); // 42.getName() ==? "fifi"
    }

    public static void foo(Dog d) {  // d = 42
        d.getName().equals("Max"); // true  42.getName() ==> "Max"
        // this changes the name of d to be "Fifi"
        d.setName("Fifi"); // 42.setName() = "Fifi"
    }*/

    /*public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "Archish");
        integerStringMap.put(2, "Kotesh");
        integerStringMap.put(3, "Bharathi");
        System.out.println(integerStringMap);
        m1(integerStringMap);
        System.out.println("after method calling" + integerStringMap);
    }

    static void m1(Map<Integer, String> hm){

//        hm.put(4, "Prabhath");
        hm = new HashMap<>();
        hm.put(1, "Mounika");
        System.out.println("hm = " + hm);
    }*/

    /*public static void main(String[] args) {
        Integer i = Integer.valueOf(5); // i = 42
        Integer j = i; // j = 42

        m1(i);
        System.out.println("Main i = " + i);
    }

    static void m1(Integer a){  // a = 42
        System.out.println("a = " + a);
        a = Integer.valueOf(10);  // a = 52
        System.out.println("a = " + a);
    }*/
}
