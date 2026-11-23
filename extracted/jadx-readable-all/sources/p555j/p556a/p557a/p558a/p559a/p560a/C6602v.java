package p555j.p556a.p557a.p558a.p559a.p560a;

import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: j.a.a.a.a.a.v */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6602v implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f31040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f31041b;

    public C6602v(ProcessActivity processActivity, String str) {
        this.f31040a = processActivity;
        this.f31041b = str;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            ProcessActivity.m14402V(this.f31040a);
            return;
        }
        RecordingEntity recordingEntityM421d = this.f31040a.mo13969R().f31869x.m421d();
        if (recordingEntityM421d != null) {
            recordingEntityM421d.m14116a(this.f31041b);
            C6799h0 c6799h0Mo13969R = this.f31040a.mo13969R();
            Intrinsics2.m13088d(recordingEntityM421d, "recordingEntity");
            c6799h0Mo13969R.m13951q(recordingEntityM421d);
        }
        ProcessActivity.m14402V(this.f31040a);
    }
}
