import java.util.ArrayList;

class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactManager() {
        contacts.add(new Contact(1, "Alice"));
        contacts.add(new Contact(2, "Bob"));
        contacts.add(new Contact(3, "Charlie"));
    }

    public void displayContacts() {
        System.out.println("Available Contacts:");
        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }

    public Contact getContactById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }
}
