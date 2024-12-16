package GUI;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Login class and set it visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();  // Instantiate the Login class
                    window.frame.setVisible(true);     // Make the Login frame visible
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
