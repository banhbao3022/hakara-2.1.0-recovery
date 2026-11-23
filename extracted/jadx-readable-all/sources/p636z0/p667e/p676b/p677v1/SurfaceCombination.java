package p636z0.p667e.p676b.p677v1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z0.e.b.v1.j1, reason: use source file name */
/* JADX INFO: compiled from: SurfaceCombination.java */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceCombination {

    /* JADX INFO: renamed from: a */
    public final List<SurfaceConfig> f36179a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m15382a(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else {
                    if (i3 == iArr[i4]) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m15382a(list, i, iArr, i2 + 1);
            }
        }
    }
}
