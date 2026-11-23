package p555j.p556a.p557a.p558a.p559a.p584n;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p555j.p556a.p557a.p558a.p559a.p578j.GiftFragment;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.n.e, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity5<T> implements Observer<ArrayList<Present>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayingActivity f31678a;

    public PlayingActivity5(PlayingActivity playingActivity) {
        this.f31678a = playingActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Present> arrayList) {
        this.f31678a.f33647C.m13977p(arrayList);
        GiftFragment giftFragment = this.f31678a.f33657M;
        if (giftFragment != null) {
            giftFragment.mo11126W0();
        }
    }
}
