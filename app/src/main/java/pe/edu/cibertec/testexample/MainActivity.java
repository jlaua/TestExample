package pe.edu.cibertec.testexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEdtA, mEdtB;
    private TextView mTxtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtA = (EditText) findViewById(R.id.edtA);
        mEdtB = (EditText) findViewById(R.id.edtB);
        Button btnSum = (Button) findViewById(R.id.btnSum);
        Button btnSubs = (Button) findViewById(R.id.btnSubs);
        Button btnMult = (Button) findViewById(R.id.btnMult);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        mTxtResult = (TextView) findViewById(R.id.txtResult);
        btnSum.setOnClickListener(this);
        btnSubs.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        float a = Integer.parseInt(mEdtA.getText().toString());
        float b = Integer.parseInt(mEdtB.getText().toString());
        float result = 0.0f;
        switch (v.getId()) {
            case R.id.btnSum:
                result = sum(a, b);
                break;
            case R.id.btnSubs:
                result = subs(a, b);
                break;
            case R.id.btnMult:
                result = mult(a, b);
                break;
            case R.id.btnDiv:
                result = div(a, b);
                break;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        mTxtResult.setText(decimalFormat.format(result));



    }

    private float sum(float a, float b) {
        float result = 0.0f;
        result = a + b;
        return result;

    }

    private float subs(float a, float b) {
        float result = 0.0f;
        result = a - b;
        return result;

    }

    private float mult(float a, float b) {
        float result = 0.0f;
        result = a * b;
        return result;

    }

    private float div(float a, float b) {
        float result = 0.0f;
        result = a / b;
        return result;

    }
}
