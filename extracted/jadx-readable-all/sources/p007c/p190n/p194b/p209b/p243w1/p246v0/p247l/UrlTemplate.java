package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import java.util.Locale;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.m, reason: use source file name */
/* JADX INFO: compiled from: UrlTemplate.java */
/* JADX INFO: loaded from: classes.dex */
public final class UrlTemplate {

    /* JADX INFO: renamed from: a */
    public final String[] f9331a;

    /* JADX INFO: renamed from: b */
    public final int[] f9332b;

    /* JADX INFO: renamed from: c */
    public final String[] f9333c;

    /* JADX INFO: renamed from: d */
    public final int f9334d;

    public UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f9331a = strArr;
        this.f9332b = iArr;
        this.f9333c = strArr2;
        this.f9334d = i;
    }

    /* JADX INFO: renamed from: a */
    public String m4295a(String str, long j2, int i, long j3) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f9334d;
            if (i2 >= i3) {
                sb.append(this.f9331a[i3]);
                return sb.toString();
            }
            sb.append(this.f9331a[i2]);
            int[] iArr = this.f9332b;
            if (iArr[i2] == 1) {
                sb.append(str);
            } else if (iArr[i2] == 2) {
                sb.append(String.format(Locale.US, this.f9333c[i2], Long.valueOf(j2)));
            } else if (iArr[i2] == 3) {
                sb.append(String.format(Locale.US, this.f9333c[i2], Integer.valueOf(i)));
            } else if (iArr[i2] == 4) {
                sb.append(String.format(Locale.US, this.f9333c[i2], Long.valueOf(j3)));
            }
            i2++;
        }
    }
}
