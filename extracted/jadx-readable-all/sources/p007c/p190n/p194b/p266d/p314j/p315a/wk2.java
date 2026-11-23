package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 {

    /* JADX INFO: renamed from: a */
    public final String f21254a;

    /* JADX INFO: renamed from: b */
    public final boolean f21255b;

    public wk2(String str, boolean z) {
        this.f21254a = str;
        this.f21255b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == wk2.class) {
            wk2 wk2Var = (wk2) obj;
            if (TextUtils.equals(this.f21254a, wk2Var.f21254a) && this.f21255b == wk2Var.f21255b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21254a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f21255b ? 1237 : 1231);
    }
}
