package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.l4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4582l4 {

    /* JADX INFO: renamed from: a */
    public final String f24109a;

    /* JADX INFO: renamed from: b */
    public boolean f24110b;

    /* JADX INFO: renamed from: c */
    public String f24111c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C4510f4 f24112d;

    public C4582l4(C4510f4 c4510f4, String str, String str2) {
        this.f24112d = c4510f4;
        C2622l.m5359e(str);
        this.f24109a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m10639a() {
        if (!this.f24110b) {
            this.f24110b = true;
            this.f24111c = this.f24112d.m10538w().getString(this.f24109a, null);
        }
        return this.f24111c;
    }

    /* JADX INFO: renamed from: b */
    public final void m10640b(String str) {
        SharedPreferences.Editor editorEdit = this.f24112d.m10538w().edit();
        editorEdit.putString(this.f24109a, str);
        editorEdit.apply();
        this.f24111c = str;
    }
}
