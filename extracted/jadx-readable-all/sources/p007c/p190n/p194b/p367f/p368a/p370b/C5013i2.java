package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p373d.C5090f0;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0;

/* JADX INFO: renamed from: c.n.b.f.a.b.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5013i2 implements InterfaceC5094h0<?> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5094h0 f25828a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5094h0 f25829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25830c = 0;

    public C5013i2(InterfaceC5094h0<C4989c2> interfaceC5094h0, InterfaceC5094h0<Context> interfaceC5094h1) {
        this.f25828a = interfaceC5094h0;
        this.f25829b = interfaceC5094h1;
    }

    public C5013i2(InterfaceC5094h0<Context> interfaceC5094h0, InterfaceC5094h0<C5056u> interfaceC5094h1, byte[] bArr) {
        this.f25829b = interfaceC5094h0;
        this.f25828a = interfaceC5094h1;
    }

    public C5013i2(InterfaceC5094h0<Context> interfaceC5094h0, InterfaceC5094h0<C5027m0> interfaceC5094h1, char[] cArr) {
        this.f25828a = interfaceC5094h0;
        this.f25829b = interfaceC5094h1;
    }

    public C5013i2(InterfaceC5094h0<C5056u> interfaceC5094h0, InterfaceC5094h0<InterfaceC5037o2> interfaceC5094h1, int[] iArr) {
        this.f25829b = interfaceC5094h0;
        this.f25828a = interfaceC5094h1;
    }

    public C5013i2(InterfaceC5094h0<Context> interfaceC5094h0, InterfaceC5094h0<C5040p1> interfaceC5094h1, short[] sArr) {
        this.f25828a = interfaceC5094h0;
        this.f25829b = interfaceC5094h1;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5094h0
    /* JADX INFO: renamed from: a */
    public final Object mo11416a() {
        int i = this.f25830c;
        if (i != 0) {
            if (i == 1) {
                return new BinderC5071z(((C5021k2) this.f25829b).mo11416a(), (C5056u) this.f25828a.mo11416a());
            }
            if (i == 2) {
                return new C5030n(((C5021k2) this.f25828a).mo11416a(), (C5027m0) this.f25829b.mo11416a());
            }
            if (i == 3) {
                return new C5056u(((C5021k2) this.f25828a).mo11416a(), (C5040p1) this.f25829b.mo11416a());
            }
            return new C5048r1((C5056u) this.f25829b.mo11416a(), C5090f0.m11535c(this.f25828a));
        }
        Object objMo11416a = this.f25828a.mo11416a();
        Context contextMo11416a = ((C5021k2) this.f25829b).mo11416a();
        C4989c2 c4989c2 = (C4989c2) objMo11416a;
        C4799a.m10966Q(contextMo11416a.getPackageManager(), new ComponentName(contextMo11416a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C4799a.m10966Q(contextMo11416a.getPackageManager(), new ComponentName(contextMo11416a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        int i2 = PlayCoreDialogWrapperActivity.f29269f;
        C4799a.m10966Q(contextMo11416a.getPackageManager(), new ComponentName(contextMo11416a.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        Objects.requireNonNull(c4989c2, "Cannot return null from a non-@Nullable @Provides method");
        return c4989c2;
    }
}
