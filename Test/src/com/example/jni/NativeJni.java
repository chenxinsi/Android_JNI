package com.example.jni;

import android.util.Log;

public class NativeJni {
	public native int add(int num1, int num2);
	
	static
	{
		Log.d("xinsi", "loadLibrary");
		//装载动态连接库
		System.loadLibrary("NativeJni");
	}
}
