package p007c.p165l.p183m0.p186d;

import android.os.Bundle;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.DialogPresenter;
import p007c.p165l.p183m0.p184b.LegacyNativeDialogParameters;
import p007c.p165l.p183m0.p184b.NativeDialogParameters;
import p007c.p165l.p183m0.p185c.ShareContent;

/* JADX INFO: renamed from: c.l.m0.d.e, reason: use source file name */
/* JADX INFO: compiled from: ShareDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareDialog3 implements DialogPresenter.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCall f5348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShareContent f5349b;

    public ShareDialog3(ShareDialog.e eVar, AppCall appCall, ShareContent shareContent, boolean z) {
        this.f5348a = appCall;
        this.f5349b = shareContent;
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: a */
    public Bundle mo2485a() {
        return NativeDialogParameters.m2616a(this.f5348a.f4874b, this.f5349b, false);
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: b */
    public Bundle mo2486b() {
        return LegacyNativeDialogParameters.m2608a(this.f5348a.f4874b, this.f5349b, false);
    }
}
