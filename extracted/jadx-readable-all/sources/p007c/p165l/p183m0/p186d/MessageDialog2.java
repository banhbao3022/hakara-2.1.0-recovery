package p007c.p165l.p183m0.p186d;

import android.os.Bundle;
import p007c.p165l.p178k0.AppCall;
import p007c.p165l.p178k0.DialogPresenter;
import p007c.p165l.p183m0.p184b.LegacyNativeDialogParameters;
import p007c.p165l.p183m0.p184b.NativeDialogParameters;
import p007c.p165l.p183m0.p185c.ShareContent;

/* JADX INFO: renamed from: c.l.m0.d.b, reason: use source file name */
/* JADX INFO: compiled from: MessageDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class MessageDialog2 implements DialogPresenter.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCall f5332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShareContent f5333b;

    public MessageDialog2(MessageDialog.b bVar, AppCall appCall, ShareContent shareContent, boolean z) {
        this.f5332a = appCall;
        this.f5333b = shareContent;
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: a */
    public Bundle mo2485a() {
        return NativeDialogParameters.m2616a(this.f5332a.f4874b, this.f5333b, false);
    }

    @Override // p007c.p165l.p178k0.DialogPresenter.a
    /* JADX INFO: renamed from: b */
    public Bundle mo2486b() {
        return LegacyNativeDialogParameters.m2608a(this.f5332a.f4874b, this.f5333b, false);
    }
}
