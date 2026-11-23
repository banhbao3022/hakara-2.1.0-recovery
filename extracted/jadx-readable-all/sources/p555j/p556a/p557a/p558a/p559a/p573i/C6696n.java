package p555j.p556a.p557a.p558a.p559a.p573i;

import android.content.SharedPreferences;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.FFmpeg;
import p007c.p154j.Error2;
import p007c.p154j.OnDownloadListener;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.i.n */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6696n implements OnDownloadListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6693k f31475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f31476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31477c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f31478d;

    public C6696n(C6693k c6693k, int i, String str, String str2) {
        this.f31475a = c6693k;
        this.f31476b = i;
        this.f31477c = str;
        this.f31478d = str2;
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: a */
    public void mo2221a() throws IOException {
        if (this.f31476b == 1) {
            C6693k c6693k = this.f31475a;
            String str = this.f31477c;
            String str2 = this.f31478d;
            C6693k.b bVar = C6693k.f31460f0;
            Objects.requireNonNull(c6693k);
            String strM14261g = PathUtils.m14261g(c6693k.m16528G0());
            StringBuilder sbM1556G = outline.m1556G(str);
            sbM1556G.append(C7804v0.m15335x(6));
            File file = new File(strM14261g, sbM1556G.toString());
            if (file.exists()) {
                PathUtils.m14256b(file, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/" + str2 + C7804v0.m15335x(6));
                CoroutineScope2 coroutineScope2 = CoroutineScope2.f29811f;
                CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
                C5729a.m12428A(coroutineScope2, MainDispatchers.f29666b, 0, new C6705w(file, null), 2, null);
                FragmentActivity fragmentActivityM16562f = c6693k.m16562f();
                if (fragmentActivityM16562f != null) {
                    SkuDao.a.m14069U(fragmentActivityM16562f, c6693k.m16546Q(R.string.title_download_recording_success), c6693k.m16546Q(R.string.message_download_recording_success), c6693k.m16546Q(R.string.f33401ok), null, null, null, false, true, 120);
                    return;
                }
                return;
            }
            return;
        }
        C6693k c6693k2 = this.f31475a;
        String str3 = this.f31477c;
        String str4 = this.f31478d;
        C6693k.b bVar2 = C6693k.f31460f0;
        Objects.requireNonNull(c6693k2);
        String strM14261g2 = PathUtils.m14261g(c6693k2.m16528G0());
        StringBuilder sbM1556G2 = outline.m1556G(str3);
        sbM1556G2.append(C7804v0.m15335x(3));
        File file2 = new File(strM14261g2, sbM1556G2.toString());
        String str5 = PathUtils.m14261g(c6693k2.m16528G0()) + "/" + str4 + C7804v0.m15335x(3);
        StringBuilder sbM1556G3 = outline.m1556G("-i ");
        sbM1556G3.append(file2.getPath());
        sbM1556G3.append(" -metadata title=\"");
        sbM1556G3.append(str4);
        sbM1556G3.append("\" -metadata album=\"Hakara - Hát karaoke\" -metadata artist=\"");
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        sbM1556G3.append(user != null ? user.getFullName() : null);
        sbM1556G3.append("\" -c:a copy -y \"");
        sbM1556G3.append(str5);
        sbM1556G3.append('\"');
        FFmpeg.m1606a(sbM1556G3.toString(), new C6704v(c6693k2, str5, str4, file2));
    }

    @Override // p007c.p154j.OnDownloadListener
    /* JADX INFO: renamed from: b */
    public void mo2222b(Error2 error2) {
        Intrinsics2.m13089e(error2, "error");
    }
}
