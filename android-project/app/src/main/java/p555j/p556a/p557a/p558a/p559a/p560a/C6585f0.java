package p555j.p556a.p557a.p558a.p559a.p560a;

import java.io.File;
import java.util.Objects;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p534c.p535a.Async2;

/* JADX INFO: renamed from: j.a.a.a.a.a.f0 */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6585f0 implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f30993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f30994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f30995c;

    public C6585f0(ProcessActivity processActivity, File file, File file2) {
        this.f30993a = processActivity;
        this.f30994b = file;
        this.f30995c = file2;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            ProcessActivity processActivity = this.f30993a;
            File file = this.f30995c;
            ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
            Objects.requireNonNull(processActivity);
            Async2.m13839b(processActivity, null, new C6601u(processActivity, file), 1);
            return;
        }
        Intrinsics2.m13089e("toContinue: rhythm success", "message");
        ProcessActivity processActivity2 = this.f30993a;
        File file2 = this.f30994b;
        ProcessActivity.C7304d c7304d2 = ProcessActivity.f33721w;
        Objects.requireNonNull(processActivity2);
        Async2.m13839b(processActivity2, null, new C6601u(processActivity2, file2), 1);
    }
}
