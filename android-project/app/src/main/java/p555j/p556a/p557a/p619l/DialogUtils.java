package p555j.p556a.p557a.p619l;

import android.content.DialogInterface;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.l.d, reason: use source file name */
/* JADX INFO: compiled from: DialogUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogUtils implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f */
    public static final DialogUtils f33081f = new DialogUtils();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        SkuDao.a.f32298b = null;
    }
}
