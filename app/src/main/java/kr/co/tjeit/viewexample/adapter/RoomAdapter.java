package kr.co.tjeit.viewexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.data.PhoneData;
import kr.co.tjeit.viewexample.data.RoomData;

/**
 * Created by user on 2017-08-01.
 */

public class RoomAdapter extends ArrayAdapter<RoomData> {
    Context mContext;
    List<RoomData> mList;
    LayoutInflater inf; // 메모리 절약

    public RoomAdapter(Context context, List<RoomData> list) {
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }

        RoomData mRoomData = mList.get(position);
        TextView rentPayTxt = (TextView)row.findViewById(R.id.rentPayTxt);
        TextView titleTxt = (TextView)row.findViewById(R.id.titleTxt);
        TextView roomTypeTxt = (TextView)row.findViewById(R.id.roomTypeTxt);
        TextView stairTxt = (TextView)row.findViewById(R.id.stairTxt);
        TextView manageTxt = (TextView)row.findViewById(R.id.manageTxt);
        TextView payTypeTxt = (TextView)row.findViewById(R.id.payTypeTxt);
        TextView roomSizeTxt = (TextView)row.findViewById(R.id.roomSizeTxt);
        ImageView likeImg = (ImageView)row.findViewById(R.id.likeImg);
        TextView tagTxt1 = (TextView)row.findViewById(R.id.tagTxt1);
        TextView tagTxt2 = (TextView)row.findViewById(R.id.tagTxt2);
        TextView tagTxt3 = (TextView)row.findViewById(R.id.tagTxt3);
        TextView tagTxt4 = (TextView)row.findViewById(R.id.tagTxt4);

        List<TextView> tags = new ArrayList<TextView>();
        tags.add(tagTxt1);
        tags.add(tagTxt2);
        tags.add(tagTxt3);
        tags.add(tagTxt4);

        for(TextView tv : tags) {
            tv.setVisibility(View.GONE);
        }

        for (int i=0; i<mRoomData.getHashTags().size(); i++) {
            TextView tag = tags.get(i);
            tag.setVisibility(View.VISIBLE);
            tag.setText(mRoomData.getHashTags().get(i));
        }

        if(mRoomData.getRoomRentPay() > 0) {
            rentPayTxt.setText(mRoomData.getRoomDeposit() + " / " + mRoomData.getRoomRentPay());
        } else {
            if(mRoomData.getRoomDeposit() > 10000) {
                rentPayTxt.setText(mRoomData.getRoomDeposit()/10000 + "억 " + (mRoomData.getRoomDeposit()%10000)/1000 + "천");
            } else {
                rentPayTxt.setText(mRoomData.getRoomDeposit() + "만");
            }
        }

        titleTxt.setText(mRoomData.getRoomTitle());
        roomTypeTxt.setText(mRoomData.getRoomType());

        if(mRoomData.getStairNum() < 0) {
            stairTxt.setText("지하 " + (-mRoomData.getStairNum()) + "층");
        } else if (mRoomData.getStairNum() == 0) {
            stairTxt.setText("반지하");
        } else {
            stairTxt.setText(mRoomData.getStairNum()+"층");
        }

        if(mRoomData.getManagePay()/10000 == 0) {
            manageTxt.setText("관리비 없음");
        } else {
            manageTxt.setText("관리비 " + (mRoomData.getManagePay()/10000) + "만원");
        }

        roomSizeTxt.setText(mRoomData.getRoomSize() + "㎡");

        if(mRoomData.getRoomRentPay() > 0) {
            payTypeTxt.setText("월세");
            payTypeTxt.setBackgroundResource(R.color.monthColor);
        } else {
            payTypeTxt.setBackgroundResource(R.color.colorYellow);
            payTypeTxt.setText("전세");
        }

        if (mRoomData.isLikedByUser()) {
            likeImg.setImageResource(R.drawable.heart);
        } else {
            likeImg.setImageResource(R.drawable.empty_heart);
        }



        return row;
    }
}
