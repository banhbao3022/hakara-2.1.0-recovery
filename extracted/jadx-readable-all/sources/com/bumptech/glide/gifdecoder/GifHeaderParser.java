package com.bumptech.glide.gifdecoder;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.l.d, reason: use source file name */
/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes.dex */
public class GifHeaderParser {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f2990b;

    /* JADX INFO: renamed from: c */
    public GifHeader f2991c;

    /* JADX INFO: renamed from: a */
    public final byte[] f2989a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f2992d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m1690a() {
        return this.f2991c.f2979b != 0;
    }

    /* JADX INFO: renamed from: b */
    public GifHeader m1691b() {
        if (this.f2990b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m1690a()) {
            return this.f2991c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m1692c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f2991c.f2983f = m1695f();
            this.f2991c.f2984g = m1695f();
            int iM1692c = m1692c();
            GifHeader gifHeader = this.f2991c;
            gifHeader.f2985h = (iM1692c & 128) != 0;
            gifHeader.f2986i = (int) Math.pow(2.0d, (iM1692c & 7) + 1);
            this.f2991c.f2987j = m1692c();
            GifHeader gifHeader2 = this.f2991c;
            m1692c();
            Objects.requireNonNull(gifHeader2);
            if (this.f2991c.f2985h && !m1690a()) {
                GifHeader gifHeader3 = this.f2991c;
                gifHeader3.f2978a = m1694e(gifHeader3.f2986i);
                GifHeader gifHeader4 = this.f2991c;
                gifHeader4.f2988k = gifHeader4.f2978a[gifHeader4.f2987j];
            }
        } else {
            this.f2991c.f2979b = 1;
        }
        if (!m1690a()) {
            boolean z = false;
            while (!z && !m1690a() && this.f2991c.f2980c <= Integer.MAX_VALUE) {
                int iM1692c2 = m1692c();
                if (iM1692c2 == 33) {
                    int iM1692c3 = m1692c();
                    if (iM1692c3 == 1) {
                        m1696g();
                    } else if (iM1692c3 == 249) {
                        this.f2991c.f2981d = new GifFrame();
                        m1692c();
                        int iM1692c4 = m1692c();
                        GifFrame gifFrame = this.f2991c.f2981d;
                        int i2 = (iM1692c4 & 28) >> 2;
                        gifFrame.f2973g = i2;
                        if (i2 == 0) {
                            gifFrame.f2973g = 1;
                        }
                        gifFrame.f2972f = (iM1692c4 & 1) != 0;
                        int iM1695f = m1695f();
                        if (iM1695f < 2) {
                            iM1695f = 10;
                        }
                        GifFrame gifFrame2 = this.f2991c.f2981d;
                        gifFrame2.f2975i = iM1695f * 10;
                        gifFrame2.f2974h = m1692c();
                        m1692c();
                    } else if (iM1692c3 == 254) {
                        m1696g();
                    } else if (iM1692c3 != 255) {
                        m1696g();
                    } else {
                        m1693d();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = 0; i3 < 11; i3++) {
                            sb2.append((char) this.f2989a[i3]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m1693d();
                                byte[] bArr = this.f2989a;
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    Objects.requireNonNull(this.f2991c);
                                }
                                if (this.f2992d <= 0) {
                                    break;
                                }
                            } while (!m1690a());
                        } else {
                            m1696g();
                        }
                    }
                } else if (iM1692c2 == 44) {
                    GifHeader gifHeader5 = this.f2991c;
                    if (gifHeader5.f2981d == null) {
                        gifHeader5.f2981d = new GifFrame();
                    }
                    gifHeader5.f2981d.f2967a = m1695f();
                    this.f2991c.f2981d.f2968b = m1695f();
                    this.f2991c.f2981d.f2969c = m1695f();
                    this.f2991c.f2981d.f2970d = m1695f();
                    int iM1692c5 = m1692c();
                    boolean z2 = (iM1692c5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM1692c5 & 7) + 1);
                    GifFrame gifFrame3 = this.f2991c.f2981d;
                    gifFrame3.f2971e = (iM1692c5 & 64) != 0;
                    if (z2) {
                        gifFrame3.f2977k = m1694e(iPow);
                    } else {
                        gifFrame3.f2977k = null;
                    }
                    this.f2991c.f2981d.f2976j = this.f2990b.position();
                    m1692c();
                    m1696g();
                    if (!m1690a()) {
                        GifHeader gifHeader6 = this.f2991c;
                        gifHeader6.f2980c++;
                        gifHeader6.f2982e.add(gifHeader6.f2981d);
                    }
                } else if (iM1692c2 != 59) {
                    this.f2991c.f2979b = 1;
                } else {
                    z = true;
                }
            }
            GifHeader gifHeader7 = this.f2991c;
            if (gifHeader7.f2980c < 0) {
                gifHeader7.f2979b = 1;
            }
        }
        return this.f2991c;
    }

    /* JADX INFO: renamed from: c */
    public final int m1692c() {
        try {
            return this.f2990b.get() & 255;
        } catch (Exception unused) {
            this.f2991c.f2979b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1693d() {
        int iM1692c = m1692c();
        this.f2992d = iM1692c;
        if (iM1692c <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f2992d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f2990b.get(this.f2989a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbM1559J = outline.m1559J("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sbM1559J.append(this.f2992d);
                    Log.d("GifHeaderParser", sbM1559J.toString(), e);
                }
                this.f2991c.f2979b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m1694e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f2990b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f2991c.f2979b = 1;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public final int m1695f() {
        return this.f2990b.getShort();
    }

    /* JADX INFO: renamed from: g */
    public final void m1696g() {
        int iM1692c;
        do {
            iM1692c = m1692c();
            this.f2990b.position(Math.min(this.f2990b.position() + iM1692c, this.f2990b.limit()));
        } while (iM1692c > 0);
    }
}
