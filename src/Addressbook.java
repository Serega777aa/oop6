import java.util.ArrayList;

public class Addressbook {
    public ArrayList<Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new Phonebook("Иванов Петр Степанович", "88005553535", "Москва"));
        pb.add(new Phonebook("Медведев Степан Петрович", "0987342321", "Петербург"));
        pb.add(new Phonebook("Тимофеев Валерий Александрович", "89574547888", "Н.Новгород"));
    }

    public void showAddressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}
