package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Class<?>> f15360a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final Context f15361b;

    /* JADX INFO: renamed from: c */
    public final jr1 f15362c;

    /* JADX INFO: renamed from: d */
    public final np1 f15363d;

    /* JADX INFO: renamed from: e */
    public final jp1 f15364e;

    /* JADX INFO: renamed from: f */
    public zq1 f15365f;

    /* JADX INFO: renamed from: g */
    public final Object f15366g = new Object();

    public ir1(Context context, jr1 jr1Var, np1 np1Var, jp1 jp1Var) {
        this.f15361b = context;
        this.f15362c = jr1Var;
        this.f15363d = np1Var;
        this.f15364e = jp1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7290a(ar1 ar1Var) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrM6948O;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Constructor<?> declaredConstructor = m7292c(ar1Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                Object[] objArr = new Object[6];
                objArr[0] = this.f15361b;
                objArr[1] = "msa-r";
                FileInputStream fileInputStream2 = null;
                if (ar1Var.f12260e == null) {
                    try {
                        fileInputStream = new FileInputStream(ar1Var.f12259d);
                        try {
                            bArrM6948O = g72.m6942L(fileInputStream).m6948O();
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            bArrM6948O = null;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    ar1Var.f12260e = bArrM6948O;
                }
                byte[] bArr = ar1Var.f12260e;
                objArr[2] = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
                objArr[3] = null;
                objArr[4] = new Bundle();
                objArr[5] = 2;
                zq1 zq1Var = new zq1(declaredConstructor.newInstance(objArr), ar1Var, this.f15362c, this.f15363d);
                if (!zq1Var.m8901b()) {
                    throw new hr1(4000, "init failed");
                }
                int iM8903d = zq1Var.m8903d();
                if (iM8903d != 0) {
                    StringBuilder sb = new StringBuilder(15);
                    sb.append("ci: ");
                    sb.append(iM8903d);
                    throw new hr1(4001, sb.toString());
                }
                synchronized (this.f15366g) {
                    try {
                        zq1 zq1Var2 = this.f15365f;
                        if (zq1Var2 != null) {
                            try {
                                zq1Var2.m8902c();
                            } catch (hr1 e) {
                                this.f15363d.m7914c(e.f14947f, -1L, e);
                            }
                        }
                        this.f15365f = zq1Var;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f15363d.m7913b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new hr1(2004, e2);
            }
        } catch (hr1 e3) {
            this.f15363d.m7914c(e3.f14947f, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f15363d.m7914c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zq1 m7291b() {
        zq1 zq1Var;
        synchronized (this.f15366g) {
            zq1Var = this.f15365f;
        }
        return zq1Var;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Class<?> m7292c(ar1 ar1Var) throws hr1 {
        String strM6810v = ar1Var.f12256a.m6810v();
        HashMap<String, Class<?>> map = f15360a;
        Class<?> cls = map.get(strM6810v);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f15364e.m7378a(ar1Var.f12257b)) {
                throw new hr1(2026, "VM did not pass signature verification");
            }
            try {
                File file = ar1Var.f12258c;
                if (!file.exists()) {
                    file.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(ar1Var.f12257b.getAbsolutePath(), file.getAbsolutePath(), null, this.f15361b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strM6810v, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new hr1(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new hr1(2026, e2);
        }
    }
}
