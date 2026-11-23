package p509g1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p477d1.Tuples;
import p477d1.TypeCastException;
import p477d1.p478a0.Progressions;
import p477d1.p478a0._Ranges;
import p477d1.p481d0.Strings5;
import p477d1.p481d0.StringsJVM;
import p477d1.p483s.Collections4;
import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.ArrayIterator;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.v, reason: use source file name */
/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Headers2 implements Iterable<Tuples<? extends String, ? extends String>>, KMarkers {

    /* JADX INFO: renamed from: f */
    public static final b f30638f = new b(null);

    /* JADX INFO: renamed from: g */
    public final String[] f30639g;

    /* JADX INFO: renamed from: g1.v$a */
    /* JADX INFO: compiled from: Headers.kt */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f30640a = new ArrayList(20);

        /* JADX INFO: renamed from: a */
        public final a m13655a(String str, String str2) {
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            b bVar = Headers2.f30638f;
            bVar.m13661a(str);
            bVar.m13662b(str2, str);
            m13657c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m13656b(String str) {
            Intrinsics2.m13090f(str, "line");
            int iM13011u = Strings5.m13011u(str, ':', 1, false, 4);
            if (iM13011u != -1) {
                String strSubstring = str.substring(0, iM13011u);
                Intrinsics2.m13086b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iM13011u + 1);
                Intrinsics2.m13086b(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                m13657c(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                Intrinsics2.m13086b(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                m13657c("", strSubstring3);
            } else {
                m13657c("", str);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m13657c(String str, String str2) {
            Intrinsics2.m13090f(str, "name");
            Intrinsics2.m13090f(str2, "value");
            this.f30640a.add(str);
            this.f30640a.add(Strings5.m13004G(str2).toString());
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final Headers2 m13658d() {
            Object[] array = this.f30640a.toArray(new String[0]);
            if (array != null) {
                return new Headers2((String[]) array, null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX INFO: renamed from: e */
        public final String m13659e(String str) {
            Intrinsics2.m13090f(str, "name");
            Progressions progressionsM12969d = _Ranges.m12969d(_Ranges.m12968c(this.f30640a.size() - 2, 0), 2);
            int i = progressionsM12969d.f29431g;
            int i2 = progressionsM12969d.f29432h;
            int i3 = progressionsM12969d.f29433i;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!StringsJVM.m12989f(str, this.f30640a.get(i), true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return this.f30640a.get(i + 1);
        }

        /* JADX INFO: renamed from: f */
        public final a m13660f(String str) {
            Intrinsics2.m13090f(str, "name");
            int i = 0;
            while (i < this.f30640a.size()) {
                if (StringsJVM.m12989f(str, this.f30640a.get(i), true)) {
                    this.f30640a.remove(i);
                    this.f30640a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: g1.v$b */
    /* JADX INFO: compiled from: Headers.kt */
    public static final class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m13661a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util9.m13369i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m13662b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(Util9.m13369i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final Headers2 m13663c(String... strArr) {
            Intrinsics2.m13090f(strArr, "namesAndValues");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) objClone;
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                if (!(strArr2[i] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr2[i];
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr2[i] = Strings5.m13004G(str).toString();
            }
            Progressions progressionsM12969d = _Ranges.m12969d(_Ranges.m12970e(0, strArr2.length), 2);
            int i2 = progressionsM12969d.f29431g;
            int i3 = progressionsM12969d.f29432h;
            int i4 = progressionsM12969d.f29433i;
            if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                while (true) {
                    String str2 = strArr2[i2];
                    String str3 = strArr2[i2 + 1];
                    m13661a(str2);
                    m13662b(str3, str2);
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
            return new Headers2(strArr2, null);
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Headers2(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30639g = strArr;
    }

    /* JADX INFO: renamed from: c */
    public final String m13649c(String str) {
        Intrinsics2.m13090f(str, "name");
        b bVar = f30638f;
        String[] strArr = this.f30639g;
        Objects.requireNonNull(bVar);
        Progressions progressionsM12969d = _Ranges.m12969d(_Ranges.m12968c(strArr.length - 2, 0), 2);
        int i = progressionsM12969d.f29431g;
        int i2 = progressionsM12969d.f29432h;
        int i3 = progressionsM12969d.f29433i;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!StringsJVM.m12989f(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers2) && Arrays.equals(this.f30639g, ((Headers2) obj).f30639g);
    }

    /* JADX INFO: renamed from: f */
    public final String m13650f(int i) {
        return this.f30639g[i * 2];
    }

    /* JADX INFO: renamed from: h */
    public final a m13651h() {
        a aVar = new a();
        List<String> list = aVar.f30640a;
        String[] strArr = this.f30639g;
        Intrinsics2.m13089e(list, "$this$addAll");
        Intrinsics2.m13089e(strArr, "elements");
        list.addAll(_ArraysJvm.m13027a(strArr));
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f30639g);
    }

    @Override // java.lang.Iterable
    public Iterator<Tuples<? extends String, ? extends String>> iterator() {
        int size = size();
        Tuples[] tuplesArr = new Tuples[size];
        for (int i = 0; i < size; i++) {
            tuplesArr[i] = new Tuples(m13650f(i), m13653m(i));
        }
        Intrinsics2.m13089e(tuplesArr, "array");
        return new ArrayIterator(tuplesArr);
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, List<String>> m13652j() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics2.m13088d(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM13650f = m13650f(i);
            Locale locale = Locale.US;
            Intrinsics2.m13086b(locale, "Locale.US");
            if (strM13650f == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strM13650f.toLowerCase(locale);
            Intrinsics2.m13086b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m13653m(i));
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: m */
    public final String m13653m(int i) {
        return this.f30639g[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: q */
    public final List<String> m13654q(String str) {
        Intrinsics2.m13090f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsJVM.m12989f(str, m13650f(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m13653m(i));
            }
        }
        if (arrayList == null) {
            return Collections4.f29519f;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics2.m13086b(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f30639g.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(m13650f(i));
            sb.append(": ");
            sb.append(m13653m(i));
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics2.m13086b(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
