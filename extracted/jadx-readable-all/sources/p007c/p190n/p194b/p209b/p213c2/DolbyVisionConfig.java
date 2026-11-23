package p007c.p190n.p194b.p209b.p213c2;

import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.c2.l, reason: use source file name */
/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class DolbyVisionConfig {

    /* JADX INFO: renamed from: a */
    public final String f6445a;

    public DolbyVisionConfig(int i, int i2, String str) {
        this.f6445a = str;
    }

    /* JADX INFO: renamed from: a */
    public static DolbyVisionConfig m3258a(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.m3195E(2);
        int iM3214s = parsableByteArray.m3214s();
        int i = iM3214s >> 1;
        int iM3214s2 = ((parsableByteArray.m3214s() >> 3) & 31) | ((iM3214s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iM3214s2 >= 10 ? "." : ".0");
        sb.append(iM3214s2);
        return new DolbyVisionConfig(i, iM3214s2, sb.toString());
    }
}
