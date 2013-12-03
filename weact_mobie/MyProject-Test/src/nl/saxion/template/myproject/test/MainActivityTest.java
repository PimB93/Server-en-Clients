package nl.saxion.template.myproject.test;

import com.jayway.android.robotium.solo.Solo;

import nl.saxion.weact.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Instrumentation test for the MainAcvitity class.
 */
public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;
	private MainActivity myActivity;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();

		solo = new Solo(this.getInstrumentation(), this.getActivity());
		myActivity = this.getActivity();
	}

	public void testActivity() {
		solo.assertCurrentActivity("MainActivity could not be found",
				MainActivity.class);
	}

	public void helloWorldTest() {
		assertTrue(solo.searchText("Hello World!"));
	}
}
