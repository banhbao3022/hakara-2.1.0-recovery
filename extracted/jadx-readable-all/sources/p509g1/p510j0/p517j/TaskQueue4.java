package p509g1.p510j0.p517j;

import java.io.IOException;
import p509g1.p510j0.p513f.Task2;
import p524h1.Buffer3;

/* JADX INFO: renamed from: g1.j0.j.h, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue4 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection f30434e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f30435f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Buffer3 f30436g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f30437h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f30438i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue4(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i, Buffer3 buffer3, int i2, boolean z3) {
        super(str2, z2);
        this.f30434e = http2Connection;
        this.f30435f = i;
        this.f30436g = buffer3;
        this.f30437h = i2;
        this.f30438i = z3;
    }

    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        try {
            boolean zMo13578d = this.f30434e.f30395s.mo13578d(this.f30435f, this.f30436g, this.f30437h, this.f30438i);
            if (zMo13578d) {
                this.f30434e.f30381G.m13566D(this.f30435f, ErrorCode2.CANCEL);
            }
            if (!zMo13578d && !this.f30438i) {
                return -1L;
            }
            synchronized (this.f30434e) {
                this.f30434e.f30383I.remove(Integer.valueOf(this.f30435f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
