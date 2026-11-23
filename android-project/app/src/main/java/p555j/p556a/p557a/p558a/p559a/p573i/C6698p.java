package p555j.p556a.p557a.p558a.p559a.p573i;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.i.p */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6698p extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6693k f31482g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Recording f31483h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View f31484i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f31485j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ BottomSheetDialog f31486k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6698p(C6693k c6693k, Recording recording, View view, String str, BottomSheetDialog bottomSheetDialog) {
        super(0);
        this.f31482g = c6693k;
        this.f31483h = recording;
        this.f31484i = view;
        this.f31485j = str;
        this.f31486k = bottomSheetDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        int i;
        HashMap map = new HashMap();
        if (this.f31483h.getPrivacy() == 1) {
            this.f31483h.setPrivacy(0);
            map.put("privacy", String.valueOf(this.f31483h.getPrivacy()));
            View view = this.f31484i;
            Intrinsics2.m13088d(view, "view");
            TextView textView = (TextView) view.findViewById(R.id.txtPrivacy);
            Intrinsics2.m13088d(textView, "view.txtPrivacy");
            textView.setText(this.f31482g.m16546Q(R.string.text_menu_none_privacy));
        } else {
            this.f31483h.setPrivacy(1);
            map.put("privacy", String.valueOf(this.f31483h.getPrivacy()));
            View view2 = this.f31484i;
            Intrinsics2.m13088d(view2, "view");
            TextView textView2 = (TextView) view2.findViewById(R.id.txtPrivacy);
            Intrinsics2.m13088d(textView2, "view.txtPrivacy");
            textView2.setText(this.f31482g.m16546Q(R.string.text_menu_privacy));
        }
        RecordingViewModel2 recordingViewModel2Mo13882Z0 = this.f31482g.mo13882Z0();
        int id = this.f31483h.getId();
        Objects.requireNonNull(recordingViewModel2Mo13882Z0);
        Intrinsics2.m13089e(map, "hashMap");
        C5729a.m12428A(C8310a.m16440e(recordingViewModel2Mo13882Z0), null, 0, new RecordingViewModel4(recordingViewModel2Mo13882Z0, id, map, null), 3, null);
        C6693k c6693k = this.f31482g;
        int id2 = this.f31483h.getId();
        ArrayList arrayList = (ArrayList) c6693k.mo13882Z0().f32034q.m421d();
        if (arrayList == null) {
            i = -1;
            break;
        }
        int size = arrayList.size();
        i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i);
            Intrinsics2.m13088d(obj, "recordings[i]");
            if (id2 == ((Recording) obj).getId()) {
                break;
            }
            i++;
        }
        ArrayList arrayList2 = (ArrayList) this.f31482g.mo13882Z0().f32034q.m421d();
        if (arrayList2 != null) {
            ((Recording) arrayList2.get(i)).setPrivacy(this.f31483h.getPrivacy());
        }
        C5729a.m12428A(CoroutineScope2.f29811f, MainDispatchers.f29666b, 0, new C6697o(this, i, null), 2, null);
        FragmentActivity fragmentActivityM16562f = this.f31482g.m16562f();
        if (fragmentActivityM16562f != null) {
            SkuDao.a.m14094j0(fragmentActivityM16562f, this.f31485j, 0, 2);
        }
        this.f31486k.dismiss();
        return Unit.f29502a;
    }
}
