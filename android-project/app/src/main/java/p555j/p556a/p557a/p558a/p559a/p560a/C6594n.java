package p555j.p556a.p557a.p558a.p559a.p560a;

import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.a.n */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6594n implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f31026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f31027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31028c;

    public C6594n(ProcessActivity processActivity, float f, String str) {
        this.f31026a = processActivity;
        this.f31027b = f;
        this.f31028c = str;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            return;
        }
        Intrinsics2.m13089e("combineVideoSideBySide success", "message");
        ProcessActivity processActivity = this.f31026a;
        float f = this.f31027b;
        String str = this.f31028c;
        String str2 = processActivity.f33730I;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31026a.f33729H);
        sb.append("/");
        processActivity.m14409b0(f, str, str2, outline.m1604z(sb, this.f31026a.f33768z, 6));
    }
}
