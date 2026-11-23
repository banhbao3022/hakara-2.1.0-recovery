package p007c.p190n.p194b.p209b.p252x1.p257r;

import android.text.TextUtils;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.r.b, reason: use source file name */
/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes.dex */
public final class SsaDialogueFormat {

    /* JADX INFO: renamed from: a */
    public final int f10013a;

    /* JADX INFO: renamed from: b */
    public final int f10014b;

    /* JADX INFO: renamed from: c */
    public final int f10015c;

    /* JADX INFO: renamed from: d */
    public final int f10016d;

    /* JADX INFO: renamed from: e */
    public final int f10017e;

    public SsaDialogueFormat(int i, int i2, int i3, int i4, int i5) {
        this.f10013a = i;
        this.f10014b = i2;
        this.f10015c = i3;
        this.f10016d = i4;
        this.f10017e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX INFO: renamed from: a */
    public static SsaDialogueFormat m4445a(String str) {
        byte b;
        C2096e.m4566b(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strM3111T = Util6.m3111T(strArrSplit[i5].trim());
            strM3111T.hashCode();
            switch (strM3111T) {
                case "end":
                    b = 0;
                    break;
                case "text":
                    b = 1;
                    break;
                case "start":
                    b = 2;
                    break;
                case "style":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i2 = i5;
            } else if (b == 1) {
                i4 = i5;
            } else if (b == 2) {
                i = i5;
            } else if (b == 3) {
                i3 = i5;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i, i2, i3, i4, strArrSplit.length);
    }
}
