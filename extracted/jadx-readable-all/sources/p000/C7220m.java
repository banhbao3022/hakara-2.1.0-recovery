package p000;

import mtp.media.karaoke.R;
import p477d1.Unit;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: m */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7220m<T> implements Observer<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33307b;

    public C7220m(int i, Object obj) {
        this.f33306a = i;
        this.f33307b = obj;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public final void mo410d(Unit unit) {
        int i = this.f33306a;
        if (i == 0) {
            BaseActivity3 baseActivity3 = (BaseActivity3) this.f33307b;
            BaseActivity3.m13966O(baseActivity3, baseActivity3.getString(R.string.no_internet_connection));
            return;
        }
        if (i == 1) {
            BaseActivity3 baseActivity4 = (BaseActivity3) this.f33307b;
            BaseActivity3.m13966O(baseActivity4, baseActivity4.getString(R.string.connect_timeout));
            return;
        }
        if (i == 2) {
            BaseActivity3 baseActivity5 = (BaseActivity3) this.f33307b;
            BaseActivity3.m13966O(baseActivity5, baseActivity5.getString(R.string.force_update_app));
        } else if (i == 3) {
            BaseActivity3 baseActivity6 = (BaseActivity3) this.f33307b;
            BaseActivity3.m13966O(baseActivity6, baseActivity6.getString(R.string.server_maintain_message));
        } else {
            if (i != 4) {
                throw null;
            }
            BaseActivity3 baseActivity7 = (BaseActivity3) this.f33307b;
            BaseActivity3.m13966O(baseActivity7, baseActivity7.getString(R.string.unknown_error));
        }
    }
}
