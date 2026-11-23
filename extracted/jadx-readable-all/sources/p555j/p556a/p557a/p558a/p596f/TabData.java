package p555j.p556a.p557a.p558a.p596f;

import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p483s.Collections4;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: j.a.a.a.f.g, reason: use source file name */
/* JADX INFO: compiled from: TabData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TabData {

    /* JADX INFO: renamed from: a */
    public final String f32072a;

    /* JADX INFO: renamed from: b */
    public final int f32073b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6164l<List<String>, Fragment> f32074c;

    /* JADX INFO: renamed from: d */
    public final List<String> f32075d;

    /* JADX WARN: Multi-variable type inference failed */
    public TabData(String str, int i, InterfaceC6164l<? super List<String>, ? extends Fragment> interfaceC6164l, List<String> list) {
        Intrinsics2.m13089e(str, "id");
        Intrinsics2.m13089e(interfaceC6164l, "fragment");
        Intrinsics2.m13089e(list, "arguments");
        this.f32072a = str;
        this.f32073b = i;
        this.f32074c = interfaceC6164l;
        this.f32075d = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabData)) {
            return false;
        }
        TabData tabData = (TabData) obj;
        return Intrinsics2.m13085a(this.f32072a, tabData.f32072a) && this.f32073b == tabData.f32073b && Intrinsics2.m13085a(this.f32074c, tabData.f32074c) && Intrinsics2.m13085a(this.f32075d, tabData.f32075d);
    }

    public int hashCode() {
        String str = this.f32072a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f32073b) * 31;
        InterfaceC6164l<List<String>, Fragment> interfaceC6164l = this.f32074c;
        int iHashCode2 = (iHashCode + (interfaceC6164l != null ? interfaceC6164l.hashCode() : 0)) * 31;
        List<String> list = this.f32075d;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("TabData(id=");
        sbM1556G.append(this.f32072a);
        sbM1556G.append(", text=");
        sbM1556G.append(this.f32073b);
        sbM1556G.append(", fragment=");
        sbM1556G.append(this.f32074c);
        sbM1556G.append(", arguments=");
        sbM1556G.append(this.f32075d);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ TabData(String str, int i, InterfaceC6164l interfaceC6164l, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, interfaceC6164l, (i2 & 8) != 0 ? Collections4.f29519f : list);
    }
}
