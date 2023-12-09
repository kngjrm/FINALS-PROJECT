package birpck;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static Map<String, String> adminCredentials = new HashMap<>();
    private static Map<String, String> studentCredentials = new HashMap<>();
    private static Map<String, String> libraryCatalog = new HashMap<>();
    private static Map<String, Map<String, String>> borrowedBooks = new HashMap<>();
    private static Map<String, String> studentProfiles = new HashMap<>();
    private static Map<String, List<String>> notifications = new HashMap<>();


    static {
        adminCredentials.put("admin", "finaloop");
        studentCredentials.put("student1", "password");
    }

    public static void main(String[] args) {
    	
 
         Scanner scanner = new Scanner(System.in);
     

         try {
        	    while (true) {
        	    	System.out.println("\n");
        	    	System.out.println("\t\t\t\t\t                   * *             ");
        	        System.out.println("\t\t\t\t\t             *  **                ");
        	        System.out.println("\t\t\t\t\t           *   *              *    ");
        	        System.out.println("\t\t\t\t\t        *    *               * *   ");
        	        System.out.println("\t\t\t\t\t      *      *              *   *  ");
        	        System.out.println("\t\t\t\t\t      *        **         *    *   ");
        	        System.out.println("\t\t\t\t\t      *           *****       **   ");
        	        System.out.println("\t\t\t\t\t       *                    *      ");
        	        System.out.println("\t\t\t\t\t         * *             **        ");
        	        System.out.println("\t\t\t\t\t             * *********       \n\n");
        	        System.out.println("\t\t\t\t\t    +----------------------------+");
        	        System.out.println("\t\t\t\t\t    |  WELCOME TO BOOK IT RIGHT  |");
        	        System.out.println("\t\t\t\t\t    +----------------------------+");
        	        System.out.println("\t\t\t\t\t      +-----------------------+");
        	        System.out.println("\t\t\t\t\t      |        LOG IN AS      |");
        	        System.out.println("\t\t\t\t\t      +-----------------------+");
        	        System.out.println("\t\t\t\t\t      |   |                   |");
        	        System.out.println("\t\t\t\t\t      | 1 |       Admin       |");
        	        System.out.println("\t\t\t\t\t      | 2 |      Student      |");
        	        System.out.println("\t\t\t\t\t      | 3 |       Exit        |");
        	        System.out.println("\t\t\t\t\t      |   |                   |");
        	        System.out.println("\t\t\t\t\t      +-----------------------+");
        	        System.out.print("\t\t\t\t\t             Choice : ");
        	        
        	        int choice = getUserChoice(scanner);

        	        switch (choice) {
        	            case 1:
        	                loginAsAdmin(scanner);
        	                break;
        	            case 2:
        	                loginAsStudent(scanner);
        	                break;
        	            case 3:
        	                System.out.println("\n\t\t\t\t\t              Exiting...\n");
        	                System.out.println("\t\t\t\t\t       Thank you for visiting!\n");
        	                System.exit(0);
        	                break;
        	            default:
        	                System.out.println("\n\t\t\t\t\t  Invalid choice. Please try again.\n");
        	                System.out.println("\t\t\t\t------------------------------------------------------\n");
        	        }
        	    }
        	} catch (Exception e) {
        	    // Handle exceptions if any
        	    e.printStackTrace();
        	}

            
         finally {
           
            scanner.close();
           
        }
            
    }

    private static int getUserChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            
            scanner.nextLine();
            return -1;
        }
    }
    private static void loginAsAdmin(Scanner scanner) {
    	System.out.println("\n\t\t\t\t\t\t   Welcome Admin!\n");
        System.out.print("\t\t\t\t\t\tUsername   : ");
        String username = scanner.next();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t\tPassword   : ");
        String password = scanner.next();
        scanner.nextLine();

        if (adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password)) {
            System.out.println("\n\t\t\t\t\t      Admin login successful!\n");
            adminMenu(scanner);
        } else {
            System.out.println("\n\t\t\t\t\t\tAdmin login failed.\n");
            System.out.println("\t\t\t\t\t\t    Returning...\n");
        }
    }
    
    private static void adminMenu(Scanner scanner) {
        while (true) {
        	System.out.println("\t\t\t\t\t  +-------------------------------+");
            System.out.println("\t\t\t\t\t  |           Admin Menu          |");
            System.out.println("\t\t\t\t\t  +-------------------------------+");
            System.out.println("\t\t\t\t\t  |   |                           |");
            System.out.println("\t\t\t\t\t  | 1 |  Update Library Catalog   |");
            System.out.println("\t\t\t\t\t  | 2 |  View All Borrowed Books  |");
            System.out.println("\t\t\t\t\t  | 3 |  Manage Users             |");
            System.out.println("\t\t\t\t\t  | 4 |  Back to Main Menu        |");
            System.out.println("\t\t\t\t\t  |   |                           |");
            System.out.println("\t\t\t\t\t  +-------------------------------+");
              System.out.print("\t\t\t\t\t            Choice : ");
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    updateLibraryCatalog(scanner);
                    break;
                case 2:
                    viewAllBorrowedBooks();
                    break;
                case 3:
                    manageUsers(scanner);
                    break;
                case 4:
                    System.out.println("\n\t\t\t\t\t   Returning to the Log in Menu...\n");
                    return;
                default:
                    System.out.println("\n\t\t\t\t\t   Invalid choice. Please try again.\n");
            }
        }
    }

    private static void updateLibraryCatalog(Scanner scanner) {
        while (true) {
        	System.out.println("\n");
        	System.out.println("\t\t\t\t\t   +----------------------------+");
            System.out.println("\t\t\t\t\t   |    Update Library Catalog  |");
            System.out.println("\t\t\t\t\t   +----------------------------+");
            System.out.println("\t\t\t\t\t   |   |                        |");
            System.out.println("\t\t\t\t\t   | 1 |      Add a Book        |");
            System.out.println("\t\t\t\t\t   | 2 |     Remove a Book      |");
            System.out.println("\t\t\t\t\t   | 3 |    View Added Books    |");
            System.out.println("\t\t\t\t\t   | 4 |   Back to Admin Menu   |");
            System.out.println("\t\t\t\t\t   |   |                        |");
            System.out.println("\t\t\t\t\t   +----------------------------+");
              System.out.print("\t\t\t\t\t            Choice : ");
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    addBookToLibraryCatalog(scanner);
                    break;
                case 2:
                    removeBookFromLibraryCatalog(scanner);
                    break;
                case 3:
                    viewAddedBooks();
                    break;
                case 4:
                    System.out.println("\t\t\t\t\t   Returning to the admin menu...\n\n");
                    return;
                default:
                    System.out.println("\t\t\t\t\t   Invalid choice. Please try again.\n");
            }
        }
    }

    private static void addBookToLibraryCatalog(Scanner scanner) {
        while (true) { 
        	System.out.print("\n\n\t\t\t\t\t      Fill up Book Information \n\n");
            System.out.print("\t\t\t\t\t         Book ID  :  ");
            String bookId = scanner.next();

            if (libraryCatalog.containsKey(bookId)) {
                System.out.println("\n\t\t\t\t Book ID already exists. Please enter a unique ID.\n");
            } else {
                scanner.nextLine();
                System.out.print("\t\t\t\t\t         Title    :  ");
                String bookTitle = scanner.nextLine();
                System.out.print("\t\t\t\t\t         Author   :  ");
                String bookAuthor = scanner.nextLine();
                String bookStatus = "Active";
                String bookInfo = String.format("Title: %s, Author: %s, Status: %s", bookTitle, bookAuthor, bookStatus);
                libraryCatalog.put(bookId, bookInfo);
                System.out.println("\n\t\t\t\t\t        Successfully added!");
                break;
            }
        }
    }

    private static void removeBookFromLibraryCatalog(Scanner scanner) {
    	System.out.println("\n");
    	System.out.print("\t\t\t\t\t      REMOVE BOOK FROM LIBRARY \n");
        System.out.print("\t\t\t\t\t       Book ID     :    ");
        String bookId = scanner.next();

        if (libraryCatalog.containsKey(bookId)) {
            libraryCatalog.remove(bookId);
            System.out.println("\n\t\t\t\t       Book removed from the library catalog!\n");
        } else {
            System.out.println("\n\t\t\t\t\tBook not found in the library catalog.\n");
        }
    }

    private static void viewAddedBooks() {
        System.out.println("\n\t\t\t\t\tAdded Books in the Library Catalog:");
        System.out.printf("%-10s %-50s %-30s %-10s%n", "Book ID", "Title", "Author", "Status");

        for (Map.Entry<String, String> entry : libraryCatalog.entrySet()) {
            String bookId = entry.getKey();
            String bookInfo = entry.getValue();

            if (!bookId.startsWith("00") && !bookId.matches("[a-zA-Z]+")) {
                String title = extractValue(bookInfo, "Title");
                String author = extractValue(bookInfo, "Author");
                String status = extractValue(bookInfo, "Status");
                System.out.printf("%-10s %-50s %-30s %-10s%n", bookId, title, author, status);
            }
        }
    }
    
    private static String extractValue(String bookInfo, String field) {
        int startIndex = bookInfo.indexOf(field + ":") + field.length() + 1;
        int endIndex = bookInfo.indexOf(",", startIndex);
        if (endIndex == -1) {
            endIndex = bookInfo.length();
        }
        return bookInfo.substring(startIndex, endIndex).trim();
    }

    // VIEW ALL BORROWED BOOKS
   
    private static void viewAllBorrowedBooks() {
        System.out.println("\n\t\t\t\t\t          ALL BORROWED BOOKS\n");
        System.out.printf("%-10s %-30s %-30s %-30s %-15s %-15s %-15s %-15s%n",
                "Book ID", "Title", "Author", "Borrower", "SR Code", "Section", "Date Borrowed", "Due Date");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (Map.Entry<String, Map<String, String>> entry : borrowedBooks.entrySet()) {
            String bookId = entry.getKey();
            Map<String, String> bookDetails = entry.getValue();
            String title = bookDetails.get("Title");
            String author = bookDetails.get("Author");
            String borrowerUsername = bookDetails.get("Borrower");
            String borrowDate = bookDetails.get("BorrowDate");

            Date dueDate = new Date();
            dueDate.setTime(dueDate.getTime() + 7 * 24 * 60 * 60 * 1000);

            // Check if studentProfiles contains an entry for the borrower
            if (studentProfiles.containsKey(borrowerUsername)) {
                // Extract full name, SR Code, and Section from the student profile
                String[] profileDetails = studentProfiles.get(borrowerUsername).split(", ");
                String fullName = profileDetails[0] + " " + profileDetails[1]; // Combine first name and last name
                String srCode = profileDetails[2];
                String section = profileDetails[3];

                System.out.printf("%-10s %-30s %-30s %-30s %-15s %-15s %-15s %-15s%n",
                        bookId, title, author, fullName, srCode, section, borrowDate, sdf.format(dueDate));
            } else {
                System.out.println("\t\t\t\t   Error: Student profile " + borrowerUsername + " not found. \n");
            }
        }

        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        }
    }

    
    private static void manageUsers(Scanner scanner) {
        while (true) {
        	System.out.println("\n\n");
        	System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |           Manage Users          |");
            System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |   |                             |");
            System.out.println("\t\t\t\t\t | 1 |   View All Student Profiles |");
            System.out.println("\t\t\t\t\t | 2 |    Update Student Profile   |");
            System.out.println("\t\t\t\t\t | 3 |      Back to Admin Menu     |");
            System.out.println("\t\t\t\t\t |   |                             |");
            System.out.println("\t\t\t\t\t +---------------------------------+");
              System.out.print("\t\t\t\t\t             Choice  :  ");
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    viewAllStudentProfiles();
                    break;
                case 2:
                    updateStudentProfile(scanner);
                    break;
                case 3:
                    System.out.println("n\t\t\t\t\t   Returning to the admin menu...\n");
                    return;
                default:
                    System.out.println("\n\t\t\t\t\t  Invalid choice. Please try again.\n");
            }

            // Consume the newline character left in the buffer
            scanner.nextLine();
        }
    }
    
    private static void viewAllStudentProfiles() {
    	System.out.println("\n");
        System.out.println("\t\t\t\t\t\tALL STUDENT PROFILES\n");
        System.out.printf("%-20s %-30s %-15s %-15s %-15s%n", "Username", "Full Name", "SR Code", "Section", "Contact Info");

        for (Map.Entry<String, String> entry : studentProfiles.entrySet()) {
            String username = entry.getKey();
            String profileInfo = entry.getValue();
            String[] profileDetails = profileInfo.split(", ");

            if (profileDetails.length >= 4) {
                String fullName = profileDetails[0] + " " + profileDetails[1];
                String srCode = profileDetails[profileDetails.length - 3];
                String section = profileDetails[profileDetails.length - 2];
                String contactInfo = profileDetails[profileDetails.length - 1];

                System.out.printf("%-20s %-30s %-15s %-15s %-15s%n", username, fullName, srCode, section, contactInfo);
            } else {
                System.out.println("\t\t\t\t  Error: Insufficient profile details for username: " + username + "\n");
            }
        }

        if (studentProfiles.isEmpty()) {
            System.out.println("\n\t\t\t\t\t   No student profiles available.\n");
        }
    }

    
    private static void updateStudentProfile(Scanner scanner) {
    	System.out.println("\n\t\t\t\t\t\tALL STUDENT PROFILES\n");
        System.out.print("\t\t\t\t  Enter student SR Code to update  : ");
        String srCode = scanner.next();
        scanner.nextLine();  // Consume the newline character

        if (isStudentProfileExists(srCode)) {
            String username = getUsernameBySRCode(srCode);
            System.out.println("Current Profile Information:");
            displayProfileTable(username);
            
        	System.out.println("\n");
        	System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |   Select information to Update  |");
            System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |   |                             |");
            System.out.println("\t\t\t\t\t | 1 |         Full Name           |");
            System.out.println("\t\t\t\t\t | 2 |          Section            |");
            System.out.println("\t\t\t\t\t | 3 |     Contact Information     |");
            System.out.println("\t\t\t\t\t | 4 |       Cancel Update         |");
            System.out.println("\t\t\t\t\t |   |                             |");
        	System.out.println("\t\t\t\t\t +---------------------------------+");
        	  System.out.print("\t\t\t\t\t             Choice  :  ");

            int updateChoice = getUserChoice(scanner);

            switch (updateChoice) {
                case 1:
                    updateFullName(scanner, username);
                    break;
                case 2:
                    updateSection(scanner, username);
                    break;
                case 3:
                    updateContactInfo(scanner, username);
                    break;
                case 4:
                    System.out.println("\t\t\t\t\t        Update canceled.\n");
                    break;
                default:
                    System.out.println("\t\t\t\t      Invalid choice. Update canceled.\n");
            }
        } else {
            System.out.println("\n\t\t\t\t       Student with SR Code " + srCode + " not found.\n");
        }
    }


    private static void updateSection(Scanner scanner, String username) {
        // Consume the newline character left in the buffer
        scanner.nextLine();

        // Read the new section input
        System.out.print("Enter new section: ");
        String updatedSection = scanner.nextLine();

        // Update the section directly in the studentProfiles map
        String currentProfile = studentProfiles.get(username);
        String[] currentDetails = currentProfile.split(", ");

        // Construct the updated profile with the new section
        StringBuilder updatedProfileBuilder = new StringBuilder();
        updatedProfileBuilder.append(currentDetails[0]).append(" ").append(currentDetails[1]).append(", ");

        // Check if the SR Code is present in the details array
        if (currentDetails.length > 3) {
            updatedProfileBuilder.append(currentDetails[currentDetails.length - 3]).append(", ");
        }

        updatedProfileBuilder.append(updatedSection).append(", ").append(currentDetails[currentDetails.length - 1]);

        // Update the profile in the map
        studentProfiles.put(username, updatedProfileBuilder.toString());

        System.out.println("Section updated successfully!\n");

        // Display all student profiles including the updated information
        viewAllStudentProfiles();
    }


    private static void updateContactInfo(Scanner scanner, String username) {
        System.out.print("Enter new contact information: ");
        String updatedContactInfo = scanner.nextLine();
        updateProfile(username, null, null, updatedContactInfo, null);
        System.out.println("Contact Information updated successfully!");

        // Display all student profiles including the updated information
        viewAllStudentProfiles();
    }


    private static void displayProfileTable(String username) {
        System.out.printf("%-20s %-40s %-15s %-15s %-15s%n", "Username", "Full Name", "SR Code", "Section", "Contact Info");

        String profileInfo = studentProfiles.get(username);
        String[] profileDetails = profileInfo.split(", ");

        if (profileDetails.length >= 5) {
            String fullName = profileDetails[0] + " " + profileDetails[1];  // Combine the first and middle name
            String srCode = profileDetails[2];
            String section = profileDetails[3];
            String contactInfo = profileDetails[4];

            System.out.printf("%-20s %-40s %-15s %-15s %-15s%n", username, fullName, srCode, section, contactInfo);
        } else {
            System.out.println("Error: Insufficient profile details for username: " + username);
        }
    }


    private static void updateFullName(Scanner scanner, String username) {
        System.out.print("Enter new last name: ");
        String updatedLastName = scanner.next();
        System.out.print("Enter new first name: ");
        String updatedFirstName = scanner.next();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter new middle initial: ");
        String updatedMiddleInitial = scanner.nextLine();

        // Retrieve the original SR Code from the profile
        String originalProfile = studentProfiles.get(username);
        String[] originalDetails = originalProfile.split(", ");
        String originalSRCode = originalDetails[2];

        // Construct updated full name and update the profile
        String updatedFullName = updatedMiddleInitial.isEmpty() ?
                String.format("%s, %s", updatedLastName, updatedFirstName) :
                String.format("%s, %s %s", updatedLastName, updatedFirstName, updatedMiddleInitial);

        updateProfile(username, updatedFullName, null, null, originalSRCode);
        System.out.println("\nFull Name updated successfully!\n");
    }



    private static void updateProfile(String username, String fullName, String section, String contactInfo, String srCode) {
        String currentProfile = studentProfiles.get(username);
        String[] currentDetails = currentProfile.split(", ");
        String updatedFullName = (fullName == null) ? currentDetails[0] : fullName;
        String updatedSRCode = (srCode == null) ? currentDetails[currentDetails.length - 3] : srCode;
        String updatedSection = (section == null) ? currentDetails[currentDetails.length - 2] : section;
        String updatedContactInfo = (contactInfo == null) ? (currentDetails.length > 3 ? currentDetails[currentDetails.length - 1] : "") : contactInfo;

        // Update the profile in the studentProfiles map
        studentProfiles.put(username, updatedFullName + ", " + updatedSRCode + ", " + updatedSection + ", " + updatedContactInfo);
        System.out.println("\nProfile updated successfully!\n");
    }


    private static boolean isStudentProfileExists(String srCode) {
        for (String profileInfo : studentProfiles.values()) {
            if (profileInfo.contains(srCode)) {
                return true;
            }
        }
        return false;
    }

    private static String getUsernameBySRCode(String srCode) {
        for (Map.Entry<String, String> entry : studentProfiles.entrySet()) {
            if (entry.getValue().contains(srCode)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static void loginAsStudent(Scanner scanner) {
    	System.out.println("\n");
    	System.out.println("\t\t\t\t\t +---------------------------------+");
    	System.out.println("\t\t\t\t\t |         CHOOSE AN OPTION        |");
    	System.out.println("\t\t\t\t\t +---------------------------------+");
        System.out.println("\t\t\t\t\t |   1   |         Sign in         |");
        System.out.println("\t\t\t\t\t +---------------------------------+");
        System.out.println("\t\t\t\t\t |   2   |         Sign up         |");
    	System.out.println("\t\t\t\t\t +---------------------------------+");
    	  System.out.print("\t\t\t\t\t           Choice   :   ");
        int choice = getUserChoice(scanner);

        switch (choice) {
            case 1:
                signInStudent(scanner);
                break;
            case 2:
                signUpStudent(scanner);
                break;
            default:
                System.out.println("\n\t\t\t\t\t\t   INVALID CHOICE             ");
                System.out.println("\t\t\t\t\t    Returning to the Log in menu\n");
                System.out.println("\n\t\t\t\t\t\t       ......               \n");
        }
    }
    
    private static void signInStudent(Scanner scanner) {
    	System.out.println("\n\t\t\t\t\t\t   Welcome Student!\n");
        System.out.print("\t\t\t\t\t\tUsername   : ");
        String username = scanner.next();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t\tPassword   : ");
        String password = scanner.next();
        scanner.nextLine();

        if (validateStudentCredentials(username, password)) {
            System.out.println("\n\t\t\t\t\t       Student login successful!");
            studentMenu(scanner, username);
        } else {
            System.out.println("\n\t\t\t\t  Student login failed. Returning to the Log in menu...\n");
            System.out.println("\n\t\t\t\t\t\t       ......               \n");
        }
    }


    private static boolean validateStudentCredentials(String username, String password) {
        return studentCredentials.containsKey(username) && studentCredentials.get(username).equals(password);
    }

    private static void signUpStudent(Scanner scanner) {
    	System.out.println("\t\t\t\t\t\t      Signing Up\n");
    	System.out.println("\t\t\t\t\t     Please fill the information\n");
        System.out.print("\t\t\t\t\t     Username        :   ");
        String username = scanner.next();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t     Password        :   ");
        String password = scanner.next();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t     First name      :   ");
        String firstName = scanner.nextLine();
        System.out.print("\t\t\t\t\t     Last name       :   ");
        String lastName = scanner.nextLine();
        System.out.print("\t\t\t\t\t     Middle initial  :   ");
        String middleInitial = scanner.nextLine();
        System.out.print("\t\t\t\t\t     SR Code         :   ");
        String srCode = scanner.next();
        System.out.print("\t\t\t\t\t     Section         :   ");
        String section = scanner.next();
        System.out.print("\t\t\t\t\t     Contact Info    :   ");
        String contactInfo = scanner.next();

     // Check if all required fields are filled
        if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || srCode.isEmpty() || section.isEmpty() || contactInfo.isEmpty()) {
            System.out.println("\t\t\t\t      All fields are required. Registration failed.\n");
            return;
        }

        // Construct full name based on the format Last Name, First Name, Middle Initial
        String fullName = middleInitial.isEmpty() ?
                String.format("%s, %s", lastName, firstName) :
                String.format("%s, %s %s", lastName, firstName, middleInitial);

        // Store student credentials and profile, including SR Code and Section
        studentCredentials.put(username, password);
        studentProfiles.put(username, fullName + ", " + srCode + ", " + section + ", " + contactInfo);
        System.out.println("\n\t\t\t\t\t   STUDENT REGISTRATION SUCCESSFUL!");
          System.out.println("\n\t\t\t\t\t   Welcome, " + fullName + ".");

        // Proceed to student menu after successful registration
        studentMenu(scanner, username);
    }
    
    private static void studentMenu(Scanner scanner, String username) {
        while (true) {
        	System.out.println("\n");
        	System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |            STUDENT MENU         |");
            System.out.println("\t\t\t\t\t +---------------------------------+");
            System.out.println("\t\t\t\t\t |   |                             |");
            System.out.println("\t\t\t\t\t | 1 |    Browse Library Catalog   |");
            System.out.println("\t\t\t\t\t | 2 |     View Borrowed Books     |");
            System.out.println("\t\t\t\t\t | 3 |        Notifications        |");
            System.out.println("\t\t\t\t\t | 4 |           Logout            |");
            System.out.println("\t\t\t\t\t |   |                             |");
            System.out.println("\t\t\t\t\t +---------------------------------+");
              System.out.print("\t\t\t\t\t          Choice    :   ");

            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    browseLibraryCatalog(scanner, username);
                    break;
                case 2:
                    viewBorrowedBooks(scanner, username);
                    break;
                case 3:
                    viewNotifications(username);
                    break;
                case 4:
                	  System.out.println("\t\t\t\t\t             Logging out...   ");
                    return;
                default:
                    System.out.println("\t\t\t\t\t  Invalid choice. Please try again.\n");
            }
        }
    }
    

    private static void browseLibraryCatalog(Scanner scanner, String username) {
        System.out.println("Library Catalog:");
        System.out.printf("%-10s %-30s %-30s %-10s%n", "Book ID", "Title", "Author", "Status");

        for (Map.Entry<String, String> entry : libraryCatalog.entrySet()) {
            String bookId = entry.getKey();
            String bookInfo = entry.getValue();
            String title = extractValue(bookInfo, "Title");
            String author = extractValue(bookInfo, "Author");
            String status = extractValue(bookInfo, "Status");

            System.out.printf("%-10s %-30s %-30s %-10s%n", bookId, title, author, status);
        }

        System.out.print("Enter the book ID to borrow: ");
        String chosenBookId = scanner.next();

        if (libraryCatalog.containsKey(chosenBookId)) {
            String chosenBookInfo = libraryCatalog.get(chosenBookId);
            String chosenBookStatus = extractValue(chosenBookInfo, "Status");

            if (chosenBookStatus.equalsIgnoreCase("Active")) {
                System.out.println("\n\t\t\t\t\t  The book is available. Borrowing...\n");

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String borrowDate = sdf.format(new Date());

                updateBookStatus(chosenBookId, "Inactive");

                Map<String, String> bookDetails = new HashMap<>();
                bookDetails.put("Title", extractValue(chosenBookInfo, "Title"));
                bookDetails.put("Author", extractValue(chosenBookInfo, "Author"));
                bookDetails.put("BorrowDate", borrowDate);
                bookDetails.put("Borrower", username); // Borrower is the current student
                borrowedBooks.put(chosenBookId, bookDetails);

                System.out.println("\t\t\t\t\t     Book borrowed successfully.\n");

                // Notify the user about the successful book borrowing
                sendBorrowedBookNotification(username, extractValue(chosenBookInfo, "Title"), borrowDate, sdf.format(new Date()));

            } else {
                System.out.println("\t\t\t\t\t    Book is not available at the moment.\n");
            }
        } else {
            System.out.println("\t\t\t\t\t     Invalid Book ID. Please try again.\n");
        }
    }


    private static void updateBookStatus(String bookId, String newStatus) {
        if (libraryCatalog.containsKey(bookId)) {
            String bookInfo = libraryCatalog.get(bookId);
            String updatedBookInfo = bookInfo.replaceFirst("Status: \\w+", "Status: " + newStatus);
            libraryCatalog.put(bookId, updatedBookInfo);
            System.out.println("\t\t\t\t\t  Book status updated to " + newStatus + ".");
        } else {
            System.out.println("\t\t\t\t\tBook not found in the library catalog.\n");
        }
    }

    private static void viewBorrowedBooks(Scanner scanner, String username) {
        System.out.println("Borrowed Books for " + username + ":");
        System.out.printf("%-10s %-30s %-30s %-15s %-15s%n", "Book ID", "Title", "Author", "Date Borrowed", "Due Date");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (Map.Entry<String, Map<String, String>> entry : borrowedBooks.entrySet()) {
            String bookId = entry.getKey();
            Map<String, String> bookDetails = entry.getValue();
            String title = bookDetails.get("Title");
            String author = bookDetails.get("Author");
            String borrowDate = bookDetails.get("BorrowDate");

            Date dueDate = new Date();
            dueDate.setTime(dueDate.getTime() + 7 * 24 * 60 * 60 * 1000);

            System.out.printf("%-10s %-30s %-30s %-15s %-15s%n", bookId, title, author, borrowDate, sdf.format(dueDate));
        }

        if (borrowedBooks.isEmpty()) {
            System.out.println("\t\t\t\t\t     NO BOOKS BORROWED YET.\n");
        } else {
            System.out.print("\t\t\t\t  Do you want to return a book? (yes/no): ");
            String returnChoice = scanner.next().toLowerCase();

            if (returnChoice.equals("yes")) {
                System.out.print("\t\t\t\t\t   Enter the Book ID to return: ");
                String returnBookId = scanner.next();
                returnBook(returnBookId);
            }

            }
        }
    

    private static void returnBook(String bookId) {
        if (borrowedBooks.containsKey(bookId)) {
            borrowedBooks.remove(bookId);
            System.out.println("\t\t\t\t\t   Book returned successfully.\n");

            // Set the book status back to "Active"
            updateBookStatus(bookId, "Active");
        } else {
            System.out.println("\t\t\t\t\t   Book not found in the borrowed books list.\n");
        }
    }
    
    private static void viewNotifications(String username) {
        List<String> userNotifications = notifications.get(username);
        
        System.out.println("\n\n\t\t\t\t\t        Notifications for " + username + "\n");

        if (userNotifications != null && !userNotifications.isEmpty()) {
            for (String notification : userNotifications) {
                System.out.println(notification);
            }

            // Clear the notifications after viewing
            userNotifications.clear();
        } else {
            System.out.println("\n\n\t\t\t\t\t   No new notifications.\n");
        }
    }
    
    private static void sendBorrowedBookNotification(String username, String title, String borrowDate, String dueDate) {
        String notification = "\t\t\t\t          Dear " + username + ", you have successfully borrowed \n" + "\t\t\t\t    the book '" +
    title + "' on " + borrowDate + ". Please return \n" + "\t\t\t\t    it before or during " + dueDate + " as per our policy stated.\n \t\t\t\t    stated.\n\n";

        // Store the notification for the user
        notifications.computeIfAbsent(username, k -> new ArrayList<>()).add(notification);
    }
    
    
    
    
   
}