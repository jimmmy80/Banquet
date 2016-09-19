package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int quantityNum = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   /** This method is called when the plus button is clicked
    */
   public void increment(View view){

       quantityNum = quantityNum + 1;
       display(quantityNum);

   }
    /** This method is called when the minus button is clicked
     */
    public void decrement(View view){
        if(quantityNum >0) {
            quantityNum = quantityNum - 1;
            display(quantityNum);
        }
    }
    public void submitOrder(View view){
        int finalQuant = quantityNum * 5;
        String message = "The total price is R " + finalQuant +" Thanks for ordering";
        displayMessage(message);
        display(quantityNum);

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView)
                findViewById(R.id.quatinty_text_view);
        quantityTextView.setText("" + number);
    }
   private void displayMessage(String s){
      TextView N = (TextView) findViewById(R.id.price_text_view);
       N.setText(""+ s);
   }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
