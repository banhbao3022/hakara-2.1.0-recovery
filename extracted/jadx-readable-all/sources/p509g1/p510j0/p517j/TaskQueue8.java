package p509g1.p510j0.p517j;

import p509g1.p510j0.p513f.Task2;

/* JADX INFO: renamed from: g1.j0.j.l, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue8 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f30449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue8(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection) {
        super(str2, z2);
        this.f30449e = http2Connection;
    }

    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        this.f30449e.m13527O(false, 2, 0);
        return -1L;
    }
}
