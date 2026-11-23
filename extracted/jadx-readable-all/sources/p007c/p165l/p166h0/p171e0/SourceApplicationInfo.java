package p007c.p165l.p166h0.p171e0;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.h0.e0.n, reason: use source file name */
/* JADX INFO: compiled from: SourceApplicationInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class SourceApplicationInfo {

    /* JADX INFO: renamed from: a */
    public String f4754a;

    /* JADX INFO: renamed from: b */
    public boolean f4755b;

    public SourceApplicationInfo(String str, boolean z) {
        this.f4754a = str;
        this.f4755b = z;
    }

    public String toString() {
        String str = this.f4755b ? "Applink" : "Unclassified";
        return this.f4754a != null ? outline.m1550A(outline.m1561L(str, "("), this.f4754a, ")") : str;
    }
}
