package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.d, reason: use source file name */
/* JADX INFO: compiled from: DraftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftFragment3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DraftFragment4 f31397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftFragment3(DraftFragment4 draftFragment4) {
        super(0);
        this.f31397g = draftFragment4;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        DraftFragment4 draftFragment4 = this.f31397g;
        DraftFragment draftFragment = draftFragment4.f31398g;
        RecordingEntity recordingEntity = draftFragment4.f31400i;
        int i = DraftFragment.f31385f0;
        File file = new File(PathUtils.m14258d(draftFragment.m16528G0()), outline.m1551B(new StringBuilder(), recordingEntity.f32347w, "-tone", 5));
        if (file.exists()) {
            Utils7.m13078a(file);
        }
        File file2 = new File(PathUtils.m14263i(draftFragment.m16528G0()) + "/" + recordingEntity.f32348x);
        if (file2.exists()) {
            Utils7.m13078a(file2);
        }
        File file3 = new File(PathUtils.m14259e(draftFragment.m16528G0()) + "/" + recordingEntity.f32348x);
        if (file3.exists()) {
            Utils7.m13078a(file3);
        }
        File file4 = new File(PathUtils.m14262h(draftFragment.m16528G0()) + "/" + recordingEntity.f32348x);
        if (file4.exists()) {
            Utils7.m13078a(file4);
        }
        DraftViewModel2 draftViewModel2Mo13882Z0 = this.f31397g.f31398g.mo13882Z0();
        Long l = this.f31397g.f31400i.f32330f;
        long jLongValue = l != null ? l.longValue() : 0L;
        Objects.requireNonNull(draftViewModel2Mo13882Z0);
        C5729a.m12428A(C8310a.m16440e(draftViewModel2Mo13882Z0), null, 0, new DraftViewModel(draftViewModel2Mo13882Z0, jLongValue, null), 3, null);
        ArrayList arrayList = (ArrayList) this.f31397g.f31398g.mo13882Z0().f32034q.m421d();
        if (arrayList != null) {
            arrayList.remove(this.f31397g.f31400i);
        }
        this.f31397g.f31398g.mo13892e1().m13977p((List) this.f31397g.f31398g.mo13882Z0().f32034q.m421d());
        return Unit.f29502a;
    }
}
