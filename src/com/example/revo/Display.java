package com.example.revo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Display extends Activity {

	public void onCreate(Bundle s)
	{
		super.onCreate(s);
		setContentView(R.layout.display);
		Bundle b=getIntent().getExtras();
		TextView name=(TextView)findViewById(R.id.nameValue);
		TextView Class=(TextView)findViewById(R.id.ClassValue);
		TextView quali=(TextView)findViewById(R.id.qualiValue);
		TextView age=(TextView)findViewById(R.id.ageValue);
		TextView gender=(TextView)findViewById(R.id.genderValue);
		TextView email=(TextView)findViewById(R.id.emailValue);
		name.setText(b.getCharSequence("name"));
		Class.setText(b.getCharSequence("Class"));
		quali.setText(b.getCharSequence("quali"));
		age.setText(b.getCharSequence("age"));
		gender.setText(b.getCharSequence("gender"));
		email.setText(b.getCharSequence("email"));

}
}

