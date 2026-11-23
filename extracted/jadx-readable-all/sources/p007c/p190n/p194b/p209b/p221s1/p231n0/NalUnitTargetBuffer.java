package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.Arrays;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.w, reason: use source file name */
/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class NalUnitTargetBuffer {

    /* JADX INFO: renamed from: a */
    public final int f8431a;

    /* JADX INFO: renamed from: b */
    public boolean f8432b;

    /* JADX INFO: renamed from: c */
    public boolean f8433c;

    /* JADX INFO: renamed from: d */
    public byte[] f8434d;

    /* JADX INFO: renamed from: e */
    public int f8435e;

    public NalUnitTargetBuffer(int i, int i2) {
        this.f8431a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f8434d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m3900a(byte[] bArr, int i, int i2) {
        if (this.f8432b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f8434d;
            int length = bArr2.length;
            int i4 = this.f8435e;
            if (length < i4 + i3) {
                this.f8434d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f8434d, this.f8435e, i3);
            this.f8435e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m3901b(int i) {
        if (!this.f8432b) {
            return false;
        }
        this.f8435e -= i;
        this.f8432b = false;
        this.f8433c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m3902c() {
        this.f8432b = false;
        this.f8433c = false;
    }

    /* JADX INFO: renamed from: d */
    public void m3903d(int i) {
        C2096e.m4570f(!this.f8432b);
        boolean z = i == this.f8431a;
        this.f8432b = z;
        if (z) {
            this.f8435e = 3;
            this.f8433c = false;
        }
    }
}
