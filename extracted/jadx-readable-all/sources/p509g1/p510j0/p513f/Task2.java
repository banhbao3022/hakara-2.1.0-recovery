package p509g1.p510j0.p513f;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.f.a, reason: use source file name */
/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Task2 {

    /* JADX INFO: renamed from: a */
    public TaskQueue2 f30158a;

    /* JADX INFO: renamed from: b */
    public long f30159b;

    /* JADX INFO: renamed from: c */
    public final String f30160c;

    /* JADX INFO: renamed from: d */
    public final boolean f30161d;

    public Task2(String str, boolean z) {
        Intrinsics2.m13090f(str, "name");
        this.f30160c = str;
        this.f30161d = z;
        this.f30159b = -1L;
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo13414a();

    public String toString() {
        return this.f30160c;
    }

    public /* synthetic */ Task2(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
