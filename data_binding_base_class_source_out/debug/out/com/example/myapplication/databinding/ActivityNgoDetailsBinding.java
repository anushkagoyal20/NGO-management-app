// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNgoDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final EditText p1;

  @NonNull
  public final EditText t1;

  @NonNull
  public final EditText t2;

  @NonNull
  public final EditText t3;

  @NonNull
  public final EditText t4;

  @NonNull
  public final EditText t5;

  @NonNull
  public final EditText t6;

  @NonNull
  public final EditText t7;

  @NonNull
  public final EditText t8;

  @NonNull
  public final TextView textView3;

  private ActivityNgoDetailsBinding(@NonNull ConstraintLayout rootView, @NonNull Button button4,
      @NonNull Button button5, @NonNull EditText p1, @NonNull EditText t1, @NonNull EditText t2,
      @NonNull EditText t3, @NonNull EditText t4, @NonNull EditText t5, @NonNull EditText t6,
      @NonNull EditText t7, @NonNull EditText t8, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.button4 = button4;
    this.button5 = button5;
    this.p1 = p1;
    this.t1 = t1;
    this.t2 = t2;
    this.t3 = t3;
    this.t4 = t4;
    this.t5 = t5;
    this.t6 = t6;
    this.t7 = t7;
    this.t8 = t8;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNgoDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNgoDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ngo_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNgoDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.p1;
      EditText p1 = ViewBindings.findChildViewById(rootView, id);
      if (p1 == null) {
        break missingId;
      }

      id = R.id.t1;
      EditText t1 = ViewBindings.findChildViewById(rootView, id);
      if (t1 == null) {
        break missingId;
      }

      id = R.id.t2;
      EditText t2 = ViewBindings.findChildViewById(rootView, id);
      if (t2 == null) {
        break missingId;
      }

      id = R.id.t3;
      EditText t3 = ViewBindings.findChildViewById(rootView, id);
      if (t3 == null) {
        break missingId;
      }

      id = R.id.t4;
      EditText t4 = ViewBindings.findChildViewById(rootView, id);
      if (t4 == null) {
        break missingId;
      }

      id = R.id.t5;
      EditText t5 = ViewBindings.findChildViewById(rootView, id);
      if (t5 == null) {
        break missingId;
      }

      id = R.id.t6;
      EditText t6 = ViewBindings.findChildViewById(rootView, id);
      if (t6 == null) {
        break missingId;
      }

      id = R.id.t7;
      EditText t7 = ViewBindings.findChildViewById(rootView, id);
      if (t7 == null) {
        break missingId;
      }

      id = R.id.t8;
      EditText t8 = ViewBindings.findChildViewById(rootView, id);
      if (t8 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityNgoDetailsBinding((ConstraintLayout) rootView, button4, button5, p1, t1,
          t2, t3, t4, t5, t6, t7, t8, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
