//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.huewu.cleancodeexample.clean;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huewu.cleancodeexample.R.layout;

public final class CleanContentFragment_
    extends CleanContentFragment
{

    private View contentView_;

    private void init_(Bundle savedInstanceState) {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    private void afterSetContentView_() {
        mImageView = ((View) findViewById(com.huewu.cleancodeexample.R.id.content_image));
        mTextView = ((View) findViewById(com.huewu.cleancodeexample.R.id.content_text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.content, container, false);
        }
        afterSetContentView_();
        return contentView_;
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    public static CleanContentFragment_.FragmentBuilder_ builder() {
        return new CleanContentFragment_.FragmentBuilder_();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public CleanContentFragment build() {
            CleanContentFragment_ fragment_ = new CleanContentFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}
