package com.wrapp.android.util;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class RelativeLayouts {

  public static class Builder {
    RelativeLayout.LayoutParams params;
    View view;

    public Builder(View view, int width, int height) {
      this.view = view;
      params = new RelativeLayout.LayoutParams(width, height);
    }

    public Builder(View view, int width, boolean wrapHeigh) {
      this.view = view;
      int heightStyle = wrapHeigh ? LayoutParams.WRAP_CONTENT : LayoutParams.MATCH_PARENT;
      params = new RelativeLayout.LayoutParams(width, heightStyle);
    }

    public Builder(View view, boolean wrapWidth, int height) {
      this.view = view;
      int widthStyle = wrapWidth ? LayoutParams.WRAP_CONTENT : LayoutParams.MATCH_PARENT;
      params = new RelativeLayout.LayoutParams(widthStyle, height);
    }

    public Builder(View view, boolean wrapWidth, boolean wrapHeigh) {
      this.view = view;
      int widthStyle = wrapWidth ? LayoutParams.WRAP_CONTENT : LayoutParams.MATCH_PARENT;
      int heightStyle = wrapHeigh ? LayoutParams.WRAP_CONTENT : LayoutParams.MATCH_PARENT;
      params = new RelativeLayout.LayoutParams(widthStyle, heightStyle);
    }

    public Builder rightOf(View left){
      params.addRule(RelativeLayout.RIGHT_OF, left.getId());
      return this;
    }

    public Builder leftOf(View right) {
      params.addRule(RelativeLayout.LEFT_OF, right.getId());
      return this;
    }

    public Builder centerInParent() {
      params.addRule(RelativeLayout.CENTER_IN_PARENT);
      return this;
    }

    public Builder centerVertical() {
      params.addRule(RelativeLayout.CENTER_VERTICAL);
      return this;
    }

    public Builder centerHorizontal() {
      params.addRule(RelativeLayout.CENTER_HORIZONTAL);
      return this;
    }

    public Builder alignParentLeft(){
      params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
      return this;
    }

    public Builder alignParentRight() {
      params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
      return this;
    }

    public Builder alignParentTop() {
      params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
      return this;
    }

    public Builder alignParentBottom() {
      params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
      return this;
    }

    public Builder alignBottom(View view) {
      params.addRule(RelativeLayout.ALIGN_BOTTOM, view.getId());
      return this;
    }

    public Builder alignTop(View view) {
      params.addRule(RelativeLayout.ALIGN_TOP, view.getId());
      return this;
    }

    public Builder setMargins(int left, int top, int right, int bottom) {
      params.setMargins(left, top, right, bottom);
      return this;
    }

    public Builder setLeftMargins(int left) {
      params.setMargins(left, params.topMargin, params.rightMargin, params.bottomMargin);
      return this;
    }

    public Builder setTopMargins(int top) {
      params.setMargins(params.leftMargin, top, params.rightMargin, params.bottomMargin);
      return this;
    }

    public Builder setRightMargins(int right) {
      params.setMargins(params.leftMargin, params.topMargin, right, params.bottomMargin);
      return this;
    }

    public Builder setBottomMargins(int bottom) {
      params.setMargins(params.leftMargin, params.topMargin, params.rightMargin, bottom);
      return this;
    }

    public RelativeLayout.LayoutParams get() {
      return params;
    }

    public void apply() {
      view.setLayoutParams(params);
    }
  }

}
