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

/**
 * Created by user on 2017-08-02.
 */

public class PhoneSpinnerAdapter extends ArrayAdapter<String> {
    Context mContext;
    List<String> mList;
    LayoutInflater inf;

    public PhoneSpinnerAdapter(Context context, List<String> list) {
        super(context, R.layout.phone_spinner_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.phone_spinner_display_item, null);
        }

        String phoneName = mList.get(position);

        TextView displayNameTxt = (TextView) row.findViewById(R.id.nameTxt);
        displayNameTxt.setText(phoneName);

        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.phone_spinner_list_item, null);
        }

        String phoneName = mList.get(position);

        TextView displayNameTxt = (TextView) row.findViewById(R.id.nameTxt);
        displayNameTxt.setText(phoneName);


        return row;
    }
}
