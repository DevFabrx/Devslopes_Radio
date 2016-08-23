package com.example.fabian.devslopesradio.Fragments;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Fabian on 16.08.2016.
 */
public class HorizontalSpaceItemDecorator extends RecyclerView.ItemDecoration {


        private final int spacer;

        public HorizontalSpaceItemDecorator(int spacer) {
            this.spacer = spacer;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.right = spacer;
        }
}
