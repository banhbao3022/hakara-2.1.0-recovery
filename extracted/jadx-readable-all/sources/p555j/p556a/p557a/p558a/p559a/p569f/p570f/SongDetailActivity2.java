package p555j.p556a.p557a.p558a.p559a.p569f.p570f;

import com.google.android.material.tabs.TabLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.song.detail.SongDetailActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.f.f.a, reason: use source file name */
/* JADX INFO: compiled from: SongDetailActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongDetailActivity2 implements TabLayoutMediator.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SongDetailActivity f31309a;

    public SongDetailActivity2(SongDetailActivity songDetailActivity) {
        this.f31309a = songDetailActivity;
    }

    @Override // p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator.b
    /* JADX INFO: renamed from: a */
    public final void mo11026a(TabLayout.C5969g c5969g, int i) {
        String string;
        Intrinsics2.m13089e(c5969g, "tab");
        SongDetailActivity songDetailActivity = this.f31309a;
        SongDetailActivity.C7373c c7373c = SongDetailActivity.f33994w;
        Objects.requireNonNull(songDetailActivity);
        if (i == 0) {
            string = songDetailActivity.getString(R.string.title_all);
        } else if (i == 1) {
            string = songDetailActivity.getString(R.string.title_monthly);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(outline.m1590l("Unknown page index: ", i));
            }
            string = songDetailActivity.getString(R.string.title_waiting_duet);
        }
        c5969g.m12838b(string);
    }
}
