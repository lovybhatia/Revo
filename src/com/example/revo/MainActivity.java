package com.example.revo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;


public class MainActivity extends Activity implements OnClickListener {
Button button;
EditText name;
EditText Class;
EditText quali;
EditText age;
EditText email;
RadioGroup genderRadioGroup;

	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllviewsById();
        button.setOnClickListener(this);
        
    }
    private void findAllviewsById(){
    button=(Button)findViewById(R.id.submit);
    name=(EditText)findViewById(R.id.name);
    Class=(EditText)findViewById(R.id.Class);
    quali=(EditText)findViewById(R.id.quali);
    age=(EditText)findViewById(R.id.age);
    email=(EditText)findViewById(R.id.email);
    genderRadioGroup=(RadioGroup)findViewById(R.id.gender);
 }

 public void onClick(View v){
    	Intent intent= new Intent(MainActivity.this,Display.class);
    	Bundle b= new Bundle();
    	b.putString("name",name.getText().toString());
    	b.putString("Class",Class.getText().toString());
    	b.putString("quali",quali.getText().toString());
    	b.putString("age",age.getText().toString());
    	b.putString("email",email.getText().toString());
    	int id=genderRadioGroup.getCheckedRadioButtonId();
    	RadioButton radioButton=(RadioButton)findViewById(id);
    	b.putString("gender",radioButton.getText().toString());
    	intent.putExtras(b);
    	startActivity(intent);
}
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
