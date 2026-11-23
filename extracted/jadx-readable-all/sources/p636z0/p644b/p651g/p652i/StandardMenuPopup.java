package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.p653h.DropDownListView;
import p636z0.p644b.p653h.MenuPopupWindow;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.g.i.q, reason: use source file name */
/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {

    /* JADX INFO: renamed from: g */
    public final Context f34902g;

    /* JADX INFO: renamed from: h */
    public final MenuBuilder f34903h;

    /* JADX INFO: renamed from: i */
    public final MenuAdapter2 f34904i;

    /* JADX INFO: renamed from: j */
    public final boolean f34905j;

    /* JADX INFO: renamed from: k */
    public final int f34906k;

    /* JADX INFO: renamed from: l */
    public final int f34907l;

    /* JADX INFO: renamed from: m */
    public final int f34908m;

    /* JADX INFO: renamed from: n */
    public final MenuPopupWindow f34909n;

    /* JADX INFO: renamed from: q */
    public PopupWindow.OnDismissListener f34912q;

    /* JADX INFO: renamed from: r */
    public View f34913r;

    /* JADX INFO: renamed from: s */
    public View f34914s;

    /* JADX INFO: renamed from: t */
    public MenuPresenter.a f34915t;

    /* JADX INFO: renamed from: u */
    public ViewTreeObserver f34916u;

    /* JADX INFO: renamed from: v */
    public boolean f34917v;

    /* JADX INFO: renamed from: w */
    public boolean f34918w;

    /* JADX INFO: renamed from: x */
    public int f34919x;

    /* JADX INFO: renamed from: z */
    public boolean f34921z;

    /* JADX INFO: renamed from: o */
    public final ViewTreeObserver.OnGlobalLayoutListener f34910o = new a();

    /* JADX INFO: renamed from: p */
    public final View.OnAttachStateChangeListener f34911p = new b();

    /* JADX INFO: renamed from: y */
    public int f34920y = 0;

    /* JADX INFO: renamed from: z0.b.g.i.q$a */
    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (StandardMenuPopup.this.mo14749a()) {
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                if (standardMenuPopup.f34909n.f35092G) {
                    return;
                }
                View view = standardMenuPopup.f34914s;
                if (view == null || !view.isShown()) {
                    StandardMenuPopup.this.dismiss();
                } else {
                    StandardMenuPopup.this.f34909n.mo14750b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.q$b */
    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.f34916u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.f34916u = view.getViewTreeObserver();
                }
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                standardMenuPopup.f34916u.removeGlobalOnLayoutListener(standardMenuPopup.f34910o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f34902g = context;
        this.f34903h = menuBuilder;
        this.f34905j = z;
        this.f34904i = new MenuAdapter2(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f34907l = i;
        this.f34908m = i2;
        Resources resources = context.getResources();
        this.f34906k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f34913r = view;
        this.f34909n = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.m14768b(this, context);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: B */
    public void mo14742B(MenuPresenter.a aVar) {
        this.f34915t = aVar;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: D */
    public void mo246D(Parcelable parcelable) {
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f34902g, subMenuBuilder, this.f34914s, this.f34905j, this.f34907l, this.f34908m);
            menuPopupHelper.m14818d(this.f34915t);
            boolean zM14814n = MenuPopup.m14814n(subMenuBuilder);
            menuPopupHelper.f34895h = zM14814n;
            MenuPopup menuPopup = menuPopupHelper.f34897j;
            if (menuPopup != null) {
                menuPopup.mo14753g(zM14814n);
            }
            menuPopupHelper.f34898k = this.f34912q;
            this.f34912q = null;
            this.f34903h.m14769c(false);
            MenuPopupWindow menuPopupWindow = this.f34909n;
            int width = menuPopupWindow.f35099n;
            int i = !menuPopupWindow.f35102q ? 0 : menuPopupWindow.f35100o;
            int i2 = this.f34920y;
            View view = this.f34913r;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.f34913r.getWidth();
            }
            if (menuPopupHelper.m14816b()) {
                z = true;
            } else if (menuPopupHelper.f34893f == null) {
                z = false;
            } else {
                menuPopupHelper.m14819e(width, i, true, true);
                z = true;
            }
            if (z) {
                MenuPresenter.a aVar = this.f34915t;
                if (aVar != null) {
                    aVar.mo187d(subMenuBuilder);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: F */
    public Parcelable mo248F() {
        return null;
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: a */
    public boolean mo14749a() {
        return !this.f34917v && this.f34909n.mo14749a();
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: b */
    public void mo14750b() {
        View view;
        boolean z = false;
        if (mo14749a()) {
            z = true;
        } else if (!this.f34917v && (view = this.f34913r) != null) {
            this.f34914s = view;
            this.f34909n.f35093H.setOnDismissListener(this);
            MenuPopupWindow menuPopupWindow = this.f34909n;
            menuPopupWindow.f35110y = this;
            menuPopupWindow.m14925s(true);
            View view2 = this.f34914s;
            boolean z2 = this.f34916u == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f34916u = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f34910o);
            }
            view2.addOnAttachStateChangeListener(this.f34911p);
            MenuPopupWindow menuPopupWindow2 = this.f34909n;
            menuPopupWindow2.f35109x = view2;
            menuPopupWindow2.f35105t = this.f34920y;
            if (!this.f34918w) {
                this.f34919x = MenuPopup.m14813e(this.f34904i, null, this.f34902g, this.f34906k);
                this.f34918w = true;
            }
            this.f34909n.m14924r(this.f34919x);
            this.f34909n.f35093H.setInputMethodMode(2);
            MenuPopupWindow menuPopupWindow3 = this.f34909n;
            Rect rect = this.f34887f;
            Objects.requireNonNull(menuPopupWindow3);
            menuPopupWindow3.f35091F = rect != null ? new Rect(rect) : null;
            this.f34909n.mo14750b();
            DropDownListView dropDownListView = this.f34909n.f35096k;
            dropDownListView.setOnKeyListener(this);
            if (this.f34921z && this.f34903h.f34831n != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f34902g).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(this.f34903h.f34831n);
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
            this.f34909n.mo14922p(this.f34904i);
            this.f34909n.mo14750b();
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f34903h) {
            return;
        }
        dismiss();
        MenuPresenter.a aVar = this.f34915t;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, z);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: d */
    public void mo14751d(MenuBuilder menuBuilder) {
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    public void dismiss() {
        if (mo14749a()) {
            this.f34909n.dismiss();
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: f */
    public void mo14752f(View view) {
        this.f34913r = view;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: g */
    public void mo14753g(boolean z) {
        this.f34904i.f34814h = z;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: h */
    public void mo14754h(int i) {
        this.f34920y = i;
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: i */
    public ListView mo14755i() {
        return this.f34909n.f35096k;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: j */
    public void mo14756j(int i) {
        this.f34909n.f35099n = i;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: k */
    public void mo14757k(PopupWindow.OnDismissListener onDismissListener) {
        this.f34912q = onDismissListener;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: l */
    public void mo14758l(boolean z) {
        this.f34921z = z;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPopup
    /* JADX INFO: renamed from: m */
    public void mo14759m(int i) {
        MenuPopupWindow menuPopupWindow = this.f34909n;
        menuPopupWindow.f35100o = i;
        menuPopupWindow.f35102q = true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f34917v = true;
        this.f34903h.m14769c(true);
        ViewTreeObserver viewTreeObserver = this.f34916u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f34916u = this.f34914s.getViewTreeObserver();
            }
            this.f34916u.removeGlobalOnLayoutListener(this.f34910o);
            this.f34916u = null;
        }
        this.f34914s.removeOnAttachStateChangeListener(this.f34911p);
        PopupWindow.OnDismissListener onDismissListener = this.f34912q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f34918w = false;
        MenuAdapter2 menuAdapter2 = this.f34904i;
        if (menuAdapter2 != null) {
            menuAdapter2.notifyDataSetChanged();
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: y */
    public boolean mo252y() {
        return false;
    }
}
