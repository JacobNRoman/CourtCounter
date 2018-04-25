package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePoints(View view){
        String team = view.getTag().toString();
        if (team.equals("A")) {
            teamAScore += 3;
            displayForTeamA(teamAScore);
        } else{
            teamBScore+=3;
            displayForTeamB(teamBScore);
        }
    }

    public void twoPoints(View view){
        String team = view.getTag().toString();
        if (team.equals("A")) {
            teamAScore += 2;
            displayForTeamA(teamAScore);
        } else{
            teamBScore+=2;
            displayForTeamB(teamBScore);
        }
    }

    public void freeThrow(View view){
        String team = view.getTag().toString();
        if (team.equals("A")) {
            teamAScore += 1;
            displayForTeamA(teamAScore);
        } else{
            teamBScore+=1;
            displayForTeamB(teamBScore);
        }
    }

    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
