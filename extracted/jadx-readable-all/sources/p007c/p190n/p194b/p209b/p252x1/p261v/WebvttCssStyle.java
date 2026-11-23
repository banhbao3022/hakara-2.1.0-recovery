package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.b.x1.v.f, reason: use source file name */
/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: f */
    public int f10134f;

    /* JADX INFO: renamed from: h */
    public int f10136h;

    /* JADX INFO: renamed from: a */
    public String f10129a = "";

    /* JADX INFO: renamed from: b */
    public String f10130b = "";

    /* JADX INFO: renamed from: c */
    public Set<String> f10131c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    public String f10132d = "";

    /* JADX INFO: renamed from: e */
    public String f10133e = null;

    /* JADX INFO: renamed from: g */
    public boolean f10135g = false;

    /* JADX INFO: renamed from: i */
    public boolean f10137i = false;

    /* JADX INFO: renamed from: j */
    public int f10138j = -1;

    /* JADX INFO: renamed from: k */
    public int f10139k = -1;

    /* JADX INFO: renamed from: l */
    public int f10140l = -1;

    /* JADX INFO: renamed from: m */
    public int f10141m = -1;

    /* JADX INFO: renamed from: n */
    public int f10142n = -1;

    /* JADX INFO: renamed from: o */
    public int f10143o = -1;

    /* JADX INFO: renamed from: p */
    public boolean f10144p = false;

    /* JADX INFO: renamed from: b */
    public static int m4480b(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public int m4481a() {
        int i = this.f10140l;
        if (i == -1 && this.f10141m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f10141m == 1 ? 2 : 0);
    }
}
