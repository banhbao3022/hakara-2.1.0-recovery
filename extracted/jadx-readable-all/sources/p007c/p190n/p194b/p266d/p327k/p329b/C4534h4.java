package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.h4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4534h4 {

    /* JADX INFO: renamed from: a */
    public final String f23962a;

    /* JADX INFO: renamed from: b */
    public final boolean f23963b;

    /* JADX INFO: renamed from: c */
    public boolean f23964c;

    /* JADX INFO: renamed from: d */
    public boolean f23965d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4510f4 f23966e;

    public C4534h4(C4510f4 c4510f4, String str, boolean z) {
        this.f23966e = c4510f4;
        C2622l.m5359e(str);
        this.f23962a = str;
        this.f23963b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m10593a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f23966e.m10538w().edit();
        editorEdit.putBoolean(this.f23962a, z);
        editorEdit.apply();
        this.f23965d = z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10594b() {
        if (!this.f23964c) {
            this.f23964c = true;
            this.f23965d = this.f23966e.m10538w().getBoolean(this.f23962a, this.f23963b);
        }
        return this.f23965d;
    }
}
