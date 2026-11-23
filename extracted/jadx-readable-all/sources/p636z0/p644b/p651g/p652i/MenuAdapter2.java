package p636z0.p644b.p651g.p652i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.b.g.i.f, reason: use source file name */
/* JADX INFO: compiled from: MenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuAdapter2 extends BaseAdapter {

    /* JADX INFO: renamed from: f */
    public MenuBuilder f34812f;

    /* JADX INFO: renamed from: g */
    public int f34813g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f34814h;

    /* JADX INFO: renamed from: i */
    public final boolean f34815i;

    /* JADX INFO: renamed from: j */
    public final LayoutInflater f34816j;

    /* JADX INFO: renamed from: k */
    public final int f34817k;

    public MenuAdapter2(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f34815i = z;
        this.f34816j = layoutInflater;
        this.f34812f = menuBuilder;
        this.f34817k = i;
        m14766a();
    }

    /* JADX INFO: renamed from: a */
    public void m14766a() {
        MenuBuilder menuBuilder = this.f34812f;
        MenuItemImpl menuItemImpl = menuBuilder.f34840w;
        if (menuItemImpl != null) {
            menuBuilder.m14775i();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.f34828k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == menuItemImpl) {
                    this.f34813g = i;
                    return;
                }
            }
        }
        this.f34813g = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> arrayListM14778l;
        if (this.f34815i) {
            MenuBuilder menuBuilder = this.f34812f;
            menuBuilder.m14775i();
            arrayListM14778l = menuBuilder.f34828k;
        } else {
            arrayListM14778l = this.f34812f.m14778l();
        }
        int i2 = this.f34813g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListM14778l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> arrayListM14778l;
        if (this.f34815i) {
            MenuBuilder menuBuilder = this.f34812f;
            menuBuilder.m14775i();
            arrayListM14778l = menuBuilder.f34828k;
        } else {
            arrayListM14778l = this.f34812f.m14778l();
        }
        return this.f34813g < 0 ? arrayListM14778l.size() : arrayListM14778l.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f34816j.inflate(this.f34817k, viewGroup, false);
        }
        int i2 = getItem(i).f34851b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f34812f.mo14779m() && i2 != (i3 >= 0 ? getItem(i3).f34851b : i2));
        MenuView.a aVar = (MenuView.a) view;
        if (this.f34814h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo144d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m14766a();
        super.notifyDataSetChanged();
    }
}
