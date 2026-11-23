package mtp.media.karaoke.utils;

import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: renamed from: mtp.media.karaoke.utils.DialogUtilsKt$showDialog$4$1, reason: use source file name */
/* JADX INFO: compiled from: DialogUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogUtils3 implements LifecycleObserver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AlertDialog f34055f;

    public DialogUtils3(AlertDialog alertDialog) {
        this.f34055f = alertDialog;
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
    public final void onDestroy() {
        this.f34055f.dismiss();
        if (SkuDao.a.f32298b == this.f34055f) {
            SkuDao.a.f32298b = null;
        }
    }
}
