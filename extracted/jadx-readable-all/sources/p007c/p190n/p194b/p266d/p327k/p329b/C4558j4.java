package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.j4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4558j4 {

    /* JADX INFO: renamed from: a */
    public final String f24027a;

    /* JADX INFO: renamed from: b */
    public final long f24028b;

    /* JADX INFO: renamed from: c */
    public boolean f24029c;

    /* JADX INFO: renamed from: d */
    public long f24030d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4510f4 f24031e;

    public C4558j4(C4510f4 c4510f4, String str, long j2) {
        this.f24031e = c4510f4;
        C2622l.m5359e(str);
        this.f24027a = str;
        this.f24028b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m10610a() {
        if (!this.f24029c) {
            this.f24029c = true;
            this.f24030d = this.f24031e.m10538w().getLong(this.f24027a, this.f24028b);
        }
        return this.f24030d;
    }

    /* JADX INFO: renamed from: b */
    public final void m10611b(long j2) {
        SharedPreferences.Editor editorEdit = this.f24031e.m10538w().edit();
        editorEdit.putLong(this.f24027a, j2);
        editorEdit.apply();
        this.f24030d = j2;
    }
}
