package p007c.p190n.p194b.p209b.p243w1.p244t0;

import android.net.Uri;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.t0.a, reason: use source file name */
/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState {

    /* JADX INFO: renamed from: a */
    public static final AdPlaybackState f9074a = new AdPlaybackState(null, new long[0], null, 0, -9223372036854775807L);

    /* JADX INFO: renamed from: b */
    public final Object f9075b;

    /* JADX INFO: renamed from: c */
    public final int f9076c;

    /* JADX INFO: renamed from: d */
    public final long[] f9077d;

    /* JADX INFO: renamed from: e */
    public final a[] f9078e;

    /* JADX INFO: renamed from: f */
    public final long f9079f;

    /* JADX INFO: renamed from: g */
    public final long f9080g;

    /* JADX INFO: renamed from: c.n.b.b.w1.t0.a$a */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9081a;

        /* JADX INFO: renamed from: b */
        public final Uri[] f9082b;

        /* JADX INFO: renamed from: c */
        public final int[] f9083c;

        /* JADX INFO: renamed from: d */
        public final long[] f9084d;

        public a() {
            C2096e.m4566b(true);
            this.f9081a = -1;
            this.f9083c = new int[0];
            this.f9082b = new Uri[0];
            this.f9084d = new long[0];
        }

        /* JADX INFO: renamed from: a */
        public int m4194a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f9083c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        /* JADX INFO: renamed from: b */
        public boolean m4195b() {
            return this.f9081a == -1 || m4194a(-1) < this.f9081a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9081a == aVar.f9081a && Arrays.equals(this.f9082b, aVar.f9082b) && Arrays.equals(this.f9083c, aVar.f9083c) && Arrays.equals(this.f9084d, aVar.f9084d);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f9084d) + ((Arrays.hashCode(this.f9083c) + (((this.f9081a * 31) + Arrays.hashCode(this.f9082b)) * 31)) * 31);
        }
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, jArr, null, 0L, -9223372036854775807L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return Util6.m3113a(this.f9075b, adPlaybackState.f9075b) && this.f9076c == adPlaybackState.f9076c && this.f9079f == adPlaybackState.f9079f && this.f9080g == adPlaybackState.f9080g && Arrays.equals(this.f9077d, adPlaybackState.f9077d) && Arrays.equals(this.f9078e, adPlaybackState.f9078e);
    }

    public int hashCode() {
        int i = this.f9076c * 31;
        Object obj = this.f9075b;
        return Arrays.hashCode(this.f9078e) + ((Arrays.hashCode(this.f9077d) + ((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f9079f)) * 31) + ((int) this.f9080g)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("AdPlaybackState(adsId=");
        sbM1556G.append(this.f9075b);
        sbM1556G.append(", adResumePositionUs=");
        sbM1556G.append(this.f9079f);
        sbM1556G.append(", adGroups=[");
        for (int i = 0; i < this.f9078e.length; i++) {
            sbM1556G.append("adGroup(timeUs=");
            sbM1556G.append(this.f9077d[i]);
            sbM1556G.append(", ads=[");
            for (int i2 = 0; i2 < this.f9078e[i].f9083c.length; i2++) {
                sbM1556G.append("ad(state=");
                int i3 = this.f9078e[i].f9083c[i2];
                if (i3 == 0) {
                    sbM1556G.append('_');
                } else if (i3 == 1) {
                    sbM1556G.append('R');
                } else if (i3 == 2) {
                    sbM1556G.append('S');
                } else if (i3 == 3) {
                    sbM1556G.append('P');
                } else if (i3 != 4) {
                    sbM1556G.append('?');
                } else {
                    sbM1556G.append('!');
                }
                sbM1556G.append(", durationUs=");
                sbM1556G.append(this.f9078e[i].f9084d[i2]);
                sbM1556G.append(')');
                if (i2 < this.f9078e[i].f9083c.length - 1) {
                    sbM1556G.append(", ");
                }
            }
            sbM1556G.append("])");
            if (i < this.f9078e.length - 1) {
                sbM1556G.append(", ");
            }
        }
        sbM1556G.append("])");
        return sbM1556G.toString();
    }

    public AdPlaybackState(Object obj, long[] jArr, a[] aVarArr, long j2, long j3) {
        this.f9075b = obj;
        this.f9077d = jArr;
        this.f9079f = j2;
        this.f9080g = j3;
        int length = jArr.length;
        this.f9076c = length;
        a[] aVarArr2 = new a[length];
        for (int i = 0; i < this.f9076c; i++) {
            aVarArr2[i] = new a();
        }
        this.f9078e = aVarArr2;
    }
}
