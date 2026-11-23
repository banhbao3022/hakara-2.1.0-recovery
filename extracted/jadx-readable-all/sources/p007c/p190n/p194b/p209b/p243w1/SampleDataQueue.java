package p007c.p190n.p194b.p209b.p243w1;

import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p210a2.Allocation;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DefaultAllocator;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.w1.k0, reason: use source file name */
/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes.dex */
public class SampleDataQueue {

    /* JADX INFO: renamed from: a */
    public final Allocator f8968a;

    /* JADX INFO: renamed from: b */
    public final int f8969b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f8970c;

    /* JADX INFO: renamed from: d */
    public a f8971d;

    /* JADX INFO: renamed from: e */
    public a f8972e;

    /* JADX INFO: renamed from: f */
    public a f8973f;

    /* JADX INFO: renamed from: g */
    public long f8974g;

    /* JADX INFO: renamed from: c.n.b.b.w1.k0$a */
    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f8975a;

        /* JADX INFO: renamed from: b */
        public final long f8976b;

        /* JADX INFO: renamed from: c */
        public boolean f8977c;

        /* JADX INFO: renamed from: d */
        public Allocation f8978d;

        /* JADX INFO: renamed from: e */
        public a f8979e;

        public a(long j2, int i) {
            this.f8975a = j2;
            this.f8976b = j2 + ((long) i);
        }

        /* JADX INFO: renamed from: a */
        public int m4142a(long j2) {
            return ((int) (j2 - this.f8975a)) + this.f8978d.f5977b;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.f8968a = allocator;
        int i = ((DefaultAllocator) allocator).f6158b;
        this.f8969b = i;
        this.f8970c = new ParsableByteArray(32);
        a aVar = new a(0L, i);
        this.f8971d = aVar;
        this.f8972e = aVar;
        this.f8973f = aVar;
    }

    /* JADX INFO: renamed from: e */
    public static a m4136e(a aVar, long j2, ByteBuffer byteBuffer, int i) {
        while (j2 >= aVar.f8976b) {
            aVar = aVar.f8979e;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVar.f8976b - j2));
            byteBuffer.put(aVar.f8978d.f5976a, aVar.m4142a(j2), iMin);
            i -= iMin;
            j2 += (long) iMin;
            if (j2 == aVar.f8976b) {
                aVar = aVar.f8979e;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: f */
    public static a m4137f(a aVar, long j2, byte[] bArr, int i) {
        while (j2 >= aVar.f8976b) {
            aVar = aVar.f8979e;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVar.f8976b - j2));
            System.arraycopy(aVar.f8978d.f5976a, aVar.m4142a(j2), bArr, i - i2, iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == aVar.f8976b) {
                aVar = aVar.f8979e;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4138a(a aVar) {
        if (aVar.f8977c) {
            a aVar2 = this.f8973f;
            int i = (((int) (aVar2.f8975a - aVar.f8975a)) / this.f8969b) + (aVar2.f8977c ? 1 : 0);
            Allocation[] allocationArr = new Allocation[i];
            int i2 = 0;
            while (i2 < i) {
                allocationArr[i2] = aVar.f8978d;
                aVar.f8978d = null;
                a aVar3 = aVar.f8979e;
                aVar.f8979e = null;
                i2++;
                aVar = aVar3;
            }
            ((DefaultAllocator) this.f8968a).m3006a(allocationArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4139b(long j2) {
        a aVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8971d;
            if (j2 < aVar.f8976b) {
                break;
            }
            Allocator allocator = this.f8968a;
            Allocation allocation = aVar.f8978d;
            DefaultAllocator defaultAllocator = (DefaultAllocator) allocator;
            synchronized (defaultAllocator) {
                Allocation[] allocationArr = defaultAllocator.f6160d;
                allocationArr[0] = allocation;
                defaultAllocator.m3006a(allocationArr);
            }
            a aVar2 = this.f8971d;
            aVar2.f8978d = null;
            a aVar3 = aVar2.f8979e;
            aVar2.f8979e = null;
            this.f8971d = aVar3;
        }
        if (this.f8972e.f8975a < aVar.f8975a) {
            this.f8972e = aVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4140c(int i) {
        long j2 = this.f8974g + ((long) i);
        this.f8974g = j2;
        a aVar = this.f8973f;
        if (j2 == aVar.f8976b) {
            this.f8973f = aVar.f8979e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m4141d(int i) {
        Allocation allocation;
        a aVar = this.f8973f;
        if (!aVar.f8977c) {
            DefaultAllocator defaultAllocator = (DefaultAllocator) this.f8968a;
            synchronized (defaultAllocator) {
                defaultAllocator.f6162f++;
                int i2 = defaultAllocator.f6163g;
                if (i2 > 0) {
                    Allocation[] allocationArr = defaultAllocator.f6164h;
                    int i3 = i2 - 1;
                    defaultAllocator.f6163g = i3;
                    allocation = allocationArr[i3];
                    Objects.requireNonNull(allocation);
                    defaultAllocator.f6164h[defaultAllocator.f6163g] = null;
                } else {
                    allocation = new Allocation(new byte[defaultAllocator.f6158b], 0);
                }
            }
            a aVar2 = new a(this.f8973f.f8976b, this.f8969b);
            aVar.f8978d = allocation;
            aVar.f8979e = aVar2;
            aVar.f8977c = true;
        }
        return Math.min(i, (int) (this.f8973f.f8976b - this.f8974g));
    }
}
