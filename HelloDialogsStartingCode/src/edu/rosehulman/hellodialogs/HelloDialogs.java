package edu.rosehulman.hellodialogs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloDialogs extends Activity {

	public static final String HD = "HD";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((Button) findViewById(R.id.dialog_button_ok))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.d(HD,
								"Show alert dialog with one button to info user.");
						showAbout();
					}
				});
		((Button) findViewById(R.id.dialog_button_multiple_buttons))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.d(HD,
								"Show alert dialog with multiple options for the user.");
						showExit();
					}
				});
		((Button) findViewById(R.id.dialog_button_select_item))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.d(HD,
								"Show alert dialog with a list of options for the user.");
						showLearningSurvey();
					}
				});
		((Button) findViewById(R.id.dialog_button_custom))
				.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Log.d(HD, "Show custom dialog subclass to the user.");
						showRoseDialog();
					}
				});
	}

	protected void showAbout() {
		// TODO: Show appropriate dialog
	}

	private void showExit() {
		// TODO: Show appropriate dialog
	}

	protected void showLearningSurvey() {
		// TODO: Show appropriate dialog
	}

	protected void showRoseDialog() {
		// TODO: Show appropriate dialog
	}
}