package p007c.p190n.p194b.p266d.p314j.p315a;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xj1 implements wj1 {

    /* JADX INFO: renamed from: a */
    public final Object[] f21560a;

    public xj1(ew2 ew2Var, String str, int i, String str2, qw2 qw2Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(ew2Var.f13714g));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m8738a(ew2Var.f13715h));
        } else if (hashSet.contains("npa")) {
            arrayList.add(ew2Var.f13715h.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(ew2Var.f13716i));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = ew2Var.f13717j;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(ew2Var.f13718k));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(ew2Var.f13719l));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(ew2Var.f13720m));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(ew2Var.f13721n);
        }
        if (hashSet.contains("location")) {
            Location location = ew2Var.f13723p;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(ew2Var.f13724q);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m8738a(ew2Var.f13725r));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m8738a(ew2Var.f13726s));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = ew2Var.f13727t;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(ew2Var.f13728u);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(ew2Var.f13729v);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(ew2Var.f13730w));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(ew2Var.f13732y));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(ew2Var.f13733z);
        }
        if (hashSet.contains("orientation")) {
            if (qw2Var != null) {
                arrayList.add(Integer.valueOf(qw2Var.f18655f));
            } else {
                arrayList.add(null);
            }
        }
        this.f21560a = arrayList.toArray();
    }

    /* JADX INFO: renamed from: a */
    public static String m8738a(Bundle bundle) {
        String strM8738a;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strM8738a = "null";
            } else {
                strM8738a = obj instanceof Bundle ? m8738a((Bundle) obj) : obj.toString();
            }
            sb.append(strM8738a);
        }
        return sb.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wj1
    public final boolean equals(Object obj) {
        if (obj instanceof xj1) {
            return Arrays.equals(this.f21560a, ((xj1) obj).f21560a);
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wj1
    public final int hashCode() {
        return Arrays.hashCode(this.f21560a);
    }

    public final String toString() {
        int iHashCode = Arrays.hashCode(this.f21560a);
        String string = Arrays.toString(this.f21560a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
