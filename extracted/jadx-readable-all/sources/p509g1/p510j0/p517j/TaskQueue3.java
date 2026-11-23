package p509g1.p510j0.p517j;

import p477d1.p493x.p495c.Ref2;
import p477d1.p493x.p495c.Ref3;
import p509g1.p510j0.p513f.Task2;

/* JADX INFO: renamed from: g1.j0.j.g, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue3 extends Task2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Http2Connection.e f30432e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Ref3 f30433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue3(String str, boolean z, String str2, boolean z2, Http2Connection.e eVar, boolean z3, Ref3 ref3, Settings2 settings2, Ref2 ref2, Ref3 ref4) {
        super(str2, z2);
        this.f30432e = eVar;
        this.f30433f = ref3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p509g1.p510j0.p513f.Task2
    /* JADX INFO: renamed from: a */
    public long mo13414a() {
        Http2Connection http2Connection = this.f30432e.f30416g;
        http2Connection.f30385i.mo13454a(http2Connection, (Settings2) this.f30433f.f29604f);
        return -1L;
    }
}
