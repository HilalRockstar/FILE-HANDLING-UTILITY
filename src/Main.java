import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        FileHandler fileHandler = new FileHandler(filePath);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Write to File");
            System.out.println("2. Read File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Text to Write: ");
                    fileHandler.writeToFile(sc.nextLine());
                    break;
                case 2:
                    fileHandler.readFile();
                    break;
                case 3:
                    System.out.print("Old Text: ");
                    String oldText = sc.nextLine();
                    System.out.print("New Text: ");
                    String newText = sc.nextLine();
                    fileHandler.modifyFile(oldText, newText);
                    break;
                case 4:
                    System.out.println("Program Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
