package com.assignmenttwo.rafi.programmingassignmenttwo;

import android.content.SharedPreferences;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;


public class ProfessorDetailsFragment extends AppCompatActivity implements View.OnTouchListener{

    private TextView professorName;
    private TextView firstDegree;
    private TextView secondDegree;
    private TextView thirdDegree;
    private TextView fourthDegree;
    private ImageView profImage;
    private RatingBar profRating;
    private TextView ratingScale;

    SharedPreferences wmbPreference1;
    SharedPreferences.Editor editor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreferencesFromResource(R.
        setContentView(R.layout.professor_details_fragment);

        professorName = (TextView) findViewById(R.id.profID);
        firstDegree = (TextView) findViewById(R.id.firstDegree);
        secondDegree = (TextView) findViewById(R.id.secondDegree);
        thirdDegree = (TextView) findViewById(R.id.thirdDegree);
        fourthDegree = (TextView) findViewById(R.id.fourthDegree);
        profRating = (RatingBar) findViewById(R.id.profRating);
        ratingScale = (TextView) findViewById(R.id.ratingScale);
        profImage = (ImageView) findViewById(R.id.profImage);

        profRating.setOnTouchListener(this);
        wmbPreference1 = PreferenceManager.getDefaultSharedPreferences(this);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String firstDegreeStr = intent.getStringExtra("firstDegree");
        String secondDegreeStr = intent.getStringExtra("secondDegree");
        String thirdDegreeStr = intent.getStringExtra("thirdDegree");

        professorName.setText(name);
        firstDegree.setText(firstDegreeStr);
        secondDegree.setText(secondDegreeStr);
        thirdDegree.setText(thirdDegreeStr);

        //Toast.makeText(this, (String)name,Toast.LENGTH_LONG).show();

        if (name.contains("John"))
        {
            profImage.setImageResource(R.drawable.john);
        }
        else if (name.contains("Kiumi"))
        {
            /*String firstDegreeStr = intent.getStringExtra("firstDegree");
            String secondDegreeStr = intent.getStringExtra("secondDegree");
            String thirdDegreeStr = intent.getStringExtra("thirdDegree");
            */
            String fourthDegreeStr = intent.getStringExtra("fourthDegree");
            fourthDegree.setText(fourthDegreeStr);
            profImage.setImageResource(R.drawable.kiumi);
        }
        else if (name.contains("Bruce"))
        {
            String fourthDegreeStr = intent.getStringExtra("fourthDegree");
            fourthDegree.setText(fourthDegreeStr);
            profImage.setImageResource(R.drawable.bruce);
        }

        else if (name.contains("Jinhua"))
        {
            profImage.setImageResource(R.drawable.jinhua);
        }

        else if (name.contains("Maroune"))
        {
            profImage.setImageResource(R.drawable.maroune);
        }

    }

    @Override
    protected void onResume (){
        super.onResume();
        //Toast.makeText(this, "RESUMING",Toast.LENGTH_LONG).show();
        //int ratings = wmbPreference1.getInt("numStars", 0);

        if (professorName.getText().toString().contains("John"))
        {
            float ratings = wmbPreference1.getFloat("JohnRating", 0.0f);
            if (ratings < 0.0 && ratings > 5.0 )
            {

            }
            else {
                ratingScale.setText(String.valueOf(ratings) + "/5.0");
                profRating.setRating(ratings);
            }
        }

        else if (professorName.getText().toString().contains("Kiumi"))
        {
            float ratings = wmbPreference1.getFloat("KiumiRating", 0.0f);
            if (ratings < 0.0 && ratings > 5.0 )
            {

            }
            else {
                ratingScale.setText(String.valueOf(ratings) + "/5.0");
                profRating.setRating(ratings);
            }
        }
        else if (professorName.getText().toString().contains("Bruce"))
        {
            float ratings = wmbPreference1.getFloat("BruceRating", 0.0f);
            if (ratings < 0.0 && ratings > 5.0 )
            {

            }
            else {
                ratingScale.setText(String.valueOf(ratings) + "/5.0");
                profRating.setRating(ratings);
            }
        }
        else if (professorName.getText().toString().contains("Jinhua"))
        {
            float ratings = wmbPreference1.getFloat("JinhuaRating", 0.0f);
            if (ratings < 0.0 && ratings > 5.0 )
            {

            }
            else {
                ratingScale.setText(String.valueOf(ratings) + "/5.0");
                profRating.setRating(ratings);
            }
        }
        else if (professorName.getText().toString().contains("Maroune"))
        {
            float ratings = wmbPreference1.getFloat("MarouneRating", 0.0f);
            if (ratings < 0.0 && ratings > 5.0 )
            {

            }
            else {
                ratingScale.setText(String.valueOf(ratings) + "/5.0");
                profRating.setRating(ratings);
            }
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

       // RatingBar rateBar = (RatingBar) v;

        ratingScale.setText( profRating.getRating() + "/5.0");
        float numStars = profRating.getRating();
        //Toast.makeText(this, (int) numStars,Toast.LENGTH_LONG).show();
        editor = wmbPreference1.edit();
        if (professorName.getText().toString().contains("John"))
        {
            editor.putFloat("JohnRating", numStars);
        }
        else if (professorName.getText().toString().contains("Kiumi"))
        {
            editor.putFloat("KiumiRating", numStars);
        }
        else if (professorName.getText().toString().contains("Bruce"))
        {
            editor.putFloat("BruceRating", numStars);
        }
        else if (professorName.getText().toString().contains("Jinhua"))
        {
            editor.putFloat("JinhuaRating", numStars);
        }
        else if (professorName.getText().toString().contains("Maroune"))
        {
            editor.putFloat("MarouneRating", numStars);
        }
        editor.commit();

        /*final int numStars = rateBar.getNumStars();
        editor = wmbPreference1.edit();
        editor.putInt("numStars", numStars);
        editor.commit();
        */
        return false;
    }
}
