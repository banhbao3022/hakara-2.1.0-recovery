package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p154j.Error2;
import p007c.p154j.OnDownloadListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.k */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6804k implements OnDownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31892b;

    public C6804k(SingActivity singActivity, File file) {
        this.f31891a = singActivity;
        this.f31892b = file;
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: a */
    public void mo2221a() {
        SingActivity singActivity = this.f31891a;
        String path = this.f31892b.getPath();
        Intrinsics2.m13088d(path, "tmpFile.path");
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        singActivity.m14446f0(path);
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: b */
    public void mo2222b(Error2 error2) {
        Intrinsics2.m13089e(error2, "error");
        Intrinsics2.m13089e("Download recording duet: " + error2.f4407a, "message");
    }
}
