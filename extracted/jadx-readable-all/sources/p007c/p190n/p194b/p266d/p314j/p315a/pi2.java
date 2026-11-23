package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pi2 implements rh2 {

    /* JADX INFO: renamed from: d */
    public oi2 f17986d;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f17989g;

    /* JADX INFO: renamed from: h */
    public ShortBuffer f17990h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f17991i;

    /* JADX INFO: renamed from: j */
    public long f17992j;

    /* JADX INFO: renamed from: k */
    public long f17993k;

    /* JADX INFO: renamed from: l */
    public boolean f17994l;

    /* JADX INFO: renamed from: e */
    public float f17987e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f17988f = 1.0f;

    /* JADX INFO: renamed from: b */
    public int f17984b = -1;

    /* JADX INFO: renamed from: c */
    public int f17985c = -1;

    public pi2() {
        ByteBuffer byteBuffer = rh2.f18836a;
        this.f17989g = byteBuffer;
        this.f17990h = byteBuffer.asShortBuffer();
        this.f17991i = byteBuffer;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: a */
    public final boolean mo7501a() {
        return Math.abs(this.f17987e + (-1.0f)) >= 0.01f || Math.abs(this.f17988f + (-1.0f)) >= 0.01f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: b */
    public final int mo7502b() {
        return this.f17984b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: c */
    public final void mo7503c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17992j += (long) iRemaining;
            oi2 oi2Var = this.f17986d;
            Objects.requireNonNull(oi2Var);
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = oi2Var.f17635b;
            int i2 = iRemaining2 / i;
            int i3 = i * i2;
            oi2Var.m8021b(i2);
            shortBufferAsShortBuffer.get(oi2Var.f17641h, oi2Var.f17650q * oi2Var.f17635b, (i3 + i3) / 2);
            oi2Var.f17650q += i2;
            oi2Var.m8025f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i4 = this.f17986d.f17651r * this.f17984b;
        int i5 = i4 + i4;
        if (i5 > 0) {
            if (this.f17989g.capacity() < i5) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
                this.f17989g = byteBufferOrder;
                this.f17990h = byteBufferOrder.asShortBuffer();
            } else {
                this.f17989g.clear();
                this.f17990h.clear();
            }
            oi2 oi2Var2 = this.f17986d;
            ShortBuffer shortBuffer = this.f17990h;
            Objects.requireNonNull(oi2Var2);
            int iMin = Math.min(shortBuffer.remaining() / oi2Var2.f17635b, oi2Var2.f17651r);
            shortBuffer.put(oi2Var2.f17643j, 0, oi2Var2.f17635b * iMin);
            int i6 = oi2Var2.f17651r - iMin;
            oi2Var2.f17651r = i6;
            short[] sArr = oi2Var2.f17643j;
            int i7 = oi2Var2.f17635b;
            System.arraycopy(sArr, iMin * i7, sArr, 0, i6 * i7);
            this.f17993k += (long) i5;
            this.f17989g.limit(i5);
            this.f17991i = this.f17989g;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: d */
    public final void mo7504d() {
        int i;
        oi2 oi2Var = this.f17986d;
        int i2 = oi2Var.f17650q;
        float f = oi2Var.f17648o;
        float f2 = oi2Var.f17649p;
        int i3 = oi2Var.f17651r + ((int) ((((i2 / (f / f2)) + oi2Var.f17652s) / f2) + 0.5f));
        int i4 = oi2Var.f17638e;
        oi2Var.m8021b(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = oi2Var.f17638e;
            i = i6 + i6;
            int i7 = oi2Var.f17635b;
            if (i5 >= i * i7) {
                break;
            }
            oi2Var.f17641h[(i7 * i2) + i5] = 0;
            i5++;
        }
        oi2Var.f17650q += i;
        oi2Var.m8025f();
        if (oi2Var.f17651r > i3) {
            oi2Var.f17651r = i3;
        }
        oi2Var.f17650q = 0;
        oi2Var.f17653t = 0;
        oi2Var.f17652s = 0;
        this.f17994l = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: e */
    public final int mo7505e() {
        return 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo7506f() {
        ByteBuffer byteBuffer = this.f17991i;
        this.f17991i = rh2.f18836a;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: g */
    public final boolean mo7507g() {
        oi2 oi2Var;
        return this.f17994l && ((oi2Var = this.f17986d) == null || oi2Var.f17651r == 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: h */
    public final void mo7508h() {
        this.f17986d = null;
        ByteBuffer byteBuffer = rh2.f18836a;
        this.f17989g = byteBuffer;
        this.f17990h = byteBuffer.asShortBuffer();
        this.f17991i = byteBuffer;
        this.f17984b = -1;
        this.f17985c = -1;
        this.f17992j = 0L;
        this.f17993k = 0L;
        this.f17994l = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: i */
    public final void mo7509i() {
        oi2 oi2Var = new oi2(this.f17985c, this.f17984b);
        this.f17986d = oi2Var;
        oi2Var.f17648o = this.f17987e;
        oi2Var.f17649p = this.f17988f;
        this.f17991i = rh2.f18836a;
        this.f17992j = 0L;
        this.f17993k = 0L;
        this.f17994l = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: j */
    public final boolean mo7510j(int i, int i2, int i3) throws qh2 {
        if (i3 != 2) {
            throw new qh2(i, i2, i3);
        }
        if (this.f17985c == i && this.f17984b == i2) {
            return false;
        }
        this.f17985c = i;
        this.f17984b = i2;
        return true;
    }
}
