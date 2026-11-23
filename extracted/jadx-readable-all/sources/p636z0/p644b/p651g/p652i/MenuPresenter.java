package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: renamed from: z0.b.g.i.m, reason: use source file name */
/* JADX INFO: compiled from: MenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public interface MenuPresenter {

    /* JADX INFO: renamed from: z0.b.g.i.m$a */
    /* JADX INFO: compiled from: MenuPresenter.java */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo186c(MenuBuilder menuBuilder, boolean z);

        /* JADX INFO: renamed from: d */
        boolean mo187d(MenuBuilder menuBuilder);
    }

    /* JADX INFO: renamed from: A */
    boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    /* JADX INFO: renamed from: B */
    void mo14742B(a aVar);

    /* JADX INFO: renamed from: C */
    void mo245C(Context context, MenuBuilder menuBuilder);

    /* JADX INFO: renamed from: D */
    void mo246D(Parcelable parcelable);

    /* JADX INFO: renamed from: E */
    boolean mo247E(SubMenuBuilder subMenuBuilder);

    /* JADX INFO: renamed from: F */
    Parcelable mo248F();

    /* JADX INFO: renamed from: c */
    void mo249c(MenuBuilder menuBuilder, boolean z);

    /* JADX INFO: renamed from: w */
    int mo250w();

    /* JADX INFO: renamed from: x */
    void mo251x(boolean z);

    /* JADX INFO: renamed from: y */
    boolean mo252y();

    /* JADX INFO: renamed from: z */
    boolean mo253z(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);
}
