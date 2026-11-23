package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.g.i.l, reason: use source file name */
/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuPopupHelper {

    /* JADX INFO: renamed from: a */
    public final Context f34888a;

    /* JADX INFO: renamed from: b */
    public final MenuBuilder f34889b;

    /* JADX INFO: renamed from: c */
    public final boolean f34890c;

    /* JADX INFO: renamed from: d */
    public final int f34891d;

    /* JADX INFO: renamed from: e */
    public final int f34892e;

    /* JADX INFO: renamed from: f */
    public View f34893f;

    /* JADX INFO: renamed from: g */
    public int f34894g;

    /* JADX INFO: renamed from: h */
    public boolean f34895h;

    /* JADX INFO: renamed from: i */
    public MenuPresenter.a f34896i;

    /* JADX INFO: renamed from: j */
    public MenuPopup f34897j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f34898k;

    /* JADX INFO: renamed from: l */
    public final PopupWindow.OnDismissListener f34899l;

    /* JADX INFO: renamed from: z0.b.g.i.l$a */
    /* JADX INFO: compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MenuPopupHelper.this.mo14817c();
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, R.attr.popupMenuStyle, 0);
    }

    /* JADX INFO: renamed from: a */
    public MenuPopup m14815a() {
        if (this.f34897j == null) {
            Display defaultDisplay = ((WindowManager) this.f34888a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            MenuPopup cascadingMenuPopup = Math.min(point.x, point.y) >= this.f34888a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.f34888a, this.f34893f, this.f34891d, this.f34892e, this.f34890c) : new StandardMenuPopup(this.f34888a, this.f34889b, this.f34893f, this.f34891d, this.f34892e, this.f34890c);
            cascadingMenuPopup.mo14751d(this.f34889b);
            cascadingMenuPopup.mo14757k(this.f34899l);
            cascadingMenuPopup.mo14752f(this.f34893f);
            cascadingMenuPopup.mo14742B(this.f34896i);
            cascadingMenuPopup.mo14753g(this.f34895h);
            cascadingMenuPopup.mo14754h(this.f34894g);
            this.f34897j = cascadingMenuPopup;
        }
        return this.f34897j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m14816b() {
        MenuPopup menuPopup = this.f34897j;
        return menuPopup != null && menuPopup.mo14749a();
    }

    /* JADX INFO: renamed from: c */
    public void mo14817c() {
        this.f34897j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f34898k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14818d(MenuPresenter.a aVar) {
        this.f34896i = aVar;
        MenuPopup menuPopup = this.f34897j;
        if (menuPopup != null) {
            menuPopup.mo14742B(aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14819e(int i, int i2, boolean z, boolean z2) {
        MenuPopup menuPopupM14815a = m14815a();
        menuPopupM14815a.mo14758l(z2);
        if (z) {
            int i3 = this.f34894g;
            View view = this.f34893f;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f34893f.getWidth();
            }
            menuPopupM14815a.mo14756j(i);
            menuPopupM14815a.mo14759m(i2);
            int i4 = (int) ((this.f34888a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            menuPopupM14815a.f34887f = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        menuPopupM14815a.mo14750b();
    }

    /* JADX INFO: renamed from: f */
    public boolean m14820f() {
        if (m14816b()) {
            return true;
        }
        if (this.f34893f == null) {
            return false;
        }
        m14819e(0, 0, false, false);
        return true;
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view) {
        this(context, menuBuilder, view, false, R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.f34894g = 8388611;
        this.f34899l = new a();
        this.f34888a = context;
        this.f34889b = menuBuilder;
        this.f34893f = view;
        this.f34890c = z;
        this.f34891d = i;
        this.f34892e = i2;
    }
}
