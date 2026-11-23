package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: z0.b.g.i.k, reason: use source file name */
/* JADX INFO: compiled from: MenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MenuPopup implements ShowableListMenu, MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f */
    public Rect f34887f;

    /* JADX INFO: renamed from: e */
    public static int m14813e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        MenuAdapter2 menuAdapter2 = (MenuAdapter2) listAdapter;
        int count = menuAdapter2.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = menuAdapter2.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = menuAdapter2.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m14814n(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: A */
    public boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: C */
    public void mo245C(Context context, MenuBuilder menuBuilder) {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14751d(MenuBuilder menuBuilder);

    /* JADX INFO: renamed from: f */
    public abstract void mo14752f(View view);

    /* JADX INFO: renamed from: g */
    public abstract void mo14753g(boolean z);

    /* JADX INFO: renamed from: h */
    public abstract void mo14754h(int i);

    /* JADX INFO: renamed from: j */
    public abstract void mo14756j(int i);

    /* JADX INFO: renamed from: k */
    public abstract void mo14757k(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: l */
    public abstract void mo14758l(boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo14759m(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter2) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter2) listAdapter).f34812f.m14785s((MenuItem) listAdapter.getItem(i), this, (this instanceof CascadingMenuPopup) ^ true ? 0 : 4);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: w */
    public int mo250w() {
        return 0;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: z */
    public boolean mo253z(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }
}
