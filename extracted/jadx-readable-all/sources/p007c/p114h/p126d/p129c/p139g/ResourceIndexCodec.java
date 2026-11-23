package p007c.p114h.p126d.p129c.p139g;

import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.h.d.c.g.g, reason: use source file name */
/* JADX INFO: compiled from: ResourceIndexCodec.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceIndexCodec extends ResourceCodec {

    /* JADX INFO: renamed from: e */
    public int[] f4203e;

    /* JADX INFO: renamed from: f */
    public int[] f4204f;

    public ResourceIndexCodec(String str, String str2) {
        super(str, str2);
    }

    @Override // p007c.p114h.p126d.p129c.p139g.ResourceCodec
    /* JADX INFO: renamed from: c */
    public void mo2168c() throws IOException {
        super.mo2168c();
        Iterator<String> it = this.f4198c.keySet().iterator();
        int i = 0;
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(m2171e(it.next()), iMax);
        }
        int i2 = iMax + 1;
        this.f4203e = new int[i2];
        this.f4204f = new int[i2];
        while (true) {
            int[] iArr = this.f4203e;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = -1;
            this.f4204f[i] = -1;
            i++;
        }
        for (Map.Entry<String, Pair<Integer, Integer>> entry : this.f4198c.entrySet()) {
            int iM2171e = m2171e(entry.getKey());
            if (iM2171e >= 0) {
                int[] iArr2 = this.f4203e;
                if (iM2171e < iArr2.length) {
                    iArr2[iM2171e] = ((Integer) entry.getValue().first).intValue();
                    this.f4204f[iM2171e] = ((Integer) entry.getValue().second).intValue();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2171e(String str) {
        try {
            return Integer.parseInt(str.substring(str.length() - 7, str.length() - 4));
        } catch (NumberFormatException e) {
            Log.e("ResourceCodec", "getIndex: ", e);
            return 0;
        }
    }
}
