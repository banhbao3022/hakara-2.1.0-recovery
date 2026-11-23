package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.remote.response.GetAnyResponse4;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.r.m */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6808m<T> implements Observer<GetAnyResponse4> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f31902b;

    public C6808m(SingActivity singActivity, String str) {
        this.f31901a = singActivity;
        this.f31902b = str;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(GetAnyResponse4 getAnyResponse4) {
        GetAnyResponse4 getAnyResponse5 = getAnyResponse4;
        if (getAnyResponse5.getStatus() != 200) {
            SkuDao.a.m14092i0(this.f31901a, R.string.txt_error_download_song, 0, 2);
            return;
        }
        SingActivity singActivity = this.f31901a;
        String link = getAnyResponse5.getLink();
        String str = this.f31902b;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        singActivity.m14447g0(link, str, 1);
    }
}
