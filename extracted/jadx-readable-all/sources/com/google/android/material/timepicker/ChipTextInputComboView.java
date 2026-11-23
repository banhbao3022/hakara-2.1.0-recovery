package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter;

/* JADX INFO: loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: f */
    public final Chip f29199f;

    /* JADX INFO: renamed from: g */
    public final TextInputLayout f29200g;

    /* JADX INFO: renamed from: h */
    public final EditText f29201h;

    /* JADX INFO: renamed from: i */
    public TextWatcher f29202i;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C5982b extends TextWatcherAdapter {
        public C5982b(C5981a c5981a) {
        }

        @Override // p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f29199f.setText(ChipTextInputComboView.m12887a(chipTextInputComboView, "00"));
            } else {
                ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
                chipTextInputComboView2.f29199f.setText(ChipTextInputComboView.m12887a(chipTextInputComboView2, editable));
            }
        }
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static String m12887a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* JADX INFO: renamed from: b */
    public final void m12888b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f29201h.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29199f.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m12888b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f29199f.setChecked(z);
        this.f29201h.setVisibility(z ? 0 : 4);
        this.f29199f.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f29201h.requestFocus();
            if (TextUtils.isEmpty(this.f29201h.getText())) {
                return;
            }
            EditText editText = this.f29201h;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29199f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f29199f.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f29199f.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f29199f = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f29200g = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f29201h = editText;
        editText.setVisibility(4);
        C5982b c5982b = new C5982b(null);
        this.f29202i = c5982b;
        editText.addTextChangedListener(c5982b);
        m12888b();
        addView(chip);
        addView(textInputLayout);
        editText.setSaveEnabled(false);
    }
}
