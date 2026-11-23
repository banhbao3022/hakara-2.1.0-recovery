package p555j.p556a.p557a.p558a.p559a.p590r;

import java.io.File;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.y */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6822y implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f31931c;

    public C6822y(SingActivity singActivity, File file, File file2) {
        this.f31929a = singActivity;
        this.f31930b = file;
        this.f31931c = file2;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            Intrinsics2.m13089e("currentSongSeek < voiceSeekEnd Error", "message");
            SingActivity.m14437Y(this.f31929a);
            return;
        }
        Intrinsics2.m13089e("seek 2", "message");
        this.f31930b.renameTo(this.f31931c);
        SingActivity singActivity = this.f31929a;
        CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar, "songSeekBar");
        SingActivity.m14438Z(singActivity, customSeekBar.getProgress());
    }
}
