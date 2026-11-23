package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.hg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3102hg implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14837f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f14838g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3176jg f14839h;

    public DialogInterfaceOnClickListenerC3102hg(C3176jg c3176jg, String str, String str2) {
        this.f14839h = c3176jg;
        this.f14837f = str;
        this.f14838g = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f14839h.f15591d.getSystemService("download");
        try {
            String str = this.f14837f;
            String str2 = this.f14838g;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f14839h.m7693b("Could not store picture.");
        }
    }
}
