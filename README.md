# SPRINT 1 TASK 7 - Annotations lvl 1

## Summary
These exercises expand on the core concepts of the sprint and explore file system interaction and object serialization.

### Functionalities

### Exercise 1: Directory Listing

Create a class that lists alphabetically the contents of a directory received as a parameter.

### Exercise 2: Recursive Directory Tree Listing

Add to the class from the previous exercise the functionality to list a directory tree with the contents of all its levels (recursively) so that they are printed on the screen in alphabetical order within each level, also indicating whether it is a directory (D) or a file (F), and its last modification date.

### Exercise 3: Output to File

Modify the previous exercise. Now, instead of displaying the result on the screen, save the result to a TXT file.

### Exercise 4: Read TXT File

Add the functionality to read any TXT file and display its contents on the console.

### Exercise 5: Object Serialization

Now the program must serialize a Java Object to a `.ser` file and then deserialize it.

## Technologies

*   Java JDK 22
*   IntelliJ IDEA
*   Git
*   GitHub

## How to run it

- Clone the repository or download the zip file and run it in your favorite IDE.
- Open the Terminal and navigate to de ¨src¨ directory.
- Compile the file with javac. To compile the file containing the main method, use the javac command specifying its path (location of the folder you want to see the files).

    
     javac Main.java

- Run the compiled file with java.
- Once compiled, a file with a .class extension will be generated. Run this file and pass the argument required by the main method (in this case, the path required for each exercise)


    java Main "PATH"

- After executing the command, the output corresponding to the action programmed in the main method will be displayed.