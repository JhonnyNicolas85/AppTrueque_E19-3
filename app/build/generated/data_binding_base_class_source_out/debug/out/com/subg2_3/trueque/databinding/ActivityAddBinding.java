// Generated by view binder compiler. Do not edit!
package com.subg2_3.trueque.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.subg2_3.trueque.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout Linearlayout1;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final Button button4;

  @NonNull
  public final EditText etCity;

  @NonNull
  public final EditText etDescription;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPhone;

  @NonNull
  public final TextView product;

  private ActivityAddBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout Linearlayout1, @NonNull Button btnCancel, @NonNull Button btnSave,
      @NonNull Button button4, @NonNull EditText etCity, @NonNull EditText etDescription,
      @NonNull EditText etEmail, @NonNull EditText etName, @NonNull EditText etPhone,
      @NonNull TextView product) {
    this.rootView = rootView;
    this.Linearlayout1 = Linearlayout1;
    this.btnCancel = btnCancel;
    this.btnSave = btnSave;
    this.button4 = button4;
    this.etCity = etCity;
    this.etDescription = etDescription;
    this.etEmail = etEmail;
    this.etName = etName;
    this.etPhone = etPhone;
    this.product = product;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Linearlayout1;
      LinearLayout Linearlayout1 = ViewBindings.findChildViewById(rootView, id);
      if (Linearlayout1 == null) {
        break missingId;
      }

      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnSave;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.etCity;
      EditText etCity = ViewBindings.findChildViewById(rootView, id);
      if (etCity == null) {
        break missingId;
      }

      id = R.id.etDescription;
      EditText etDescription = ViewBindings.findChildViewById(rootView, id);
      if (etDescription == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.etName;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.etPhone;
      EditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      id = R.id.product;
      TextView product = ViewBindings.findChildViewById(rootView, id);
      if (product == null) {
        break missingId;
      }

      return new ActivityAddBinding((ConstraintLayout) rootView, Linearlayout1, btnCancel, btnSave,
          button4, etCity, etDescription, etEmail, etName, etPhone, product);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
