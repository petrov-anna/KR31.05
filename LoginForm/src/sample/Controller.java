package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    String password = "hey";
    String login = "anna";
    @FXML
    Button btnLogin;
    @FXML
    PasswordField txtPassword;
    @FXML
    TextField txtFieldLogin;

    public void setBtnLogin(){
        String passText = txtPassword.getText();
        String loginName = txtFieldLogin.getText();

        String path = "D:/study/2 курс/Java/LoginForm/src/sample/note.txt";
        StringBuilder sb = new StringBuilder();
        try (Scanner scan = new Scanner(new File(path))) {
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File [%s] is not found.\n", path);
        }

        String[] array = sb.toString().split("\n");

        for (String line : array) {
            for (String line2 : line){

            }
            System.out.println(line);
        }

//        String[] words = str.split(" ");

        if (loginName.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your login!");
        }
        if (!loginName.equals("")){
            if (!passText.equals("")) {
                if (passText.equals("hey") && loginName.equals("anna")) {
                    JOptionPane.showMessageDialog(null, "Great!");
                }
            }
        }

        else{
            JOptionPane.showMessageDialog(null, "Error!");
        }

        if (passText.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your password!");
        }
    }
}