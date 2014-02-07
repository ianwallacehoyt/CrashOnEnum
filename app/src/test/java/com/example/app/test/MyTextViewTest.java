package com.example.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import android.app.Activity;

import com.example.app.Main;
import com.example.app.R;
import com.example.view.MyTextView;
import com.squareup.RobolectricGradleTestRunner;

import static org.junit.Assert.assertEquals;


@RunWith(RobolectricGradleTestRunner.class)
public class MyTextViewTest {
	@Test
	public void testOne() {
		Activity activity = Robolectric.buildActivity(Main.class).create().get();
		
		MyTextView subject = (MyTextView) activity.findViewById(R.id.myTextView);
		assertEquals("Hello world", subject.getText());
	}
}
