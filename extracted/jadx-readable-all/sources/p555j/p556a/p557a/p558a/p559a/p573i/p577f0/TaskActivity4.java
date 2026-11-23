package p555j.p556a.p557a.p558a.p559a.p573i.p577f0;

import mtp.media.karaoke.p628ui.screen.profile.task.TaskActivity;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.i.f0.c, reason: use source file name */
/* JADX INFO: compiled from: TaskActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskActivity4 extends AbstractC2185l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskActivity f31449a;

    public TaskActivity4(TaskActivity taskActivity) {
        this.f31449a = taskActivity;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: a */
    public void mo2742a() {
        Intrinsics2.m13089e("Ad was dismissed.", "message");
        TaskActivity taskActivity = this.f31449a;
        TaskActivity.C7333b c7333b = TaskActivity.f33850w;
        taskActivity.m14428V();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: b */
    public void mo4630b(C2103a c2103a) {
        Intrinsics2.m13089e("Ad failed to show.", "message");
        TaskActivity taskActivity = this.f31449a;
        TaskActivity.C7333b c7333b = TaskActivity.f33850w;
        taskActivity.m14428V();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: c */
    public void mo2743c() {
        Intrinsics2.m13089e("Ad showed fullscreen content.", "message");
        this.f31449a.f33856F = null;
    }
}
