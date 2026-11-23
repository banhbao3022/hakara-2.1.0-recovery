package p000;

import mtp.media.karaoke.R;
import p477d1.Unit;
import p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: java-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7156k<T> implements Observer<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33107b;

    public C7156k(int i, Object obj) {
        this.f33106a = i;
        this.f33107b = obj;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public final void mo410d(Unit unit) {
        int i = this.f33106a;
        if (i == 0) {
            BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment3 = (BaseBottomSheetDialogFragment3) this.f33107b;
            BaseBottomSheetDialogFragment3.m13972e1(baseBottomSheetDialogFragment3, baseBottomSheetDialogFragment3.m16546Q(R.string.no_internet_connection));
            return;
        }
        if (i == 1) {
            BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment4 = (BaseBottomSheetDialogFragment3) this.f33107b;
            BaseBottomSheetDialogFragment3.m13972e1(baseBottomSheetDialogFragment4, baseBottomSheetDialogFragment4.m16546Q(R.string.connect_timeout));
            return;
        }
        if (i == 2) {
            BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment5 = (BaseBottomSheetDialogFragment3) this.f33107b;
            BaseBottomSheetDialogFragment3.m13972e1(baseBottomSheetDialogFragment5, baseBottomSheetDialogFragment5.m16546Q(R.string.force_update_app));
        } else if (i == 3) {
            BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment6 = (BaseBottomSheetDialogFragment3) this.f33107b;
            BaseBottomSheetDialogFragment3.m13972e1(baseBottomSheetDialogFragment6, baseBottomSheetDialogFragment6.m16546Q(R.string.server_maintain_message));
        } else {
            if (i != 4) {
                throw null;
            }
            BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment7 = (BaseBottomSheetDialogFragment3) this.f33107b;
            BaseBottomSheetDialogFragment3.m13972e1(baseBottomSheetDialogFragment7, baseBottomSheetDialogFragment7.m16546Q(R.string.unknown_error));
        }
    }
}
