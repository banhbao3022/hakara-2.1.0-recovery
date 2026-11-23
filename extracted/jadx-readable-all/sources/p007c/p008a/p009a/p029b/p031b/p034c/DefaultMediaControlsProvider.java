package p007c.p008a.p009a.p029b.p031b.p034c;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import p007c.p008a.p009a.p029b.p038c.MediaInfo2;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.b.c.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultMediaControlsProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public class DefaultMediaControlsProvider implements MediaControlsProvider {

    /* JADX INFO: renamed from: a */
    public boolean f1688a;

    public DefaultMediaControlsProvider(Context context) {
        Intrinsics2.m13090f(context, "context");
        this.f1688a = true;
    }

    @Override // p007c.p008a.p009a.p029b.p031b.p034c.MediaControlsProvider
    /* JADX INFO: renamed from: a */
    public void mo1233a(MediaInfo2 mediaInfo2, MediaSessionCompat mediaSessionCompat) {
        Intrinsics2.m13090f(mediaInfo2, "mediaInfo");
        Intrinsics2.m13090f(mediaSessionCompat, "mediaSession");
        PlaybackStateCompat.C0041b c0041b = new PlaybackStateCompat.C0041b();
        MediaInfo2.a aVar = mediaInfo2.f1740f;
        Intrinsics2.m13090f(aVar, "mediaState");
        long j2 = aVar.f1744d ? 550L : 518L;
        if (aVar.f1743c) {
            j2 |= 16;
        }
        c0041b.f132f = j2;
        c0041b.m120b(mediaInfo2.f1740f.f1741a ? 3 : 8, -1L, 1.0f);
        mediaSessionCompat.f77c.mo69k(c0041b.m119a());
        if (!this.f1688a || mediaSessionCompat.m43d()) {
            return;
        }
        mediaSessionCompat.m44e(true);
    }
}
