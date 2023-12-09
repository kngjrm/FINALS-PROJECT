package birpck;

import java.util.ArrayList;
import java.util.List;

public class Notification {
     private String username;
	    private List<String> notifications;

	    public Notification(String username) {
	        this.username = username;
	        this.notifications = new ArrayList<>();
	    }

	    public void addNotification(String notification) {
	        this.notifications.add(notification);
	    }

	    public List<String> getNotifications() {
	        return notifications;
	    }

	    public void clearNotifications() {
	        this.notifications.clear();
	        System.out.println("\nNotifications cleared for user: " + this.username + ".\n");
	    }

	    public int getUnreadNotificationsCount() {
	        return this.notifications.size();
	    }

	   
}
