package p007c.p190n.p194b.p266d.p327k.p329b;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.k.b.s3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4662s3 extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public char f24415c;

    /* JADX INFO: renamed from: d */
    public long f24416d;

    /* JADX INFO: renamed from: e */
    public String f24417e;

    /* JADX INFO: renamed from: f */
    public final C4684u3 f24418f;

    /* JADX INFO: renamed from: g */
    public final C4684u3 f24419g;

    /* JADX INFO: renamed from: h */
    public final C4684u3 f24420h;

    /* JADX INFO: renamed from: i */
    public final C4684u3 f24421i;

    /* JADX INFO: renamed from: j */
    public final C4684u3 f24422j;

    /* JADX INFO: renamed from: k */
    public final C4684u3 f24423k;

    /* JADX INFO: renamed from: l */
    public final C4684u3 f24424l;

    /* JADX INFO: renamed from: m */
    public final C4684u3 f24425m;

    /* JADX INFO: renamed from: n */
    public final C4684u3 f24426n;

    public C4662s3(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24415c = (char) 0;
        this.f24416d = -1L;
        this.f24418f = new C4684u3(this, 6, false, false);
        this.f24419g = new C4684u3(this, 6, true, false);
        this.f24420h = new C4684u3(this, 6, false, true);
        this.f24421i = new C4684u3(this, 5, false, false);
        this.f24422j = new C4684u3(this, 5, true, false);
        this.f24423k = new C4684u3(this, 5, false, true);
        this.f24424l = new C4684u3(this, 4, false, false);
        this.f24425m = new C4684u3(this, 3, false, false);
        this.f24426n = new C4684u3(this, 2, false, false);
    }

    /* JADX INFO: renamed from: s */
    public static Object m10738s(String str) {
        if (str == null) {
            return null;
        }
        return new C4717x3(str);
    }

    /* JADX INFO: renamed from: t */
    public static String m10739t(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C4717x3) {
                return ((C4717x3) obj).f24572a;
            }
            return z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM10741y = m10741y(C4707w4.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m10741y(className).equals(strM10741y)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public static String m10740u(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strM10739t = m10739t(z, obj);
        String strM10739t2 = m10739t(z, obj2);
        String strM10739t3 = m10739t(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM10739t)) {
            sb.append(str2);
            sb.append(strM10739t);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM10739t2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM10739t2);
        }
        if (!TextUtils.isEmpty(strM10739t3)) {
            sb.append(str3);
            sb.append(strM10739t3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m10741y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: A */
    public final C4684u3 m10742A() {
        return this.f24421i;
    }

    /* JADX INFO: renamed from: B */
    public final C4684u3 m10743B() {
        return this.f24423k;
    }

    /* JADX INFO: renamed from: C */
    public final C4684u3 m10744C() {
        return this.f24425m;
    }

    /* JADX INFO: renamed from: D */
    public final C4684u3 m10745D() {
        return this.f24426n;
    }

    /* JADX INFO: renamed from: E */
    public final String m10746E() {
        long jAbs;
        Pair<String, Long> pair;
        C4594m4 c4594m4 = m10818g().f23890e;
        c4594m4.f24147e.mo10381b();
        c4594m4.f24147e.mo10381b();
        long j2 = c4594m4.f24147e.m10538w().getLong(c4594m4.f24143a, 0L);
        if (j2 == 0) {
            c4594m4.m10648a();
            jAbs = 0;
        } else {
            jAbs = Math.abs(j2 - c4594m4.f24147e.f24476a.f24541o.mo5623c());
        }
        long j3 = c4594m4.f24146d;
        if (jAbs < j3) {
            pair = null;
        } else if (jAbs > (j3 << 1)) {
            c4594m4.m10648a();
            pair = null;
        } else {
            String string = c4594m4.f24147e.m10538w().getString(c4594m4.f24145c, null);
            long j4 = c4594m4.f24147e.m10538w().getLong(c4594m4.f24144b, 0L);
            c4594m4.m10648a();
            pair = (string == null || j4 <= 0) ? C4510f4.f23884c : new Pair<>(string, Long.valueOf(j4));
        }
        if (pair == null || pair == C4510f4.f23884c) {
            return null;
        }
        String strValueOf = String.valueOf(pair.second);
        String str = (String) pair.first;
        return outline.m1587i(outline.m1558I(str, strValueOf.length() + 1), strValueOf, ":", str);
    }

    /* JADX INFO: renamed from: F */
    public final String m10747F() {
        String str;
        synchronized (this) {
            if (this.f24417e == null) {
                String str2 = this.f24476a.f24531e;
                if (str2 == null) {
                    str2 = "FA";
                }
                this.f24417e = str2;
            }
            str = this.f24417e;
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m10748v(int i, String str) {
        Log.println(i, m10747F(), str);
    }

    /* JADX INFO: renamed from: w */
    public final void m10749w(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m10747F(), i)) {
            Log.println(i, m10747F(), m10740u(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Objects.requireNonNull(str, "null reference");
        C4674t4 c4674t4 = this.f24476a.f24537k;
        if (c4674t4 == null) {
            m10748v(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!c4674t4.m10762i()) {
                m10748v(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i < 0) {
                i = 0;
            }
            c4674t4.m10758v(new RunnableC4695v3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10750x(int i) {
        return Log.isLoggable(m10747F(), i);
    }

    /* JADX INFO: renamed from: z */
    public final C4684u3 m10751z() {
        return this.f24418f;
    }
}
