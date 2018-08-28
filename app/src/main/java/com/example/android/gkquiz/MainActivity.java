package com.example.android.gkquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        int tot = total();
        String final1 = "TOTAL = "+tot+"\nANSWERS : "+"\n1)-(a),France the counntry with maximum numbers of Round-Abouts."+"\n2)-(c),UAE is the country where you will find policemen driving cars like Lamborghini or Bentley"+"\n3)-(d),Nepal is the only country in the world which does not have a square or a rectangular shaped flag"+"\n4)-(b),Bhutan is the country whose population has not been recorded since 1975 ,hence its population is unknown"+"\n5)-(a),The tallest tower i.e. The C.N.Tower is situated in Canada"+"\n6)-(c),Abrahim Lincoln was the one who abolished slavery in U.S.A"+"\n7)-(d),13 is the number which is regarded as a lucky number in Italy"+"\n8)-(b),Colby Lopez is the real name of WWE superstar Seth Rollins"+"\n9)-(a),Disneyland is located in California"+"\n10)-(a),Tut-en-khamen died at the age of 19";
       displayMessage(final1);
    }
   private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.final_answers);
        orderSummaryTextView.setText(message);
    }
    public boolean ques1(){
        RadioButton question1 = (RadioButton) findViewById(R.id.q1);
        boolean results1 = question1.isChecked();
        return results1;
    }
    public boolean ques2(){
        RadioButton question2 = (RadioButton) findViewById(R.id.q2);
        boolean results2 = question2.isChecked();
        return results2;
    }
    public boolean ques3(){
        RadioButton question3 = (RadioButton) findViewById(R.id.q3);
        boolean results3 = question3.isChecked();
        return results3;
    }
    public boolean ques4(){
        RadioButton question4 = (RadioButton) findViewById(R.id.q4);
        boolean results4 = question4.isChecked();
        return results4;
    }
    public boolean ques5(){
        RadioButton question5 = (RadioButton) findViewById(R.id.q5);
        boolean results5 = question5.isChecked();
        return results5;
    }
    public boolean ques6(){
        RadioButton question6 = (RadioButton) findViewById(R.id.q6);
        boolean results6 = question6.isChecked();
        return results6;
    }
    public boolean ques7(){
        RadioButton question7 = (RadioButton) findViewById(R.id.q7);
        boolean results7 = question7.isChecked();
        return results7;
    }
    public boolean ques8(){
        RadioButton question8 = (RadioButton) findViewById(R.id.q8);
        boolean results8 = question8.isChecked();
        return results8;
    }
    public boolean ques9(){
        RadioButton question9 = (RadioButton) findViewById(R.id.q9);
        boolean results9 = question9.isChecked();
        return results9;
    }
    public boolean ques10(){
        RadioButton question10 = (RadioButton) findViewById(R.id.q10);
        boolean results10 = question10.isChecked();
        return results10;
    }
     private int total (){
        boolean RESULT1 = ques1(),RESULT2 = ques2(),RESULT3 = ques3(),RESULT4 = ques4(),RESULT5 = ques5(),RESULT6 = ques6(),RESULT7 = ques7(),RESULT8 = ques8(),RESULT9 = ques9(),RESULT10 = ques10();
        int marks = 0;
        if(RESULT1==true)
        {
         marks = marks + 10 ;
        }
         if(RESULT2==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT3==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT4==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT5==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT6==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT7==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT8==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT9==true)
         {
             marks = marks + 10 ;
         }
         if(RESULT10==true)
         {
             marks = marks + 10 ;
         }
         return marks ;

     }

}
