package p477d1.p493x.p495c;

import p007c.p071d.p078c.p079a.outline;
import p477d1.Function2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6154b;
import p477d1.p493x.p494b.InterfaceC6155c;
import p477d1.p493x.p494b.InterfaceC6156d;
import p477d1.p493x.p494b.InterfaceC6157e;
import p477d1.p493x.p494b.InterfaceC6158f;
import p477d1.p493x.p494b.InterfaceC6159g;
import p477d1.p493x.p494b.InterfaceC6160h;
import p477d1.p493x.p494b.InterfaceC6161i;
import p477d1.p493x.p494b.InterfaceC6162j;
import p477d1.p493x.p494b.InterfaceC6163k;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6165m;
import p477d1.p493x.p494b.InterfaceC6166n;
import p477d1.p493x.p494b.InterfaceC6167o;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p494b.InterfaceC6169q;
import p477d1.p493x.p494b.InterfaceC6170r;
import p477d1.p493x.p494b.InterfaceC6171s;
import p477d1.p493x.p494b.InterfaceC6172t;
import p477d1.p493x.p494b.InterfaceC6173u;
import p477d1.p493x.p494b.InterfaceC6174v;
import p477d1.p493x.p494b.InterfaceC6175w;

/* JADX INFO: renamed from: d1.x.c.u, reason: use source file name */
/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes.dex */
public class TypeIntrinsics {
    /* JADX INFO: renamed from: a */
    public static Object m13099a(Object obj, int i) {
        if (m13100b(obj, i)) {
            return obj;
        }
        m13101c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13100b(Object obj, int i) {
        int iMo13073d;
        if (obj instanceof Function2) {
            if (obj instanceof FunctionBase) {
                iMo13073d = ((FunctionBase) obj).mo13073d();
            } else if (obj instanceof InterfaceC6153a) {
                iMo13073d = 0;
            } else if (obj instanceof InterfaceC6164l) {
                iMo13073d = 1;
            } else if (obj instanceof InterfaceC6168p) {
                iMo13073d = 2;
            } else if (obj instanceof InterfaceC6169q) {
                iMo13073d = 3;
            } else if (obj instanceof InterfaceC6170r) {
                iMo13073d = 4;
            } else if (obj instanceof InterfaceC6171s) {
                iMo13073d = 5;
            } else if (obj instanceof InterfaceC6172t) {
                iMo13073d = 6;
            } else if (obj instanceof InterfaceC6173u) {
                iMo13073d = 7;
            } else if (obj instanceof InterfaceC6174v) {
                iMo13073d = 8;
            } else if (obj instanceof InterfaceC6175w) {
                iMo13073d = 9;
            } else if (obj instanceof InterfaceC6154b) {
                iMo13073d = 10;
            } else if (obj instanceof InterfaceC6155c) {
                iMo13073d = 11;
            } else if (obj instanceof InterfaceC6156d) {
                iMo13073d = 12;
            } else if (obj instanceof InterfaceC6157e) {
                iMo13073d = 13;
            } else if (obj instanceof InterfaceC6158f) {
                iMo13073d = 14;
            } else if (obj instanceof InterfaceC6159g) {
                iMo13073d = 15;
            } else if (obj instanceof InterfaceC6160h) {
                iMo13073d = 16;
            } else if (obj instanceof InterfaceC6161i) {
                iMo13073d = 17;
            } else if (obj instanceof InterfaceC6162j) {
                iMo13073d = 18;
            } else if (obj instanceof InterfaceC6163k) {
                iMo13073d = 19;
            } else if (obj instanceof InterfaceC6165m) {
                iMo13073d = 20;
            } else if (obj instanceof InterfaceC6166n) {
                iMo13073d = 21;
            } else {
                iMo13073d = obj instanceof InterfaceC6167o ? 22 : -1;
            }
            if (iMo13073d == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m13101c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(outline.m1600v(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics2.m13093i(classCastException, TypeIntrinsics.class.getName());
        throw classCastException;
    }
}
