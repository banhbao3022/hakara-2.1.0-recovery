package p007c.p190n.p194b.p334e.p338c0;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: c.n.b.e.c0.q, reason: use source file name */
/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: d */
    public final TextWatcher f24897d;

    /* JADX INFO: renamed from: e */
    public final TextInputLayout.InterfaceC5978f f24898e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout.InterfaceC5979g f24899f;

    /* JADX INFO: renamed from: c.n.b.e.c0.q$a */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    public class a extends TextWatcherAdapter {
        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
            passwordToggleEndIconDelegate.f24866c.setChecked(!PasswordToggleEndIconDelegate.m11071d(passwordToggleEndIconDelegate));
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.q$b */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    public class b implements TextInputLayout.InterfaceC5978f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5978f
        /* JADX INFO: renamed from: a */
        public void mo11046a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
            passwordToggleEndIconDelegate.f24866c.setChecked(!PasswordToggleEndIconDelegate.m11071d(passwordToggleEndIconDelegate));
            editText.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f24897d);
            editText.addTextChangedListener(PasswordToggleEndIconDelegate.this.f24897d);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.q$c */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    public class c implements TextInputLayout.InterfaceC5979g {

        /* JADX INFO: renamed from: c.n.b.e.c0.q$c$a */
        /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ EditText f24903f;

            public a(EditText editText) {
                this.f24903f = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24903f.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f24897d);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5979g
        /* JADX INFO: renamed from: a */
        public void mo11047a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.q$d */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = PasswordToggleEndIconDelegate.this.f24864a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (PasswordToggleEndIconDelegate.m11071d(PasswordToggleEndIconDelegate.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            PasswordToggleEndIconDelegate.this.f24864a.m12869o();
        }
    }

    public PasswordToggleEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f24897d = new a();
        this.f24898e = new b();
        this.f24899f = new c();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11071d(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate) {
        EditText editText = passwordToggleEndIconDelegate.f24864a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: a */
    public void mo11043a() {
        this.f24864a.setEndIconDrawable(AppCompatResources.m14707b(this.f24865b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f24864a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.f24864a.setEndIconOnClickListener(new d());
        this.f24864a.m12856a(this.f24898e);
        this.f24864a.f29158k0.add(this.f24899f);
        EditText editText = this.f24864a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
