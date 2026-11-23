package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p080e.p081a.FFmpeg;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.a0 */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6785a0 implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f31819c;

    /* JADX INFO: renamed from: j.a.a.a.a.r.a0$a */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class a implements ExecuteCallback {
        public a() {
        }

        @Override // p007c.p080e.p081a.ExecuteCallback
        /* JADX INFO: renamed from: a */
        public final void mo1605a(long j2, int i) {
            if (i != 0) {
                Intrinsics2.m13089e("Add silence to the end errro", "message");
                SingActivity.m14437Y(C6785a0.this.f31817a);
                return;
            }
            Intrinsics2.m13089e("Add silence to the end", "message");
            C6785a0 c6785a0 = C6785a0.this;
            c6785a0.f31818b.renameTo(c6785a0.f31819c);
            SingActivity singActivity = C6785a0.this.f31817a;
            CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            SingActivity.m14438Z(singActivity, customSeekBar.getProgress());
        }
    }

    public C6785a0(SingActivity singActivity, File file, File file2) {
        this.f31817a = singActivity;
        this.f31818b = file;
        this.f31819c = file2;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            Intrinsics2.m13089e("AConcat errro", "message");
            SingActivity.m14437Y(this.f31817a);
            return;
        }
        this.f31818b.renameTo(this.f31819c);
        CustomSeekBar customSeekBar = (CustomSeekBar) this.f31817a.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar, "songSeekBar");
        int progress = customSeekBar.getProgress() - this.f31817a.f33928f0;
        StringBuilder sbM1556G = outline.m1556G("secondSilence 1: ");
        CustomSeekBar customSeekBar2 = (CustomSeekBar) this.f31817a.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
        sbM1556G.append(customSeekBar2.getProgress());
        sbM1556G.append("  - ");
        sbM1556G.append(this.f31817a.f33928f0);
        sbM1556G.append(" = ");
        sbM1556G.append(progress);
        Intrinsics2.m13089e(sbM1556G.toString(), "message");
        FFmpeg.m1606a("-i " + this.f31819c.getPath() + " -af apad=pad_dur=" + progress + " -y " + this.f31818b.getPath(), new a());
    }
}
