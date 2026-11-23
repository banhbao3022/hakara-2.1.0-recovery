package p555j.p556a.p557a.p558a.p559a.p573i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.t */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6702t extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6703u f31494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6702t(C6703u c6703u) {
        super(0);
        this.f31494g = c6703u;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        RecordingViewModel2 recordingViewModel2Mo13882Z0 = this.f31494g.f31495g.mo13882Z0();
        int id = this.f31494g.f31497i.getId();
        Objects.requireNonNull(recordingViewModel2Mo13882Z0);
        C5729a.m12428A(C8310a.m16440e(recordingViewModel2Mo13882Z0), null, 0, new RecordingViewModel(recordingViewModel2Mo13882Z0, id, null), 3, null);
        ArrayList arrayList = (ArrayList) this.f31494g.f31495g.mo13882Z0().f32034q.m421d();
        if (arrayList != null) {
            arrayList.remove(this.f31494g.f31497i);
        }
        this.f31494g.f31495g.mo13892e1().m13977p((List) this.f31494g.f31495g.mo13882Z0().f32034q.m421d());
        return Unit.f29502a;
    }
}
