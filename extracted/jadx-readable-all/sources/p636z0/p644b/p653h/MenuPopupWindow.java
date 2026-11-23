package p636z0.p644b.p653h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p636z0.p644b.p651g.p652i.MenuAdapter2;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;

/* JADX INFO: renamed from: z0.b.h.m0, reason: use source file name */
/* JADX INFO: compiled from: MenuPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuPopupWindow extends ListPopupWindow2 implements MenuItemHoverListener {

    /* JADX INFO: renamed from: I */
    public static Method f35122I;

    /* JADX INFO: renamed from: J */
    public MenuItemHoverListener f35123J;

    /* JADX INFO: renamed from: z0.b.h.m0$a */
    /* JADX INFO: compiled from: MenuPopupWindow.java */
    public static class a extends DropDownListView {

        /* JADX INFO: renamed from: s */
        public final int f35124s;

        /* JADX INFO: renamed from: t */
        public final int f35125t;

        /* JADX INFO: renamed from: u */
        public MenuItemHoverListener f35126u;

        /* JADX INFO: renamed from: v */
        public MenuItem f35127v;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f35124s = 21;
                this.f35125t = 22;
            } else {
                this.f35124s = 22;
                this.f35125t = 21;
            }
        }

        @Override // p636z0.p644b.p653h.DropDownListView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            MenuAdapter2 menuAdapter2;
            int iPointToPosition;
            int i;
            if (this.f35126u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter2 = (MenuAdapter2) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    menuAdapter2 = (MenuAdapter2) adapter;
                }
                MenuItemImpl item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < menuAdapter2.getCount()) {
                    item = menuAdapter2.getItem(i);
                }
                MenuItem menuItem = this.f35127v;
                if (menuItem != item) {
                    MenuBuilder menuBuilder = menuAdapter2.f34812f;
                    if (menuItem != null) {
                        this.f35126u.mo14762g(menuBuilder, menuItem);
                    }
                    this.f35127v = item;
                    if (item != null) {
                        this.f35126u.mo14761d(menuBuilder, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f35124s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f35125t) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (MenuAdapter2) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter2) adapter).f34812f.m14769c(false);
            return true;
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.f35126u = menuItemHoverListener;
        }

        @Override // p636z0.p644b.p653h.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f35122I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p636z0.p644b.p653h.MenuItemHoverListener
    /* JADX INFO: renamed from: d */
    public void mo14761d(MenuBuilder menuBuilder, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f35123J;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.mo14761d(menuBuilder, menuItem);
        }
    }

    @Override // p636z0.p644b.p653h.MenuItemHoverListener
    /* JADX INFO: renamed from: g */
    public void mo14762g(MenuBuilder menuBuilder, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f35123J;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.mo14762g(menuBuilder, menuItem);
        }
    }

    @Override // p636z0.p644b.p653h.ListPopupWindow2
    /* JADX INFO: renamed from: q */
    public DropDownListView mo14923q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
