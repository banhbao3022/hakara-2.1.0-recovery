package p636z0.p770y;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p770y.p771t.C8457a;

/* JADX INFO: renamed from: z0.y.j, reason: use source file name */
/* JADX INFO: compiled from: NavDestination.java */
/* JADX INFO: loaded from: classes.dex */
public class NavDestination {

    /* JADX INFO: renamed from: f */
    public final String f39031f;

    /* JADX INFO: renamed from: g */
    public NavGraph f39032g;

    /* JADX INFO: renamed from: h */
    public int f39033h;

    /* JADX INFO: renamed from: i */
    public String f39034i;

    /* JADX INFO: renamed from: j */
    public CharSequence f39035j;

    /* JADX INFO: renamed from: k */
    public ArrayList<NavDeepLink> f39036k;

    /* JADX INFO: renamed from: l */
    public SparseArrayCompat<NavAction> f39037l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, NavArgument> f39038m;

    /* JADX INFO: renamed from: z0.y.j$a */
    /* JADX INFO: compiled from: NavDestination.java */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: f */
        public final NavDestination f39039f;

        /* JADX INFO: renamed from: g */
        public final Bundle f39040g;

        /* JADX INFO: renamed from: h */
        public final boolean f39041h;

        /* JADX INFO: renamed from: i */
        public final boolean f39042i;

        /* JADX INFO: renamed from: j */
        public final int f39043j;

        public a(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
            this.f39039f = navDestination;
            this.f39040g = bundle;
            this.f39041h = z;
            this.f39042i = z2;
            this.f39043j = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z = this.f39041h;
            if (z && !aVar.f39041h) {
                return 1;
            }
            if (!z && aVar.f39041h) {
                return -1;
            }
            Bundle bundle = this.f39040g;
            if (bundle != null && aVar.f39040g == null) {
                return 1;
            }
            if (bundle == null && aVar.f39040g != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f39040g.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f39042i;
            if (z2 && !aVar.f39042i) {
                return 1;
            }
            if (z2 || !aVar.f39042i) {
                return this.f39043j - aVar.f39043j;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.m16926b(navigator.getClass()));
    }

    /* JADX INFO: renamed from: h */
    public static String m16907h(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m16908c(Bundle bundle) {
        HashMap<String, NavArgument> map;
        if (bundle == null && ((map = this.f39038m) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, NavArgument> map2 = this.f39038m;
        if (map2 != null) {
            for (Map.Entry<String, NavArgument> entry : map2.entrySet()) {
                NavArgument value = entry.getValue();
                String key = entry.getKey();
                if (value.f38993c) {
                    value.f38991a.mo16923d(bundle2, key, value.f38994d);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, NavArgument> map3 = this.f39038m;
            if (map3 != null) {
                for (Map.Entry<String, NavArgument> entry2 : map3.entrySet()) {
                    NavArgument value2 = entry2.getValue();
                    String key2 = entry2.getKey();
                    boolean z = false;
                    if (value2.f38992b || !bundle2.containsKey(key2) || bundle2.get(key2) != null) {
                        try {
                            value2.f38991a.mo16920a(bundle2, key2);
                            z = true;
                        } catch (ClassCastException unused) {
                        }
                    }
                    if (!z) {
                        StringBuilder sbM1556G = outline.m1556G("Wrong argument type for '");
                        sbM1556G.append(entry2.getKey());
                        sbM1556G.append("' in argument bundle. ");
                        sbM1556G.append(entry2.getValue().f38991a.mo16921b());
                        sbM1556G.append(" expected.");
                        throw new IllegalArgumentException(sbM1556G.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: f */
    public final NavAction m16909f(int i) {
        SparseArrayCompat<NavAction> sparseArrayCompat = this.f39037l;
        NavAction navActionM15617g = sparseArrayCompat == null ? null : sparseArrayCompat.m15617g(i, null);
        if (navActionM15617g != null) {
            return navActionM15617g;
        }
        NavGraph navGraph = this.f39032g;
        if (navGraph != null) {
            return navGraph.m16909f(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public a mo16910j(NavDeepLinkRequest navDeepLinkRequest) {
        Bundle bundle;
        Bundle bundle2;
        Matcher matcher;
        Uri uri;
        Matcher matcher2;
        ArrayList<NavDeepLink> arrayList = this.f39036k;
        Bundle bundle3 = null;
        if (arrayList == null) {
            return null;
        }
        a aVar = null;
        for (NavDeepLink navDeepLink : arrayList) {
            Uri uri2 = navDeepLinkRequest.f39028a;
            if (uri2 != null) {
                HashMap<String, NavArgument> map = this.f39038m;
                Map mapEmptyMap = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
                Matcher matcher3 = navDeepLink.f39018d.matcher(uri2.toString());
                if (!matcher3.matches()) {
                    bundle2 = bundle3;
                    break;
                }
                bundle2 = new Bundle();
                int size = navDeepLink.f39016b.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        if (!navDeepLink.f39020f) {
                            break;
                        }
                        for (String str : navDeepLink.f39017c.keySet()) {
                            NavDeepLink.b bVar = navDeepLink.f39017c.get(str);
                            String queryParameter = uri2.getQueryParameter(str);
                            if (queryParameter != null) {
                                matcher2 = Pattern.compile(bVar.f39026a).matcher(queryParameter);
                                if (!matcher2.matches()) {
                                    matcher = matcher2;
                                }
                            } else {
                                matcher = bundle3;
                            }
                            matcher = matcher2;
                            int i2 = 0;
                            while (true) {
                                if (i2 < bVar.f39027b.size()) {
                                    String strDecode = matcher != 0 ? Uri.decode(matcher.group(i2 + 1)) : bundle3;
                                    String str2 = bVar.f39027b.get(i2);
                                    NavArgument navArgument = (NavArgument) mapEmptyMap.get(str2);
                                    if (strDecode != null) {
                                        uri = uri2;
                                        if (!strDecode.replaceAll("[{}]", "").equals(str2) && navDeepLink.m16905b(bundle2, str2, strDecode, navArgument)) {
                                            bundle2 = null;
                                            break;
                                        }
                                    } else {
                                        uri = uri2;
                                    }
                                    i2++;
                                    uri2 = uri;
                                    bundle3 = null;
                                }
                            }
                        }
                        break;
                    }
                    String str3 = navDeepLink.f39016b.get(i);
                    i++;
                    if (navDeepLink.m16905b(bundle2, str3, Uri.decode(matcher3.group(i)), (NavArgument) mapEmptyMap.get(str3))) {
                    }
                    bundle2 = bundle3;
                    break;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str4 = navDeepLinkRequest.f39029b;
            boolean z = str4 != null && str4.equals(navDeepLink.f39021g);
            String str5 = navDeepLinkRequest.f39030c;
            int iCompareTo = str5 != null ? (navDeepLink.f39023i == null || !navDeepLink.f39022h.matcher(str5).matches()) ? -1 : new NavDeepLink.a(navDeepLink.f39023i).compareTo(new NavDeepLink.a(str5)) : -1;
            if (bundle != null || z || iCompareTo > -1) {
                a aVar2 = new a(this, bundle, navDeepLink.f39019e, z, iCompareTo);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
            bundle3 = null;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: m */
    public void mo462m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C8457a.f39094e);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        this.f39033h = resourceId;
        this.f39034i = null;
        this.f39034i = m16907h(context, resourceId);
        this.f39035j = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f39034i;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f39033h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f39035j != null) {
            sb.append(" label=");
            sb.append(this.f39035j);
        }
        return sb.toString();
    }

    public NavDestination(String str) {
        this.f39031f = str;
    }
}
