package kr.co.tjeit.viewexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.adapter.PhoneAdapter;
import kr.co.tjeit.viewexample.adapter.PhoneDataSpinnerAdapter;
import kr.co.tjeit.viewexample.data.PhoneData;

public class ListViewTestActivity extends AppCompatActivity {

    private ListView myListView;
    List<PhoneData> myArrayList = new ArrayList<>();
    PhoneAdapter myAdapter;
    PhoneDataSpinnerAdapter phoneDataSpinnerAdapter;
    private Spinner phoneSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        phoneSpinner = (Spinner) findViewById(R.id.phoneSpinner);
        myListView = (ListView)findViewById(R.id.myListView);

        myArrayList.add(new PhoneData("삼성", "갤럭시S8"));
        myArrayList.add(new PhoneData("애플", "아이폰6S"));
        myArrayList.add(new PhoneData("LG", "V20"));
        myArrayList.add(new PhoneData("샤오미", "Mi"));
        myArrayList.add(new PhoneData("모토로라", "스타텍"));
        myArrayList.add(new PhoneData("삼성", "갤럭시S7"));
        myArrayList.add(new PhoneData("삼성", "갤럭시S6"));
        myArrayList.add(new PhoneData("삼성", "갤럭시 노트5"));
        myArrayList.add(new PhoneData("삼성", "갤럭시 노트7"));
        myArrayList.add(new PhoneData("삼성", "옴니아"));


        myAdapter = new PhoneAdapter(ListViewTestActivity.this, myArrayList);
        phoneDataSpinnerAdapter = new PhoneDataSpinnerAdapter(ListViewTestActivity.this, myArrayList);

        myListView.setAdapter(myAdapter);
        phoneSpinner.setAdapter(phoneDataSpinnerAdapter);
    }
}
