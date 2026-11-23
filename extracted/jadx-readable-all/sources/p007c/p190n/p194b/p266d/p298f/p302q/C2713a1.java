package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.a1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713a1 {

    /* JADX INFO: renamed from: a */
    public static final Uri f11785a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: b */
    public final String f11786b;

    /* JADX INFO: renamed from: c */
    public final String f11787c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f11788d;

    /* JADX INFO: renamed from: e */
    public final int f11789e;

    /* JADX INFO: renamed from: f */
    public final boolean f11790f;

    public C2713a1(ComponentName componentName, int i) {
        this.f11786b = null;
        this.f11787c = null;
        Objects.requireNonNull(componentName, "null reference");
        this.f11788d = componentName;
        this.f11789e = i;
        this.f11790f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2713a1)) {
            return false;
        }
        C2713a1 c2713a1 = (C2713a1) obj;
        return C2622l.m5459y(this.f11786b, c2713a1.f11786b) && C2622l.m5459y(this.f11787c, c2713a1.f11787c) && C2622l.m5459y(this.f11788d, c2713a1.f11788d) && this.f11789e == c2713a1.f11789e && this.f11790f == c2713a1.f11790f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11786b, this.f11787c, this.f11788d, Integer.valueOf(this.f11789e), Boolean.valueOf(this.f11790f)});
    }

    public final String toString() {
        String str = this.f11786b;
        if (str != null) {
            return str;
        }
        Objects.requireNonNull(this.f11788d, "null reference");
        return this.f11788d.flattenToString();
    }

    public C2713a1(String str, String str2, int i) {
        this(str, "com.google.android.gms", i, false);
    }

    public C2713a1(String str, String str2, int i, boolean z) {
        C2622l.m5359e(str);
        this.f11786b = str;
        C2622l.m5359e(str2);
        this.f11787c = str2;
        this.f11788d = null;
        this.f11789e = i;
        this.f11790f = z;
    }
}
