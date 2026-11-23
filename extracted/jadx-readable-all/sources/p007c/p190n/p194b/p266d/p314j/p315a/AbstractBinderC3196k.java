package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.AbstractC2140d;

/* JADX INFO: renamed from: c.n.b.d.j.a.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3196k extends hg2 implements InterfaceC3233l {
    public AbstractBinderC3196k() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
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
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        AdT adt;
        if (i == 1) {
            bw2 bw2Var = (bw2) this;
            AbstractC2140d<AdT> abstractC2140d = bw2Var.f12885f;
            if (abstractC2140d != 0 && (adt = bw2Var.f12886g) != 0) {
                abstractC2140d.mo2741b(adt);
            }
        } else {
            if (i != 2) {
                return false;
            }
            yv2 yv2Var = (yv2) ig2.m7250a(parcel, yv2.CREATOR);
            AbstractC2140d<AdT> abstractC2140d2 = ((bw2) this).f12885f;
            if (abstractC2140d2 != 0) {
                abstractC2140d2.mo2740a(yv2Var.m8837K());
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
