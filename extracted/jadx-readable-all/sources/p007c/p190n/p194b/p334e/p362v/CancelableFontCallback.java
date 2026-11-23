package p007c.p190n.p194b.p334e.p362v;

import android.graphics.Typeface;

/* JADX INFO: renamed from: c.n.b.e.v.a, reason: use source file name */
/* JADX INFO: compiled from: CancelableFontCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a */
    public final Typeface f25520a;

    /* JADX INFO: renamed from: b */
    public final a f25521b;

    /* JADX INFO: renamed from: c */
    public boolean f25522c;

    /* JADX INFO: renamed from: c.n.b.e.v.a$a */
    /* JADX INFO: compiled from: CancelableFontCallback.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo11329a(Typeface typeface);
    }

    public CancelableFontCallback(a aVar, Typeface typeface) {
        this.f25520a = typeface;
        this.f25521b = aVar;
    }

    @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
    /* JADX INFO: renamed from: a */
    public void mo11338a(int i) {
        Typeface typeface = this.f25520a;
        if (this.f25522c) {
            return;
        }
        this.f25521b.mo11329a(typeface);
    }

    @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
    /* JADX INFO: renamed from: b */
    public void mo11339b(Typeface typeface, boolean z) {
        if (this.f25522c) {
            return;
        }
        this.f25521b.mo11329a(typeface);
    }
}
