package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.b */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6786b implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f31823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f31824d;

    public C6786b(SingActivity singActivity, File file, File file2, File file3) {
        this.f31821a = singActivity;
        this.f31822b = file;
        this.f31823c = file2;
        this.f31824d = file3;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            SingActivity singActivity = this.f31821a;
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            singActivity.m14443c0();
        } else {
            Intrinsics2.m13089e("concatAudioFinal success", "message");
            this.f31822b.renameTo(this.f31823c);
            SingActivity singActivity2 = this.f31821a;
            SingActivity.C7351e c7351e2 = SingActivity.f33896w;
            singActivity2.m14443c0();
            this.f31824d.delete();
        }
    }
}
