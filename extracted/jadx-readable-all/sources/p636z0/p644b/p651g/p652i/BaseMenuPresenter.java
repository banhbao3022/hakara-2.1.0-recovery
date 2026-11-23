package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.b.g.i.b, reason: use source file name */
/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {

    /* JADX INFO: renamed from: f */
    public Context f34754f;

    /* JADX INFO: renamed from: g */
    public Context f34755g;

    /* JADX INFO: renamed from: h */
    public MenuBuilder f34756h;

    /* JADX INFO: renamed from: i */
    public LayoutInflater f34757i;

    /* JADX INFO: renamed from: j */
    public MenuPresenter.a f34758j;

    /* JADX INFO: renamed from: k */
    public int f34759k;

    /* JADX INFO: renamed from: l */
    public int f34760l;

    /* JADX INFO: renamed from: m */
    public MenuView f34761m;

    /* JADX INFO: renamed from: n */
    public int f34762n;

    public BaseMenuPresenter(Context context, int i, int i2) {
        this.f34754f = context;
        this.f34757i = LayoutInflater.from(context);
        this.f34759k = i;
        this.f34760l = i2;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: A */
    public boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: B */
    public void mo14742B(MenuPresenter.a aVar) {
        this.f34758j = aVar;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: C */
    public void mo245C(Context context, MenuBuilder menuBuilder) {
        this.f34755g = context;
        LayoutInflater.from(context);
        this.f34756h = menuBuilder;
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
    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.a aVar = this.f34758j;
        MenuBuilder menuBuilder = subMenuBuilder;
        if (aVar == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.f34756h;
        }
        return aVar.mo187d(menuBuilder);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14743a(MenuItemImpl menuItemImpl, MenuView.a aVar);

    /* JADX INFO: renamed from: b */
    public boolean mo14744b(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.a aVar = this.f34758j;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public View mo14745d(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.a aVar = view instanceof MenuView.a ? (MenuView.a) view : (MenuView.a) this.f34757i.inflate(this.f34760l, viewGroup, false);
        mo14743a(menuItemImpl, aVar);
        return (View) aVar;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo14746e(int i, MenuItemImpl menuItemImpl) {
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: w */
    public int mo250w() {
        return this.f34762n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: x */
    public void mo251x(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f34761m;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f34756h;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.m14775i();
            ArrayList<MenuItemImpl> arrayListM14778l = this.f34756h.m14778l();
            int size = arrayListM14778l.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = arrayListM14778l.get(i3);
                if (mo14746e(i2, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof MenuView.a ? ((MenuView.a) childAt).getItemData() : null;
                    View viewMo14745d = mo14745d(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewMo14745d.setPressed(false);
                        viewMo14745d.jumpDrawablesToCurrentState();
                    }
                    if (viewMo14745d != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo14745d.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo14745d);
                        }
                        ((ViewGroup) this.f34761m).addView(viewMo14745d, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo14744b(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: y */
    public boolean mo252y() {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: z */
    public boolean mo253z(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }
}
