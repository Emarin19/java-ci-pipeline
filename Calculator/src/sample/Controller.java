package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button clear;

    @FXML
    private Button point;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button division;

    @FXML
    private Button product;

    @FXML
    private Button sum;

    @FXML
    private Button subtraction;

    @FXML
    private TextField output;

    @FXML
    private TextField input;

    private double ans = 0.0;
    private int operator;

    @FXML
    public void initialize() {
        output.setText(Double.toString(ans));
    }

    @FXML
    void clear_click(ActionEvent event) {
        ans = 0.0;
        output.setText(Double.toString(ans));
        input.clear();
    }

    @FXML
    void division_click(ActionEvent event) {
        ans /= Double.parseDouble(input.getText());
        output.setText(Double.toString(ans));
        input.clear();
        operator = 1;
    }

    @FXML
    void eight_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "8";
        input.setText(oldvalue);
    }

    @FXML
    void equal_click(ActionEvent event) {
        switch (operator){
            case 4:
                ans += Double.parseDouble(input.getText());
                output.setText(Double.toString(ans));
                input.clear();
                break;
            case 3:
                ans -= Double.parseDouble(input.getText());
                output.setText(Double.toString(ans));
                input.clear();
                break;
            case 2:
                ans *= Double.parseDouble(input.getText());
                output.setText(Double.toString(ans));
                input.clear();
                break;
            case 1:
                ans /= Double.parseDouble(input.getText());
                output.setText(Double.toString(ans));
                input.clear();
                break;
            default:
                output.setText(input.getText());
                break;
        }
    }

    @FXML
    void five_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "5";
        input.setText(oldvalue);
    }

    @FXML
    void four_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "4";
        input.setText(oldvalue);
    }

    @FXML
    void input_click(ActionEvent event) {

    }

    @FXML
    void nine_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "9";
        input.setText(oldvalue);
    }

    @FXML
    void one_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "1";
        input.setText(oldvalue);
    }

    @FXML
    void output_click(ActionEvent event) {

    }

    @FXML
    void point_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += ".";
        input.setText(oldvalue);
    }

    @FXML
    void product_click(ActionEvent event) {
        ans *= Double.parseDouble(input.getText());
        output.setText(Double.toString(ans));
        input.clear();
        operator = 2;
    }

    @FXML
    void seven_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "7";
        input.setText(oldvalue);
    }

    @FXML
    void six_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "6";
        input.setText(oldvalue);
    }

    @FXML
    void subtraction_click(ActionEvent event) {
        ans -= Double.parseDouble(input.getText());
        output.setText(Double.toString(ans));
        input.clear();
        operator = 3;
    }

    @FXML
    void sum_click(ActionEvent event) {
        ans += Double.parseDouble(input.getText());
        output.setText(Double.toString(ans));
        input.clear();
        operator = 4;
    }

    @FXML
    void three_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "3";
        input.setText(oldvalue);
    }

    @FXML
    void two_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "2";
        input.setText(oldvalue);
    }

    @FXML
    void zero_click(ActionEvent event) {
        String oldvalue = input.getText();
        oldvalue += "0";
        input.setText(oldvalue);
    }
}
