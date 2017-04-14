package com.example.jni;


import com.example.jni.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NativeTest extends Activity{
	
	private EditText num1;
	private EditText num2;
	private Button btn;
	private TextView tv_result;
	private NativeJni nativeJni;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		num1 = (EditText) findViewById(R.id.number1);
		num2 = (EditText) findViewById(R.id.number2);
		nativeJni = new NativeJni();
		btn = (Button) findViewById(R.id.btn);
		tv_result = (TextView) findViewById(R.id.result);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                int number1 = Integer.parseInt(num1.getText().toString().trim());
                int number2 = Integer.parseInt(num2.getText().toString().trim());
                Log.d("xinsi","nativeJni:" + nativeJni);
                int sum = nativeJni.add(number1, number2);
                tv_result.setText("" + sum);
			}
		});
	}
	
}
