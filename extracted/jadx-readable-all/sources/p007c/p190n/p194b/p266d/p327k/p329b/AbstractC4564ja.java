package p007c.p190n.p194b.p266d.p327k.p329b;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p007c.p190n.p194b.p266d.p314j.p325k.C4304q0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4332s0;

/* JADX INFO: renamed from: c.n.b.d.k.b.ja */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4564ja {

    /* JADX INFO: renamed from: a */
    public String f24043a;

    /* JADX INFO: renamed from: b */
    public int f24044b;

    /* JADX INFO: renamed from: c */
    public Boolean f24045c;

    /* JADX INFO: renamed from: d */
    public Boolean f24046d;

    /* JADX INFO: renamed from: e */
    public Long f24047e;

    /* JADX INFO: renamed from: f */
    public Long f24048f;

    public AbstractC4564ja(String str, int i) {
        this.f24043a = str;
        this.f24044b = i;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m10612b(long j2, C4304q0 c4304q0) {
        try {
            return m10616f(new BigDecimal(j2), c4304q0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m10613c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m10614d(String str, C4304q0 c4304q0) {
        if (!C4679t9.m10791P(str)) {
            return null;
        }
        try {
            return m10616f(new BigDecimal(str), c4304q0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m10615e(String str, C4332s0 c4332s0, C4662s3 c4662s3) {
        List<String> listM10199y;
        C4332s0.b bVar = C4332s0.b.REGEXP;
        C4332s0.b bVar2 = C4332s0.b.IN_LIST;
        Objects.requireNonNull(c4332s0, "null reference");
        if (str == null || !c4332s0.m10193s() || c4332s0.m10194t() == C4332s0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (c4332s0.m10194t() == bVar2) {
            if (c4332s0.m10200z() == 0) {
                return null;
            }
        } else if (!c4332s0.m10195u()) {
            return null;
        }
        C4332s0.b bVarM10194t = c4332s0.m10194t();
        boolean zM10198x = c4332s0.m10198x();
        String strM10196v = (zM10198x || bVarM10194t == bVar || bVarM10194t == bVar2) ? c4332s0.m10196v() : c4332s0.m10196v().toUpperCase(Locale.ENGLISH);
        if (c4332s0.m10200z() == 0) {
            listM10199y = null;
        } else {
            listM10199y = c4332s0.m10199y();
            if (!zM10198x) {
                ArrayList arrayList = new ArrayList(listM10199y.size());
                Iterator<String> it = listM10199y.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listM10199y = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = bVarM10194t == bVar ? strM10196v : null;
        if (bVarM10194t == bVar2) {
            if (listM10199y == null || listM10199y.size() == 0) {
                return null;
            }
        } else if (strM10196v == null) {
            return null;
        }
        if (!zM10198x && bVarM10194t != bVar) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C4516fa.f23923a[bVarM10194t.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str2, zM10198x ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c4662s3 == null) {
                        return null;
                    }
                    c4662s3.f24421i.m10812b("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(strM10196v));
            case 3:
                return Boolean.valueOf(str.endsWith(strM10196v));
            case 4:
                return Boolean.valueOf(str.contains(strM10196v));
            case 5:
                return Boolean.valueOf(str.equals(strM10196v));
            case 6:
                return Boolean.valueOf(listM10199y.contains(str));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m10616f(BigDecimal bigDecimal, C4304q0 c4304q0, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Objects.requireNonNull(c4304q0, "null reference");
        if (c4304q0.m10148s() && c4304q0.m10149t() != C4304q0.a.UNKNOWN_COMPARISON_TYPE) {
            C4304q0.a aVarM10149t = c4304q0.m10149t();
            C4304q0.a aVar = C4304q0.a.BETWEEN;
            if (aVarM10149t == aVar) {
                if (!c4304q0.m10154y() || !c4304q0.m10146A()) {
                    return null;
                }
            } else if (!c4304q0.m10152w()) {
                return null;
            }
            C4304q0.a aVarM10149t2 = c4304q0.m10149t();
            if (c4304q0.m10149t() == aVar) {
                if (C4679t9.m10791P(c4304q0.m10155z()) && C4679t9.m10791P(c4304q0.m10147B())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(c4304q0.m10155z());
                        bigDecimal4 = new BigDecimal(c4304q0.m10147B());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!C4679t9.m10791P(c4304q0.m10153x())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(c4304q0.m10153x());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (aVarM10149t2 == aVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i = C4516fa.f23924b[aVarM10149t2.ordinal()];
            boolean z = false;
            if (i == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (i == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (i == 3) {
                if (d == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (i == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo10617a();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo10618g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo10619h();
}
