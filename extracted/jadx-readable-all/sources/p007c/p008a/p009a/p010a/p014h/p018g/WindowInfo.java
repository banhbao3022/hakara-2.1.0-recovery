package p007c.p008a.p009a.p010a.p014h.p018g;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Timeline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.g.c, reason: use source file name */
/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInfo {

    /* JADX INFO: renamed from: a */
    public final int f1556a;

    /* JADX INFO: renamed from: b */
    public final int f1557b;

    /* JADX INFO: renamed from: c */
    public final int f1558c;

    /* JADX INFO: renamed from: d */
    public final Timeline.c f1559d;

    public WindowInfo(int i, int i2, int i3, Timeline.c cVar) {
        Intrinsics2.m13089e(cVar, "currentWindow");
        this.f1556a = i;
        this.f1557b = i2;
        this.f1558c = i3;
        this.f1559d = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInfo)) {
            return false;
        }
        WindowInfo windowInfo = (WindowInfo) obj;
        return this.f1556a == windowInfo.f1556a && this.f1557b == windowInfo.f1557b && this.f1558c == windowInfo.f1558c && Intrinsics2.m13085a(this.f1559d, windowInfo.f1559d);
    }

    public int hashCode() {
        int i = ((((this.f1556a * 31) + this.f1557b) * 31) + this.f1558c) * 31;
        Timeline.c cVar = this.f1559d;
        return i + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("WindowInfo(previousWindowIndex=");
        sbM1556G.append(this.f1556a);
        sbM1556G.append(", currentWindowIndex=");
        sbM1556G.append(this.f1557b);
        sbM1556G.append(", nextWindowIndex=");
        sbM1556G.append(this.f1558c);
        sbM1556G.append(", currentWindow=");
        sbM1556G.append(this.f1559d);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
