package p636z0.p759s;

import androidx.lifecycle.ViewModel;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.p479b0.KClass;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: z0.s.c0, reason: use source file name */
/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelProvider<VM extends ViewModel> implements Lazy3<VM> {

    /* JADX INFO: renamed from: f */
    public VM f38688f;

    /* JADX INFO: renamed from: g */
    public final KClass<VM> f38689g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6153a<ViewModelStore> f38690h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6153a<ViewModelProvider2.b> f38691i;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelProvider(KClass<VM> kClass, InterfaceC6153a<? extends ViewModelStore> interfaceC6153a, InterfaceC6153a<? extends ViewModelProvider2.b> interfaceC6153a2) {
        Intrinsics2.m13089e(kClass, "viewModelClass");
        Intrinsics2.m13089e(interfaceC6153a, "storeProducer");
        Intrinsics2.m13089e(interfaceC6153a2, "factoryProducer");
        this.f38689g = kClass;
        this.f38690h = interfaceC6153a;
        this.f38691i = interfaceC6153a2;
    }

    @Override // p477d1.Lazy3
    public Object getValue() {
        VM vm = this.f38688f;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider2(this.f38690h.mo2c(), this.f38691i.mo2c()).m16722a(C5729a.m12464s(this.f38689g));
        this.f38688f = vm2;
        Intrinsics2.m13088d(vm2, "ViewModelProvider(store,…ed = it\n                }");
        return vm2;
    }
}
