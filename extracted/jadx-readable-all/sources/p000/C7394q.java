package p000;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.screen.song.detail.SongDetailActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p569f.SongFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7394q extends Lambda implements InterfaceC6164l<Song, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34085g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7394q(int i, Object obj) {
        super(1);
        this.f34085g = i;
        this.f34086h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Song song) {
        int i = this.f34085g;
        if (i == 0) {
            Song song2 = song;
            Intrinsics2.m13089e(song2, "it");
            SongFragment songFragment = SongFragment.this;
            SongFragment.b bVar = SongFragment.f31286f0;
            Objects.requireNonNull(songFragment);
            SongDetailActivity.C7373c c7373c = SongDetailActivity.f33994w;
            Context contextM16528G0 = songFragment.m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            Objects.requireNonNull(c7373c);
            Intrinsics2.m13089e(contextM16528G0, "context");
            Intrinsics2.m13089e(song2, "song");
            Intent intent = new Intent(contextM16528G0, (Class<?>) SongDetailActivity.class);
            intent.putExtra("song", song2);
            songFragment.m13976b1(intent);
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Song song3 = song;
        Intrinsics2.m13089e(song3, "it");
        SongFragment songFragment2 = SongFragment.this;
        SongFragment.b bVar2 = SongFragment.f31286f0;
        Objects.requireNonNull(songFragment2);
        if (song3.getDuet_singer() == 0) {
            View viewInflate = songFragment2.m16524E().inflate(R.layout.bottom_sheet_sing_question, (ViewGroup) null);
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(songFragment2.m16528G0());
            bottomSheetDialog.setContentView(viewInflate);
            bottomSheetDialog.show();
            Intrinsics2.m13088d(viewInflate, "view");
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.optionSolo);
            Intrinsics2.m13088d(linearLayout, "view.optionSolo");
            SkuDao.a.m14067S(linearLayout, new C7398s(0, songFragment2, song3, bottomSheetDialog));
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.optionDuet);
            Intrinsics2.m13088d(linearLayout2, "view.optionDuet");
            SkuDao.a.m14067S(linearLayout2, new C7398s(1, songFragment2, song3, bottomSheetDialog));
        } else {
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            Context contextM16528G1 = songFragment2.m16528G0();
            Intrinsics2.m13088d(contextM16528G1, "requireContext()");
            songFragment2.m13976b1(SingActivity.C7351e.m14457b(c7351e, contextM16528G1, song3.getId(), 0, 0, 12));
        }
        return Unit.f29502a;
    }
}
