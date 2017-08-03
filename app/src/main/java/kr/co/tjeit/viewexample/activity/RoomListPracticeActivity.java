package kr.co.tjeit.viewexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.adapter.RoomAdapter;
import kr.co.tjeit.viewexample.data.RoomData;

public class RoomListPracticeActivity extends AppCompatActivity {
    private ListView roomListView;
    List<RoomData> roomDataList = new ArrayList<>();
    RoomAdapter roomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list_practice);

        roomListView = (ListView)findViewById(R.id.roomListView);

        roomDataList.add(new RoomData("일반 원룸입니다.", 1000, 40, true, "원룸", 3, 33, 30000));
        roomDataList.add(new RoomData("채광좋은 원룸", 2000, 60, false, "원룸", 1, 26.4, 0));
        roomDataList.add(new RoomData("전세 투룸", 15000, 0, true, "투룸", 0, 36.3, 10000));

        List<String> tags0 = roomDataList.get(0).getHashTags();
        tags0.add("#무난무난");
        tags0.add("#일반");

        List<String> tags1 = roomDataList.get(1).getHashTags();
        tags1.add("#채광");
        tags1.add("#주차");

        List<String> tags2 = roomDataList.get(2).getHashTags();
        tags2.add("#단기가능");
        tags2.add("#반려동물");

        roomAdapter = new RoomAdapter(RoomListPracticeActivity.this, roomDataList);
        roomListView.setAdapter(roomAdapter);
    }


}
