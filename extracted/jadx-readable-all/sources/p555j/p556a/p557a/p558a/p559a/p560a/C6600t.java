package p555j.p556a.p557a.p558a.p559a.p560a;

import java.io.File;
import java.util.Objects;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.FFmpeg;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: j.a.a.a.a.a.t */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6600t extends Lambda implements InterfaceC6164l<ProcessActivity, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6601u f31037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6600t(C6601u c6601u) {
        super(1);
        this.f31037g = c6601u;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(ProcessActivity processActivity) {
        Intrinsics2.m13089e(processActivity, "it");
        ProcessActivity processActivity2 = this.f31037g.f31038g;
        ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
        Objects.requireNonNull(processActivity2);
        File file = new File(processActivity2.f33729H, Intrinsics2.m13094j(processActivity2.f33768z, C7804v0.m15335x(5)));
        StringBuilder sbM1556G = outline.m1556G("-i ");
        sbM1556G.append(file.getPath());
        sbM1556G.append(" -filter:a volumedetect -f null /dev/null");
        FFmpeg.m1606a(sbM1556G.toString(), new C6593m(processActivity2));
        return Unit.f29502a;
    }
}
