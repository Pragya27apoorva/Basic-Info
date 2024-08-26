import java.awt.*;
import java.awt.event.*;

public class UserInfoApp {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("User Information");
        // Create labels and text fields for input
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField("Pragya Apoorva", 20);
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField("19 years", 3);
        Label occupationLabel = new Label("Occupation:");
        TextField occupationField = new TextField("Student", 20);
        Label phoneLabel = new Label("Phone Number:");
        TextField phoneField = new TextField("9998887776", 15);
        Label emailLabel = new Label("Email ID:");
        TextField emailField = new TextField("pragya123@gmail.com", 25);
        // Create a button to print the information
        Button printButton = new Button("Print Information");
        // Add an action listener to the button
        printButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the information from the text fields
                String name = nameField.getText();
                String age = ageField.getText();
                String occupation = occupationField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                // Print the information to the console
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Occupation: " + occupation);
                System.out.println("Phone Number: " + phone);
                System.out.println("Email ID: " + email);
                // Show the information in a dialog box
                Dialog dialog = new Dialog(frame, "User Information", true);
                dialog.setLayout(new FlowLayout());
                dialog.add(new Label("Information Printed to Console"));
                Button okButton = new Button("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                });
                dialog.add(okButton);
                dialog.setSize(150, 100);
                dialog.setVisible(true);
            }
        });
        // Set the layout for the frame
        frame.setLayout(new GridLayout(6, 2));
        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(occupationLabel);
        frame.add(occupationField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(printButton);
        // Set the frame size
        frame.setSize(300, 200);
        // Make the frame visible
        frame.setVisible(true);
        // Add a window listener to close the frame when the close button is clicked
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
}