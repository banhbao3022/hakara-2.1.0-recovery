package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: renamed from: c.n.b.d.j.a.bq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class C2889bq implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final AudioManager f12769a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2852aq f12770b;

    /* JADX INFO: renamed from: c */
    public boolean f12771c;

    /* JADX INFO: renamed from: d */
    public boolean f12772d;

    /* JADX INFO: renamed from: e */
    public boolean f12773e;

    /* JADX INFO: renamed from: f */
    public float f12774f = 1.0f;

    public C2889bq(Context context, InterfaceC2852aq interfaceC2852aq) {
        this.f12769a = (AudioManager) context.getSystemService("audio");
        this.f12770b = interfaceC2852aq;
    }

    /* JADX INFO: renamed from: a */
    public final void m6069a() {
        this.f12772d = false;
        m6070b();
    }

    /* JADX INFO: renamed from: b */
    public final void m6070b() {
        if (!this.f12772d || this.f12773e || this.f12774f <= 0.0f) {
            if (this.f12771c) {
                AudioManager audioManager = this.f12769a;
                if (audioManager != null) {
                    this.f12771c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f12770b.mo5839l();
                return;
            }
            return;
        }
        if (this.f12771c) {
            return;
        }
        AudioManager audioManager2 = this.f12769a;
        if (audioManager2 != null) {
            this.f12771c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f12770b.mo5839l();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f12771c = i > 0;
        this.f12770b.mo5839l();
    }
}
