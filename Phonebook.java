package L110;


import java.util.HashMap;

public class Phonebook {

    private HashMap<String, String> phones;

    public Phonebook(){
        this.phones = new HashMap<>();
        phones.put("Smith", "9283048");
        phones.put("Adams", "238728401");
        phones.put("Kim", "230947011");
        phones.put("Um", "12560002");
    }

    public void add(String surname, String phoneNumber){
        if(phones.containsKey(surname)){
            phoneNumber = phones.get(surname) + "; " + phoneNumber + "; ";
        }
        phones.put(surname, phoneNumber);
    }

    public void get(String surname){

        if(phones.containsKey(surname)){
            System.out.println(surname + ": " + (phones.get(surname)));
        } else {
            System.out.printf("No such surname (%s) in the database", surname);
        }
    }
}
