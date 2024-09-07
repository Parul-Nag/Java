import java.util.*;

public class User{
   // Two variables
   int id;
   String name;

   // Constructor to create Object of User with id and name
   public User(int id, String name){
     this.id = id;
     this.name = name;
   }

   // Getter methods to access id and name of a particular object
   public int getId(){
     return id;
   }

   public String getName(){
     return name;
   }

   // Main method to run
   public static void main(String[] args){
   // If you want to create 3 User object and store it in Vector, this is how it is done

     // This can be achieved even using list and array
     // List<User> userList = new ArrayList<User>();
     // User[] userArray = new User[3];
     // For vector
     Vector<User> userVector = new Vector<User>();
     for (int i = 0; i < 3; i++){
       User u = new User(i, "A" + i);
       userVector.add(u);
     }
     // To access user objects from Vector
    for (int i = 0; i < 3; i++){
       System.out.println("Id is " + userVector.get(i).getId() + " Name is " + userVector.get(i).getName());
     }
    }
}