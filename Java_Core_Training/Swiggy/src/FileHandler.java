import java.util.*;
import java.io.*;

public class FileHandler{

    public static Map<String, String> loadUsers() {
        Map <String, String> users = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("user.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                users.put(parts[0], parts[1]);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("DB Error");
        }
        return users;
    }

    public static List<Order> loadOrders() {
        List <Order> orders = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("database.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                orders.add(new Order(parts[0], Integer.parseInt(parts[1]), parts[2]));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("DB Error");
        }
        return orders;
    }

    public static boolean uploadUserRecord(Map<String, String> users) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));
            Set <String> userset = users.keySet();
            String content = "";
            for (String user : userset) {
                content += user + " " + users.get(user) + "\n";
            }
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            System.out.println("DB Error");
        }
        return true;
    }
	
}