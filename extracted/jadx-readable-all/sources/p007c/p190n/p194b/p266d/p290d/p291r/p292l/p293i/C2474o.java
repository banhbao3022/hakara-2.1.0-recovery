package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2474o extends MediaSessionCompat.AbstractC0032b {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2470k f11338f;

    public C2474o(C2470k c2470k) {
        this.f11338f = c2470k;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: c */
    public final boolean mo49c(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.f11338f.f11331j.m5074o();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: d */
    public final void mo50d() {
        this.f11338f.f11331j.m5074o();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0032b
    /* JADX INFO: renamed from: e */
    public final void mo51e() {
        this.f11338f.f11331j.m5074o();
    }
}
