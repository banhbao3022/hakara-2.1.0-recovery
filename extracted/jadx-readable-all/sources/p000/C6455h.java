package p000;

import mtp.media.karaoke.R;
import p477d1.Unit;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6455h<T> implements Observer<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30686b;

    public C6455h(int i, Object obj) {
        this.f30685a = i;
        this.f30686b = obj;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public final void mo410d(Unit unit) {
        int i = this.f30685a;
        if (i == 0) {
            BaseFragment3 baseFragment3 = (BaseFragment3) this.f30686b;
            BaseFragment3.m13974X0(baseFragment3, baseFragment3.m16546Q(R.string.no_internet_connection));
            return;
        }
        if (i == 1) {
            BaseFragment3 baseFragment4 = (BaseFragment3) this.f30686b;
            BaseFragment3.m13974X0(baseFragment4, baseFragment4.m16546Q(R.string.connect_timeout));
            return;
        }
        if (i == 2) {
            BaseFragment3 baseFragment5 = (BaseFragment3) this.f30686b;
            BaseFragment3.m13974X0(baseFragment5, baseFragment5.m16546Q(R.string.force_update_app));
        } else if (i == 3) {
            BaseFragment3 baseFragment6 = (BaseFragment3) this.f30686b;
            BaseFragment3.m13974X0(baseFragment6, baseFragment6.m16546Q(R.string.server_maintain_message));
        } else {
            if (i != 4) {
                throw null;
            }
            BaseFragment3 baseFragment7 = (BaseFragment3) this.f30686b;
            BaseFragment3.m13974X0(baseFragment7, baseFragment7.m16546Q(R.string.unknown_error));
        }
    }
}
