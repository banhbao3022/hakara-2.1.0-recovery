package p007c.p008a.p009a.p010a.p028j;

import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import p007c.p008a.p009a.p010a.C0244f;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.CollectionsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.j.a, reason: use source file name */
/* JADX INFO: compiled from: DeviceUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceUtil {

    /* JADX INFO: renamed from: a */
    public final List<a> f1661a = CollectionsJVM.m13036a(new a("Amazon", null, 2, 0 == true ? 1 : 0));

    /* JADX INFO: renamed from: c.a.a.a.j.a$a */
    /* JADX INFO: compiled from: DeviceUtil.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f1662a;

        /* JADX INFO: renamed from: b */
        public final String f1663b;

        public a(String str, String str2) {
            Intrinsics2.m13089e(str, "manufacturer");
            this.f1662a = str;
            this.f1663b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics2.m13085a(this.f1662a, aVar.f1662a) && Intrinsics2.m13085a(this.f1663b, aVar.f1663b);
        }

        public int hashCode() {
            String str = this.f1662a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f1663b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Device(manufacturer=");
            sbM1556G.append(this.f1662a);
            sbM1556G.append(", model=");
            return outline.m1550A(sbM1556G, this.f1663b, ")");
        }

        public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1211a(Context context) {
        boolean z;
        boolean zM12989f;
        Intrinsics2.m13089e(context, "context");
        Iterator<a> it = this.f1661a.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                zM12989f = false;
                break;
            }
            a next = it.next();
            if (StringsJVM.m12989f(Build.MANUFACTURER, next.f1662a, true)) {
                String str = next.f1663b;
                if (str == null) {
                    zM12989f = true;
                    break;
                }
                zM12989f = StringsJVM.m12989f(Build.DEVICE, str, true);
                break;
            }
        }
        if (!zM12989f) {
            return true;
        }
        if (StringsJVM.m12989f(Build.MANUFACTURER, "Amazon", true)) {
            C0244f.m1020i(context);
            z = true;
        }
        return z;
    }
}
