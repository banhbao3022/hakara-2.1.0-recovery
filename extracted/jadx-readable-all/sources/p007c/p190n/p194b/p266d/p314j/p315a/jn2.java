package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jn2 {

    /* JADX INFO: renamed from: a */
    public final Uri f15667a;

    /* JADX INFO: renamed from: b */
    public final long f15668b;

    /* JADX INFO: renamed from: c */
    public final long f15669c;

    /* JADX INFO: renamed from: d */
    public final long f15670d;

    public jn2(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i) {
        C2622l.m5366f1(j2 >= 0);
        C2622l.m5366f1(j3 >= 0);
        C2622l.m5366f1(j4 > 0 || j4 == -1);
        this.f15667a = uri;
        this.f15668b = j2;
        this.f15669c = j3;
        this.f15670d = j4;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15667a);
        String string = Arrays.toString((byte[]) null);
        long j2 = this.f15668b;
        long j3 = this.f15669c;
        long j4 = this.f15670d;
        StringBuilder sb = new StringBuilder(outline.m1578b(strValueOf.length(), 93, String.valueOf(string).length(), "null".length()));
        outline.m1572W(sb, "DataSpec[", strValueOf, ", ", string);
        outline.m1570U(sb, ", ", j2, ", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
