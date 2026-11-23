package p000;

import android.view.View;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;

/* JADX INFO: renamed from: f */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC6325f implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f29825f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f29826g;

    public ViewOnClickListenerC6325f(int i, Object obj) {
        this.f29825f = i;
        this.f29826g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f29825f;
        if (i == 0) {
            PlaylistManager playlistManagerM14375W = PlayingActivity.m14375W((PlayingActivity) this.f29826g);
            playlistManagerM14375W.m1281j(playlistManagerM14375W.f1779o);
        } else if (i == 1) {
            PlaylistManager playlistManagerM14375W2 = PlayingActivity.m14375W((PlayingActivity) this.f29826g);
            playlistManagerM14375W2.m1281j(playlistManagerM14375W2.f1781q);
        } else {
            if (i != 2) {
                throw null;
            }
            PlaylistManager playlistManagerM14375W3 = PlayingActivity.m14375W((PlayingActivity) this.f29826g);
            playlistManagerM14375W3.m1281j(playlistManagerM14375W3.f1780p);
        }
    }
}
