package p509g1.p510j0.p517j;

import java.io.IOException;
import java.util.List;
import p509g1.p510j0.p513f.Task2;

/* JADX INFO: renamed from: g1.j0.j.j, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue6 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f30443e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f30444f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f30445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue6(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, List list) {
        super(str2, z2);
        this.f30443e = http2Connection;
        this.f30444f = i;
        this.f30445g = list;
    }

    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        if (!this.f30443e.f30395s.mo13575a(this.f30444f, this.f30445g)) {
            return -1L;
        }
        try {
            this.f30443e.f30381G.m13566D(this.f30444f, ErrorCode2.CANCEL);
            synchronized (this.f30443e) {
                this.f30443e.f30383I.remove(Integer.valueOf(this.f30444f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
