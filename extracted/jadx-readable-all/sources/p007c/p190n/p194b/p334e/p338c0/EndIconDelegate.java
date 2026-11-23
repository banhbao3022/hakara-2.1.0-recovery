package p007c.p190n.p194b.p334e.p338c0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: c.n.b.e.c0.m, reason: use source file name */
/* JADX INFO: compiled from: EndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class EndIconDelegate {

    /* JADX INFO: renamed from: a */
    public TextInputLayout f24864a;

    /* JADX INFO: renamed from: b */
    public Context f24865b;

    /* JADX INFO: renamed from: c */
    public CheckableImageButton f24866c;

    public EndIconDelegate(TextInputLayout textInputLayout) {
        this.f24864a = textInputLayout;
        this.f24865b = textInputLayout.getContext();
        this.f24866c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11043a();

    /* JADX INFO: renamed from: b */
    public boolean mo11053b(int i) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo11044c(boolean z) {
    }
}
