package p007c.p190n.p194b.p334e.p338c0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: c.n.b.e.c0.a, reason: use source file name */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class ClearTextEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: d */
    public final TextWatcher f24816d;

    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener f24817e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout.InterfaceC5978f f24818f;

    /* JADX INFO: renamed from: g */
    public final TextInputLayout.InterfaceC5979g f24819g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f24820h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f24821i;

    /* JADX INFO: renamed from: c.n.b.e.c0.a$a */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ClearTextEndIconDelegate.this.f24864a.getSuffixText() != null) {
                return;
            }
            ClearTextEndIconDelegate.this.m11045d(editable.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.a$b */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            ClearTextEndIconDelegate.this.m11045d((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.a$c */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class c implements TextInputLayout.InterfaceC5978f {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5978f
        /* JADX INFO: renamed from: a */
        public void mo11046a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (editText.hasFocus()) {
                z = editText.getText().length() > 0;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(ClearTextEndIconDelegate.this.f24817e);
            editText.removeTextChangedListener(ClearTextEndIconDelegate.this.f24816d);
            editText.addTextChangedListener(ClearTextEndIconDelegate.this.f24816d);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.a$d */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class d implements TextInputLayout.InterfaceC5979g {

        /* JADX INFO: renamed from: c.n.b.e.c0.a$d$a */
        /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ EditText f24826f;

            public a(EditText editText) {
                this.f24826f = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24826f.removeTextChangedListener(ClearTextEndIconDelegate.this.f24816d);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5979g
        /* JADX INFO: renamed from: a */
        public void mo11047a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new a(editText));
            if (editText.getOnFocusChangeListener() == ClearTextEndIconDelegate.this.f24817e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.a$e */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = ClearTextEndIconDelegate.this.f24864a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            ClearTextEndIconDelegate.this.f24864a.m12869o();
        }
    }

    public ClearTextEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f24816d = new a();
        this.f24817e = new b();
        this.f24818f = new c();
        this.f24819g = new d();
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: a */
    public void mo11043a() {
        this.f24864a.setEndIconDrawable(AppCompatResources.m14707b(this.f24865b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f24864a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f24864a.setEndIconOnClickListener(new e());
        this.f24864a.m12856a(this.f24818f);
        this.f24864a.f29158k0.add(this.f24819g);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.f24796d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ClearTextEndIconDelegate5(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = AnimationUtils.f24793a;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new ClearTextEndIconDelegate4(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f24820h = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f24820h.addListener(new ClearTextEndIconDelegate2(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new ClearTextEndIconDelegate4(this));
        this.f24821i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new ClearTextEndIconDelegate3(this));
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: c */
    public void mo11044c(boolean z) {
        if (this.f24864a.getSuffixText() == null) {
            return;
        }
        m11045d(z);
    }

    /* JADX INFO: renamed from: d */
    public final void m11045d(boolean z) {
        boolean z2 = this.f24864a.m12866k() == z;
        if (z && !this.f24820h.isRunning()) {
            this.f24821i.cancel();
            this.f24820h.start();
            if (z2) {
                this.f24820h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f24820h.cancel();
        this.f24821i.start();
        if (z2) {
            this.f24821i.end();
        }
    }
}
