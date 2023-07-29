package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class quiz extends MainActivity implements View.OnClickListener{

    TextView back, totalquestion, question;

    Button ansA, ansB, ansC, ansD, btnsubmit;

    int score = 0;

    int totalQuestion = QuestionAnswer.question.length;

    int currentQUestionIndex = 0;

    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        back = findViewById(R.id.quiz_back);

        totalquestion = findViewById(R.id.total_question);
        question = findViewById(R.id.question);

        ansA = findViewById(R.id.ans_A);

        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);

        btnsubmit = findViewById(R.id.btn_submit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quiz.this, MainActivity.class));
            }
        });

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        btnsubmit.setOnClickListener(this);

        totalquestion.setText("Total Question: " + totalQuestion);
        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.LTGRAY);
        ansB.setBackgroundColor(Color.LTGRAY);
        ansC.setBackgroundColor(Color.LTGRAY);
        ansD.setBackgroundColor(Color.LTGRAY);

        ansA.setTextColor(Color.BLACK);
        ansB.setTextColor(Color.BLACK);
        ansC.setTextColor(Color.BLACK);
        ansD.setTextColor(Color.BLACK);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.btn_submit)
        {

            if(selectedAnswer.equals((QuestionAnswer.correctAnswer[currentQUestionIndex])))
            {
                score++;
            }

            currentQUestionIndex++;
            loadNewQuestion();

        }
        else
        {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.DKGRAY);
            clickedButton.setTextColor(Color.WHITE);
        }

    }

    void loadNewQuestion(){

        if(currentQUestionIndex == totalQuestion)
        {
            finishQuiz();
            return;
        }


        question.setText(QuestionAnswer.question[currentQUestionIndex]);
        ansA.setText(QuestionAnswer.choicess[currentQUestionIndex][0]);
        ansB.setText(QuestionAnswer.choicess[currentQUestionIndex][1]);
        ansC.setText(QuestionAnswer.choicess[currentQUestionIndex][2]);
        ansD.setText(QuestionAnswer.choicess[currentQUestionIndex][3]);


    }

    void finishQuiz()
    {
        String passStatus = "";
        if(score > totalQuestion * 0.60)
        {
            passStatus = "Passed";
        }
        else
        {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of " + totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i ) -> restartQuiz() )
                .setCancelable(false)
                .show();
    }

    void restartQuiz()
    {
        score = 0;
        currentQUestionIndex = 0;
        loadNewQuestion();
    }

}