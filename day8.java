import java.util.*;

public class day8 {

    // Store users and their friends
    static Map<String, Set<String>> friendsMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    // Add friendship (two-way)
    static void addFriend(String user1, String user2) {
        friendsMap.putIfAbsent(user1, new HashSet<>());
        friendsMap.putIfAbsent(user2, new HashSet<>());

        friendsMap.get(user1).add(user2);
        friendsMap.get(user2).add(user1);

        System.out.println("Friend added successfully!");
    }

    // Find mutual friends
    static void mutualFriends(String user1, String user2) {
        if (!friendsMap.containsKey(user1) || !friendsMap.containsKey(user2)) {
            System.out.println("User not found!");
            return;
        }

        Set<String> mutual = new HashSet<>(friendsMap.get(user1));
        mutual.retainAll(friendsMap.get(user2));

        System.out.println("Mutual Friends: " + mutual);
    }

    // Suggest friends (friends of friends)
    static void suggestFriends(String user) {
        if (!friendsMap.containsKey(user)) {
            System.out.println("User not found!");
            return;
        }

        Set<String> suggestions = new HashSet<>();
        Set<String> userFriends = friendsMap.get(user);

        for (String friend : userFriends) {
            for (String foaf : friendsMap.get(friend)) {
                if (!foaf.equals(user) && !userFriends.contains(foaf)) {
                    suggestions.add(foaf);
                }
            }
        }

        System.out.println("Friend Suggestions: " + suggestions);
    }

    // Display all users
    static void displayNetwork() {
        System.out.println("\nSocial Network:");
        for (String user : friendsMap.keySet()) {
            System.out.println(user + " -> " + friendsMap.get(user));
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Friend Recommendation System ---");
            System.out.println("1. Add Friend");
            System.out.println("2. Mutual Friends");
            System.out.println("3. Suggest Friends");
            System.out.println("4. Display Network");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter User 1: ");
                    String u1 = sc.nextLine();
                    System.out.print("Enter User 2: ");
                    String u2 = sc.nextLine();
                    addFriend(u1, u2);
                    break;

                case 2:
                    System.out.print("Enter User 1: ");
                    String m1 = sc.nextLine();
                    System.out.print("Enter User 2: ");
                    String m2 = sc.nextLine();
                    mutualFriends(m1, m2);
                    break;

                case 3:
                    System.out.print("Enter User: ");
                    String user = sc.nextLine();
                    suggestFriends(user);
                    break;

                case 4:
                    displayNetwork();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}