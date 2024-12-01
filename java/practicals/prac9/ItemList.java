import java.util.LinkedList;
import java.util.Scanner;

public class ItemList {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Insert item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items in ascending order");
            System.out.println("4. Display items in descending order");
            System.out.println("5. Display a particular item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Insert at (1: beginning, 2: end, 3: position): ");
                    int position = scanner.nextInt();
                switch (position) {
                    case 1:
                        items.addFirst(itemName);
                        break;
                    case 2:
                        items.addLast(itemName);
                        break;
                    case 3:
                        System.out.print("Enter position: ");
                        int pos = scanner.nextInt();
                        items.add(pos, itemName);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                    break;

                case 2:
                    System.out.print("Remove from (1: beginning, 2: end, 3: position): ");
                    int removePosition = scanner.nextInt();
                switch (removePosition) {
                    case 1:
                        items.removeFirst();
                        break;
                    case 2:
                        items.removeLast();
                        break;
                    case 3:
                        System.out.print("Enter position: ");
                        int pos = scanner.nextInt();
                        items.remove(pos);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                    break;

                case 3:
                    System.out.println("Items in ascending order: " + items);
                    break;
                case 4:
                    System.out.println("Items in descending order: ");
                    for (int i = items.size() - 1; i >= 0; i--) {
                        System.out.println(items.get(i));
                    }
                    break;
                case 5:
                    System.out.print("Enter index of item to display: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < items.size()) {
                        System.out.println("Item at index " + index + ": " + items.get(index));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
