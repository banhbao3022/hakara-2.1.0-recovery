package p555j.p556a.p557a.p558a.p559a.p573i;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.i.u */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6703u extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6693k f31495g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BottomSheetDialog f31496h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Recording f31497i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6703u(C6693k c6693k, BottomSheetDialog bottomSheetDialog, Recording recording) {
        super(0);
        this.f31495g = c6693k;
        this.f31496h = bottomSheetDialog;
        this.f31497i = recording;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        this.f31496h.dismiss();
        SkuDao.a.m14069U(this.f31495g.m16526F0(), this.f31495g.m16546Q(R.string.text_delete_recording), this.f31495g.m16546Q(R.string.text_delete_recording_description), this.f31495g.m16546Q(R.string.text_yes), new C6702t(this), this.f31495g.m16546Q(R.string.text_no), null, false, false, 96);
        return Unit.f29502a;
    }
}
