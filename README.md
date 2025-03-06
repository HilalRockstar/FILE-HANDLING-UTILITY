# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: HAMEED HILAL

*INTERN ID*: CT04XHI

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

File Operations in Java using IntelliJ

Project Description

This project demonstrates essential file handling operations using Java on the IntelliJ IDEA platform. File operations play a crucial role in software development, especially when data needs to be stored, retrieved, or modified without relying on databases. The objective of this project is to perform reading, writing, and modifying text files using Java's built-in libraries. The entire project is developed in IntelliJ, making use of object-oriented programming concepts to enhance code structure, reusability, and maintainability.

The project follows a structured approach where all file-related functionalities are managed through a dedicated FileHandler class. This class contains methods to perform various file operations, ensuring that the code remains modular and easy to maintain. The writeToFile() method allows users to append data to an existing file without deleting previous content, making it suitable for log files and data entry systems. The readFile() method reads the entire content of the file line by line, providing a simple yet efficient way to display data stored in text files. Meanwhile, the modifyFile() method enables users to search for specific text in the file and replace it with new content, demonstrating how files can be dynamically updated.

One of the key features of this project is its menu-driven interface, which makes user interaction seamless. The menu prompts users to select one of the three operations or exit the program. This approach enhances the user experience by offering a simple and interactive way to access file operations. The program uses the Scanner class to accept user input, making the application flexible for different types of data entries.

To ensure the security and reliability of file operations, the project implements exception handling mechanisms using try-catch blocks. This helps to prevent unexpected crashes in cases where the file does not exist or access permissions are restricted. Additionally, the project utilizes the BufferedReader and BufferedWriter classes to improve input and output efficiency, especially when working with large files.

The project directory structure is designed in a professional way, including a separate files/ folder where all text files are stored. This folder acts as a central storage location, making file management more organized. The file path is passed dynamically through the FileHandler class, allowing users to customize file names without modifying the core code.

One of the standout features of this project is the file modification functionality. Unlike basic file handling applications, this project goes beyond simple read and write operations by allowing users to search and replace content within the file. This feature is implemented using the java.nio.file package, which makes it easier to read the entire file content into a string and modify it before saving it back to the file.

The project is built entirely with Java's standard libraries, without requiring any external dependencies. This makes the program lightweight and easy to deploy across different platforms. The implementation follows best coding practices, including code reusability, modular design, and user-friendly interfaces.

By completing this project, students and beginners can gain hands-on experience in file handling, which is a fundamental concept in programming. This project can also be expanded further by integrating MySQL databases, encryption mechanisms, or GUI interfaces in the future. Overall, this project serves as an excellent starting point for understanding file manipulation in Java while following industry-standard coding practices.

#OUTPUT 

Write a File
![Image](https://github.com/user-attachments/assets/1bde88ee-3845-4d90-b8f5-032f7ba5e899)


Read a File

![Image](https://github.com/user-attachments/assets/062548a5-f0ad-4a14-8158-c7426ebb0933)

Modify a File 
![Image](https://github.com/user-attachments/assets/942697dc-a658-4e2b-ac33-c85e08034d35)

After Modify the File again We read it






