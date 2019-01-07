package Lesson3HW;

public class PhonebookTest {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("Михаил", "558-78-17");
        pb.add("Евграф", "776-17-16");
        pb.add("Аристарх", "123-64-78");
        pb.add("Михаил", "576-14-68");
        pb.get("Михаил");
        pb.get("Евграф");
        pb.get("Аристарх");
    }
}
