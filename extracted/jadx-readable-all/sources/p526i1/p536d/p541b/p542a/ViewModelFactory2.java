package p526i1.p536d.p541b.p542a;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s._Arrays;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p536d.p543c.p546i.DefinitionParameterException;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.AbstractSavedStateViewModelFactory;
import p636z0.p759s.SavedStateHandle;

/* JADX INFO: renamed from: i1.d.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: ViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewModelFactory2 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Scope2 f30875d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewModelParameter f30876e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SavedStateRegistryOwner f30877f;

    /* JADX INFO: renamed from: i1.d.b.a.b$a */
    /* JADX INFO: compiled from: ViewModelFactory.kt */
    public static final class a extends Lambda implements InterfaceC6153a<DefinitionParameters> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ SavedStateHandle f30879h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SavedStateHandle savedStateHandle) {
            super(0);
            this.f30879h = savedStateHandle;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DefinitionParameters mo2c() throws DefinitionParameterException {
            DefinitionParameters definitionParameters;
            ViewModelFactory2 viewModelFactory2 = ViewModelFactory2.this;
            SavedStateHandle savedStateHandle = this.f30879h;
            InterfaceC6153a<DefinitionParameters> interfaceC6153a = viewModelFactory2.f30876e.f30882c;
            if (interfaceC6153a == null || (definitionParameters = interfaceC6153a.mo2c()) == null) {
                definitionParameters = new DefinitionParameters(new Object[0]);
            }
            List listM13035i = _Arrays.m13035i(definitionParameters.f30932a);
            ArrayList arrayList = (ArrayList) listM13035i;
            if (arrayList.size() > 4) {
                StringBuilder sbM1556G = outline.m1556G("Can't add SavedStateHandle to your definition function parameters, as you already have ");
                sbM1556G.append(arrayList.size());
                sbM1556G.append(" elements: ");
                sbM1556G.append(listM13035i);
                throw new DefinitionParameterException(sbM1556G.toString());
            }
            arrayList.add(0, savedStateHandle);
            Object[] array = arrayList.toArray(new Object[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
            Intrinsics2.m13090f(objArrCopyOf, "parameters");
            if (objArrCopyOf.length <= 5) {
                return new DefinitionParameters(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            throw new DefinitionParameterException("Can't build DefinitionParameters for more than 5 arguments");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelFactory2(Scope2 scope2, ViewModelParameter viewModelParameter, SavedStateRegistryOwner savedStateRegistryOwner, SavedStateRegistryOwner savedStateRegistryOwner2, Bundle bundle) {
        super(savedStateRegistryOwner2, bundle);
        this.f30875d = scope2;
        this.f30876e = viewModelParameter;
        this.f30877f = savedStateRegistryOwner;
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
    @Override // p636z0.p759s.AbstractSavedStateViewModelFactory
    /* JADX INFO: renamed from: d */
    public <T extends ViewModel> T mo13841d(String str, Class<T> cls, SavedStateHandle savedStateHandle) {
        Intrinsics2.m13090f(str, "key");
        Intrinsics2.m13090f(cls, "modelClass");
        Intrinsics2.m13090f(savedStateHandle, "handle");
        Scope2 scope2 = this.f30875d;
        ViewModelParameter viewModelParameter = this.f30876e;
        return (T) scope2.m13863c(viewModelParameter.f30880a, viewModelParameter.f30881b, new a(savedStateHandle));
    }
}
