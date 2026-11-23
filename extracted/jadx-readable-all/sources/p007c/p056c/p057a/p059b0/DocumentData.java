package p007c.p056c.p057a.p059b0;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.b, reason: use source file name */
/* JADX INFO: compiled from: DocumentData.java */
/* JADX INFO: loaded from: classes.dex */
public class DocumentData {

    /* JADX INFO: renamed from: a */
    public final String f1969a;

    /* JADX INFO: renamed from: b */
    public final String f1970b;

    /* JADX INFO: renamed from: c */
    public final float f1971c;

    /* JADX INFO: renamed from: d */
    public final a f1972d;

    /* JADX INFO: renamed from: e */
    public final int f1973e;

    /* JADX INFO: renamed from: f */
    public final float f1974f;

    /* JADX INFO: renamed from: g */
    public final float f1975g;

    /* JADX INFO: renamed from: h */
    public final int f1976h;

    /* JADX INFO: renamed from: i */
    public final int f1977i;

    /* JADX INFO: renamed from: j */
    public final float f1978j;

    /* JADX INFO: renamed from: k */
    public final boolean f1979k;

    /* JADX INFO: renamed from: c.c.a.b0.b$a */
    /* JADX INFO: compiled from: DocumentData.java */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f1969a = str;
        this.f1970b = str2;
        this.f1971c = f;
        this.f1972d = aVar;
        this.f1973e = i;
        this.f1974f = f2;
        this.f1975g = f3;
        this.f1976h = i2;
        this.f1977i = i3;
        this.f1978j = f4;
        this.f1979k = z;
    }

    public int hashCode() {
        int iOrdinal = ((this.f1972d.ordinal() + (((int) (outline.m1569T(this.f1970b, this.f1969a.hashCode() * 31, 31) + this.f1971c)) * 31)) * 31) + this.f1973e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f1974f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f1976h;
    }
}
