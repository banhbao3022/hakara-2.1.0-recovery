package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;

/* JADX INFO: renamed from: j.a.a.a.a.r.x */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6821x implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f31927c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31928d;

    public C6821x(SingActivity singActivity, File file, File file2, int i) {
        this.f31925a = singActivity;
        this.f31926b = file;
        this.f31927c = file2;
        this.f31928d = i;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            return;
        }
        this.f31926b.renameTo(this.f31927c);
        SingActivity singActivity = this.f31925a;
        SingActivity.C7351e c7351e = SingActivity.f33896w;
        singActivity.m14450j0();
        SingActivity singActivity2 = this.f31925a;
        singActivity2.f33927e0 = this.f31928d;
        singActivity2.m14455p0();
        this.f31925a.f33930h0 = false;
    }
}
