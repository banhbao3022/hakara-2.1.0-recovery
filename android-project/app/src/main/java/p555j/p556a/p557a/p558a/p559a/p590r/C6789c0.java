package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.TextView;
import java.io.File;
import java.util.Arrays;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p080e.p081a.ExecuteCallback;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.c0 */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6789c0 implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f31828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31829c;

    public C6789c0(SingActivity singActivity, File file, String str) {
        this.f31827a = singActivity;
        this.f31828b = file;
        this.f31829c = str;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        if (i != 0) {
            if (i == 255) {
                Intrinsics2.m13089e("Async command execution cancelled by user.", "message");
                return;
            }
            String str = String.format("Async command execution failed with returnCode=%d.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
            Intrinsics2.m13089e(str, "message");
            return;
        }
        SingActivity singActivity = this.f31827a;
        singActivity.f33904H = true;
        TextView textView = (TextView) singActivity.m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        textView.setText(this.f31827a.getResources().getText(R.string.text_start));
        Song songM421d = this.f31827a.mo13969R().f31857l.m421d();
        if (songM421d != null) {
            if (songM421d.getLink_video() == null) {
                this.f31827a.mo13969R().m13949o(this.f31828b, songM421d.getId(), 1, true);
            }
            if (songM421d.getLink() == null) {
                this.f31827a.mo13969R().m13949o(new File(this.f31829c), songM421d.getId(), 0, false);
            }
        }
    }
}
