package p636z0.p725k.p727d;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.d.b, reason: use source file name */
/* JADX INFO: compiled from: LocusIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class LocusIdCompat {

    /* JADX INFO: renamed from: a */
    public final String f37816a;

    /* JADX INFO: renamed from: b */
    public final LocusId f37817b;

    public LocusIdCompat(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f37816a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f37817b = new LocusId(str);
        } else {
            this.f37817b = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f37816a;
        if (str == null) {
            return locusIdCompat.f37816a == null;
        }
        return str.equals(locusIdCompat.f37816a);
    }

    public int hashCode() {
        String str = this.f37816a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LocusIdCompat[");
        sbM1556G.append(this.f37816a.length() + "_chars");
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
