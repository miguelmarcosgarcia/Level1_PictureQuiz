package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.picturequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //Sets the activity layout resource file

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }
    /*
    * The onCreate method is the method that is called when an activity is created (started).
    * Here you need to declare the initializations for the activity.
    *
    * In the generated MainActivity class the onCreate method is already overridden. The connection
    * with the layout file is also made using setContentView.
    * */

    /*
    * The submit button needs an OnClickListener to detect when a user clicks the button and to
    * define what to do when a user has clicked the button. Here the checkAnswer method is called
    * when the button is clicked.
    *
    * The binding object declared above the onCreate method refers to a class that is automatically
    * generated when using View Binding. This class is generated when View Binding is enabled and
    * the layout file contains a context linking the layout file with its accompanying class.
    * This generated class contains a mapping of all the variables with an id that are defined in
    * the layout file.
    */



    //Check if the submitted answer is correct
    private fun checkAnswer() {
        val answer = binding.etAnswer.text.toString()

        // When the answer equals "giraffe" then display a correct message using a toast message.
        // Otherwise display an incorrect message.
        if (answer == getString(R.string.giraffe)) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
    /*
   * In Kotlin, methods are defined using the fun keyword. As with the variables, the return type
   * is defined using the colon after the method. The default return type is Unit which corresponds
   * to void in Java.
   *
   * In Kotlin variables are created using either val or var.
   *   val: indicates that the variable is immutable (final)
   *   var: indicates that the variable is mutable (can be changed)
   *
   * A widget is referenced in Kotlin using the binding object and the ID we gave the widget in the
   * layout file. The meaning of the binding object will be further explained in the next section.
   * A variable of type val is made which contains the current text from the EditText widget.
   *
   * The method getString is used to retrieve a String from the Strings.xml resource file from an
   * Activity.
   *
   * A Toast message is made using Toast.makeText using the Context (the Activity), a String for
   * the message and a Length.
   */
}