// Generated by view binder compiler. Do not edit!
package com.subg2_3.trueque.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.subg2_3.trueque.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoSesionBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final Button okNoInicio;

  private NoSesionBinding(@NonNull LinearLayoutCompat rootView, @NonNull Button okNoInicio) {
    this.rootView = rootView;
    this.okNoInicio = okNoInicio;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static NoSesionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoSesionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.no_sesion, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoSesionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ok_no_inicio;
      Button okNoInicio = ViewBindings.findChildViewById(rootView, id);
      if (okNoInicio == null) {
        break missingId;
      }

      return new NoSesionBinding((LinearLayoutCompat) rootView, okNoInicio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}