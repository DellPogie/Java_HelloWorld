
// set the package name
package com.dellpogie;

// add reference to Swing library
import javax.swing.JOptionPane;

// HelloWorld class inherits from JOptionPane class
public class HelloWorld extends JOptionPane {

    // entry point in Java
    public static void main( String[] args ) {

        // display greetings in dialog box
        JOptionPane.showMessageDialog(null, "Hello, World!", "Welcome to Java", JOptionPane.INFORMATION_MESSAGE);

    }
}
