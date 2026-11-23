package p007c.p190n.p194b.p334e.p347h;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import p007c.p190n.p194b.p334e.p342e.BadgeDrawable;
import p007c.p190n.p194b.p334e.p360t.ParcelableSparseArray;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p651g.p652i.SubMenuBuilder;
import p636z0.p685e0.TransitionManager;

/* JADX INFO: renamed from: c.n.b.e.h.d, reason: use source file name */
/* JADX INFO: compiled from: BottomNavigationPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationPresenter implements MenuPresenter {

    /* JADX INFO: renamed from: f */
    public MenuBuilder f25049f;

    /* JADX INFO: renamed from: g */
    public BottomNavigationMenuView f25050g;

    /* JADX INFO: renamed from: h */
    public boolean f25051h = false;

    /* JADX INFO: renamed from: i */
    public int f25052i;

    /* JADX INFO: renamed from: c.n.b.e.h.d$a */
    /* JADX INFO: compiled from: BottomNavigationPresenter.java */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C8519a();

        /* JADX INFO: renamed from: f */
        public int f25053f;

        /* JADX INFO: renamed from: g */
        public ParcelableSparseArray f25054g;

        /* JADX INFO: renamed from: c.n.b.e.h.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BottomNavigationPresenter.java */
        public static class C8519a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f25053f);
            parcel.writeParcelable(this.f25054g, 0);
        }

        public a(Parcel parcel) {
            this.f25053f = parcel.readInt();
            this.f25054g = (ParcelableSparseArray) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: A */
    public boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: C */
    public void mo245C(Context context, MenuBuilder menuBuilder) {
        this.f25049f = menuBuilder;
        this.f25050g.f25028G = menuBuilder;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: D */
    public void mo246D(Parcelable parcelable) {
        if (parcelable instanceof a) {
            BottomNavigationMenuView bottomNavigationMenuView = this.f25050g;
            a aVar = (a) parcelable;
            int i = aVar.f25053f;
            int size = bottomNavigationMenuView.f25028G.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = bottomNavigationMenuView.f25028G.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.f25041t = i;
                    bottomNavigationMenuView.f25042u = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f25050g.getContext();
            ParcelableSparseArray parcelableSparseArray = aVar.f25054g;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable.a aVar2 = (BadgeDrawable.a) parcelableSparseArray.valueAt(i3);
                if (aVar2 == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                badgeDrawable.m11100j(aVar2.f24964j);
                int i4 = aVar2.f24963i;
                if (i4 != -1) {
                    badgeDrawable.m11101k(i4);
                }
                badgeDrawable.m11097g(aVar2.f24960f);
                badgeDrawable.m11099i(aVar2.f24961g);
                badgeDrawable.m11098h(aVar2.f24968n);
                badgeDrawable.f24951m.f24970p = aVar2.f24970p;
                badgeDrawable.m11103m();
                badgeDrawable.f24951m.f24971q = aVar2.f24971q;
                badgeDrawable.m11103m();
                boolean z = aVar2.f24969o;
                badgeDrawable.setVisible(z, false);
                badgeDrawable.f24951m.f24969o = z;
                sparseArray.put(iKeyAt, badgeDrawable);
            }
            this.f25050g.setBadgeDrawables(sparseArray);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: E */
    public boolean mo247E(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: F */
    public Parcelable mo248F() {
        a aVar = new a();
        aVar.f25053f = this.f25050g.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f25050g.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            if (badgeDrawableValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.f24951m);
        }
        aVar.f25054g = parcelableSparseArray;
        return aVar;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: c */
    public void mo249c(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: w */
    public int mo250w() {
        return this.f25052i;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter
    /* JADX INFO: renamed from: x */
    public void mo251x(boolean z) {
        if (this.f25051h) {
            return;
        }
        if (z) {
            this.f25050g.m11118a();
            return;
        }
        BottomNavigationMenuView bottomNavigationMenuView = this.f25050g;
        MenuBuilder menuBuilder = bottomNavigationMenuView.f25028G;
        if (menuBuilder == null || bottomNavigationMenuView.f25040s == null) {
            return;
        }
        int size = menuBuilder.size();
        if (size != bottomNavigationMenuView.f25040s.length) {
            bottomNavigationMenuView.m11118a();
            return;
        }
        int i = bottomNavigationMenuView.f25041t;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = bottomNavigationMenuView.f25028G.getItem(i2);
            if (item.isChecked()) {
                bottomNavigationMenuView.f25041t = item.getItemId();
                bottomNavigationMenuView.f25042u = i2;
            }
        }
        if (i != bottomNavigationMenuView.f25041t) {
            TransitionManager.m15519a(bottomNavigationMenuView, bottomNavigationMenuView.f25029h);
        }
        boolean zM11120d = bottomNavigationMenuView.m11120d(bottomNavigationMenuView.f25039r, bottomNavigationMenuView.f25028G.m14778l().size());
        for (int i3 = 0; i3 < size; i3++) {
            bottomNavigationMenuView.f25027F.f25051h = true;
            bottomNavigationMenuView.f25040s[i3].setLabelVisibilityMode(bottomNavigationMenuView.f25039r);
            bottomNavigationMenuView.f25040s[i3].setShifting(zM11120d);
            bottomNavigationMenuView.f25040s[i3].mo144d((MenuItemImpl) bottomNavigationMenuView.f25028G.getItem(i3), 0);
            bottomNavigationMenuView.f25027F.f25051h = false;
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
