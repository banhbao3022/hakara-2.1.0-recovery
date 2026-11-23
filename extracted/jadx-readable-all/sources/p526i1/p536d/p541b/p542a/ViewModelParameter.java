package p526i1.p536d.p541b.p542a;

import android.os.Bundle;
import p477d1.p479b0.KClass;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p551n.Qualifier;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.ViewModelStore;

/* JADX INFO: renamed from: i1.d.b.a.c, reason: use source file name */
/* JADX INFO: compiled from: ViewModelParameter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewModelParameter<T> {

    /* JADX INFO: renamed from: a */
    public final KClass<T> f30880a;

    /* JADX INFO: renamed from: b */
    public final Qualifier f30881b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6153a<DefinitionParameters> f30882c;

    /* JADX INFO: renamed from: d */
    public final Bundle f30883d;

    /* JADX INFO: renamed from: e */
    public final ViewModelStore f30884e;

    /* JADX INFO: renamed from: f */
    public final SavedStateRegistryOwner f30885f;

    public ViewModelParameter(KClass<T> kClass, Qualifier qualifier, InterfaceC6153a<DefinitionParameters> interfaceC6153a, Bundle bundle, ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics2.m13090f(kClass, "clazz");
        Intrinsics2.m13090f(viewModelStore, "viewModelStore");
        this.f30880a = kClass;
        this.f30881b = qualifier;
        this.f30882c = interfaceC6153a;
        this.f30883d = bundle;
        this.f30884e = viewModelStore;
        this.f30885f = savedStateRegistryOwner;
    }

    public /* synthetic */ ViewModelParameter(KClass kClass, Qualifier qualifier, InterfaceC6153a interfaceC6153a, Bundle bundle, ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i & 2) != 0 ? null : qualifier, (i & 4) != 0 ? null : interfaceC6153a, (i & 8) != 0 ? null : bundle, viewModelStore, (i & 32) != 0 ? null : savedStateRegistryOwner);
    }
}
