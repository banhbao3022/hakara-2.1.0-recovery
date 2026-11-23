package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.bg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2879bg {

    /* JADX INFO: renamed from: a */
    public static final Comparator<byte[]> f12597a = new C2916cf();

    /* JADX INFO: renamed from: b */
    public final List<byte[]> f12598b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<byte[]> f12599c = new ArrayList(64);

    /* JADX INFO: renamed from: d */
    public int f12600d = 0;

    public C2879bg(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized byte[] m5989a(int i) {
        for (int i2 = 0; i2 < this.f12599c.size(); i2++) {
            byte[] bArr = this.f12599c.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f12600d -= length;
                this.f12599c.remove(i2);
                this.f12598b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5990b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f12598b.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f12599c, bArr, f12597a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f12599c.add(iBinarySearch, bArr);
                this.f12600d += length;
                synchronized (this) {
                    while (this.f12600d > 4096) {
                        byte[] bArrRemove = this.f12598b.remove(0);
                        this.f12599c.remove(bArrRemove);
                        this.f12600d -= bArrRemove.length;
                    }
                }
            }
        }
    }
}
