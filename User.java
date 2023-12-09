package birpck;


public class User {
    private String username;
    private String fullName;
    private String email; // New field for user email
    // Other relevant user details

    public User(String username, String password, String fullName, String email) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        // Initialize other user details
    }

    // Getters and setters for user details

    public void changePassword(String newPassword) {
        System.out.println("Password changed successfully.\n");
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        System.out.println("Email updated successfully.\n");
    }

    public void displayUserDetails() {
        System.out.println("User Details:");
        System.out.println("Username: " + this.username);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Email: " + this.email);
        // Display other user details
    }

	
    
}
