package p636z0.p770y;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.y.h, reason: use source file name */
/* JADX INFO: compiled from: NavDeepLink.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavDeepLink {

    /* JADX INFO: renamed from: a */
    public static final Pattern f39015a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f39016b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Map<String, b> f39017c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Pattern f39018d;

    /* JADX INFO: renamed from: e */
    public boolean f39019e;

    /* JADX INFO: renamed from: f */
    public boolean f39020f;

    /* JADX INFO: renamed from: g */
    public final String f39021g;

    /* JADX INFO: renamed from: h */
    public Pattern f39022h;

    /* JADX INFO: renamed from: i */
    public final String f39023i;

    /* JADX INFO: renamed from: z0.y.h$a */
    /* JADX INFO: compiled from: NavDeepLink.java */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: f */
        public String f39024f;

        /* JADX INFO: renamed from: g */
        public String f39025g;

        public a(String str) {
            String[] strArrSplit = str.split("/", -1);
            this.f39024f = strArrSplit[0];
            this.f39025g = strArrSplit[1];
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i = this.f39024f.equals(aVar.f39024f) ? 2 : 0;
            return this.f39025g.equals(aVar.f39025g) ? i + 1 : i;
        }
    }

    /* JADX INFO: renamed from: z0.y.h$b */
    /* JADX INFO: compiled from: NavDeepLink.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f39026a;

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f39027b = new ArrayList<>();
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.f39018d = null;
        this.f39019e = false;
        this.f39020f = false;
        this.f39022h = null;
        this.f39021g = str2;
        this.f39023i = str3;
        if (str != null) {
            Uri uri = Uri.parse(str);
            int i = 1;
            this.f39020f = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f39015a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.f39020f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    m16904a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.f39019e = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    b bVar = new b();
                    int iEnd = 0;
                    while (matcher2.find()) {
                        bVar.f39027b.add(matcher2.group(i));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                        i = 1;
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    bVar.f39026a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f39017c.put(str4, bVar);
                    i = 1;
                }
            } else {
                this.f39019e = m16904a(str, sb, patternCompile);
            }
            this.f39018d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException(outline.m1600v("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            }
            a aVar = new a(str3);
            StringBuilder sbM1556G = outline.m1556G("^(");
            sbM1556G.append(aVar.f39024f);
            sbM1556G.append("|[*]+)/(");
            sbM1556G.append(aVar.f39025g);
            sbM1556G.append("|[*]+)$");
            this.f39022h = Pattern.compile(sbM1556G.toString().replace("*|[*]", "[\\s\\S]"));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16904a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int iEnd = 0;
        while (matcher.find()) {
            this.f39016b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16905b(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument == null) {
            bundle.putString(str, str2);
            return false;
        }
        NavType navType = navArgument.f38991a;
        try {
            navType.mo16923d(bundle, str, navType.mo16924e(str2));
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
