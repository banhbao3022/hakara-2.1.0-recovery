package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Base64;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 {

    /* JADX INFO: renamed from: a */
    public final Object f22386a;

    /* JADX INFO: renamed from: b */
    public final ar1 f22387b;

    /* JADX INFO: renamed from: c */
    public final jr1 f22388c;

    /* JADX INFO: renamed from: d */
    public final np1 f22389d;

    public zq1(Object obj, ar1 ar1Var, jr1 jr1Var, np1 np1Var) {
        this.f22386a = obj;
        this.f22387b = ar1Var;
        this.f22388c = jr1Var;
        this.f22389d = np1Var;
    }

    /* JADX INFO: renamed from: e */
    public static String m8899e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        uk1 uk1VarM8423v = tl1.m8423v();
        ja1 ja1Var = ja1.DG;
        if (uk1VarM8423v.f13191h) {
            uk1VarM8423v.m6298m();
            uk1VarM8423v.f13191h = false;
        }
        tl1.m8422A((tl1) uk1VarM8423v.f13190g, ja1Var);
        uk1VarM8423v.m8511r(g72.m6939G(bArr, 0, bArr.length));
        return Base64.encodeToString(uk1VarM8423v.m6300o().mo7574w(), 11);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8900a(String str, MotionEvent motionEvent) throws hr1 {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f22386a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f22386a, map);
            this.f22389d.m7913b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new hr1(2005, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m8901b() throws hr1 {
        try {
        } catch (Exception e) {
            throw new hr1(2001, e);
        }
        return ((Boolean) this.f22386a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f22386a, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8902c() throws hr1 {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f22386a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f22386a, new Object[0]);
            this.f22389d.m7913b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new hr1(2003, e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m8903d() throws hr1 {
        try {
        } catch (Exception e) {
            throw new hr1(2006, e);
        }
        return ((Integer) this.f22386a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f22386a, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized byte[] m8904f(Map<String, String> map, Map<String, Object> map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f22389d.m7914c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f22386a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f22386a, null, map2);
    }
}
