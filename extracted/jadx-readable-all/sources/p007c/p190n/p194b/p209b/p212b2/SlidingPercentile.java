package p007c.p190n.p194b.p209b.p212b2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: c.n.b.b.b2.a0, reason: use source file name */
/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes.dex */
public class SlidingPercentile {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f6266a = 0;

    /* JADX INFO: renamed from: b */
    public final int f6267b;

    /* JADX INFO: renamed from: f */
    public int f6271f;

    /* JADX INFO: renamed from: g */
    public int f6272g;

    /* JADX INFO: renamed from: h */
    public int f6273h;

    /* JADX INFO: renamed from: d */
    public final b[] f6269d = new b[5];

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f6268c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public int f6270e = -1;

    /* JADX INFO: renamed from: c.n.b.b.b2.a0$b */
    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f6274a;

        /* JADX INFO: renamed from: b */
        public int f6275b;

        /* JADX INFO: renamed from: c */
        public float f6276c;

        public b() {
        }

        public b(a aVar) {
        }
    }

    public SlidingPercentile(int i) {
        this.f6267b = i;
    }

    /* JADX INFO: renamed from: a */
    public void m3057a(int i, float f) {
        b bVar;
        if (this.f6270e != 1) {
            Collections.sort(this.f6268c, new Comparator() { // from class: c.n.b.b.b2.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i2 = SlidingPercentile.f6266a;
                    return ((SlidingPercentile.b) obj).f6274a - ((SlidingPercentile.b) obj2).f6274a;
                }
            });
            this.f6270e = 1;
        }
        int i2 = this.f6273h;
        if (i2 > 0) {
            b[] bVarArr = this.f6269d;
            int i3 = i2 - 1;
            this.f6273h = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new b(null);
        }
        int i4 = this.f6271f;
        this.f6271f = i4 + 1;
        bVar.f6274a = i4;
        bVar.f6275b = i;
        bVar.f6276c = f;
        this.f6268c.add(bVar);
        this.f6272g += i;
        while (true) {
            int i5 = this.f6272g;
            int i6 = this.f6267b;
            if (i5 <= i6) {
                return;
            }
            int i7 = i5 - i6;
            b bVar2 = this.f6268c.get(0);
            int i8 = bVar2.f6275b;
            if (i8 <= i7) {
                this.f6272g -= i8;
                this.f6268c.remove(0);
                int i9 = this.f6273h;
                if (i9 < 5) {
                    b[] bVarArr2 = this.f6269d;
                    this.f6273h = i9 + 1;
                    bVarArr2[i9] = bVar2;
                }
            } else {
                bVar2.f6275b = i8 - i7;
                this.f6272g -= i7;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public float m3058b(float f) {
        if (this.f6270e != 0) {
            Collections.sort(this.f6268c, new Comparator() { // from class: c.n.b.b.b2.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i = SlidingPercentile.f6266a;
                    return Float.compare(((SlidingPercentile.b) obj).f6276c, ((SlidingPercentile.b) obj2).f6276c);
                }
            });
            this.f6270e = 0;
        }
        float f2 = f * this.f6272g;
        int i = 0;
        for (int i2 = 0; i2 < this.f6268c.size(); i2++) {
            b bVar = this.f6268c.get(i2);
            i += bVar.f6275b;
            if (i >= f2) {
                return bVar.f6276c;
            }
        }
        if (this.f6268c.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f6268c;
        return arrayList.get(arrayList.size() - 1).f6276c;
    }
}
