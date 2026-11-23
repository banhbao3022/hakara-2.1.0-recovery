package p007c.p190n.p194b.p367f.p368a.p375f;

import android.os.IBinder;
import android.os.IInterface;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractBinderC5081b;
import p007c.p190n.p194b.p367f.p368a.p373d.C5079a;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5083c;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5101l;

/* JADX INFO: renamed from: c.n.b.f.a.f.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5130d implements InterfaceC5101l {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5101l f26087a = new C5130d();

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5101l
    /* JADX INFO: renamed from: a */
    public final Object mo11468a(IBinder iBinder) {
        int i = AbstractBinderC5081b.f26037f;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5083c ? (InterfaceC5083c) iInterfaceQueryLocalInterface : new C5079a(iBinder);
    }
}
