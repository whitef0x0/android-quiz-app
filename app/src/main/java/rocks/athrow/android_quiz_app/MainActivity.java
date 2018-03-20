package rocks.athrow.android_quiz_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    RadioButton question2_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_output;
        int answer2_output;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1
        //------------------------------------------------------------------------------------------
        String answer1_output;

        question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        is_back = question1_choice1.isChecked();
        if (is_back) {
            answer1_output = "back";
        } else {
            answer1_output = "legs";
        }
        //------------------------------------------------------------------------------------------
        // Question 2
        //------------------------------------------------------------------------------------------
        String answer2_output;

        question2_choice1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        is_bending_over = question2_choice1.isChecked();
        if (is_bending_over) {
            answer1_output = "bending_over";
        } else {
            answer1_output = "leaning_back";
        }
        
        //------------------------------------------------------------------------------------------
        // Results Page
        //------------------------------------------------------------------------------------------
        resultsDisplay = "Your Diagnosis is ..."

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

