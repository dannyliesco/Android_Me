package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * @author Hogen.Xue
 * @version 1.0.0
 * @time 2020/9/9 16:24
 * @brief
 **/
public class BodyPartFragment extends Fragment {

    private static BodyPartFragment sBodyPartFragment;

    public BodyPartFragment(){
        ;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView = rootView.findViewById(R.id.body_part);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }

    public static BodyPartFragment getInstance(){
        if(sBodyPartFragment == null){
            sBodyPartFragment = new BodyPartFragment();
        }
        return sBodyPartFragment;
    }
}
