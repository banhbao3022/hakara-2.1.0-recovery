package p509g1.p510j0.p517j;

import p509g1.p510j0.p513f.Task2;

/* JADX INFO: renamed from: g1.j0.j.k, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue7 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f30446e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f30447f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ErrorCode2 f30448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue7(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, ErrorCode2 errorCode2) {
        super(str2, z2);
        this.f30446e = http2Connection;
        this.f30447f = i;
        this.f30448g = errorCode2;
    }

    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        this.f30446e.f30395s.mo13577c(this.f30447f, this.f30448g);
        synchronized (this.f30446e) {
            this.f30446e.f30383I.remove(Integer.valueOf(this.f30447f));
        }
        return -1L;
    }
}
