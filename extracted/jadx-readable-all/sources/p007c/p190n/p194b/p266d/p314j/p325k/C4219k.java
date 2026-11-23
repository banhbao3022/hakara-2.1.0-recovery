package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.j.k.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4219k extends C4177h.a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23261j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23262k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f23263l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Bundle f23264m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C4177h f23265n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4219k(C4177h c4177h, String str, String str2, Context context, Bundle bundle) {
        super(true);
        this.f23265n = c4177h;
        this.f23261j = str;
        this.f23262k = str2;
        this.f23263l = context;
        this.f23264m = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.C4177h.a
    /* JADX INFO: renamed from: a */
    public final void mo9336a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int iMax;
        try {
            InterfaceC4302pc interfaceC4302pcAsInterface = null;
            if (C4177h.m9635h(this.f23261j, this.f23262k)) {
                str3 = this.f23262k;
                str2 = this.f23261j;
                str = this.f23265n.f23196c;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C4177h.m9634g(this.f23263l);
            boolean z2 = C4177h.f23195b.booleanValue() || str2 != null;
            C4177h c4177h = this.f23265n;
            Context context = this.f23263l;
            Objects.requireNonNull(c4177h);
            try {
                interfaceC4302pcAsInterface = AbstractBinderC4288oc.asInterface(DynamiteModule.m12666d(context, z2 ? DynamiteModule.f28677d : DynamiteModule.f28675b, ModuleDescriptor.MODULE_ID).m12673c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.C5899a e) {
                c4177h.m9638d(e, true, false);
            }
            c4177h.f23204k = interfaceC4302pcAsInterface;
            if (this.f23265n.f23204k == null) {
                Log.w(this.f23265n.f23196c, "Failed to connect to measurement client.");
                return;
            }
            int iM12664a = DynamiteModule.m12664a(this.f23263l, ModuleDescriptor.MODULE_ID);
            int iM12665b = DynamiteModule.m12665b(this.f23263l, ModuleDescriptor.MODULE_ID);
            if (z2) {
                iMax = Math.max(iM12664a, iM12665b);
                z = iM12665b < iM12664a;
            } else {
                if (iM12664a > 0) {
                    iM12665b = iM12664a;
                }
                z = iM12664a > 0;
                iMax = iM12665b;
            }
            this.f23265n.f23204k.initialize(new BinderC2800b(this.f23263l), new C4149f(33025L, iMax, z, str, str2, str3, this.f23264m), this.f23205f);
        } catch (Exception e2) {
            this.f23265n.m9638d(e2, true, false);
        }
    }
}
