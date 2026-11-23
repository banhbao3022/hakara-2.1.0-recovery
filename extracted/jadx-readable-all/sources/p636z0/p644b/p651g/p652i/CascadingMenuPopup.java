package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.p653h.DropDownListView;
import p636z0.p644b.p653h.MenuItemHoverListener;
import p636z0.p644b.p653h.MenuPopupWindow;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.g.i.d, reason: use source file name */
/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public boolean f34767B;

    /* JADX INFO: renamed from: C */
    public MenuPresenter.a f34768C;

    /* JADX INFO: renamed from: D */
    public ViewTreeObserver f34769D;

    /* JADX INFO: renamed from: E */
    public PopupWindow.OnDismissListener f34770E;

    /* JADX INFO: renamed from: F */
    public boolean f34771F;

    /* JADX INFO: renamed from: g */
    public final Context f34772g;

    /* JADX INFO: renamed from: h */
    public final int f34773h;

    /* JADX INFO: renamed from: i */
    public final int f34774i;

    /* JADX INFO: renamed from: j */
    public final int f34775j;

    /* JADX INFO: renamed from: k */
    public final boolean f34776k;

    /* JADX INFO: renamed from: l */
    public final Handler f34777l;

    /* JADX INFO: renamed from: t */
    public View f34785t;

    /* JADX INFO: renamed from: u */
    public View f34786u;

    /* JADX INFO: renamed from: v */
    public int f34787v;

    /* JADX INFO: renamed from: w */
    public boolean f34788w;

    /* JADX INFO: renamed from: x */
    public boolean f34789x;

    /* JADX INFO: renamed from: y */
    public int f34790y;

    /* JADX INFO: renamed from: z */
    public int f34791z;

    /* JADX INFO: renamed from: m */
    public final List<MenuBuilder> f34778m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final List<d> f34779n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ViewTreeObserver.OnGlobalLayoutListener f34780o = new a();

    /* JADX INFO: renamed from: p */
    public final View.OnAttachStateChangeListener f34781p = new b();

    /* JADX INFO: renamed from: q */
    public final MenuItemHoverListener f34782q = new c();

    /* JADX INFO: renamed from: r */
    public int f34783r = 0;

    /* JADX INFO: renamed from: s */
    public int f34784s = 0;

    /* JADX INFO: renamed from: A */
    public boolean f34766A = false;

    /* JADX INFO: renamed from: z0.b.g.i.d$a */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.mo14749a() || CascadingMenuPopup.this.f34779n.size() <= 0 || CascadingMenuPopup.this.f34779n.get(0).f34799a.f35092G) {
                return;
            }
            View view = CascadingMenuPopup.this.f34786u;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator<d> it = CascadingMenuPopup.this.f34779n.iterator();
            while (it.hasNext()) {
                it.next().f34799a.mo14750b();
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.d$b */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f34769D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f34769D = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f34769D.removeGlobalOnLayoutListener(cascadingMenuPopup.f34780o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.d$c */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class c implements MenuItemHoverListener {

        /* JADX INFO: renamed from: z0.b.g.i.d$c$a */
        /* JADX INFO: compiled from: CascadingMenuPopup.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ d f34795f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ MenuItem f34796g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ MenuBuilder f34797h;

            public a(d dVar, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f34795f = dVar;
                this.f34796g = menuItem;
                this.f34797h = menuBuilder;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f34795f;
                if (dVar != null) {
                    CascadingMenuPopup.this.f34771F = true;
                    dVar.f34800b.m14769c(false);
                    CascadingMenuPopup.this.f34771F = false;
                }
                if (this.f34796g.isEnabled() && this.f34796g.hasSubMenu()) {
                    this.f34797h.m14784r(this.f34796g, 4);
                }
            }
        }

        public c() {
        }

        @Override // p636z0.p644b.p653h.MenuItemHoverListener
        /* JADX INFO: renamed from: d */
        public void mo14761d(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f34777l.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f34779n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == CascadingMenuPopup.this.f34779n.get(i).f34800b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            CascadingMenuPopup.this.f34777l.postAtTime(new a(i2 < CascadingMenuPopup.this.f34779n.size() ? CascadingMenuPopup.this.f34779n.get(i2) : null, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // p636z0.p644b.p653h.MenuItemHoverListener
        /* JADX INFO: renamed from: g */
        public void mo14762g(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f34777l.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.d$d */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final MenuPopupWindow f34799a;

        /* JADX INFO: renamed from: b */
        public final MenuBuilder f34800b;

        /* JADX INFO: renamed from: c */
        public final int f34801c;

        public d(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f34799a = menuPopupWindow;
            this.f34800b = menuBuilder;
            this.f34801c = i;
        }
    }

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.f34772g = context;
        this.f34785t = view;
        this.f34774i = i;
        this.f34775j = i2;
        this.f34776k = z;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        this.f34787v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f34773h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f34777l = new Handler();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: B */
    public void mo14742B(MenuPresenter.a aVar) {
        this.f34768C = aVar;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: D */
    public void mo246D(Parcelable parcelable) {
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        for (d dVar : this.f34779n) {
            if (subMenuBuilder == dVar.f34800b) {
                dVar.f34799a.f35096k.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        subMenuBuilder.m14768b(this, this.f34772g);
        if (mo14749a()) {
            m14760o(subMenuBuilder);
        } else {
            this.f34778m.add(subMenuBuilder);
        }
        MenuPresenter.a aVar = this.f34768C;
        if (aVar != null) {
            aVar.mo187d(subMenuBuilder);
        }
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: F */
    public Parcelable mo248F() {
        return null;
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: a */
    public boolean mo14749a() {
        return this.f34779n.size() > 0 && this.f34779n.get(0).f34799a.mo14749a();
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: b */
    public void mo14750b() {
        if (mo14749a()) {
            return;
        }
        Iterator<MenuBuilder> it = this.f34778m.iterator();
        while (it.hasNext()) {
            m14760o(it.next());
        }
        this.f34778m.clear();
        View view = this.f34785t;
        this.f34786u = view;
        if (view != null) {
            boolean z = this.f34769D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f34769D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f34780o);
            }
            this.f34786u.addOnAttachStateChangeListener(this.f34781p);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
        int size = this.f34779n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == this.f34779n.get(i).f34800b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f34779n.size()) {
            this.f34779n.get(i2).f34800b.m14769c(false);
        }
        d dVarRemove = this.f34779n.remove(i);
        dVarRemove.f34800b.m14787u(this);
        if (this.f34771F) {
            MenuPopupWindow menuPopupWindow = dVarRemove.f34799a;
            Objects.requireNonNull(menuPopupWindow);
            if (Build.VERSION.SDK_INT >= 23) {
                menuPopupWindow.f35093H.setExitTransition(null);
            }
            dVarRemove.f34799a.f35093H.setAnimationStyle(0);
        }
        dVarRemove.f34799a.dismiss();
        int size2 = this.f34779n.size();
        if (size2 > 0) {
            this.f34787v = this.f34779n.get(size2 - 1).f34801c;
        } else {
            View view = this.f34785t;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            this.f34787v = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.f34779n.get(0).f34800b.m14769c(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.a aVar = this.f34768C;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.f34769D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f34769D.removeGlobalOnLayoutListener(this.f34780o);
            }
            this.f34769D = null;
        }
        this.f34786u.removeOnAttachStateChangeListener(this.f34781p);
        this.f34770E.onDismiss();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: d */
    public void mo14751d(MenuBuilder menuBuilder) {
        menuBuilder.m14768b(this, this.f34772g);
        if (mo14749a()) {
            m14760o(menuBuilder);
        } else {
            this.f34778m.add(menuBuilder);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    public void dismiss() {
        int size = this.f34779n.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f34779n.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f34799a.mo14749a()) {
                    dVar.f34799a.dismiss();
                }
            }
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: f */
    public void mo14752f(View view) {
        if (this.f34785t != view) {
            this.f34785t = view;
            int i = this.f34783r;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            this.f34784s = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: g */
    public void mo14753g(boolean z) {
        this.f34766A = z;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: h */
    public void mo14754h(int i) {
        if (this.f34783r != i) {
            this.f34783r = i;
            View view = this.f34785t;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            this.f34784s = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: i */
    public ListView mo14755i() {
        if (this.f34779n.isEmpty()) {
            return null;
        }
        List<d> list = this.f34779n;
        return list.get(list.size() - 1).f34799a.f35096k;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: j */
    public void mo14756j(int i) {
        this.f34788w = true;
        this.f34790y = i;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: k */
    public void mo14757k(PopupWindow.OnDismissListener onDismissListener) {
        this.f34770E = onDismissListener;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: l */
    public void mo14758l(boolean z) {
        this.f34767B = z;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: m */
    public void mo14759m(int i) {
        this.f34789x = true;
        this.f34791z = i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8 A[PHI: r4
  0x01a8: PHI (r4v14 int) = (r4v13 int), (r4v5 int) binds: [B:82:0x01a4, B:78:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[PHI: r4
  0x01aa: PHI (r4v15 int) = (r4v5 int), (r4v16 int) binds: [B:81:0x01a2, B:80:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX INFO: renamed from: o */
    public final void m14760o(MenuBuilder menuBuilder) {
        d dVar;
        Rect rect;
        Rect rect2;
        int i;
        int i2;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i3;
        int i4;
        int i5;
        Method method;
        MenuItem item;
        MenuAdapter2 menuAdapter2;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f34772g);
        MenuAdapter2 menuAdapter3 = new MenuAdapter2(menuBuilder, layoutInflaterFrom, this.f34776k, R.layout.abc_cascading_menu_item_layout);
        if (!mo14749a() && this.f34766A) {
            menuAdapter3.f34814h = true;
        } else if (mo14749a()) {
            menuAdapter3.f34814h = MenuPopup.m14814n(menuBuilder);
        }
        View childAt = null;
        int iM14813e = MenuPopup.m14813e(menuAdapter3, null, this.f34772g, this.f34773h);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f34772g, null, this.f34774i, this.f34775j);
        menuPopupWindow.f35123J = this.f34782q;
        menuPopupWindow.f35110y = this;
        menuPopupWindow.f35093H.setOnDismissListener(this);
        menuPopupWindow.f35109x = this.f34785t;
        menuPopupWindow.f35105t = this.f34784s;
        menuPopupWindow.m14925s(true);
        menuPopupWindow.f35093H.setInputMethodMode(2);
        menuPopupWindow.mo14922p(menuAdapter3);
        menuPopupWindow.m14924r(iM14813e);
        menuPopupWindow.f35105t = this.f34784s;
        if (this.f34779n.size() > 0) {
            List<d> list = this.f34779n;
            dVar = list.get(list.size() - 1);
            MenuBuilder menuBuilder2 = dVar.f34800b;
            int size = menuBuilder2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = menuBuilder2.getItem(i6);
                if (item.hasSubMenu() && menuBuilder == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                DropDownListView dropDownListView = dVar.f34799a.f35096k;
                ListAdapter adapter = dropDownListView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter2 = (MenuAdapter2) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter2 = (MenuAdapter2) adapter;
                    headersCount = 0;
                }
                int count = menuAdapter2.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == menuAdapter2.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - dropDownListView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView.getChildCount()) {
                    childAt = dropDownListView.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    method = MenuPopupWindow.f35122I;
                    if (method != null) {
                        try {
                            method.invoke(menuPopupWindow.f35093H, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    menuPopupWindow.f35093H.setTouchModal(false);
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    menuPopupWindow.f35093H.setEnterTransition(null);
                }
                List<d> list2 = this.f34779n;
                DropDownListView dropDownListView2 = list2.get(list2.size() - 1).f34799a.f35096k;
                int[] iArr3 = new int[2];
                dropDownListView2.getLocationOnScreen(iArr3);
                Rect rect3 = new Rect();
                this.f34786u.getWindowVisibleDisplayFrame(rect3);
                i2 = (this.f34787v == 1 ? iArr3[0] - iM14813e >= 0 : (dropDownListView2.getWidth() + iArr3[0]) + iM14813e > rect3.right) ? 0 : 1;
                if (i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f34787v = i2;
                if (i >= 26) {
                    menuPopupWindow.f35109x = childAt;
                    i4 = 0;
                    i3 = 0;
                } else {
                    iArr = new int[2];
                    this.f34785t.getLocationOnScreen(iArr);
                    iArr2 = new int[2];
                    childAt.getLocationOnScreen(iArr2);
                    if ((this.f34784s & 7) == 5) {
                        iArr[0] = this.f34785t.getWidth() + iArr[0];
                        iArr2[0] = childAt.getWidth() + iArr2[0];
                    }
                    i3 = iArr2[0] - iArr[0];
                    i4 = iArr2[1] - iArr[1];
                }
                if ((this.f34784s & 5) == 5) {
                    if (z) {
                        i5 = i3 + iM14813e;
                    } else {
                        iM14813e = childAt.getWidth();
                        i5 = i3 - iM14813e;
                    }
                } else if (z) {
                    iM14813e = childAt.getWidth();
                    i5 = i3 + iM14813e;
                } else {
                    i5 = i3 - iM14813e;
                }
                menuPopupWindow.f35099n = i5;
                menuPopupWindow.f35104s = true;
                menuPopupWindow.f35103r = true;
                menuPopupWindow.m14920l(i4);
            } else {
                if (this.f34788w) {
                    menuPopupWindow.f35099n = this.f34790y;
                }
                if (this.f34789x) {
                    menuPopupWindow.m14920l(this.f34791z);
                }
                rect = this.f34887f;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                menuPopupWindow.f35091F = rect2;
            }
            this.f34779n.add(new d(menuPopupWindow, menuBuilder, this.f34787v));
            menuPopupWindow.mo14750b();
            DropDownListView dropDownListView3 = menuPopupWindow.f35096k;
            dropDownListView3.setOnKeyListener(this);
            if (dVar == null || !this.f34767B || menuBuilder.f34831n == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.f34831n);
            dropDownListView3.addHeaderView(frameLayout, null, false);
            menuPopupWindow.mo14750b();
            return;
        }
        dVar = null;
        childAt = null;
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                method = MenuPopupWindow.f35122I;
                if (method != null) {
                    method.invoke(menuPopupWindow.f35093H, Boolean.FALSE);
                }
            } else {
                menuPopupWindow.f35093H.setTouchModal(false);
            }
            i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                menuPopupWindow.f35093H.setEnterTransition(null);
            }
            List<d> list3 = this.f34779n;
            DropDownListView dropDownListView4 = list3.get(list3.size() - 1).f34799a.f35096k;
            int[] iArr4 = new int[2];
            dropDownListView4.getLocationOnScreen(iArr4);
            Rect rect4 = new Rect();
            this.f34786u.getWindowVisibleDisplayFrame(rect4);
            if (this.f34787v == 1) {
            }
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f34787v = i2;
            if (i >= 26) {
                menuPopupWindow.f35109x = childAt;
                i4 = 0;
                i3 = 0;
            } else {
                iArr = new int[2];
                this.f34785t.getLocationOnScreen(iArr);
                iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if ((this.f34784s & 7) == 5) {
                    iArr[0] = this.f34785t.getWidth() + iArr[0];
                    iArr2[0] = childAt.getWidth() + iArr2[0];
                }
                i3 = iArr2[0] - iArr[0];
                i4 = iArr2[1] - iArr[1];
            }
            if ((this.f34784s & 5) == 5) {
                if (z) {
                    i5 = i3 + iM14813e;
                } else {
                    iM14813e = childAt.getWidth();
                    i5 = i3 - iM14813e;
                }
            } else if (z) {
                iM14813e = childAt.getWidth();
                i5 = i3 + iM14813e;
            } else {
                i5 = i3 - iM14813e;
            }
            menuPopupWindow.f35099n = i5;
            menuPopupWindow.f35104s = true;
            menuPopupWindow.f35103r = true;
            menuPopupWindow.m14920l(i4);
        } else {
            if (this.f34788w) {
                menuPopupWindow.f35099n = this.f34790y;
            }
            if (this.f34789x) {
                menuPopupWindow.m14920l(this.f34791z);
            }
            rect = this.f34887f;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            menuPopupWindow.f35091F = rect2;
        }
        this.f34779n.add(new d(menuPopupWindow, menuBuilder, this.f34787v));
        menuPopupWindow.mo14750b();
        DropDownListView dropDownListView5 = menuPopupWindow.f35096k;
        dropDownListView5.setOnKeyListener(this);
        if (dVar == null) {
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f34779n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f34779n.get(i);
            if (!dVar.f34799a.mo14749a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f34800b.m14769c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: x */
    public void mo251x(boolean z) {
        Iterator<d> it = this.f34779n.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f34799a.f35096k.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter2) adapter).notifyDataSetChanged();
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: y */
    public boolean mo252y() {
        return false;
    }
}
