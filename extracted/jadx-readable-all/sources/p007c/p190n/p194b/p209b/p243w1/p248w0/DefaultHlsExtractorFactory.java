package p007c.p190n.p194b.p209b.p243w1.p248w0;

import java.util.List;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.h, reason: use source file name */
/* JADX INFO: compiled from: DefaultHlsExtractorFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {

    /* JADX INFO: renamed from: b */
    public static final int[] f9355b = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: c */
    public final int f9356c;

    /* JADX INFO: renamed from: d */
    public final boolean f9357d;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m4297a(int i, List<Integer> list) {
        int[] iArr = f9355b;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    public DefaultHlsExtractorFactory(int i, boolean z) {
        this.f9356c = i;
        this.f9357d = z;
    }
}
