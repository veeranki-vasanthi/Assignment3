// To implement serialization in Java for a given object, such as the 'Customer' class in your example, 
// you need to follow these steps:

// 1.Ensure that the class you want to serialize implements the Serializable interface.
// 2.Create an instance of the ObjectOutputStream class to write objects to an output stream.
// 3.Use the writeObject() method of ObjectOutputStream to serialize the object and write it to a file.
// 4.Close the output stream to release resources.
//Serialization
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Customer implements java.io.Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    
}

public class Prob1{
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Alice", "1234567890", "New York");

        try {
            FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(customer);
            out.close();
            fileOut.close();
            System.out.println("Customer object serialized to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
