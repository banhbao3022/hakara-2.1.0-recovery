package p007c.p165l.p183m0.p186d;

import android.os.Bundle;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.DialogPresenter;
import p007c.p165l.p183m0.p184b.LegacyNativeDialogParameters;
import p007c.p165l.p183m0.p184b.NativeDialogParameters;
import p007c.p165l.p183m0.p185c.ShareContent;

/* JADX INFO: renamed from: c.l.m0.d.f, reason: use source file name */
/* JADX INFO: compiled from: ShareDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareDialog4 implements DialogPresenter.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCall f5350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShareContent f5351b;

    public ShareDialog4(ShareDialog.f fVar, AppCall appCall, ShareContent shareContent, boolean z) {
        this.f5350a = appCall;
        this.f5351b = shareContent;
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: a */
    public Bundle mo2485a() {
        return NativeDialogParameters.m2616a(this.f5350a.f4874b, this.f5351b, false);
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: b */
    public Bundle mo2486b() {
        return LegacyNativeDialogParameters.m2608a(this.f5350a.f4874b, this.f5351b, false);
    }
}
