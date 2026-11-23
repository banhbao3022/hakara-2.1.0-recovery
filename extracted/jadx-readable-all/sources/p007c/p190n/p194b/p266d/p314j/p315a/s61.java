package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s61 implements ia1<t61> {

    /* JADX INFO: renamed from: a */
    public final lv1 f19475a;

    /* JADX INFO: renamed from: b */
    public final Context f19476b;

    public s61(lv1 lv1Var, Context context) {
        this.f19475a = lv1Var;
        this.f19476b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<t61> zza() {
        return this.f19475a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.r61

            /* JADX INFO: renamed from: a */
            public final s61 f18710a;

            {
                this.f18710a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                AudioManager audioManager = (AudioManager) this.f18710a.f19476b.getSystemService("audio");
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                int ringerMode = audioManager.getRingerMode();
                int streamVolume2 = audioManager.getStreamVolume(2);
                C2330u c2330u = C2330u.f10884a;
                return new t61(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, ringerMode, streamVolume2, c2330u.f10894i.m4732a(), c2330u.f10894i.m4733b());
            }
        });
    }
}
