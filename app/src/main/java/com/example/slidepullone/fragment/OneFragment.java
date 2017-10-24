package com.example.slidepullone.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slidepullone.R;

/**
 * Created by Lizhiguo on 2017/10/24.
 */

public class OneFragment extends Fragment{
    View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if(mView==null){
            mView = inflater.inflate(R.layout.one_frag_layout,container,false);
        }
        return mView;
    }
}
