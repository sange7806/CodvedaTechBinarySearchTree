import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== BINARY SEARCH TREE MENU =====");
            System.out.println("1. Insert Node");
            System.out.println("2. Search Node");
            System.out.println("3. Delete Node");
            System.out.println("4. Display InOrder Traversal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    bst.root = bst.insert(bst.root, insertValue);
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();

                    if (bst.search(bst.root, searchValue)) {
                        System.out.println("Value found in the tree.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    bst.root = bst.delete(bst.root, deleteValue);
                    break;

                case 4:
                    System.out.println("InOrder Traversal:");
                    bst.inorder(bst.root);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}