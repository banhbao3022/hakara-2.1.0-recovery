package p509g1.p510j0.p517j;

import java.io.IOException;
import java.util.List;
import p509g1.p510j0.p513f.Task2;

/* JADX INFO: renamed from: g1.j0.j.i, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue5 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f30439e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f30440f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f30441g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f30442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue5(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, List list, boolean z3) {
        super(str2, z2);
        this.f30439e = http2Connection;
        this.f30440f = i;
        this.f30441g = list;
        this.f30442h = z3;
    }

    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        boolean zMo13576b = this.f30439e.f30395s.mo13576b(this.f30440f, this.f30441g, this.f30442h);
        if (zMo13576b) {
            try {
                this.f30439e.f30381G.m13566D(this.f30440f, ErrorCode2.CANCEL);
            } catch (IOException unused) {
                return -1L;
            }
        }
        if (!zMo13576b && !this.f30442h) {
            return -1L;
        }
        synchronized (this.f30439e) {
            this.f30439e.f30383I.remove(Integer.valueOf(this.f30440f));
        }
        return -1L;
    }
}
