package p555j.p556a.p557a.p558a.p559a.p560a;

import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.a.e0 */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6583e0 implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f30991a;

    public C6583e0(ProcessActivity processActivity) {
        this.f30991a = processActivity;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            ProcessActivity.m14402V(this.f30991a);
        } else {
            Intrinsics2.m13089e("resizeVideoDuetInvite scuccess", "message");
            ProcessActivity.m14403W(this.f30991a);
        }
    }
}
