package p000;

import java.io.File;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.seekbar.CustomSeekBar;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6021d implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f29426c;

    public C6021d(int i, Object obj, Object obj2) {
        this.f29424a = i;
        this.f29425b = obj;
        this.f29426c = obj2;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        int i2 = this.f29424a;
        if (i2 == 0) {
            if (i != 0) {
                Intrinsics2.m13089e("seek 1 error", "message");
                SingActivity.m14437Y((SingActivity) this.f29425b);
                return;
            }
            Intrinsics2.m13089e("seek 1", "message");
            ((File) this.f29426c).delete();
            SingActivity singActivity = (SingActivity) this.f29425b;
            CustomSeekBar customSeekBar = (CustomSeekBar) singActivity.m14442U(R.id.songSeekBar);
            Intrinsics2.m13088d(customSeekBar, "songSeekBar");
            SingActivity.m14438Z(singActivity, customSeekBar.getProgress());
            return;
        }
        if (i2 != 1) {
            throw null;
        }
        if (i != 0) {
            Intrinsics2.m13089e("Add silence to the end 111 error", "message");
            SingActivity.m14437Y((SingActivity) this.f29425b);
            return;
        }
        Intrinsics2.m13089e("Add silence to the end 111", "message");
        ((File) this.f29426c).delete();
        SingActivity singActivity2 = (SingActivity) this.f29425b;
        CustomSeekBar customSeekBar2 = (CustomSeekBar) singActivity2.m14442U(R.id.songSeekBar);
        Intrinsics2.m13088d(customSeekBar2, "songSeekBar");
        SingActivity.m14438Z(singActivity2, customSeekBar2.getProgress());
    }
}
