
import java.util.*;
import java.util.HashMap;

public class Address_Book {
    HashMap<String,String> hm = new HashMap<>();
    String name;
    String phone;
//    ArrayList<Address_Book> arl = new ArrayList<>();
//    HashMap<String,String> hm = new HashMap<>();

    public Address_Book(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Address_Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public static void main(String args[]){
        Address_Book main = new Address_Book();
        main.input();
    }
    public void input() {
//        HashMap<String,String> hm = new HashMap<>();
        int luachon;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add new contact");
            System.out.println("2.Find a contact by name");
            System.out.println("3.Display contacts");
            System.out.println("4.Exit");
            System.out.println("Nhập lua chon cua ban:");
            luachon = scanner.nextInt();
            Address_Book arb = new Address_Book();
            while (luachon < 0 || luachon > 4) ;
            switch (luachon) {
                case 1:
                    System.out.println("Ten cua ban la:");
//                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.next();
                    System.out.println("Nhap vao phonenumber cua ban:");
                    String phone = scanner.next();
                    hm.put(name,phone);
                    break;

                case 2:
                    String name_contact;
                    System.out.println("Nhap vao ten ban can tim");
//                    Scanner scanner = new Scanner(System.in);
                    name_contact = scanner.nextLine();
                    System.out.println(hm.get(name_contact));
                    break;
                case 3:
                    Iterator<Map.Entry<String, String>> iterator = hm.entrySet().iterator();
                    while (iterator.hasNext()) {
                        // tạo 1 entry
                        for (Map.Entry entry: hm.entrySet()
                             ) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());

                        }
                    }
break;
                case 4:
                    System.out.println("EXIT");
                    System.exit(0);
                    break;
            }
        }while (luachon != 0);
    }


//    public void adduser(){
//            System.out.println("Ten cua ban la:");
//            Scanner scanner = new Scanner(System.in);
//            name = scanner.next();
//            System.out.println("Nhap vao phonenumber cua ban:");
//            phone = scanner.next();
//            hm.put(name,phone);
//
////        System.out.println("Ten cua ban la:");
////        Scanner scanner = new Scanner(System.in);
////        name = scanner.nextLine();
////        System.out.println("Nhap vao phonenumber cua ban:");
////        phone = scanner.nextLine();
////        hm.put(name,phone);
//
////        prodArrayList.add(hm);
////        arl.add(hm);
//    }
//    public void contact(){
//        String name_contact;
//        System.out.println("Nhap vao ten ban can tim");
//        Scanner scanner = new Scanner(System.in);
//        name_contact = scanner.nextLine();
//        System.out.println(hm.get(name_contact));
//    }
//    public void display(){
//
//        Iterator<Map.Entry<String, String>> iterator = hm.entrySet().iterator();
//        while (iterator.hasNext()) {
//            // tạo 1 entry
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//    }
//    HashMap<String,String> hm = new HashMap<>();

}
