package p007c.p114h.p144e;

import android.util.SparseArray;

/* JADX INFO: renamed from: c.h.e.b, reason: use source file name */
/* JADX INFO: compiled from: LandmarkEngine.java */
/* JADX INFO: loaded from: classes.dex */
public final class LandmarkEngine {

    /* JADX INFO: renamed from: a */
    public final Object f4264a = new Object();

    /* JADX INFO: renamed from: b */
    public final SparseArray<OneFace> f4265b = new SparseArray<>();

    /* JADX INFO: renamed from: c.h.e.b$b */
    /* JADX INFO: compiled from: LandmarkEngine.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static LandmarkEngine f4266a = new LandmarkEngine(null);
    }

    public LandmarkEngine(a aVar) {
    }

    /* JADX INFO: renamed from: a */
    public void m2191a(float[] fArr, int i) {
        if (fArr == null || i >= this.f4265b.size() || this.f4265b.get(i) == null || this.f4265b.get(i).f4273g.length + 16 > fArr.length) {
            return;
        }
        float[] fArr2 = this.f4265b.get(i).f4273g;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        float[] fArr3 = new float[2];
        FacePointsUtils.m2190a(fArr3, fArr[196], fArr[197], fArr[204], fArr[205]);
        fArr[212] = fArr3[0];
        fArr[213] = fArr3[1];
        FacePointsUtils.m2190a(fArr3, fArr[70], fArr[71], fArr[130], fArr[131]);
        fArr[214] = fArr3[0];
        fArr[215] = fArr3[1];
        FacePointsUtils.m2190a(fArr3, fArr[80], fArr[81], fArr[140], fArr[141]);
        fArr[216] = fArr3[0];
        fArr[217] = fArr3[1];
        fArr[220] = (fArr[86] * 2.0f) - fArr[98];
        fArr[221] = (fArr[87] * 2.0f) - fArr[99];
        FacePointsUtils.m2190a(fArr3, fArr[68], fArr[69], fArr[220], fArr[221]);
        fArr[218] = fArr3[0];
        fArr[219] = fArr3[1];
        FacePointsUtils.m2190a(fArr3, fArr[82], fArr[83], fArr[220], fArr[221]);
        fArr[222] = fArr3[0];
        fArr[223] = fArr3[1];
        FacePointsUtils.m2190a(fArr3, fArr[8], fArr[9], fArr[164], fArr[165]);
        fArr[224] = fArr3[0];
        fArr[225] = fArr3[1];
        FacePointsUtils.m2190a(fArr3, fArr[56], fArr[57], fArr[166], fArr[167]);
        fArr[226] = fArr3[0];
        fArr[227] = fArr3[1];
    }

    /* JADX INFO: renamed from: b */
    public int m2192b() {
        return this.f4265b.size();
    }

    /* JADX INFO: renamed from: c */
    public boolean m2193c() {
        boolean z;
        synchronized (this.f4264a) {
            z = this.f4265b.size() > 0;
        }
        return z;
    }
}
