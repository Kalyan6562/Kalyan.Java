import java.util.Scanner;

// Song class (Node)
class Song {
    String title;
    String genre;
    String artist;
    double duration;
    Song next;
    Song prev;

    Song(String title, String genre, String artist, double duration) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.duration = duration;
        this.next = null;
        this.prev = null;
    }
}

// Playlist class
class Playlist {
    Song head;
    Song tail;
    Song current;

    // Add song
    void addSong(String title, String genre, String artist, double duration) {
        Song newSong = new Song(title, genre, artist, duration);
        if (head == null) {
            head = tail = current = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
        System.out.println("Song added successfully.");
    }

    // Delete song by title
    void deleteSong(String title) {
        Song temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head)
                    head = temp.next;
                if (temp == tail)
                    tail = temp.prev;
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;

                if (current == temp)
                    current = head;

                System.out.println("Song deleted successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Song not found.");
    }

    // Play next song
    void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            displayCurrent();
        } else {
            System.out.println("No next song available.");
        }
    }

    // Play previous song
    void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            displayCurrent();
        } else {
            System.out.println("No previous song available.");
        }
    }

    // Display current song
    void displayCurrent() {
        if (current != null) {
            System.out.println("\nNow Playing:");
            System.out.println("Title: " + current.title);
            System.out.println("Genre: " + current.genre);
            System.out.println("Artist: " + current.artist);
            System.out.println("Duration: " + current.duration + " mins");
        } else {
            System.out.println("Playlist is empty.");
        }
    }
}

// Main class
public class project3 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song");
            System.out.println("2. Delete Song");
            System.out.println("3. Next Song");
            System.out.println("4. Previous Song");
            System.out.println("5. Show Current Song");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Duration (mins): ");
                    double duration = sc.nextDouble();
                    playlist.addSong(title, genre, artist, duration);
                    break;

                case 2:
                    System.out.print("Enter song title to delete: ");
                    playlist.deleteSong(sc.nextLine());
                    break;

                case 3:
                    playlist.nextSong();
                    break;

                case 4:
                    playlist.previousSong();
                    break;

                case 5:
                    playlist.displayCurrent();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
