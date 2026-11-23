package p007c.p190n.p194b.p266d.p290d.p295s;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2567y;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;

/* JADX INFO: renamed from: c.n.b.d.d.s.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2532h0 extends AbstractC2735i<InterfaceC2542m0> {

    /* JADX INFO: renamed from: A */
    public static final C2518b f11414A = new C2518b("CastClientImplCxless");

    /* JADX INFO: renamed from: B */
    public final CastDevice f11415B;

    /* JADX INFO: renamed from: C */
    public final long f11416C;

    /* JADX INFO: renamed from: D */
    public final Bundle f11417D;

    /* JADX INFO: renamed from: E */
    public final String f11418E;

    public C2532h0(Context context, Looper looper, C2720d c2720d, CastDevice castDevice, long j2, Bundle bundle, String str, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        super(context, looper, 10, c2720d, aVar, bVar);
        this.f11415B = castDevice;
        this.f11416C = j2;
        this.f11417D = bundle;
        this.f11418E = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: J */
    public final void mo5133J() {
        try {
            try {
                ((InterfaceC2542m0) m5581u()).mo5139J();
            } finally {
                super.mo5133J();
            }
        } catch (RemoteException | IllegalStateException e) {
            f11414A.m5120b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
            super.mo5133J();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2542m0 ? (InterfaceC2542m0) iInterfaceQueryLocalInterface : new C2529g(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 19390000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: q */
    public final C2606d[] mo5118q() {
        return C2567y.f11491f;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: s */
    public final Bundle mo5135s() {
        Bundle bundle = new Bundle();
        f11414A.m5119a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.f11415B;
        Objects.requireNonNull(castDevice);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f11416C);
        bundle.putString("connectionless_client_record_id", this.f11418E);
        Bundle bundle2 = this.f11417D;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }
}
