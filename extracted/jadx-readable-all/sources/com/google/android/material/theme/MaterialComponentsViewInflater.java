package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p007c.p190n.p194b.p334e.p338c0.MaterialAutoCompleteTextView;
import p007c.p190n.p194b.p334e.p351l.MaterialCheckBox;
import p007c.p190n.p194b.p334e.p361u.MaterialRadioButton;
import p636z0.p644b.p645c.AppCompatViewInflater;
import p636z0.p644b.p653h.AppCompatAutoCompleteTextView;
import p636z0.p644b.p653h.AppCompatButton;
import p636z0.p644b.p653h.AppCompatCheckBox;
import p636z0.p644b.p653h.AppCompatRadioButton;
import p636z0.p644b.p653h.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // p636z0.p644b.p645c.AppCompatViewInflater
    /* JADX INFO: renamed from: a */
    public AppCompatAutoCompleteTextView mo12882a(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // p636z0.p644b.p645c.AppCompatViewInflater
    /* JADX INFO: renamed from: b */
    public AppCompatButton mo12883b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p636z0.p644b.p645c.AppCompatViewInflater
    /* JADX INFO: renamed from: c */
    public AppCompatCheckBox mo12884c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p636z0.p644b.p645c.AppCompatViewInflater
    /* JADX INFO: renamed from: d */
    public AppCompatRadioButton mo12885d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // p636z0.p644b.p645c.AppCompatViewInflater
    /* JADX INFO: renamed from: e */
    public AppCompatTextView mo12886e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
