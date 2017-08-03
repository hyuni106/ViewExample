package kr.co.tjeit.viewexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.adapter.CarSpinnerAdapter;
import kr.co.tjeit.viewexample.adapter.PhoneSpinnerAdapter;

public class SpinnerPracticeActivity extends AppCompatActivity {
    private Spinner carListSpinner, phonemodelSpinner;
    List<String> carList = new ArrayList<>();
    List<String> phoneModelList = new ArrayList<>();
    CarSpinnerAdapter carAdapter;
    PhoneSpinnerAdapter phoneSpinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_practice);
        carListSpinner = (Spinner) findViewById(R.id.carListSpinner);
        phonemodelSpinner = (Spinner) findViewById(R.id.phonemodelSpinner);

        carList.add("현대");
        carList.add("기아");
        carList.add("르노");
        carList.add("쉐보레");
        carList.add("쌍용");

        carAdapter = new CarSpinnerAdapter(SpinnerPracticeActivity.this, carList);
        carListSpinner.setAdapter(carAdapter);

        phoneModelList.add("갤럭시");
        phoneModelList.add("G3");
        phoneModelList.add("Mi");
        phoneModelList.add("Razr");
        phoneModelList.add("iPhone");

        phoneSpinnerAdapter = new PhoneSpinnerAdapter(SpinnerPracticeActivity.this, phoneModelList);
        phonemodelSpinner.setAdapter(phoneSpinnerAdapter);
    }
}
