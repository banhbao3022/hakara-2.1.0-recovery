package p555j.p556a.p557a.p558a.p559a.p573i;

import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel3;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.s */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6701s extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6693k f31490g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Recording f31491h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View f31492i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ BottomSheetDialog f31493j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6701s(C6693k c6693k, Recording recording, View view, BottomSheetDialog bottomSheetDialog) {
        super(0);
        this.f31490g = c6693k;
        this.f31491h = recording;
        this.f31492i = view;
        this.f31493j = bottomSheetDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        if (this.f31491h.getPin() == 1) {
            this.f31491h.setPin(0);
            View view = this.f31492i;
            Intrinsics2.m13088d(view, "view");
            TextView textView = (TextView) view.findViewById(R.id.txtPin);
            Intrinsics2.m13088d(textView, "view.txtPin");
            textView.setText(this.f31490g.m16546Q(R.string.text_menu_unpin));
        } else {
            this.f31491h.setPin(1);
            View view2 = this.f31492i;
            Intrinsics2.m13088d(view2, "view");
            TextView textView2 = (TextView) view2.findViewById(R.id.txtPin);
            Intrinsics2.m13088d(textView2, "view.txtPin");
            textView2.setText(this.f31490g.m16546Q(R.string.text_menu_pin));
        }
        RecordingViewModel2 recordingViewModel2M13918g1 = this.f31490g.mo13882Z0();
        int id = this.f31491h.getId();
        int pin = this.f31491h.getPin();
        Objects.requireNonNull(recordingViewModel2M13918g1);
        C5729a.m12428A(C8310a.m16440e(recordingViewModel2M13918g1), null, 0, new RecordingViewModel3(recordingViewModel2M13918g1, id, pin, null), 3, null);
        this.f31490g.mo13882Z0().f31257x.mo422e(this.f31490g.m16548R(), new C6700r(this));
        this.f31493j.dismiss();
        return Unit.f29502a;
    }
}
