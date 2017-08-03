package kr.co.tjeit.viewexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.co.tjeit.viewexample.R;
import kr.co.tjeit.viewexample.data.PhoneData;

/**
 * Created by user on 2017-08-01.
 */

public class PhoneAdapter extends ArrayAdapter<PhoneData> {
    Context mContext;
    List<PhoneData> mList;
    LayoutInflater inf;

    public PhoneAdapter(Context context, List<PhoneData> list) {
        super(context, R.layout.phone_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if(row == null) {
            row = inf.inflate(R.layout.phone_list_item, null);
        }

        PhoneData mPhoneData = mList.get(position);

        TextView modelTxt = (TextView)row.findViewById(R.id.modelTxt);
        TextView makerTxt = (TextView)row.findViewById(R.id.makerTxt);

        modelTxt.setText(mPhoneData.getModelName());
        makerTxt.setText(mPhoneData.getMaker());

        return row;
    }
}
