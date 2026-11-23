package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftFragment;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftFragment2;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftFragment4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7395q0 extends Lambda implements InterfaceC6164l<RecordingEntity, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34087g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34088h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7395q0(int i, Object obj) {
        super(1);
        this.f34087g = i;
        this.f34088h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(RecordingEntity recordingEntity) {
        int i = this.f34087g;
        if (i == 0) {
            RecordingEntity recordingEntity2 = recordingEntity;
            Intrinsics2.m13089e(recordingEntity2, "it");
            DraftFragment.m13915g1(DraftFragment.this, recordingEntity2);
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        RecordingEntity recordingEntity3 = recordingEntity;
        Intrinsics2.m13089e(recordingEntity3, "it");
        DraftFragment draftFragment = DraftFragment.this;
        int i2 = DraftFragment.f31385f0;
        View viewInflate = draftFragment.m16524E().inflate(R.layout.draft_menu_bottom_sheet, (ViewGroup) null);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(draftFragment.m16528G0());
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(viewInflate, "view");
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.menuContinue);
        Intrinsics2.m13088d(linearLayout, "view.menuContinue");
        SkuDao.a.m14067S(linearLayout, new DraftFragment2(draftFragment, recordingEntity3, bottomSheetDialog));
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.menuDelete);
        Intrinsics2.m13088d(linearLayout2, "view.menuDelete");
        SkuDao.a.m14067S(linearLayout2, new DraftFragment4(draftFragment, bottomSheetDialog, recordingEntity3));
        return Unit.f29502a;
    }
}
