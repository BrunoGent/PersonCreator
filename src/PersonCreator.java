public class PersonCreator {
    public static void main(String[] args) {
        Person Person01=new Person("James Peterson", 34, 180, 73.5);
        Person Person02=new Person("Bob Thomley", 25, 171, 68.2);
        //System.out.println(Person01.getName());
        //Person01.setName("Alex Ayodeji");
        //System.out.println(Person01.getName());
        //--------------------------------------------
        Person01.GrowOlder();
        System.out.println(Person01.getName());
        System.out.println(Person01.getAge());
        System.out.println(Person01.getHeight());
        System.out.println(Person01.getWeight());
    }
}
