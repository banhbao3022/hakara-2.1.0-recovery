package p000;

import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.duet.DuetCreateActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import mtp.media.karaoke.p628ui.screen.song.detail.SongDetailActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C5769c0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28071g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f28072h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f28073i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f28074j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5769c0(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f28071g = i;
        this.f28072h = obj;
        this.f28073i = obj2;
        this.f28074j = obj3;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f28071g;
        if (i == 0) {
            ((SongDetailActivity) this.f28072h).m13971T(SingActivity.C7351e.m14457b(SingActivity.f33896w, (SongDetailActivity) this.f28072h, ((Song) this.f28073i).getId(), 0, 0, 12));
            ((BottomSheetDialog) this.f28074j).dismiss();
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        ((SongDetailActivity) this.f28072h).m13971T(DuetCreateActivity.f33518w.m14359a((SongDetailActivity) this.f28072h, (Song) this.f28073i));
        ((BottomSheetDialog) this.f28074j).dismiss();
        return Unit.f29502a;
    }
}
