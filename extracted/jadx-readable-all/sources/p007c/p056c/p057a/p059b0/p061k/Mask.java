package p007c.p056c.p057a.p059b0.p061k;

import p007c.p056c.p057a.p059b0.p060j.AnimatableIntegerValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableShapeValue;

/* JADX INFO: renamed from: c.c.a.b0.k.g, reason: use source file name */
/* JADX INFO: compiled from: Mask.java */
/* JADX INFO: loaded from: classes.dex */
public class Mask {

    /* JADX INFO: renamed from: a */
    public final a f2050a;

    /* JADX INFO: renamed from: b */
    public final AnimatableShapeValue f2051b;

    /* JADX INFO: renamed from: c */
    public final AnimatableIntegerValue f2052c;

    /* JADX INFO: renamed from: d */
    public final boolean f2053d;

    /* JADX INFO: renamed from: c.c.a.b0.k.g$a */
    /* JADX INFO: compiled from: Mask.java */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(a aVar, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.f2050a = aVar;
        this.f2051b = animatableShapeValue;
        this.f2052c = animatableIntegerValue;
        this.f2053d = z;
    }
}
