package com.example.android_8_lab_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

// This program allows a user to order a pizza and get the order price
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onPlaceOrderButtonClicked(view: View) {
        // Set prices equal to zero to get sum when items are selected
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when {
            // When small pizza is checked the price is 5 dollars
            radioGroup.smallpizza.isChecked -> pizzaSizePrice =5.0
            // When medium pizza is checked the price is 7 dollars
            radioGroup.mediumpizza.isChecked -> pizzaSizePrice =7.0
            // When large pizza is checked the price is 9 dollars
            radioGroup.largepizza.isChecked -> pizzaSizePrice =9.0
        }
        // When onions is checked the price is 1 more dollar
        if (OnionsCheckBox.isChecked) { toppingsTotal += 1 }
        // When olives is checked the price is 2 more dollars
        if (OlivesCheckBox.isChecked) { toppingsTotal += 2 }
        // When tomatoes is checked the price is 3 more dollars
        if (TomatoesCheckBox.isChecked) { toppingsTotal += 3 }
        // Add pizza size and  topping price and display the total price in the text box
        totalprice.text="Total Order Price= $"+(pizzaSizePrice+toppingsTotal)
    }

}