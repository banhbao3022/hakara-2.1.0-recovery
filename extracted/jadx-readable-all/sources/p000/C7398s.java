package p000;

import android.content.Context;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.p628ui.screen.duet.DuetCreateActivity;
import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p569f.SongFragment;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7398s extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34094g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34095h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34096i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f34097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7398s(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f34094g = i;
        this.f34095h = obj;
        this.f34096i = obj2;
        this.f34097j = obj3;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34094g;
        if (i == 0) {
            SingActivity.C7351e c7351e = SingActivity.f33896w;
            Context contextM16528G0 = ((SongFragment) this.f34095h).m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            ((SongFragment) this.f34095h).m13976b1(SingActivity.C7351e.m14457b(c7351e, contextM16528G0, ((Song) this.f34096i).getId(), 0, 0, 12));
            ((BottomSheetDialog) this.f34097j).dismiss();
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        DuetCreateActivity.C7253c c7253c = DuetCreateActivity.f33518w;
        Context contextM16528G1 = ((SongFragment) this.f34095h).m16528G0();
        Intrinsics2.m13088d(contextM16528G1, "requireContext()");
        ((SongFragment) this.f34095h).m13976b1(c7253c.m14359a(contextM16528G1, (Song) this.f34096i));
        ((BottomSheetDialog) this.f34097j).dismiss();
        return Unit.f29502a;
    }
}
