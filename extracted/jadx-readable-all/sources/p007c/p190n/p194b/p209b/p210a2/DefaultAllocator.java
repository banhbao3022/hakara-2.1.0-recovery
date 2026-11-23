package p007c.p190n.p194b.p209b.p210a2;

import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.q, reason: use source file name */
/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultAllocator implements Allocator {

    /* JADX INFO: renamed from: a */
    public final boolean f6157a;

    /* JADX INFO: renamed from: b */
    public final int f6158b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6159c;

    /* JADX INFO: renamed from: d */
    public final Allocation[] f6160d;

    /* JADX INFO: renamed from: e */
    public int f6161e;

    /* JADX INFO: renamed from: f */
    public int f6162f;

    /* JADX INFO: renamed from: g */
    public int f6163g;

    /* JADX INFO: renamed from: h */
    public Allocation[] f6164h;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3006a(Allocation[] allocationArr) {
        int i = this.f6163g;
        int length = allocationArr.length + i;
        Allocation[] allocationArr2 = this.f6164h;
        if (length >= allocationArr2.length) {
            this.f6164h = (Allocation[]) Arrays.copyOf(allocationArr2, Math.max(allocationArr2.length * 2, i + allocationArr.length));
        }
        for (Allocation allocation : allocationArr) {
            Allocation[] allocationArr3 = this.f6164h;
            int i2 = this.f6163g;
            this.f6163g = i2 + 1;
            allocationArr3[i2] = allocation;
        }
        this.f6162f -= allocationArr.length;
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3007b(int i) {
        boolean z = i < this.f6161e;
        this.f6161e = i;
        if (z) {
            m3008c();
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m3008c() {
        int i = 0;
        int iMax = Math.max(0, Util6.m3119g(this.f6161e, this.f6158b) - this.f6162f);
        int i2 = this.f6163g;
        if (iMax >= i2) {
            return;
        }
        if (this.f6159c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                Allocation allocation = this.f6164h[i];
                Objects.requireNonNull(allocation);
                if (allocation.f5976a == this.f6159c) {
                    i++;
                } else {
                    Allocation allocation2 = this.f6164h[i3];
                    Objects.requireNonNull(allocation2);
                    if (allocation2.f5976a != this.f6159c) {
                        i3--;
                    } else {
                        Allocation[] allocationArr = this.f6164h;
                        allocationArr[i] = allocation2;
                        allocationArr[i3] = allocation;
                        i3--;
                        i++;
                    }
                }
            }
            iMax = Math.max(iMax, i);
            if (iMax >= this.f6163g) {
                return;
            }
        }
        Arrays.fill(this.f6164h, iMax, this.f6163g, (Object) null);
        this.f6163g = iMax;
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        C2096e.m4566b(i > 0);
        C2096e.m4566b(i2 >= 0);
        this.f6157a = z;
        this.f6158b = i;
        this.f6163g = i2;
        this.f6164h = new Allocation[i2 + 100];
        if (i2 > 0) {
            this.f6159c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f6164h[i3] = new Allocation(this.f6159c, i3 * i);
            }
        } else {
            this.f6159c = null;
        }
        this.f6160d = new Allocation[1];
    }
}
