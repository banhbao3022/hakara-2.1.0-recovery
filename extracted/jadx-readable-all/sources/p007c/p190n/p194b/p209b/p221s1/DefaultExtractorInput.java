package p007c.p190n.p194b.p209b.p221s1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.s1.e, reason: use source file name */
/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: b */
    public final DataReader f7571b;

    /* JADX INFO: renamed from: c */
    public final long f7572c;

    /* JADX INFO: renamed from: d */
    public long f7573d;

    /* JADX INFO: renamed from: f */
    public int f7575f;

    /* JADX INFO: renamed from: g */
    public int f7576g;

    /* JADX INFO: renamed from: e */
    public byte[] f7574e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f7570a = new byte[4096];

    public DefaultExtractorInput(DataReader dataReader, long j2, long j3) {
        this.f7571b = dataReader;
        this.f7573d = j2;
        this.f7572c = j3;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: a */
    public long mo3729a() {
        return this.f7572c;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: b */
    public boolean mo3730b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iMin;
        int i3 = this.f7576g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f7574e, 0, bArr, i, iMin);
            m3744t(iMin);
        }
        int iM3743s = iMin;
        while (iM3743s < i2 && iM3743s != -1) {
            iM3743s = m3743s(bArr, i, i2, iM3743s, z);
        }
        m3741q(iM3743s);
        return iM3743s != -1;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: d */
    public boolean mo3731d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo3738m(i2, z)) {
            return false;
        }
        System.arraycopy(this.f7574e, this.f7575f - i2, bArr, i, i2);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: e */
    public long mo3732e() {
        return this.f7573d + ((long) this.f7575f);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: f */
    public void mo3733f(int i) throws IOException {
        mo3738m(i, false);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: g */
    public int mo3734g(int i) throws IOException {
        int iMin = Math.min(this.f7576g, i);
        m3744t(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f7570a;
            iMin = m3743s(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m3741q(iMin);
        return iMin;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: i */
    public int mo3735i(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        m3742r(i2);
        int i3 = this.f7576g;
        int i4 = this.f7575f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m3743s(this.f7574e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f7576g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f7574e, this.f7575f, bArr, i, iMin);
        this.f7575f += iMin;
        return iMin;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: k */
    public void mo3736k() {
        this.f7575f = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: l */
    public void mo3737l(int i) throws IOException {
        int iMin = Math.min(this.f7576g, i);
        m3744t(iMin);
        int iM3743s = iMin;
        while (iM3743s < i && iM3743s != -1) {
            iM3743s = m3743s(this.f7570a, -iM3743s, Math.min(i, this.f7570a.length + iM3743s), iM3743s, false);
        }
        m3741q(iM3743s);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: m */
    public boolean mo3738m(int i, boolean z) throws IOException {
        m3742r(i);
        int iM3743s = this.f7576g - this.f7575f;
        while (iM3743s < i) {
            iM3743s = m3743s(this.f7574e, this.f7575f, i, iM3743s, z);
            if (iM3743s == -1) {
                return false;
            }
            this.f7576g = this.f7575f + iM3743s;
        }
        this.f7575f += i;
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: o */
    public void mo3739o(byte[] bArr, int i, int i2) throws IOException {
        mo3731d(bArr, i, i2, false);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: p */
    public long mo3740p() {
        return this.f7573d;
    }

    /* JADX INFO: renamed from: q */
    public final void m3741q(int i) {
        if (i != -1) {
            this.f7573d += (long) i;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3742r(int i) {
        int i2 = this.f7575f + i;
        byte[] bArr = this.f7574e;
        if (i2 > bArr.length) {
            this.f7574e = Arrays.copyOf(this.f7574e, Util6.m3121i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput, p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f7576g;
        int iM3743s = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f7574e, 0, bArr, i, iMin);
            m3744t(iMin);
            iM3743s = iMin;
        }
        if (iM3743s == 0) {
            iM3743s = m3743s(bArr, i, i2, 0, true);
        }
        m3741q(iM3743s);
        return iM3743s;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo3730b(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: s */
    public final int m3743s(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f7571b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: t */
    public final void m3744t(int i) {
        int i2 = this.f7576g - i;
        this.f7576g = i2;
        this.f7575f = 0;
        byte[] bArr = this.f7574e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f7574e = bArr2;
    }
}
