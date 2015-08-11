package pe.edu.cibertec.testexample;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ANDROID on 10/08/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private EditText mEdtA, mEdtB;
    private Button mBtnSum, mBtnSubs, mBtnMult, mBtnDiv;
    private TextView mTxtResult;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mEdtA = (EditText) getActivity().findViewById(R.id.edtA);
        mEdtB = (EditText) getActivity().findViewById(R.id.edtB);
        mBtnSum = (Button) getActivity().findViewById(R.id.btnSum);
        mBtnSubs = (Button) getActivity().findViewById(R.id.btnSubs);
        mBtnMult = (Button) getActivity().findViewById(R.id.btnMult);
        mBtnDiv = (Button) getActivity().findViewById(R.id.btnDiv);
        mTxtResult = (TextView) getActivity().findViewById(R.id.txtResult);
        testSum();
        testSubs();
        testMult();
        testDiv();

    }

    public void testSum() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mEdtA.setText("5");
                mEdtB.setText("15");
                mBtnSum.performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
        assertEquals(mTxtResult.getText().toString(), "20");

    }

    public void testSubs() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mEdtA.setText("25");
                mEdtB.setText("15");
                mBtnSubs.performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
        assertEquals(mTxtResult.getText().toString(), "10");

    }

    public void testMult() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mEdtA.setText("10");
                mEdtB.setText("3");
                mBtnMult.performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
        assertEquals(mTxtResult.getText().toString(), "30");

    }

    public void testDiv() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mEdtA.setText("16");
                mEdtB.setText("4");
                mBtnDiv.performClick();
            }
        });
        getInstrumentation().waitForIdleSync();
        assertEquals(mTxtResult.getText().toString(), "4");

    }

    public void preConditions(){
        assertNotNull("Activity is null", getActivity());
        assertNotNull("edt A is null", mEdtA);
        assertNotNull("edt B is null", mEdtB);


    }

}
