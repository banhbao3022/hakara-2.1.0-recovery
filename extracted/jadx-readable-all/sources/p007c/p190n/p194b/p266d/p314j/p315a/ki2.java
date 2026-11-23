package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ki2 implements rh2 {

    /* JADX INFO: renamed from: b */
    public int f15953b;

    /* JADX INFO: renamed from: c */
    public int f15954c;

    /* JADX INFO: renamed from: d */
    public int[] f15955d;

    /* JADX INFO: renamed from: e */
    public boolean f15956e;

    /* JADX INFO: renamed from: f */
    public int[] f15957f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f15958g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f15959h;

    /* JADX INFO: renamed from: i */
    public boolean f15960i;

    public ki2() {
        ByteBuffer byteBuffer = rh2.f18836a;
        this.f15958g = byteBuffer;
        this.f15959h = byteBuffer;
        this.f15953b = -1;
        this.f15954c = -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: a */
    public final boolean mo7501a() {
        return this.f15956e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: b */
    public final int mo7502b() {
        int[] iArr = this.f15957f;
        return iArr == null ? this.f15953b : iArr.length;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: c */
    public final void mo7503c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = this.f15953b;
        int length = ((iLimit - iPosition) / (i + i)) * this.f15957f.length;
        int i2 = length + length;
        if (this.f15958g.capacity() < i2) {
            this.f15958g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f15958g.clear();
        }
        while (iPosition < iLimit) {
            for (int i3 : this.f15957f) {
                this.f15958g.putShort(byteBuffer.getShort(i3 + i3 + iPosition));
            }
            int i4 = this.f15953b;
            iPosition += i4 + i4;
        }
        byteBuffer.position(iLimit);
        this.f15958g.flip();
        this.f15959h = this.f15958g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: d */
    public final void mo7504d() {
        this.f15960i = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: e */
    public final int mo7505e() {
        return 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: f */
    public final ByteBuffer mo7506f() {
        ByteBuffer byteBuffer = this.f15959h;
        this.f15959h = rh2.f18836a;
        return byteBuffer;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: g */
    public final boolean mo7507g() {
        return this.f15960i && this.f15959h == rh2.f18836a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: h */
    public final void mo7508h() {
        mo7509i();
        this.f15958g = rh2.f18836a;
        this.f15953b = -1;
        this.f15954c = -1;
        this.f15957f = null;
        this.f15956e = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: i */
    public final void mo7509i() {
        this.f15959h = rh2.f18836a;
        this.f15960i = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rh2
    /* JADX INFO: renamed from: j */
    public final boolean mo7510j(int i, int i2, int i3) throws qh2 {
        boolean z = !Arrays.equals(this.f15955d, this.f15957f);
        int[] iArr = this.f15955d;
        this.f15957f = iArr;
        if (iArr == null) {
            this.f15956e = false;
            return z;
        }
        if (i3 != 2) {
            throw new qh2(i, i2, i3);
        }
        if (!z && this.f15954c == i && this.f15953b == i2) {
            return false;
        }
        this.f15954c = i;
        this.f15953b = i2;
        this.f15956e = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f15957f;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new qh2(i, i2, 2);
            }
            this.f15956e = (i5 != i4) | this.f15956e;
            i4++;
        }
    }
}
