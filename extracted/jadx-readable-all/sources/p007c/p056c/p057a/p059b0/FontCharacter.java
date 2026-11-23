package p007c.p056c.p057a.p059b0;

import java.util.List;
import p007c.p056c.p057a.p059b0.p061k.ShapeGroup;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.b0.d, reason: use source file name */
/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes.dex */
public class FontCharacter {

    /* JADX INFO: renamed from: a */
    public final List<ShapeGroup> f1987a;

    /* JADX INFO: renamed from: b */
    public final char f1988b;

    /* JADX INFO: renamed from: c */
    public final double f1989c;

    /* JADX INFO: renamed from: d */
    public final String f1990d;

    /* JADX INFO: renamed from: e */
    public final String f1991e;

    public FontCharacter(List<ShapeGroup> list, char c2, double d, double d2, String str, String str2) {
        this.f1987a = list;
        this.f1988b = c2;
        this.f1989c = d2;
        this.f1990d = str;
        this.f1991e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m1329a(char c2, String str, String str2) {
        return str2.hashCode() + outline.m1569T(str, (c2 + 0) * 31, 31);
    }

    public int hashCode() {
        return m1329a(this.f1988b, this.f1991e, this.f1990d);
    }
}
