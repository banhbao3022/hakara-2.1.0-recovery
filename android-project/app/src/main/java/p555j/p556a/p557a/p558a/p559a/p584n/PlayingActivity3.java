package p555j.p556a.p557a.p558a.p559a.p584n;

import android.widget.EditText;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p593c.RefreshableFragment;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.n.c, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity3<T> implements Observer<Comment> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayingActivity f31676a;

    public PlayingActivity3(PlayingActivity playingActivity) {
        this.f31676a = playingActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Comment comment) {
        PlayingPagerAdapter playingPagerAdapter = this.f31676a.f33655K;
        if (playingPagerAdapter == null) {
            Intrinsics2.m13096l("adapter");
            throw null;
        }
        for (int i = 0; i < 1; i++) {
            LifecycleOwner lifecycleOwnerM13990w = playingPagerAdapter.m13990w(i);
            if (lifecycleOwnerM13990w != null && (lifecycleOwnerM13990w instanceof RefreshableFragment)) {
                ((RefreshableFragment) lifecycleOwnerM13990w).mo13910c();
            }
        }
        PlayingActivity.m14376X(this.f31676a);
        EditText editText = (EditText) this.f31676a.m14383U(R.id.writeComment);
        Intrinsics2.m13088d(editText, "writeComment");
        editText.setText((CharSequence) null);
    }
}
