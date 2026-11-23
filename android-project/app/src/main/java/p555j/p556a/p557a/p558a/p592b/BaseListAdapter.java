package p555j.p556a.p557a.p558a.p592b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import p477d1.p483s.Collections4;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p748n.DataBindingUtil;
import p636z0.p774z.p775b.AsyncDifferConfig;
import p636z0.p774z.p775b.AsyncListDiffer;
import p636z0.p774z.p775b.AsyncListDiffer2;
import p636z0.p774z.p775b.DiffUtil;
import p636z0.p774z.p775b.ListAdapter;

/* JADX INFO: renamed from: j.a.a.a.b.k, reason: use source file name */
/* JADX INFO: compiled from: BaseListAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseListAdapter<Item, ViewBinding extends ViewDataBinding> extends ListAdapter<Item, BaseListAdapter3<ViewBinding>> implements BaseListAdapter2<Item, ViewBinding> {
    public BaseListAdapter(DiffUtil.e<Item> eVar) {
        Intrinsics2.m13089e(eVar, "callBack");
        AsyncDifferConfig.a aVar = new AsyncDifferConfig.a(eVar);
        aVar.f39142c = Executors.newSingleThreadExecutor();
        super(aVar.m16985a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0149b0 mo667i(ViewGroup viewGroup, int i) {
        Intrinsics2.m13089e(viewGroup, "parent");
        ViewDataBinding viewDataBindingM16404c = DataBindingUtil.m16404c(LayoutInflater.from(viewGroup.getContext()), mo13876c(i), viewGroup, false);
        Intrinsics2.m13088d(viewDataBindingM16404c, "this");
        mo13890n(viewDataBindingM16404c);
        Intrinsics2.m13088d(viewDataBindingM16404c, "DataBindingUtil.inflate<…FirstTime(this)\n        }");
        return new BaseListAdapter3(viewDataBindingM16404c);
    }

    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewBinding viewbinding) {
        Intrinsics2.m13089e(viewbinding, "binding");
        Intrinsics2.m13089e(viewbinding, "binding");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo666h(BaseListAdapter3<ViewBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        Object obj = this.f39339d.f39163g.get(i);
        baseListAdapter3.f32043u.mo403q(8, obj);
        if (obj != null) {
            ViewBinding viewbinding = baseListAdapter3.f32043u;
            Intrinsics2.m13089e(viewbinding, "binding");
            Intrinsics2.m13089e(obj, "item");
            Intrinsics2.m13089e(viewbinding, "binding");
            Intrinsics2.m13089e(obj, "item");
        }
        baseListAdapter3.f32043u.m396c();
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
    /* JADX INFO: renamed from: p */
    public void m13977p(List<? extends Item> list) {
        if (list == null) {
            list = Collections4.f29519f;
        }
        ArrayList arrayList = new ArrayList(list);
        AsyncListDiffer2<T> asyncListDiffer2 = this.f39339d;
        int i = asyncListDiffer2.f39164h + 1;
        asyncListDiffer2.f39164h = i;
        List<T> list2 = asyncListDiffer2.f39162f;
        if (arrayList == list2) {
            return;
        }
        Collection collection = asyncListDiffer2.f39163g;
        if (list2 != 0) {
            asyncListDiffer2.f39159c.f39138a.execute(new AsyncListDiffer(asyncListDiffer2, list2, arrayList, i, null));
            return;
        }
        asyncListDiffer2.f39162f = arrayList;
        asyncListDiffer2.f39163g = Collections.unmodifiableList(arrayList);
        asyncListDiffer2.f39158b.mo16977b(0, arrayList.size());
        asyncListDiffer2.m16996a(collection, null);
    }
}
