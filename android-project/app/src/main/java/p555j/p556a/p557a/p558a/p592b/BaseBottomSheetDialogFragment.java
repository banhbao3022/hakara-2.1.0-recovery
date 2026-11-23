package p555j.p556a.p557a.p558a.p592b;

import android.content.Context;
import java.util.Objects;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.b.e, reason: use source file name */
/* JADX INFO: compiled from: BaseBottomSheetDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BaseBottomSheetDialogFragment<T> implements Observer<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseBottomSheetDialogFragment3 f32013a;

    public BaseBottomSheetDialogFragment(BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment3) {
        this.f32013a = baseBottomSheetDialogFragment3;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Boolean bool) {
        BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment3 = this.f32013a;
        boolean zM13085a = Intrinsics2.m13085a(bool, Boolean.TRUE);
        Objects.requireNonNull(baseBottomSheetDialogFragment3);
        if (!zM13085a) {
            SkuDao.a.m14099m();
            return;
        }
        Context contextM16571x = baseBottomSheetDialogFragment3.m16571x();
        if (contextM16571x != null) {
            SkuDao.a.m14071W(contextM16571x, false, false, 3);
        }
    }
}
