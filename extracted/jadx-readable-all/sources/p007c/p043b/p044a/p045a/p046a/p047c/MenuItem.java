package p007c.p043b.p044a.p045a.p046a.p047c;

import android.view.View;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.a.c.a, reason: use source file name */
/* JADX INFO: compiled from: MenuItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItem {

    /* JADX INFO: renamed from: a */
    public final String f1846a;

    /* JADX INFO: renamed from: b */
    public final Integer f1847b;

    /* JADX INFO: renamed from: c */
    public final View.OnClickListener f1848c;

    public MenuItem(String str, View.OnClickListener onClickListener) {
        this(str, null, onClickListener, 2, null);
    }

    public MenuItem(String str, Integer num, View.OnClickListener onClickListener) {
        Intrinsics2.m13090f(str, "text");
        Intrinsics2.m13090f(onClickListener, "onClickListener");
        this.f1846a = str;
        this.f1847b = num;
        this.f1848c = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Intrinsics2.m13085a(this.f1846a, menuItem.f1846a) && Intrinsics2.m13085a(this.f1847b, menuItem.f1847b) && Intrinsics2.m13085a(this.f1848c, menuItem.f1848c);
    }

    public int hashCode() {
        String str = this.f1846a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f1847b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.f1848c;
        return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("MenuItem(text=");
        sbM1556G.append(this.f1846a);
        sbM1556G.append(", icon=");
        sbM1556G.append(this.f1847b);
        sbM1556G.append(", onClickListener=");
        sbM1556G.append(this.f1848c);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ MenuItem(String str, Integer num, View.OnClickListener onClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, onClickListener);
    }
}
