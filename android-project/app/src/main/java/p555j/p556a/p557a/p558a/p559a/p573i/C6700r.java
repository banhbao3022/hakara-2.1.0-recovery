package p555j.p556a.p557a.p558a.p559a.p573i;

import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.i.r */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6700r<T> implements Observer<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6701s f31489a;

    public C6700r(C6701s c6701s) {
        this.f31489a = c6701s;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics2.m13088d(bool2, "it");
        if (bool2.booleanValue()) {
            CoroutineScope2 coroutineScope2 = CoroutineScope2.f29811f;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            C5729a.m12428A(coroutineScope2, MainDispatchers.f29666b, 0, new C6699q(this, null), 2, null);
        }
    }
}
