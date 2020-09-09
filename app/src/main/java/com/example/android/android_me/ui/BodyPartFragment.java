package com.example.android.android_me.ui;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hogen.Xue
 * @version 1.0.0
 * @time 2020/9/9 16:24
 * @brief
 **/
public class BodyPartFragment extends Fragment {

    private List<Integer> mImageIds = null;
    private int mImageIndex = 0;
    private final String TAG = getClass().getSimpleName();

    // TODO (1) Create a setter method and class variable to set and store of a list of image resources
    public void setImages(List<Integer> images) {
        mImageIds = images;
    }
    // TODO (2) Create another setter method and variable to track and set the index of the list item to display
        // ex. index = 0 is the first image id in the given list , index 1 is the second, and so on
    public void setImageIndex(int imageIndex) {
        mImageIndex = imageIndex;
    }
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment
     */
    public BodyPartFragment() {
    }

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        // TODO (3) If a list of image ids exists, set the image resource to the correct item in that list
        // Otherwise, create a Log statement that indicates that the list was not found
        if(mImageIds != null){
            imageView.setImageResource(mImageIds.get(mImageIndex));
        }else{
            Log.d(TAG, "This fragment has a null imageids ");
        }
        // Return the rootView
        return rootView;
    }

}
