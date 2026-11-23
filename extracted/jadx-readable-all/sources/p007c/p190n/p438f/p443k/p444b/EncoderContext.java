package p007c.p190n.p438f.p443k.p444b;

import java.nio.charset.StandardCharsets;
import p007c.p190n.p438f.Dimension;

/* JADX INFO: renamed from: c.n.f.k.b.h, reason: use source file name */
/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class EncoderContext {

    /* JADX INFO: renamed from: a */
    public final String f27699a;

    /* JADX INFO: renamed from: b */
    public SymbolShapeHint f27700b;

    /* JADX INFO: renamed from: c */
    public Dimension f27701c;

    /* JADX INFO: renamed from: d */
    public Dimension f27702d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f27703e;

    /* JADX INFO: renamed from: f */
    public int f27704f;

    /* JADX INFO: renamed from: g */
    public int f27705g;

    /* JADX INFO: renamed from: h */
    public SymbolInfo f27706h;

    /* JADX INFO: renamed from: i */
    public int f27707i;

    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c2 = (char) (bytes[i] & 255);
            if (c2 == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.f27699a = sb.toString();
        this.f27700b = SymbolShapeHint.FORCE_NONE;
        this.f27703e = new StringBuilder(str.length());
        this.f27705g = -1;
    }

    /* JADX INFO: renamed from: a */
    public int m12371a() {
        return this.f27703e.length();
    }

    /* JADX INFO: renamed from: b */
    public char m12372b() {
        return this.f27699a.charAt(this.f27704f);
    }

    /* JADX INFO: renamed from: c */
    public int m12373c() {
        return (this.f27699a.length() - this.f27707i) - this.f27704f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m12374d() {
        return this.f27704f < this.f27699a.length() - this.f27707i;
    }

    /* JADX INFO: renamed from: e */
    public void m12375e() {
        m12376f(m12371a());
    }

    /* JADX INFO: renamed from: f */
    public void m12376f(int i) {
        SymbolInfo symbolInfo = this.f27706h;
        if (symbolInfo == null || i > symbolInfo.f27714c) {
            this.f27706h = SymbolInfo.m12378i(i, this.f27700b, this.f27701c, this.f27702d, true);
        }
    }
}
