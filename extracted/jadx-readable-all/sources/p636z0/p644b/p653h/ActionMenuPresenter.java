package p636z0.p644b.p653h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import p636z0.p644b.C7462a;
import p636z0.p644b.p651g.p652i.BaseMenuPresenter;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuPopup;
import p636z0.p644b.p651g.p652i.MenuPopupHelper;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p651g.p652i.ShowableListMenu;
import p636z0.p644b.p651g.p652i.SubMenuBuilder;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.b.h.c, reason: use source file name */
/* JADX INFO: compiled from: ActionMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends BaseMenuPresenter {

    /* JADX INFO: renamed from: A */
    public a f34975A;

    /* JADX INFO: renamed from: B */
    public c f34976B;

    /* JADX INFO: renamed from: C */
    public b f34977C;

    /* JADX INFO: renamed from: D */
    public final f f34978D;

    /* JADX INFO: renamed from: E */
    public int f34979E;

    /* JADX INFO: renamed from: o */
    public d f34980o;

    /* JADX INFO: renamed from: p */
    public Drawable f34981p;

    /* JADX INFO: renamed from: q */
    public boolean f34982q;

    /* JADX INFO: renamed from: r */
    public boolean f34983r;

    /* JADX INFO: renamed from: s */
    public boolean f34984s;

    /* JADX INFO: renamed from: t */
    public int f34985t;

    /* JADX INFO: renamed from: u */
    public int f34986u;

    /* JADX INFO: renamed from: v */
    public int f34987v;

    /* JADX INFO: renamed from: w */
    public boolean f34988w;

    /* JADX INFO: renamed from: x */
    public int f34989x;

    /* JADX INFO: renamed from: y */
    public final SparseBooleanArray f34990y;

    /* JADX INFO: renamed from: z */
    public e f34991z;

    /* JADX INFO: renamed from: z0.b.h.c$a */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class a extends MenuPopupHelper {
        public a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.actionOverflowMenuStyle);
            if (!subMenuBuilder.f34924A.m14797g()) {
                View view2 = ActionMenuPresenter.this.f34980o;
                this.f34893f = view2 == null ? (View) ActionMenuPresenter.this.f34761m : view2;
            }
            m14818d(ActionMenuPresenter.this.f34978D);
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPopupHelper
        /* JADX INFO: renamed from: c */
        public void mo14817c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f34975A = null;
            actionMenuPresenter.f34979E = 0;
            super.mo14817c();
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$b */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class b extends ActionMenuItemView.AbstractC0054b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0054b
        /* JADX INFO: renamed from: a */
        public ShowableListMenu mo149a() {
            a aVar = ActionMenuPresenter.this.f34975A;
            if (aVar != null) {
                return aVar.m14815a();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$c */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public e f34994f;

        public c(e eVar) {
            this.f34994f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MenuBuilder.a aVar;
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f34756h;
            if (menuBuilder != null && (aVar = menuBuilder.f34823f) != null) {
                aVar.mo189b(menuBuilder);
            }
            View view = (View) ActionMenuPresenter.this.f34761m;
            if (view != null && view.getWindowToken() != null && this.f34994f.m14820f()) {
                ActionMenuPresenter.this.f34991z = this.f34994f;
            }
            ActionMenuPresenter.this.f34976B = null;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$d */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class d extends AppCompatImageView implements ActionMenuView.InterfaceC0061a {

        /* JADX INFO: renamed from: z0.b.h.c$d$a */
        /* JADX INFO: compiled from: ActionMenuPresenter.java */
        public class a extends ForwardingListener {
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // p636z0.p644b.p653h.ForwardingListener
            /* JADX INFO: renamed from: b */
            public ShowableListMenu mo147b() {
                e eVar = ActionMenuPresenter.this.f34991z;
                if (eVar == null) {
                    return null;
                }
                return eVar.m14815a();
            }

            @Override // p636z0.p644b.p653h.ForwardingListener
            /* JADX INFO: renamed from: c */
            public boolean mo148c() {
                ActionMenuPresenter.this.m14848j();
                return true;
            }

            @Override // p636z0.p644b.p653h.ForwardingListener
            /* JADX INFO: renamed from: d */
            public boolean mo14849d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f34976B != null) {
                    return false;
                }
                actionMenuPresenter.m14845g();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C7462a.m14578o(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0061a
        /* JADX INFO: renamed from: a */
        public boolean mo141a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0061a
        /* JADX INFO: renamed from: b */
        public boolean mo142b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m14848j();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$e */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class e extends MenuPopupHelper {
        public e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, z, R.attr.actionOverflowMenuStyle);
            this.f34894g = 8388613;
            m14818d(ActionMenuPresenter.this.f34978D);
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPopupHelper
        /* JADX INFO: renamed from: c */
        public void mo14817c() {
            MenuBuilder menuBuilder = ActionMenuPresenter.this.f34756h;
            if (menuBuilder != null) {
                menuBuilder.m14769c(true);
            }
            ActionMenuPresenter.this.f34991z = null;
            super.mo14817c();
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$f */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class f implements MenuPresenter.a {
        public f() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: c */
        public void mo186c(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.mo14777k().m14769c(false);
            }
            MenuPresenter.a aVar = ActionMenuPresenter.this.f34758j;
            if (aVar != null) {
                aVar.mo186c(menuBuilder, z);
            }
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: d */
        public boolean mo187d(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.f34756h) {
                return false;
            }
            actionMenuPresenter.f34979E = ((SubMenuBuilder) menuBuilder).f34924A.f34850a;
            MenuPresenter.a aVar = actionMenuPresenter.f34758j;
            if (aVar != null) {
                return aVar.mo187d(menuBuilder);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.c$g */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f35000f;

        /* JADX INFO: renamed from: z0.b.h.c$g$a */
        /* JADX INFO: compiled from: ActionMenuPresenter.java */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35000f);
        }

        public g(Parcel parcel) {
            this.f35000f = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f34990y = new SparseBooleanArray();
        this.f34978D = new f();
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter, p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: C */
    public void mo245C(Context context, MenuBuilder menuBuilder) {
        this.f34755g = context;
        LayoutInflater.from(context);
        this.f34756h = menuBuilder;
        Resources resources = context.getResources();
        if (!this.f34984s) {
            this.f34983r = true;
        }
        int i = 2;
        this.f34985t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f34987v = i;
        int measuredWidth = this.f34985t;
        if (this.f34983r) {
            if (this.f34980o == null) {
                d dVar = new d(this.f34754f);
                this.f34980o = dVar;
                if (this.f34982q) {
                    dVar.setImageDrawable(this.f34981p);
                    this.f34981p = null;
                    this.f34982q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f34980o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f34980o.getMeasuredWidth();
        } else {
            this.f34980o = null;
        }
        this.f34986u = measuredWidth;
        this.f34989x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: D */
    public void mo246D(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i = ((g) parcelable).f35000f) > 0 && (menuItemFindItem = this.f34756h.findItem(i)) != null) {
            mo247E((SubMenuBuilder) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter, p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (true) {
            MenuBuilder menuBuilder = subMenuBuilder2.f34925z;
            if (menuBuilder == this.f34756h) {
                break;
            }
            subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
        }
        MenuItemImpl menuItemImpl = subMenuBuilder2.f34924A;
        ViewGroup viewGroup = (ViewGroup) this.f34761m;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof MenuView.a) && ((MenuView.a) childAt).getItemData() == menuItemImpl) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.f34979E = subMenuBuilder.f34924A.f34850a;
        int size = subMenuBuilder.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = subMenuBuilder.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        a aVar = new a(this.f34755g, subMenuBuilder, view);
        this.f34975A = aVar;
        aVar.f34895h = z;
        MenuPopup menuPopup = aVar.f34897j;
        if (menuPopup != null) {
            menuPopup.mo14753g(z);
        }
        if (!this.f34975A.m14820f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        super.mo247E(subMenuBuilder);
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: F */
    public Parcelable mo248F() {
        g gVar = new g();
        gVar.f35000f = this.f34979E;
        return gVar;
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter
    /* JADX INFO: renamed from: a */
    public void mo14743a(MenuItemImpl menuItemImpl, MenuView.a aVar) {
        aVar.mo144d(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f34761m);
        if (this.f34977C == null) {
            this.f34977C = new b();
        }
        actionMenuItemView.setPopupCallback(this.f34977C);
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter
    /* JADX INFO: renamed from: b */
    public boolean mo14744b(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f34980o) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter, p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
        m14844f();
        MenuPresenter.a aVar = this.f34758j;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, z);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter
    /* JADX INFO: renamed from: d */
    public View mo14745d(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.m14796f()) {
            actionView = super.mo14745d(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.f34848C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter
    /* JADX INFO: renamed from: e */
    public boolean mo14746e(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.m14797g();
    }

    /* JADX INFO: renamed from: f */
    public boolean m14844f() {
        return m14845g() | m14846h();
    }

    /* JADX INFO: renamed from: g */
    public boolean m14845g() {
        Object obj;
        c cVar = this.f34976B;
        if (cVar != null && (obj = this.f34761m) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f34976B = null;
            return true;
        }
        e eVar = this.f34991z;
        if (eVar == null) {
            return false;
        }
        if (eVar.m14816b()) {
            eVar.f34897j.dismiss();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14846h() {
        a aVar = this.f34975A;
        if (aVar == null) {
            return false;
        }
        if (!aVar.m14816b()) {
            return true;
        }
        aVar.f34897j.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14847i() {
        e eVar = this.f34991z;
        return eVar != null && eVar.m14816b();
    }

    /* JADX INFO: renamed from: j */
    public boolean m14848j() {
        MenuBuilder menuBuilder;
        if (!this.f34983r || m14847i() || (menuBuilder = this.f34756h) == null || this.f34761m == null || this.f34976B != null) {
            return false;
        }
        menuBuilder.m14775i();
        if (menuBuilder.f34828k.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f34755g, this.f34756h, this.f34980o, true));
        this.f34976B = cVar;
        ((View) this.f34761m).post(cVar);
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter, p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: x */
    public void mo251x(boolean z) {
        ArrayList<MenuItemImpl> arrayList;
        super.mo251x(z);
        ((View) this.f34761m).requestLayout();
        MenuBuilder menuBuilder = this.f34756h;
        boolean z2 = false;
        if (menuBuilder != null) {
            menuBuilder.m14775i();
            ArrayList<MenuItemImpl> arrayList2 = menuBuilder.f34827j;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ActionProvider actionProvider = arrayList2.get(i).f34846A;
            }
        }
        MenuBuilder menuBuilder2 = this.f34756h;
        if (menuBuilder2 != null) {
            menuBuilder2.m14775i();
            arrayList = menuBuilder2.f34828k;
        } else {
            arrayList = null;
        }
        if (this.f34983r && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).f34848C;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f34980o == null) {
                this.f34980o = new d(this.f34754f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f34980o.getParent();
            if (viewGroup != this.f34761m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f34980o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f34761m;
                d dVar = this.f34980o;
                ActionMenuView.C0063c c0063cGenerateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                c0063cGenerateDefaultLayoutParams.f344a = true;
                actionMenuView.addView(dVar, c0063cGenerateDefaultLayoutParams);
            }
        } else {
            d dVar2 = this.f34980o;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.f34761m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f34980o);
                }
            }
        }
        ((ActionMenuView) this.f34761m).setOverflowReserved(this.f34983r);
    }

    @Override // p636z0.p644b.p651g.p652i.BaseMenuPresenter, p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: y */
    public boolean mo252y() {
        ArrayList<MenuItemImpl> arrayListM14778l;
        int size;
        int i;
        boolean z;
        MenuBuilder menuBuilder = this.f34756h;
        if (menuBuilder != null) {
            arrayListM14778l = menuBuilder.m14778l();
            size = arrayListM14778l.size();
        } else {
            arrayListM14778l = null;
            size = 0;
        }
        int i2 = this.f34987v;
        int i3 = this.f34986u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f34761m;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            MenuItemImpl menuItemImpl = arrayListM14778l.get(i4);
            int i7 = menuItemImpl.f34874y;
            if ((i7 & 2) == 2) {
                i6++;
            } else if ((i7 & 1) == 1) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f34988w && menuItemImpl.f34848C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f34983r && (z2 || i5 + i6 > i2)) {
            i2--;
        }
        int i8 = i2 - i6;
        SparseBooleanArray sparseBooleanArray = this.f34990y;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            MenuItemImpl menuItemImpl2 = arrayListM14778l.get(i9);
            int i11 = menuItemImpl2.f34874y;
            if ((i11 & 2) == i) {
                View viewMo14745d = mo14745d(menuItemImpl2, null, viewGroup);
                viewMo14745d.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewMo14745d.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = menuItemImpl2.f34851b;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                menuItemImpl2.m14802l(z);
            } else {
                if ((i11 & 1) == z) {
                    int i13 = menuItemImpl2.f34851b;
                    boolean z3 = sparseBooleanArray.get(i13);
                    boolean z4 = (i8 > 0 || z3) && i3 > 0;
                    if (z4) {
                        View viewMo14745d2 = mo14745d(menuItemImpl2, null, viewGroup);
                        viewMo14745d2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewMo14745d2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z4 &= i3 + i10 > 0;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i9; i14++) {
                            MenuItemImpl menuItemImpl3 = arrayListM14778l.get(i14);
                            if (menuItemImpl3.f34851b == i13) {
                                if (menuItemImpl3.m14797g()) {
                                    i8++;
                                }
                                menuItemImpl3.m14802l(false);
                            }
                        }
                    }
                    if (z4) {
                        i8--;
                    }
                    menuItemImpl2.m14802l(z4);
                } else {
                    menuItemImpl2.m14802l(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return true;
    }
}
