package p007c.p071d.p078c.p079a;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p667e.p676b.p677v1.AutoValue_SurfaceConfig;
import p636z0.p667e.p676b.p677v1.SurfaceCombination;
import p636z0.p667e.p676b.p677v1.SurfaceConfig;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.d.c.a.a, reason: use source file name */
/* JADX INFO: compiled from: outline */
/* JADX INFO: loaded from: classes.dex */
public class outline {
    /* JADX INFO: renamed from: A */
    public static String m1550A(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static String m1551B(StringBuilder sb, String str, String str2, int i) {
        sb.append(str);
        sb.append(str2);
        sb.append(C7804v0.m15335x(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m1552C(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public static String m1553D(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static String m1554E(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: F */
    public static StringBuilder m1555F(char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        return sb;
    }

    /* JADX INFO: renamed from: G */
    public static StringBuilder m1556G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: H */
    public static StringBuilder m1557H(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: I */
    public static int m1558I(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    /* JADX INFO: renamed from: J */
    public static StringBuilder m1559J(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: K */
    public static StringBuilder m1560K(String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: L */
    public static StringBuilder m1561L(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: M */
    public static StringBuilder m1562M(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: N */
    public static void m1563N(int i, HashMap map, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
        map.put(str3, Integer.valueOf(i3));
        map.put(str4, Integer.valueOf(i4));
    }

    /* JADX INFO: renamed from: O */
    public static void m1564O(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }

    /* JADX INFO: renamed from: P */
    public static void m1565P(String str, int i, String str2) {
        Log.w(str2, str + i);
    }

    /* JADX INFO: renamed from: Q */
    public static void m1566Q(String str, String str2, Logger4 logger4) {
        logger4.m11713b(str + str2);
    }

    /* JADX INFO: renamed from: R */
    public static void m1567R(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    /* JADX INFO: renamed from: S */
    public static void m1568S(StringBuilder sb, long j2, String str) {
        sb.append(j2);
        Log.w(str, sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public static int m1569T(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: U */
    public static void m1570U(StringBuilder sb, String str, long j2, String str2) {
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: V */
    public static void m1571V(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.w(str2, sb.toString());
    }

    /* JADX INFO: renamed from: W */
    public static void m1572W(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: X */
    public static void m1573X(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        Log.w(str4, sb.toString());
    }

    /* JADX INFO: renamed from: Y */
    public static void m1574Y(Object[] objArr, int i, String str, String str2, TextView textView) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i));
        Intrinsics2.m13088d(str3, str2);
        textView.setText(str3);
    }

    /* JADX INFO: renamed from: Z */
    public static Bundle m1575Z(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    /* JADX INFO: renamed from: a */
    public static float m1576a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: a0 */
    public static RemoteException m1577a0(String str, Throwable th) {
        C2622l.m5438t3(str, th);
        return new RemoteException();
    }

    /* JADX INFO: renamed from: b */
    public static int m1578b(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: b0 */
    public static View m1579b0(BottomSheetDialog bottomSheetDialog, View view, View view2, String str, int i) {
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(view2, str);
        return view.findViewById(i);
    }

    /* JADX INFO: renamed from: c */
    public static SurfaceCombination m1580c(List list, AutoValue_SurfaceConfig autoValue_SurfaceConfig, ArrayList arrayList, SurfaceCombination surfaceCombination) {
        list.add(autoValue_SurfaceConfig);
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    /* JADX INFO: renamed from: c0 */
    public static AutoValue_SurfaceConfig m1581c0(List list, AutoValue_SurfaceConfig autoValue_SurfaceConfig, SurfaceConfig.b bVar, SurfaceConfig.a aVar) {
        list.add(autoValue_SurfaceConfig);
        return new AutoValue_SurfaceConfig(bVar, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static Format.b m1582d(int i) {
        Format.b bVar = new Format.b();
        bVar.m3520b(i);
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC2799a m1583e(Parcel parcel) {
        InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
        parcel.recycle();
        return interfaceC2799aM5638i1;
    }

    /* JADX INFO: renamed from: f */
    public static Object m1584f(String str, Class cls) {
        return new GsonBuilder().m12322a().m12315b(str, cls);
    }

    /* JADX INFO: renamed from: g */
    public static String m1585g(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m1586h(int i, String str, int i2, String str2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m1587i(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m1588j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m574A());
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m1589k(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m1590l(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: m */
    public static int m1591m(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: n */
    public static String m1592n(String str, int i, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: o */
    public static String m1593o(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* JADX INFO: renamed from: p */
    public static String m1594p(String str, long j2) {
        return str + j2;
    }

    /* JADX INFO: renamed from: q */
    public static String m1595q(String str, long j2, String str2) {
        return str + j2 + str2;
    }

    /* JADX INFO: renamed from: r */
    public static String m1596r(String str, Uri uri) {
        return str + uri;
    }

    /* JADX INFO: renamed from: s */
    public static String m1597s(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* JADX INFO: renamed from: t */
    public static String m1598t(String str, Object obj) {
        return str + obj;
    }

    /* JADX INFO: renamed from: u */
    public static String m1599u(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: v */
    public static String m1600v(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: w */
    public static String m1601w(String str, Type type) {
        return str + type;
    }

    /* JADX INFO: renamed from: x */
    public static int m1602x(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: y */
    public static String m1603y(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m1604z(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(C7804v0.m15335x(i));
        return sb.toString();
    }
}
