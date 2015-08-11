package pe.edu.cibertec.testexample;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

/**
 * Created by ANDROID on 10/08/2015.
 */
public class MainActivity2Test extends ActivityUnitTestCase<MainActivity> {

    private Intent mLaunchIntent;
    private Button mBtnNext;

    public MainActivity2Test() {
        super(MainActivity.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mLaunchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);

    }

    public void testPreConditions(){
        startActivity(mLaunchIntent,null,null);
        mBtnNext = (Button) getActivity().findViewById(R.id.btnNext);
        assertNotNull("Activity is null", getActivity());
        assertNotNull("mBtnNext is null", mBtnNext);


    }

    public void testLaunchNextActivity(){
        startActivity(mLaunchIntent, null, null);
        mBtnNext = (Button) getActivity().findViewById(R.id.btnNext);
        mBtnNext.performClick();
        Intent intent = getStartedActivityIntent();
        assertNotNull("New Intent is null " , intent);
        assertNotNull(isFinishCalled());

    }


}
