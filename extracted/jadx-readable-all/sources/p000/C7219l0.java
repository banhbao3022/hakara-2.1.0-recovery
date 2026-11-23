package p000;

import android.widget.EditText;
import java.io.File;
import java.util.Date;
import java.util.Locale;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.PostActivity;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p530b.p531a.EventBus3;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7219l0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f33303g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f33304h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f33305i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7219l0(int i, Object obj, Object obj2) {
        super(0);
        this.f33303g = i;
        this.f33304h = obj;
        this.f33305i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f33303g;
        if (i != 0) {
            if (i != 1) {
                throw null;
            }
            PostActivity.m14398V((PostActivity) this.f33304h);
            ((BottomSheetDialog) this.f33305i).dismiss();
            ((PostActivity) this.f33304h).finish();
            return Unit.f29502a;
        }
        File file = new File(String.valueOf(((PostActivity) this.f33304h).f33694C));
        if (file.exists()) {
            Utils7.m13078a(file);
        }
        PostActivity postActivity = (PostActivity) this.f33304h;
        RecordingEntity recordingEntityM421d = postActivity.mo13969R().f31869x.m421d();
        if (recordingEntityM421d != null) {
            EditText editText = (EditText) postActivity.m14399U(R.id.message);
            Intrinsics2.m13088d(editText, "message");
            recordingEntityM421d.f32335k = editText.getText().toString();
            Date date = new Date();
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            String strValueOf = String.valueOf(SkuDao.a.m14090h0(date, "yyyy-MM-dd HH:mm:ss", locale));
            Intrinsics2.m13089e(strValueOf, "<set-?>");
            recordingEntityM421d.f32329C = strValueOf;
            C6799h0 c6799h0Mo13969R = postActivity.mo13969R();
            Intrinsics2.m13088d(recordingEntityM421d, "recordingEntity");
            c6799h0Mo13969R.m13951q(recordingEntityM421d);
        }
        EventBus3.m13810b().m13815g(new RecordingEvent3());
        SkuDao.a.m14092i0((PostActivity) this.f33304h, R.string.message_save_draft_success, 0, 2);
        ((BottomSheetDialog) this.f33305i).dismiss();
        ((PostActivity) this.f33304h).finish();
        return Unit.f29502a;
    }
}
