package p500e1.p501a.p503c2;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: e1.a.c2.o, reason: use source file name */
/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LockFreeLinkedList4 {

    /* JADX INFO: renamed from: a */
    public final LockFreeLinkedList3 f29667a;

    public LockFreeLinkedList4(LockFreeLinkedList3 lockFreeLinkedList3) {
        this.f29667a = lockFreeLinkedList3;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Removed[");
        sbM1556G.append(this.f29667a);
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
