package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p644b.p645c.AlertDialog;

/* JADX INFO: renamed from: z0.b.g.i.e, reason: use source file name */
/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f */
    public Context f34802f;

    /* JADX INFO: renamed from: g */
    public LayoutInflater f34803g;

    /* JADX INFO: renamed from: h */
    public MenuBuilder f34804h;

    /* JADX INFO: renamed from: i */
    public ExpandedMenuView f34805i;

    /* JADX INFO: renamed from: j */
    public int f34806j;

    /* JADX INFO: renamed from: k */
    public int f34807k;

    /* JADX INFO: renamed from: l */
    public MenuPresenter.a f34808l;

    /* JADX INFO: renamed from: m */
    public a f34809m;

    /* JADX INFO: renamed from: z0.b.g.i.e$a */
    /* JADX INFO: compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: f */
        public int f34810f = -1;

        public a() {
            m14764a();
        }

        /* JADX INFO: renamed from: a */
        public void m14764a() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f34804h;
            MenuItemImpl menuItemImpl = menuBuilder.f34840w;
            if (menuItemImpl != null) {
                menuBuilder.m14775i();
                ArrayList<MenuItemImpl> arrayList = menuBuilder.f34828k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == menuItemImpl) {
                        this.f34810f = i;
                        return;
                    }
                }
            }
            this.f34810f = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItemImpl getItem(int i) {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f34804h;
            menuBuilder.m14775i();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.f34828k;
            Objects.requireNonNull(ListMenuPresenter.this);
            int i2 = i + 0;
            int i3 = this.f34810f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f34804h;
            menuBuilder.m14775i();
            int size = menuBuilder.f34828k.size();
            Objects.requireNonNull(ListMenuPresenter.this);
            int i = size + 0;
            return this.f34810f < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f34803g.inflate(listMenuPresenter.f34807k, viewGroup, false);
            }
            ((MenuView.a) view).mo144d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m14764a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.f34802f = context;
        this.f34803g = LayoutInflater.from(context);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: A */
    public boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: B */
    public void mo14742B(MenuPresenter.a aVar) {
        this.f34808l = aVar;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: C */
    public void mo245C(Context context, MenuBuilder menuBuilder) {
        if (this.f34806j != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f34806j);
            this.f34802f = contextThemeWrapper;
            this.f34803g = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f34802f != null) {
            this.f34802f = context;
            if (this.f34803g == null) {
                this.f34803g = LayoutInflater.from(context);
            }
        }
        this.f34804h = menuBuilder;
        a aVar = this.f34809m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: D */
    public void mo246D(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f34805i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper(subMenuBuilder);
        MenuBuilder menuBuilder = menuDialogHelper.f34843f;
        AlertDialog.a aVar = new AlertDialog.a(menuBuilder.f34819b);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        menuDialogHelper.f34845h = listMenuPresenter;
        listMenuPresenter.f34808l = menuDialogHelper;
        MenuBuilder menuBuilder2 = menuDialogHelper.f34843f;
        menuBuilder2.m14768b(listMenuPresenter, menuBuilder2.f34819b);
        ListAdapter listAdapterM14763a = menuDialogHelper.f34845h.m14763a();
        AlertController.C0050b c0050b = aVar.f34424a;
        c0050b.f236n = listAdapterM14763a;
        c0050b.f237o = menuDialogHelper;
        View view = menuBuilder.f34833p;
        if (view != null) {
            c0050b.f227e = view;
        } else {
            c0050b.f225c = menuBuilder.f34832o;
            aVar.setTitle(menuBuilder.f34831n);
        }
        aVar.f34424a.f234l = menuDialogHelper;
        AlertDialog alertDialogCreate = aVar.create();
        menuDialogHelper.f34844g = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.f34844g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.f34844g.show();
        MenuPresenter.a aVar2 = this.f34808l;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo187d(subMenuBuilder);
        return true;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: F */
    public Parcelable mo248F() {
        if (this.f34805i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f34805i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public ListAdapter m14763a() {
        if (this.f34809m == null) {
            this.f34809m = new a();
        }
        return this.f34809m;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.a aVar = this.f34808l;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
        this.f34804h.m14785s(this.f34809m.getItem(i), this, 0);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: w */
    public int mo250w() {
        return 0;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: x */
    public void mo251x(boolean z) {
        a aVar = this.f34809m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
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

    public ListMenuPresenter(int i, int i2) {
        this.f34807k = i;
        this.f34806j = i2;
    }
}
