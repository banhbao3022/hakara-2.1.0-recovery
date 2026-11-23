package p007c.p190n.p194b.p209b.p252x1.p259t;

import android.text.Layout;

/* JADX INFO: renamed from: c.n.b.b.x1.t.f, reason: use source file name */
/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class TtmlStyle {

    /* JADX INFO: renamed from: a */
    public String f10090a;

    /* JADX INFO: renamed from: b */
    public int f10091b;

    /* JADX INFO: renamed from: c */
    public boolean f10092c;

    /* JADX INFO: renamed from: d */
    public int f10093d;

    /* JADX INFO: renamed from: e */
    public boolean f10094e;

    /* JADX INFO: renamed from: k */
    public float f10100k;

    /* JADX INFO: renamed from: l */
    public String f10101l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f10104o;

    /* JADX INFO: renamed from: q */
    public TextEmphasis f10106q;

    /* JADX INFO: renamed from: f */
    public int f10095f = -1;

    /* JADX INFO: renamed from: g */
    public int f10096g = -1;

    /* JADX INFO: renamed from: h */
    public int f10097h = -1;

    /* JADX INFO: renamed from: i */
    public int f10098i = -1;

    /* JADX INFO: renamed from: j */
    public int f10099j = -1;

    /* JADX INFO: renamed from: m */
    public int f10102m = -1;

    /* JADX INFO: renamed from: n */
    public int f10103n = -1;

    /* JADX INFO: renamed from: p */
    public int f10105p = -1;

    /* JADX INFO: renamed from: r */
    public float f10107r = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public TtmlStyle m4473a(TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        String str;
        if (ttmlStyle != null) {
            if (!this.f10092c && ttmlStyle.f10092c) {
                this.f10091b = ttmlStyle.f10091b;
                this.f10092c = true;
            }
            if (this.f10097h == -1) {
                this.f10097h = ttmlStyle.f10097h;
            }
            if (this.f10098i == -1) {
                this.f10098i = ttmlStyle.f10098i;
            }
            if (this.f10090a == null && (str = ttmlStyle.f10090a) != null) {
                this.f10090a = str;
            }
            if (this.f10095f == -1) {
                this.f10095f = ttmlStyle.f10095f;
            }
            if (this.f10096g == -1) {
                this.f10096g = ttmlStyle.f10096g;
            }
            if (this.f10103n == -1) {
                this.f10103n = ttmlStyle.f10103n;
            }
            if (this.f10104o == null && (alignment = ttmlStyle.f10104o) != null) {
                this.f10104o = alignment;
            }
            if (this.f10105p == -1) {
                this.f10105p = ttmlStyle.f10105p;
            }
            if (this.f10099j == -1) {
                this.f10099j = ttmlStyle.f10099j;
                this.f10100k = ttmlStyle.f10100k;
            }
            if (this.f10106q == null) {
                this.f10106q = ttmlStyle.f10106q;
            }
            if (this.f10107r == Float.MAX_VALUE) {
                this.f10107r = ttmlStyle.f10107r;
            }
            if (!this.f10094e && ttmlStyle.f10094e) {
                this.f10093d = ttmlStyle.f10093d;
                this.f10094e = true;
            }
            if (this.f10102m == -1 && (i = ttmlStyle.f10102m) != -1) {
                this.f10102m = i;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m4474b() {
        int i = this.f10097h;
        if (i == -1 && this.f10098i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f10098i == 1 ? 2 : 0);
    }
}
