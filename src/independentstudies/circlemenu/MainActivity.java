package independentstudies.circlemenu;

import independentstudies.circlemenu.view.CircleImageView;
import independentstudies.circlemenu.view.CircleLayout;
import independentstudies.circlemenu.view.CircleLayout.OnCenterClickListener;
import independentstudies.circlemenu.view.CircleLayout.OnItemClickListener;
import independentstudies.circlemenu.view.CircleLayout.OnItemSelectedListener;
import independentstudies.circlemenu.view.CircleLayout.OnRotationFinishedListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.szugyi.circlemenu.R;

public class MainActivity extends Activity implements OnItemSelectedListener,
		OnItemClickListener, OnRotationFinishedListener, OnCenterClickListener {
	TextView selectedTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CircleLayout circleMenu = (CircleLayout) findViewById(R.id.main_circle_layout);
		circleMenu.setOnItemSelectedListener(this);
		circleMenu.setOnItemClickListener(this);
		circleMenu.setOnRotationFinishedListener(this);
		circleMenu.setOnCenterClickListener(this);

		selectedTextView = (TextView) findViewById(R.id.main_selected_textView);
		selectedTextView.setText(((CircleImageView) circleMenu
				.getSelectedItem()).getName());
	}

	@Override
	public void onItemSelected(View view, String name) {
		selectedTextView.setText(name);

		switch (view.getId()) {
			case R.id.bubble_one:
				// Handle one selection
				break;
			case R.id.bubble_two:
				// Handle two selection
				break;
			case R.id.bubble_three:
				// Handle three selection
				break;
			case R.id.bubble_four:
				// Handle three selection
				break;
			case R.id.bubble_five:
				// Handle three selection
				break;
			case R.id.bubble_six:
				// Handle three selection
				break;
			case R.id.bubble_seven:
				// Handle three selection
				break;
			case R.id.bubble_eight:
				// Handle three selection
				break;
			/*case R.id.bubble_nine:
				// Handle three selection
				break;
			case R.id.bubble_ten:
				// Handle three selection
				break;
			case R.id.bubble_eleven:
				// Handle three selection
				break;
			case R.id.bubble_twelve:
				// Handle three selection
				break;
			case R.id.bubble_thirteen:
				// Handle three selection
				break;
			case R.id.bubble_fourteen:
				// Handle three selection
				break;
			case R.id.bubble_fifteen:
				// Handle three selection
				break;
			case R.id.bubble_sixteen:
				// Handle three selection
				break;*/
		}
	}

	@Override
	public void onItemClick(View view, String name) {
		Toast.makeText(getApplicationContext(),
				getResources().getString(R.string.start_app) + " " + name,
				Toast.LENGTH_SHORT).show();

		switch (view.getId()) {
			case R.id.bubble_one:
				// Handle one click
				break;
			case R.id.bubble_two:
				// Handle two click
				break;
			case R.id.bubble_three:
				// Handle three click
				break;
		}
	}

	@Override
	public void onCenterClick() {
		Toast.makeText(getApplicationContext(), R.string.center_click,
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onRotationFinished(View view, String name) {
		Animation animation = new RotateAnimation(0, 360, view.getWidth() / 2,
				view.getHeight() / 2);
		animation.setDuration(250);
		view.startAnimation(animation);
	}

}
