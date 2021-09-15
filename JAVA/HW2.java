import java.util.Scanner;
import java.util.HashMap;

public class HW2 {
    public static void main(String[] args) {
        HashMap<String, String> vehicle = new HashMap<>();
        vehicle.put("Civic", "Honda"); //This map can contain many types of vehicles, and they can share with same key. This is just an example.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a + " is belonged to " + vehicle.get(a));
        sc.close();

    }
}
