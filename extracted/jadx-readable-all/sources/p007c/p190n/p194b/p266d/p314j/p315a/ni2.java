package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ni2 implements rh2 {

    /* JADX INFO: renamed from: b */
    public int f17121b = -1;

    /* JADX INFO: renamed from: c */
    public int f17122c = -1;

    /* JADX INFO: renamed from: d */
    public int f17123d = 0;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f17124e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f17125f;

    /* JADX INFO: renamed from: g */
    public boolean f17126g;

    public ni2() {
        ByteBuffer byteBuffer = rh2.f18836a;
        this.f17124e = byteBuffer;
        this.f17125f = byteBuffer;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: a */
    public final boolean mo7501a() {
        int i = this.f17123d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: b */
    public final int mo7502b() {
        return this.f17122c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[ADDED_TO_REGION, LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_START, PHI: r0
  0x0046: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0044, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[ADDED_TO_REGION, LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_START, PHI: r0
  0x0067: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0042, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[ADDED_TO_REGION, LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0
  0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_END] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: c */
    public final void mo7503c(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.f17123d;
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 3) {
                if (i4 != 1073741824) {
                    throw new IllegalStateException();
                }
                i = i3 / 2;
            }
            if (this.f17124e.capacity() < i) {
                this.f17124e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f17124e.clear();
            }
            i2 = this.f17123d;
            if (i2 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f17124e.put(byteBuffer.get(iPosition + 1));
                    this.f17124e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i2 != 3) {
                while (iPosition < iLimit) {
                    this.f17124e.put((byte) 0);
                    this.f17124e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i2 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f17124e.put(byteBuffer.get(iPosition + 2));
                    this.f17124e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f17124e.flip();
            this.f17125f = this.f17124e;
        }
        i3 /= 3;
        i = i3 + i3;
        if (this.f17124e.capacity() < i) {
            this.f17124e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f17124e.clear();
        }
        i2 = this.f17123d;
        if (i2 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f17124e.put(byteBuffer.get(iPosition + 1));
                this.f17124e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i2 != 3) {
            while (iPosition < iLimit) {
                this.f17124e.put((byte) 0);
                this.f17124e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i2 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f17124e.put(byteBuffer.get(iPosition + 2));
                this.f17124e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f17124e.flip();
        this.f17125f = this.f17124e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: d */
    public final void mo7504d() {
        this.f17126g = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: e */
    public final int mo7505e() {
        return 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo7506f() {
        ByteBuffer byteBuffer = this.f17125f;
        this.f17125f = rh2.f18836a;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: g */
    public final boolean mo7507g() {
        return this.f17126g && this.f17125f == rh2.f18836a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: h */
    public final void mo7508h() {
        mo7509i();
        this.f17124e = rh2.f18836a;
        this.f17121b = -1;
        this.f17122c = -1;
        this.f17123d = 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: i */
    public final void mo7509i() {
        this.f17125f = rh2.f18836a;
        this.f17126g = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: j */
    public final boolean mo7510j(int i, int i2, int i3) throws qh2 {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new qh2(i, i2, i3);
        }
        if (this.f17121b == i && this.f17122c == i2 && this.f17123d == i3) {
            return false;
        }
        this.f17121b = i;
        this.f17122c = i2;
        this.f17123d = i3;
        if (i3 != 2) {
            return true;
        }
        this.f17124e = rh2.f18836a;
        return true;
    }
}
