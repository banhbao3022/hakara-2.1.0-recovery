package p526i1.p536d.p541b.p542a;

import androidx.lifecycle.ViewModel;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.p553p.Scope2;
import p636z0.p759s.ViewModelProvider2;

/* JADX INFO: renamed from: i1.d.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: ViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewModelFactory implements ViewModelProvider2.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scope2 f30873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewModelParameter f30874b;

    public ViewModelFactory(Scope2 scope2, ViewModelParameter viewModelParameter) {
        this.f30873a = scope2;
        this.f30874b = viewModelParameter;
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
    @Override // p636z0.p759s.ViewModelProvider2.b
    /* JADX INFO: renamed from: a */
    public <T extends ViewModel> T mo13840a(Class<T> cls) {
        Intrinsics2.m13090f(cls, "modelClass");
        Scope2 scope2 = this.f30873a;
        ViewModelParameter viewModelParameter = this.f30874b;
        return (T) scope2.m13863c(viewModelParameter.f30880a, viewModelParameter.f30881b, viewModelParameter.f30882c);
    }
}
