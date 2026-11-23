package p007c.p056c.p057a.p059b0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.e, reason: use source file name */
/* JADX INFO: compiled from: KeyPath.java */
/* JADX INFO: loaded from: classes.dex */
public class KeyPath {

    /* JADX INFO: renamed from: a */
    public static final KeyPath f1992a = new KeyPath("COMPOSITION");

    /* JADX INFO: renamed from: b */
    public final List<String> f1993b;

    /* JADX INFO: renamed from: c */
    public KeyPathElement f1994c;

    public KeyPath(String... strArr) {
        this.f1993b = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: a */
    public KeyPath m1330a(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f1993b.add(str);
        return keyPath;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1331b() {
        List<String> list = this.f1993b;
        return list.get(list.size() - 1).equals("**");
    }

    /* JADX INFO: renamed from: c */
    public boolean m1332c(String str, int i) {
        if (i >= this.f1993b.size()) {
            return false;
        }
        boolean z = i == this.f1993b.size() - 1;
        String str2 = this.f1993b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f1993b.size() + (-2) && m1331b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f1993b.get(i + 1).equals(str)) {
            return i == this.f1993b.size() + (-2) || (i == this.f1993b.size() + (-3) && m1331b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f1993b.size() - 1) {
            return false;
        }
        return this.f1993b.get(i2).equals(str);
    }

    /* JADX INFO: renamed from: d */
    public int m1333d(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.f1993b.get(i).equals("**")) {
            return (i != this.f1993b.size() - 1 && this.f1993b.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1334e(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f1993b.size()) {
            return false;
        }
        return this.f1993b.get(i).equals(str) || this.f1993b.get(i).equals("**") || this.f1993b.get(i).equals("*");
    }

    /* JADX INFO: renamed from: f */
    public boolean m1335f(String str, int i) {
        return "__container".equals(str) || i < this.f1993b.size() - 1 || this.f1993b.get(i).equals("**");
    }

    /* JADX INFO: renamed from: g */
    public KeyPath m1336g(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f1994c = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("KeyPath{keys=");
        sbM1556G.append(this.f1993b);
        sbM1556G.append(",resolved=");
        sbM1556G.append(this.f1994c != null);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public KeyPath(KeyPath keyPath) {
        this.f1993b = new ArrayList(keyPath.f1993b);
        this.f1994c = keyPath.f1994c;
    }
}
