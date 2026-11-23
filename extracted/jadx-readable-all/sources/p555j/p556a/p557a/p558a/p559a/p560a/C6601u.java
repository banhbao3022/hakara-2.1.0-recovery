package p555j.p556a.p557a.p558a.p559a.p560a;

import java.io.File;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p534c.p535a.Async;
import p526i1.p534c.p535a.Async2;

/* JADX INFO: renamed from: j.a.a.a.a.a.u */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6601u extends Lambda implements InterfaceC6164l<Async<ProcessActivity>, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProcessActivity f31038g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ File f31039h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6601u(ProcessActivity processActivity, File file) {
        super(1);
        this.f31038g = processActivity;
        this.f31039h = file;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Async<ProcessActivity> async) {
        Async<ProcessActivity> async2 = async;
        Intrinsics2.m13089e(async2, "$receiver");
        Intrinsics2.m13089e("executeMixer: " + this.f31039h.getPath(), "message");
        ProcessActivity processActivity = this.f31038g;
        if (processActivity.f33748a0 == 0) {
            File file = processActivity.f33727F;
            if (file == null) {
                Intrinsics2.m13096l("fileAudio");
                throw null;
            }
            String path = file.getPath();
            Intrinsics2.m13088d(path, "fileAudio.path");
            String path2 = this.f31039h.getPath();
            Intrinsics2.m13088d(path2, "fileVoiceFinal.path");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31038g.f33729H);
            sb.append("/");
            processActivity.onMixer(path, path2, outline.m1604z(sb, this.f31038g.f33768z, 5), this.f31038g.f33736O);
        } else {
            File file2 = new File(this.f31038g.f33723B, outline.m1551B(new StringBuilder(), this.f31038g.f33768z, "-tone", 5));
            if (file2.exists()) {
                Utils7.m13078a(file2);
            }
            ProcessActivity processActivity2 = this.f31038g;
            File file3 = processActivity2.f33727F;
            if (file3 == null) {
                Intrinsics2.m13096l("fileAudio");
                throw null;
            }
            String path3 = file3.getPath();
            Intrinsics2.m13088d(path3, "fileAudio.path");
            String path4 = this.f31039h.getPath();
            Intrinsics2.m13088d(path4, "fileVoiceFinal.path");
            String path5 = file2.getPath();
            Intrinsics2.m13088d(path5, "fileOutputAudioTone.path");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31038g.f33729H);
            sb2.append("/");
            String strM1604z = outline.m1604z(sb2, this.f31038g.f33768z, 5);
            ProcessActivity processActivity3 = this.f31038g;
            processActivity2.onMixerWithTone(path3, path4, path5, strM1604z, processActivity3.f33736O, processActivity3.f33748a0);
        }
        Async2.m13838a(async2, new C6600t(this));
        return Unit.f29502a;
    }
}
