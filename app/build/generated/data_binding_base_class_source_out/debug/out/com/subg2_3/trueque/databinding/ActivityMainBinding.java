// Generated by view binder compiler. Do not edit!
package com.subg2_3.trueque.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.subg2_3.trueque.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button CerrarSesion;

  @NonNull
  public final Button btnInfo;

  @NonNull
  public final Button btnMail;

  @NonNull
  public final Button btnPhone;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @NonNull
  public final FloatingActionButton floatingActionButton4;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView product;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button CerrarSesion,
      @NonNull Button btnInfo, @NonNull Button btnMail, @NonNull Button btnPhone,
      @NonNull FloatingActionButton floatingActionButton,
      @NonNull FloatingActionButton floatingActionButton4, @NonNull LinearLayout linearLayout2,
      @NonNull TextView product) {
    this.rootView = rootView;
    this.CerrarSesion = CerrarSesion;
    this.btnInfo = btnInfo;
    this.btnMail = btnMail;
    this.btnPhone = btnPhone;
    this.floatingActionButton = floatingActionButton;
    this.floatingActionButton4 = floatingActionButton4;
    this.linearLayout2 = linearLayout2;
    this.product = product;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CerrarSesion;
      Button CerrarSesion = ViewBindings.findChildViewById(rootView, id);
      if (CerrarSesion == null) {
        break missingId;
      }

      id = R.id.btnInfo;
      Button btnInfo = ViewBindings.findChildViewById(rootView, id);
      if (btnInfo == null) {
        break missingId;
      }

      id = R.id.btnMail;
      Button btnMail = ViewBindings.findChildViewById(rootView, id);
      if (btnMail == null) {
        break missingId;
      }

      id = R.id.btnPhone;
      Button btnPhone = ViewBindings.findChildViewById(rootView, id);
      if (btnPhone == null) {
        break missingId;
      }

      id = R.id.floatingActionButton;
      FloatingActionButton floatingActionButton = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton == null) {
        break missingId;
      }

      id = R.id.floatingActionButton4;
      FloatingActionButton floatingActionButton4 = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton4 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.product;
      TextView product = ViewBindings.findChildViewById(rootView, id);
      if (product == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, CerrarSesion, btnInfo, btnMail,
          btnPhone, floatingActionButton, floatingActionButton4, linearLayout2, product);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
