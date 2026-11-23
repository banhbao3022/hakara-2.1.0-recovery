package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.m4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4594m4 {

    /* JADX INFO: renamed from: a */
    public final String f24143a;

    /* JADX INFO: renamed from: b */
    public final String f24144b;

    /* JADX INFO: renamed from: c */
    public final String f24145c;

    /* JADX INFO: renamed from: d */
    public final long f24146d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C4510f4 f24147e;

    public C4594m4(C4510f4 c4510f4, String str, long j2, C4546i4 c4546i4) {
        this.f24147e = c4510f4;
        C2622l.m5359e(str);
        C2622l.m5339a(j2 > 0);
        this.f24143a = str.concat(":start");
        this.f24144b = str.concat(":count");
        this.f24145c = str.concat(":value");
        this.f24146d = j2;
    }

    /* JADX INFO: renamed from: a */
    public final void m10648a() {
        this.f24147e.mo10381b();
        long jMo5623c = this.f24147e.f24476a.f24541o.mo5623c();
        SharedPreferences.Editor editorEdit = this.f24147e.m10538w().edit();
        editorEdit.remove(this.f24144b);
        editorEdit.remove(this.f24145c);
        editorEdit.putLong(this.f24143a, jMo5623c);
        editorEdit.apply();
    }
}
