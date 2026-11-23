package p555j.p556a.p557a.p558a.p559a.p590r;

import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p154j.Error2;
import p007c.p154j.OnDownloadListener;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.h */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6798h implements OnDownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31855a;

    public C6798h(SingActivity singActivity) {
        this.f31855a = singActivity;
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: a */
    public void mo2221a() {
        SingActivity singActivity = this.f31855a;
        singActivity.f33904H = true;
        TextView textView = (TextView) singActivity.m14442U(R.id.txtProgress);
        Intrinsics2.m13088d(textView, "txtProgress");
        textView.setText(this.f31855a.getResources().getText(R.string.text_start));
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: b */
    public void mo2222b(Error2 error2) {
        Intrinsics2.m13089e(error2, "error");
        Intrinsics2.m13089e("Download recording duet: " + error2.f4407a, "message");
    }
}
