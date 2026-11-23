package p007c.p190n.p194b.p334e.p338c0;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: c.n.b.e.c0.p, reason: use source file name */
/* JADX INFO: compiled from: NoEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class NoEndIconDelegate extends EndIconDelegate {
    public NoEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: a */
    public void mo11043a() {
        this.f24864a.setEndIconOnClickListener(null);
        this.f24864a.setEndIconDrawable((Drawable) null);
        this.f24864a.setEndIconContentDescription((CharSequence) null);
    }
}
