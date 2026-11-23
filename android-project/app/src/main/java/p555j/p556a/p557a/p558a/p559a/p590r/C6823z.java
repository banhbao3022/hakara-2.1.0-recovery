package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p080e.p081a.FFmpeg;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.z */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6823z implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f31934c;

    /* JADX INFO: renamed from: j.a.a.a.a.r.z$a */
    /* JADX INFO: compiled from: SingActivity.kt */
    public static final class a implements ExecuteCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f31936b;

        public a(File file) {
            this.f31936b = file;
        }

        @Override // p007c.p080e.p081a.ExecuteCallback
        /* JADX INFO: renamed from: a */
        public final void mo1605a(long j2, int i) {
            if (i != 0) {
                Intrinsics2.m13089e("seek 3 errorrrr", "message");
                SingActivity.m14437Y(C6823z.this.f31932a);
                return;
            }
            Intrinsics2.m13089e("seek 4", "message");
            this.f31936b.renameTo(C6823z.this.f31933b);
            SingActivity singActivity = C6823z.this.f31932a;
            CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            SingActivity.m14438Z(singActivity, customSeekBar.getProgress());
            C6823z.this.f31934c.delete();
        }
    }

    public C6823z(SingActivity singActivity, File file, File file2) {
        this.f31932a = singActivity;
        this.f31933b = file;
        this.f31934c = file2;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            Intrinsics2.m13089e("seek 3 errror", "message");
            SingActivity.m14437Y(this.f31932a);
            return;
        }
        Intrinsics2.m13089e("seek 3", "message");
        File file = new File(this.f31932a.f33916T, outline.m1551B(new StringBuilder(), this.f31932a.f33913Q, "-seek1", 5));
        StringBuilder sbM1556G = outline.m1556G("-i ");
        sbM1556G.append(this.f31933b.getPath());
        sbM1556G.append(" -i ");
        sbM1556G.append(this.f31934c.getPath());
        sbM1556G.append(" -filter_complex '[0:0][1:0]concat=n=2:v=0:a=1[out]' -map '[out]' -y ");
        sbM1556G.append(file.getPath());
        FFmpeg.m1606a(sbM1556G.toString(), new a(file));
    }
}
