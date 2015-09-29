package com.example.elimt.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button zero;
    Button decimal;
    Button plus;
    Button minus;
    Button divide;
    Button multiply;
    Button equals;

    TextView results;

    boolean isResults;

    double c,d,r,b;
    String a="0",aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
isResults = false;
        nine = (Button)findViewById(R.id.but9);
        eight = (Button)findViewById(R.id.but8);
        seven = (Button)findViewById(R.id.but7);
        six = (Button) findViewById(R.id.but6);
        five = (Button) findViewById(R.id.but5);
        four = (Button) findViewById(R.id.but4);
        three = (Button) findViewById(R.id.but3);
        two = (Button) findViewById(R.id.but2);
        one = (Button) findViewById(R.id.but1);
        zero = (Button) findViewById(R.id.but0);
        decimal = (Button) findViewById(R.id.butPoint);
        plus = (Button) findViewById(R.id.butPlus);
        minus = (Button) findViewById(R.id.butSub);
        divide = (Button) findViewById(R.id.butSlash);
        multiply = (Button) findViewById(R.id.butMulti);
        equals = (Button) findViewById(R.id.butEqual);
        results = (TextView) findViewById(R.id.Results);

        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a = results.getText().toString();
                a = a + "1";
                results.setText(a);
                isResults = false;
            }
        });
        two.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                    results.setText("");
                a=results.getText().toString();
                a=a+"2";
                results.setText(a);
                isResults = false;
            }
        });

        three.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"3";
                results.setText(a);
                isResults = false;
            }
        });


        four.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"4";
                results.setText(a);
                isResults = false;
            }
        });


        five.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"5";
                results.setText(a);
                isResults = false;
            }
        });


        six.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"6";
                results.setText(a);
                isResults = false;
            }
        });


        seven.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"7";
                results.setText(a);
                isResults = false;
            }
        });


        eight.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"8";
                results.setText(a);
                isResults = false;
            }
        });


        nine.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"9";
                results.setText(a);
                isResults = false;
            }
        });


        zero.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                results.setText("");
                a=results.getText().toString();
                a=a+"0";
                results.setText(a);
                isResults = false;
            }
        });


        decimal.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                if(isResults)
                    results.setText("");
                a=results.getText().toString();
                a=a+".";
                results.setText(a);
                isResults = false;
            }
        });

        plus.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {

                aa=a;
                b=1;
                a="";
                results.setText("+");

                results.setText("");
            }
        });





        minus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                aa = a;
                b = 2;
                a = "";
                results.setText("-");
                results.setText("");

            }
        });


        multiply.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                aa=a;
                b=3;
                a="";
                results.setText("*");
                results.setText("");

            }
        });



        divide.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {
                aa=a;
                b=4;
                a="";
                results.setText("/");
                results.setText("");

            }
        });


        equals.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v) {

                if(b==1){
                    c=Double.parseDouble(aa);

                    d=Double.parseDouble(a);
                    r=c+d;
                }
                else
                if(b==4){
                    c=Double.parseDouble(aa);
                    d=Double.parseDouble(a);
                    r=c/d;
                }else
                if(b==2){
                    c=Double.parseDouble(aa);
                    d=Double.parseDouble(a);
                    r=c-d;
                }
                else
                if(b==3) {
                    c = Double.parseDouble(aa);
                    d = Double.parseDouble(a);
                    r = c * d;
                }
         // results.setText("test");
          // Toast.makeText(MainActivity.this, "Result is::" + r, Toast.LENGTH_LONG).show();
                c=0;
                b=0;
                d=0;
                a="";
                aa="";
                results.setText(String.valueOf(r));
                isResults = true;
            }
        });


        }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
