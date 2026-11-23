package p000;

import java.util.List;
import mtp.media.karaoke.p628ui.screen.explore.ExploreFragment;
import mtp.media.karaoke.p628ui.screen.feed.FeedFragment;
import mtp.media.karaoke.p628ui.screen.notification.NotificationFragment;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import mtp.media.karaoke.p628ui.screen.song.SongbookFragment;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p563d.p564a.DuetInviteFragment;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingFragment;
import p555j.p556a.p557a.p558a.p559a.p569f.SongFragment;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment;
import p555j.p556a.p557a.p558a.p559a.p591s.CoinFragment;
import p555j.p556a.p557a.p558a.p559a.p591s.DiamondFragment;
import p555j.p556a.p557a.p558a.p559a.p591s.StarFragment;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7400t extends Lambda implements InterfaceC6164l<List<? extends String>, Fragment> {

    /* JADX INFO: renamed from: g */
    public static final C7400t f34101g = new C7400t(0);

    /* JADX INFO: renamed from: h */
    public static final C7400t f34102h = new C7400t(1);

    /* JADX INFO: renamed from: i */
    public static final C7400t f34103i = new C7400t(2);

    /* JADX INFO: renamed from: j */
    public static final C7400t f34104j = new C7400t(3);

    /* JADX INFO: renamed from: k */
    public static final C7400t f34105k = new C7400t(4);

    /* JADX INFO: renamed from: l */
    public static final C7400t f34106l = new C7400t(5);

    /* JADX INFO: renamed from: m */
    public static final C7400t f34107m = new C7400t(6);

    /* JADX INFO: renamed from: n */
    public static final C7400t f34108n = new C7400t(7);

    /* JADX INFO: renamed from: o */
    public static final C7400t f34109o = new C7400t(8);

    /* JADX INFO: renamed from: p */
    public static final C7400t f34110p = new C7400t(9);

    /* JADX INFO: renamed from: q */
    public static final C7400t f34111q = new C7400t(10);

    /* JADX INFO: renamed from: r */
    public static final C7400t f34112r = new C7400t(11);

    /* JADX INFO: renamed from: s */
    public static final C7400t f34113s = new C7400t(12);

    /* JADX INFO: renamed from: t */
    public static final C7400t f34114t = new C7400t(13);

    /* JADX INFO: renamed from: u */
    public static final C7400t f34115u = new C7400t(14);

    /* JADX INFO: renamed from: v */
    public static final C7400t f34116v = new C7400t(15);

    /* JADX INFO: renamed from: w */
    public static final C7400t f34117w = new C7400t(16);

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f34118x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7400t(int i) {
        super(1);
        this.f34118x = i;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Fragment mo3b(List<? extends String> list) {
        switch (this.f34118x) {
            case 0:
                Intrinsics2.m13089e(list, "it");
                return RecordingFragment.c.m13905a(RecordingFragment.f31226f0, 1, 0, 2);
            case 1:
                Intrinsics2.m13089e(list, "it");
                return RecordingFragment.c.m13905a(RecordingFragment.f31226f0, 2, 0, 2);
            case 2:
                Intrinsics2.m13089e(list, "it");
                return new CommentFragment();
            case 3:
                Intrinsics2.m13089e(list, "it");
                return new DiamondFragment();
            case 4:
                Intrinsics2.m13089e(list, "it");
                return new CoinFragment();
            case 5:
                Intrinsics2.m13089e(list, "it");
                return new StarFragment();
            case 6:
                Intrinsics2.m13089e(list, "it");
                return DuetInviteFragment.b.m13899a(DuetInviteFragment.f31150f0, 0, 0, 0, false, 13);
            case 7:
                Intrinsics2.m13089e(list, "it");
                return DuetInviteFragment.b.m13899a(DuetInviteFragment.f31150f0, 0, 1, 0, false, 13);
            case 8:
                Intrinsics2.m13089e(list, "it");
                return new FeedFragment();
            case 9:
                Intrinsics2.m13089e(list, "it");
                return new ExploreFragment();
            case 10:
                Intrinsics2.m13089e(list, "it");
                return new SongbookFragment();
            case 11:
                Intrinsics2.m13089e(list, "it");
                return new NotificationFragment();
            case 12:
                Intrinsics2.m13089e(list, "it");
                return new ProfileFragment();
            case 13:
                Intrinsics2.m13089e(list, "it");
                return SongFragment.f31286f0.m13908a("recommend");
            case 14:
                Intrinsics2.m13089e(list, "it");
                return SongFragment.f31286f0.m13908a("duet");
            case 15:
                Intrinsics2.m13089e(list, "it");
                return SongFragment.f31286f0.m13908a("hot");
            case 16:
                Intrinsics2.m13089e(list, "it");
                return SongFragment.f31286f0.m13908a("trending");
            default:
                throw null;
        }
    }
}
